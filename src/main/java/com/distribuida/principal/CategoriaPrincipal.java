package com.distribuida.principal;

import com.distribuida.model.Categoria;

public class CategoriaPrincipal {

    public static void main(String[] args){

        Categoria categoria = new Categoria(1,"Ciencia Ficción");

        System.out.println(categoria.toString());

    }

}
