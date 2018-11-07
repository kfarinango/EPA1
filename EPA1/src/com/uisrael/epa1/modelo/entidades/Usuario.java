/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.epa1.modelo.entidades;

/**
 *
 * @author Asus
 */
public class Usuario {
    private Integer id_usuario;
    private String ci;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    public Usuario() {
    }

    public Usuario(Integer id_usuario, String ci, String nombre, String apellido, String correo, String telefono) {
        this.id_usuario = id_usuario;
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
}
