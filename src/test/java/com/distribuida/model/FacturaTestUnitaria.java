package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class FacturaTestUnitaria {

    private Factura factura;
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

        factura = new Factura();

        factura.setIdFactura(1);
        factura.setNumFactura("FAC-0001");
        factura.setFecha(new Date());
        factura.setTotalNeto(100.00);
        factura.setIva(15.00);
        factura.setTotal(115.00);
         //inyeccion de dependencias
        factura.setCliente(cliente);
    }

    @Test
    public void testFacturaConstructor(){
        assertAll("Valdiar datos del constructor - Factura",
                () -> assertEquals(1,factura.getIdFactura()),
                () -> assertEquals("FAC-0001", factura.getNumFactura()),
                // () -> aseertEquals(new Date(), factura.getFecha()),
                () -> assertEquals(100.00, factura.getTotalNeto()),
                () -> assertEquals(15.00, factura.getIva()),
                () -> assertEquals(115.00, factura.getTotal())

                );
    }



    @Test
    public void testFacturaSetters(){
        cliente = new Cliente(2, "1103314710", "Armando2", "Murallas", "Direccion2", "0914253625", "amurallas@correo.com");
        factura = new Factura();

        factura.setIdFactura(2);
        factura.setNumFactura("FAC-0002");
        factura.setFecha(new Date());
        factura.setTotalNeto(200.00);
        factura.setIva(30.00);
        factura.setTotal(230.00);
            //test en inyeccion de dependencias
        factura.setCliente(cliente);

        assertAll("Validar metodos setter - Factura",
                () -> assertEquals(2, factura.getIdFactura()),
                () -> assertEquals("FAC-0002", factura.getNumFactura()),
                //() -> assertEquals(new Date(), factura.getFecha()),
                () -> assertEquals(200.00, factura.getTotalNeto()),
                () -> assertEquals(30.00, factura.getIva()),
                () -> assertEquals(230.00, factura.getTotal()),
                () -> assertEquals("1103314710", factura.getCliente().getCedula())
                );

    }

    @Test
    public void testFacturaToString(){
        String str = factura.toString();

        assertAll("Validar datos de toSting - Factura",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("FAC-0001")),
                () -> assertTrue(str.contains("100.0")),
                () -> assertTrue(str.contains("15.0")),
                () -> assertTrue(str.contains("115.0")),
                () -> assertTrue(str.contains("Armando"))
        );

    }


    @Test
    public void testFacturaInyeccion(){

        assertAll("Validar metodo inyector",
                () -> assertNotNull(factura.getCliente()),
                () -> assertEquals("Muritos", factura.getCliente().getApellido())
        );

    }


    @Test
    public void testFacturaValoresNegativos(){

        factura.setTotal(-100.00);
        assertAll("Validar datos negativos - Factura",
                () -> assertEquals(-100.00, factura.getTotal())
            );
            // validar que se evite valores negativos.
//dawdaw
    }


//asdwad   fdsfdsgfdsgfdsgdf

    // otra prueba
}
