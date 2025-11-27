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
                "Esteban",
                "Paltin",
                "Ecuador",
                "Av mas aca",
                "0915261526",
                "epaltin@correo.com"
        );
    }

    @Test
    public void testAutorConstructor() {
        assertAll("Validar Constructor - autor",
                () -> assertEquals(1, Autor.getIdAutor()),
                () -> assertEquals("Esteban", Autor.getNombre()),
                () -> assertEquals("Paltin", Autor.getApellido()),
                () -> assertEquals("Ecuador", Autor.getPais())
        );
    }

    @Test
    public void TestAutorSetters() {
        Autor = new Autor();
        Autor.setIdAutor(2);
        Autor.setNombre("Susan");
        Autor.setApellido("Ahoria");

        assertAll("Validar setters - autor",
                () -> assertEquals(2, Autor.getIdAutor()),
                () -> assertEquals("Susan", Autor.getNombre()),
                () -> assertEquals("Ahoria", Autor.getApellido())
        );
    }

    @Test
    public void testAutorToString() {
        String s = Autor.toString();

        assertAll("Validar toString - autor",
                () -> assertTrue(s.contains("Esteban")),
                () -> assertTrue(s.contains("Paltin"))
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