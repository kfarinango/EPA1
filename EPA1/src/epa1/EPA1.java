/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epa1;

import com.uisrael.epa1.controlador.LibrosControlador;

/**
 *
 * @author Asus
 */
public class EPA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Insertar libro
        LibrosControlador libros = new LibrosControlador();
        libros.insertarLibro(4,"9781492339243","Python for Informatics",1,1,9.99);
        libros.listarLibros();
    }
    
}
