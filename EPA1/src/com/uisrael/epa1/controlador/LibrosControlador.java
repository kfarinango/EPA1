/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.epa1.controlador;

import com.uisrael.epa1.modelo.DAO.LibrosDAO;
import com.uisrael.epa1.modelo.entidades.Libros;
import java.util.List;

/**
 *
 * @author Asus
 */
public class LibrosControlador {
    public void insertarLibro(Integer id,String isbn,String titulo,Integer idAutor,Integer idCategoria,Double precio ){
    try {
               LibrosDAO sql= new LibrosDAO();
               Libros libro = new Libros();
               libro.setId_libro(id);
               libro.setTitulo(titulo);
               libro.setIsbn(isbn);
               libro.setId_autor(idAutor);
               libro.setId_categoria(idCategoria);
               libro.setPrecio(precio);
               sql.insertarLibro(libro);
               
           } catch (Exception e) {
               System.err.println(""+e.getMessage());
           }
    }
    public void listarLibros(){
        LibrosDAO sql = new LibrosDAO();
        System.out.print(sql.ListarLibros());
       
    }
}
