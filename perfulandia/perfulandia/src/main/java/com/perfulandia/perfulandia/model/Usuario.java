package com.perfulandia.perfulandia.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;

    @Enumerated(EnumType.STRING)
    private EstadoUsuario estado; //Activo o Desactivdo

    @ElementCollection
    private List<String> permisos; //Listado de permisos del usuario

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String contrasena, EstadoUsuario estado, List<String> permisos) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estado = estado;
        this.permisos = permisos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public EstadoUsuario getEstado() {
        return estado;
    }

    public void setEstado(EstadoUsuario estado) {
        this.estado = estado;
    }

    public List<String> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<String> permisos) {
        this.permisos = permisos;
    }
    
    // Enum para el estado del usuario
    public enum EstadoUsuario {
        ACTIVO,
        DESACTIVADO
    }
}
