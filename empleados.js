$(document).ready(function () {
  mostrarTodosEmpleados();
  $('#AgregarEmpleado').click(function (e) {
    e.preventDefault();
    var data;
    var url = "http://localhost:8090/api/empleados/guardar-empleado/";
    //Lleno la variable data
        data = JSON.stringify({           
          nombre: $('#nombre').val(),
          sexo: $('#Sexo').val(),
          estadoCivil: $('#estadoCivil').val(),
          fechaNac: $('#fechaNac').val(),
          cargoId: $('#cargoId').val()
        });
        $.ajax({
          method: "POST",
          url: url,
          data: data,
          dataType: 'json',
          contentType: "application/json",
          success: function (data) {
            console.log('Rellenando la tabla');
            mostrarTodosEmpleados(); //Recarga el contenido de la tabla
            $('.alert-success').html('Se añadio el empleado').fadeIn().delay(4000).fadeOut('snow');
          },
          error: function (errors) {
            $('.alert-success').html('No fue posible añadir el empleado').fadeIn().delay(4000).fadeOut('snow');
            console.log(errors);
          }
        });
  });


  $("#btnEditarEmpleado").click(function (e) {
    e.preventDefault(); //Detengo elcomportamiento por default
    var url = "http://localhost:8090/api/empleados/actualizar-empleado";

    //Empaquetar los datos que se van a actualizaer
    var data = JSON.stringify({
      empleadoId: $('#edit_empleadoId').val(),
      nombre: $('#edit_nombre').val(),
      sexo: $('#edit_sexo').val(),
      estadoCivil: $('#edit_estadoCivil').val(),
      fechaNac: $('#edit_fechaNac').val(),
      cargoId: $('#edit_cargoId').val()
    });

    //Llamada AJAX para actualizar
    $.ajax({
      type: 'PUT',
      url: url,
      data: data,
      dataType: 'json',
      contentType: "application/json; charset=utf-8",
      success: function (data) {
        mostrarTodosEmpleados();
        $('.alert-warning').html('Se editó el empleado').fadeIn().delay(4000).fadeOut('snow');
        console.log("Actualizado correctamente")
      },
      error: function (errors) {
        $('.alert-warning').html('No se pudo editar el empleado').fadeIn().delay(4000).fadeOut('snow');
        console.log(errors);
      }
    });
  });

});

function showEditModal(e) {
  var url = "http://localhost:8090/api/empleados/buscar-por-id/"+e;

  $.ajax({
    method: "GET",
    url: url,
    dataType: 'json',
    success: function (response, data) {
      console.log('Rellenando el formulario para editar');
      //console.log('response' + response.nombre);

      //Acomodar los valores en los input del formulario
      $('#edit_empleadoId').val(response.empleadoId);
      $('#edit_nombre').val(response.nombre);
      $('#edit_sexo').val(response.sexo);
      $('#edit_estadoCivil').val(response.estadoCivil);
      $('#edit_fechaNac').val(response.fechaNac);
      $('#edit_cargoId').val(response.cargoId);

      // Mostrar el modal con esos datos
      $('#modalEditar').modal("show");
    },
    error: function (errors) {
      console.log(errors);
    }
  });

}


function eliminarEmpleado(e) {
  swal({
    title: "¿Está seguro?",
    text: "Esta acción es irreversible",
    icon: "warning",
    buttons: ["Cancelar", "Eliminar"],
    dangerMode: true,
    closeModal: false,
  }).then(function (data) {
    if (data) {
      /*var data = JSON.stringify({
        numeroEmpleado: e
      });*/
      var url = "http://localhost:8090/api/empleados/eliminar/"+e;
      $.ajax({
        type: 'DELETE',
        url: url,
        //data: data,
        dataType: 'json',
        contentType: "application/json",
        success: function (data) {
          $('.alert-danger').html('Se eliminó de la base de datos').fadeIn().delay(4000).fadeOut('snow');
          swal("Eliminado correctamente", "success");
          mostrarTodosEmpleados();
        },
        error: function (errors) {          
          $('.alert-danger').html('No fue posible eliminar este empleado.').fadeIn().delay(4000).fadeOut('snow');
          swal("Hubo un error al eliminar este empleado");
          mostrarTodosEmpleados();
        }
      });
    } else {
      swal("Cancelado", "Se canceló la operación", "error");
      mostrarTodosEmpleados();
    }
  });
}


function mostrarTodosEmpleados() {
  $.get("http://localhost:8090/api/empleados/mostrar-todos", function (response, state) {
   
    $("tbody").children().remove(); //Limpio la tabla

    for (i = 0; i < response.length; i++) {

      //Se verá en la consola del navegador
      console.log(response[i].empleadoId + ' ' + response[i].nombre + ' ' +
        response[i].fechaRegistro + ' ' + response[i].sexo + '' +response[i].estadoCivil + ' '
        +response[i].fechaNac +' ' +response[i].cargoId + ''+response[i].status );

      $('#tablaEmpleado').append(
        '<tr><td>' + response[i].empleadoId + '</td><td>' +
        response[i].nombre + '</td><td>'
        + response[i].fechaRegistro + '</td><td>'
        + response[i].sexo + '</td><td>'
        + response[i].estadoCivil + '</td><td>'
        + response[i].fechaNac + '</td><td>'
        + response[i].cargoId + '</td><td>'
        + response[i].status + '</td><td>'
        + '<button type="button" class="btn btn-warning col-sm-4" id="btnEditarEmpleado" onclick="showEditModal(' + response[i].empleadoId + ')"><i class="fa fa-edit"></i></button></td><td><button type="button" class="btn btn-danger col-sm-4 float-right" onclick="eliminarEmpleado(' + response[i].empleadoId + ')"><i class="fa fa-ban"></i></button></td></tr>');
    }
  }, 'json');
}
