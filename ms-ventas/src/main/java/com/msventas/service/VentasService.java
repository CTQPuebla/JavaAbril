package com.msventas.service;

import com.persistence.dto.VentasDTO;
import com.persistence.entity.Ventas;

public interface VentasService {
	
	Ventas guardar(VentasDTO dto);

}
