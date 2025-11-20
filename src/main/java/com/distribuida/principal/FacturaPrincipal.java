package com.distribuida.principal;

import com.distribuida.model.Cliente;
import com.distribuida.model.Factura;

import java.util.Date;

public class FacturaPrincipal {

    public static void main(String[] args){

        Cliente cliente = new Cliente(1,"1752775237", "Armando"
                ,"Muritos", "Av siempre muerta", "0914141414", "amuritos@correo.com");


        Factura factura = new Factura(1,"FAC-0003",new Date(),12.50,2.50,15.00,cliente);

        System.out.println(factura.toString());

    }
}
