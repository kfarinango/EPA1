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
public class Ventas {
    private Integer id_venta;
    private Integer id_usuario;
    private Integer id_libro;

    public Ventas() {
    }

    public Ventas(Integer id_venta, Integer id_usuario, Integer id_libro) {
        this.id_venta = id_venta;
        this.id_usuario = id_usuario;
        this.id_libro = id_libro;
    }

    public Integer getId_libro() {
        return id_libro;
    }

    public void setId_libro(Integer id_libro) {
        this.id_libro = id_libro;
    }

    public Integer getId_venta() {
        return id_venta;
    }

    public void setId_venta(Integer id_venta) {
        this.id_venta = id_venta;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Ventas{" + "id_venta=" + id_venta + ", id_usuario=" + id_usuario + ", id_libro=" + id_libro + '}';
    }
    
}
