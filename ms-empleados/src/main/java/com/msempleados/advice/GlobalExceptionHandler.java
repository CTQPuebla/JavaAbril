package com.msempleados.advice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.msempleados.errors.ApiErrors;
import com.msempleados.exception.BusinessException;
import com.msempleados.exception.ResourceNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	private static final String RECURSO_DUPLICADO = "Recurso duplicado";
	private static final String NO_ENCONTRADO = "No se encontró el recurso";
	private static final String NO_VALIDO = "Valor incorrecto";
	

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		List<String> detalles = new ArrayList<String>();
		detalles.add("Verbo HTTP no soportado por el método");
		ApiErrors errores = new ApiErrors(ex.getMessage(), detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errores);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<String> detalles = new ArrayList<String>();
		detalles.add("MediaType no soportado");
		detalles.add(ex.getMessage());
		ApiErrors errores = new ApiErrors(ex.getMessage(), detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errores);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		List<String> detalles = new ArrayList<String>();
		detalles.add("Variable de URL no encontrada");
		ApiErrors errores = new ApiErrors(ex.getMessage(), detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errores);
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		List<String> detalles = new ArrayList<String>();
		detalles.add("Request param is missing");
		ApiErrors errores = new ApiErrors(ex.getMessage(), detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errores);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		List<String> detalles = new ArrayList<String>();
		detalles.add("Type mismatch");
		ApiErrors errores = new ApiErrors(ex.getMessage(), detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errores);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<String> detalles = new ArrayList<String>();
		detalles.add("RequestBody is not readable");
		ApiErrors errores = new ApiErrors(ex.getMessage(), detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errores);
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex) {
		List<String> detalles = new ArrayList<String>();
		detalles.add(NO_ENCONTRADO);
		ApiErrors errores = new ApiErrors(ex.getMessage(), detalles, HttpStatus.NOT_FOUND, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errores);
	}

	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<Object> handleBusinessException(BusinessException ex) {
		List<String> detalles = new ArrayList<String>();
		String mensaje = "";

		switch (ex.getIdException()) {
		case 1:
			mensaje = RECURSO_DUPLICADO;
			detalles.add("Ya existe un empleado con ese nombre");
			break;
		case 2:
			mensaje = NO_VALIDO;
			detalles.add("El atributo sexo debe ser 'M' ó 'F'");
			break;
		case 3:
			mensaje = NO_VALIDO;
			detalles.add("En el atributo estado civil se esperaba 'CASADO','VIUDO','SOLTERO' o 'DIVORCIADO'");
			break;
		}

		ApiErrors errores = new ApiErrors(mensaje, detalles, HttpStatus.UNPROCESSABLE_ENTITY, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(errores);
	}

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<Object> handleOther(RuntimeException ex) {
		List<String> detalles = new ArrayList<String>();
		detalles.add("Alguna otra excepcion");
		ApiErrors errores = new ApiErrors(ex.getMessage(), detalles, HttpStatus.UNPROCESSABLE_ENTITY, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(errores);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		List<String> detalles = new ArrayList<String>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {

			detalles.add(error.getDefaultMessage());
		});
		ApiErrors errores = new ApiErrors("Datos inválidos", detalles, HttpStatus.BAD_REQUEST, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errores);
	}

}
