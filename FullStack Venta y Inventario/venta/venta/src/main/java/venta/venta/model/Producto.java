package venta.venta.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Producto")
@Data

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)    
    private float precio;
    @Column(nullable = false)    
    private String estado;

}