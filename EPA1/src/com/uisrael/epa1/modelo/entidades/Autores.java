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
public class Autores {
    private Integer id_autor;
    private String nombre;
    private String apellido;

    public Autores() {
    }

    public Autores(Integer id_autor, String nombre, String apellido) {
        this.id_autor = id_autor;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getId_autor() {
        return id_autor;
    }

    public void setId_autor(Integer id_autor) {
        this.id_autor = id_autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autores{" + "id_autor=" + id_autor + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
