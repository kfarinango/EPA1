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
public class Categoria {
    private Integer id_categoria;
    private String Categoria;

    public Categoria() {
    }

    public Categoria(Integer id_categoria, String Categoria) {
        this.id_categoria = id_categoria;
        this.Categoria = Categoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id_categoria=" + id_categoria + ", Categoria=" + Categoria + '}';
    }
    
}
