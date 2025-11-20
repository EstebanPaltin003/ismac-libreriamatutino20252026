package com.distribuida.principal;

import com.distribuida.model.Cliente;

public class ClientePrincipal {

    public static void main(String[] args){

        Cliente cliente = new Cliente(1,"1752775237", "Armando"
                ,"Muritos", "Av siempre muerta", "0914141414", "amuritos@correo.com");

        System.out.println(cliente.toString());
    }
}