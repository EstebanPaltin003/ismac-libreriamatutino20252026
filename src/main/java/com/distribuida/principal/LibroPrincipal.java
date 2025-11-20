package com.distribuida.principal;

import com.distribuida.model.Autor;
import com.distribuida.model.Libro;
import com.distribuida.model.Categoria;

public class LibroPrincipal {

    public static void main(String[] args) {

        Autor autor = new Autor(1, "Gabriel García Márquez", "Colombiano");

        Categoria categoria = new Categoria(1, "Ciencia Ficción");

        Libro libro = new Libro(1, "100 años de soledad", autor, categoria, 12.50);

        System.out.println(libro.toString());
    }
}