package com.perfulandia.perfulandia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "atencion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Atencion {

    @Id
    private int idAtencion;

    @Column(nullable = false, length = 50)
    private String tituloAtencion;

    @Column(nullable = false, length = 200)
    private String descripcionAtencion;

    @Column(nullable = false)
    private String estadoAtencion;

}
