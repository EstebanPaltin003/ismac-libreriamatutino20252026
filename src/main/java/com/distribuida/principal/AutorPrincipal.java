package com.distribuida.principal;

import com.distribuida.model.Autor;

public class AutorPrincipal {

    public static void main(String[] args){

        Autor autor = new Autor(1,"Marco Aurelio","Español");

        System.out.println(autor.toString());

    }
}
