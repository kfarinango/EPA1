/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.epa1.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Asus
 */
@Entity
@Table(name="tb_libros")

public class Libros {
    @Id
    @GeneratedValue
    private Integer id_libro;
    private String isbn;
    private String titulo;
    private Integer id_autor;
    private Integer id_categoria;
    private Double precio;

    public Libros() {
    }

    public Libros(Integer id_libro, String isbn, String titulo, Integer id_autor, Integer id_categoria, Double precio) {
        this.id_libro = id_libro;
        this.isbn = isbn;
        this.titulo = titulo;
        this.id_autor = id_autor;
        this.id_categoria = id_categoria;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getId_libro() {
        return id_libro;
    }

    public void setId_libro(Integer id_libro) {
        this.id_libro = id_libro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getId_autor() {
        return id_autor;
    }

    public void setId_autor(Integer id_autor) {
        this.id_autor = id_autor;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    @Override
    public String toString() {
        return "Libros{" + "id_libro=" + id_libro + ", isbn=" + isbn + ", titulo=" + titulo + ", id_autor=" + id_autor + ", id_categoria=" + id_categoria + ", precio=" + precio + '}';
    }
    
}
