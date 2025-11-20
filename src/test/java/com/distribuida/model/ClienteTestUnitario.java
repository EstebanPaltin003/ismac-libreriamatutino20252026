package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTestUnitario {

    private Cliente cliente;

    @BeforeEach
    public void setup(){
        cliente = new Cliente(1
                ,"1752775237"
                ,"Armando"
                ,"Muritos"
                ,"Av siempre muerta"
                ,"0915263524"
                ,"amuritos@correo.com");
    }

    @Test
    public void testClienteConstructor(){

        assertAll("Validar datos del Clietne con constructor",
                 () -> assertEquals(1, cliente.getIdCliente()),
                 () -> assertEquals("1752775237", cliente.getCedula()),
                 () -> assertEquals("Armando", cliente.getNombre()),
                 () -> assertEquals("Muritos", cliente.getApellido()),
                 () -> assertEquals("Av siempre muerta", cliente.getDireccion()),
                 () -> assertEquals("0915263524", cliente.getTelefono()),
                 () -> assertEquals("amuritos@correo.com", cliente.getCorreo())
                 );
    }

    @Test
    public void testClienteSetters(){

        cliente.setIdCliente(2);
        cliente.setCedula("1713144176");
        cliente.setNombre("Jaime");
        cliente.setApellido("Cartero");
        cliente.setDireccion("Av viva");
        cliente.setTelefono("0951515151");
        cliente.setCorreo("jcartero@correo.com");

        assertAll("Validar datos del cliente con setters",
                () -> assertEquals(2, cliente.getIdCliente()),
                () -> assertEquals("1713144176", cliente.getCedula()),
                () -> assertEquals("Jaime", cliente.getNombre()),
                () -> assertEquals("Cartero", cliente.getApellido()),
                () -> assertEquals("Av viva", cliente.getDireccion()),
                () -> assertEquals("0951515151", cliente.getTelefono()),
                () -> assertEquals("jcartero@correo.com", cliente.getCorreo())
                );
    }

    @Test
    public void testClienteToString(){

        String str = cliente.toString();

        assertAll("Validar datos del cliente en toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1752775237")),
                () -> assertTrue(str.contains("Armando")),
                () -> assertTrue(str.contains("Muritos")),
                () -> assertTrue(str.contains("Av siempre muerta")),
                () -> assertTrue(str.contains("0915263524")),
                () -> assertTrue(str.contains("amuritos@correo.com"))
                );


    }


}
