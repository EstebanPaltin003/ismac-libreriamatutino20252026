package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTestUnitaria {

    private Categoria Categoria;

    @BeforeEach
    public void setup() {
        Categoria = new Categoria(1);
    }

    @Test
    public void testCategoriaConstructor() {
        assertAll("Validar Constructor - categoria",
                () -> assertEquals(1, Categoria.getIdCategoria())
        );
    }

    @Test
    public void TestCategoriaSetters() {
        Categoria = new Categoria(1);
        Categoria.setIdCategoria(2);

        assertAll("Validar setters - categoria",
                () -> assertEquals(2, Categoria.getIdCategoria())
        );
    }

    @Test
    public void testCategoriaToString() {
        String s = Categoria.toString();

        assertAll("Validar toString - categoria",
                () -> assertTrue(s.contains("Ficción")),
                () -> assertTrue(s.contains("Narrativa"))
        );
    }

    @Test
    public void testCategoriaValoresNegativos() {

        Categoria.setIdCategoria(-1);

        assertAll("Validar valores negativos - categoria",
                () -> assertEquals(-1, Categoria.getIdCategoria())
        );
    }
}
//awd