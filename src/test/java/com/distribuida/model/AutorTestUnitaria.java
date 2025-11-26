package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTestUnitaria {

    private Autor Autor;

    @BeforeEach
    public void setup() {
        Autor = new Autor(
                1,
                "Gabriel",
                "García",
                "Colombia",
                "Direccion X",
                "0999999999",
                "ggarcia@correo.com"
        );
    }

    @Test
    public void testAutorConstructor() {
        assertAll("Validar Constructor - autor",
                () -> assertEquals(1, Autor.getIdAutor()),
                () -> assertEquals("Gabriel", Autor.getNombre())
        );
    }

    @Test
    public void TestAutorSetters() {
        Autor = new Autor(1, "Gabriel", "García", "Colombia", "Direccion X", "0999999999", "ggarcia@correo.com");
        Autor.setIdAutor(2);
        Autor.setNombre("Lucho");

        assertAll("Validar setters - autor",
                () -> assertEquals(2, Autor.getIdAutor()),
                () -> assertEquals("Lucho", Autor.getNombre())
        );
    }

    @Test
    public void testAutorToString() {
        String s = Autor.toString();

        assertAll("Validar toString - autor",
                () -> assertTrue(s.contains("Gabriel")),
                () -> assertTrue(s.contains("García"))
        );
    }

    @Test
    public void testAutorValoresNegativos() {

        Autor.setIdAutor(-10);

        assertAll("Validar valores negativos - autor",
                () -> assertEquals(-10, Autor.getIdAutor())
        );
    }
}
//awd
//UwU
//PRUEBAS