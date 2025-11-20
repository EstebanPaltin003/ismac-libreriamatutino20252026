package com.distribuida.principal;

import com.distribuida.model.*;

import java.util.Date;

public class FacturaDetallePrincipal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "1752775237", "Armando", "Muritos", "Av siempre muerta", "0914141414", "amuritos@correo.com");

        Factura factura = new Factura(1, "FAC-0003", new Date(), 12.50, 2.50, 15.00, cliente);

        Autor autor = new Autor(1, "Marco Aurelio", "Español");

        Categoria categoria = new Categoria(1, "Ciencia Ficción");

        Libro libro = new Libro(1, "100 años de soledad", autor, categoria, 12.50);

        FacturaDetalle facturaDetalle = new FacturaDetalle(1, libro, 1, 15);

        System.out.println(facturaDetalle.toString());
    }
}