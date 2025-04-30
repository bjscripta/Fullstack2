package com.perfulandia.perfulandia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reporte {

    private int idReporte;
    private String tituloReporte;
    private String descripcionReporte;
    private String estadoReporte;
    
}
