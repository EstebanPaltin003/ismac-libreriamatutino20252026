package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class LibroTestUnitaria {

    private Libro Libro;
    private Categoria Categoria;
    private Autor Autor;

    @BeforeEach
    public void setup() {
        Categoria = new Categoria(1);
        Autor = new Autor(1, "Gabriel", "García", "Colombia",
                "Direc", "0999999999", "correo@mail.com");

        Libro = new Libro();
        Libro.setIdLibro(10);
        Libro.setTitulo("Cien años de soledad");
        Libro.setPrecio(25);
        Libro.setCategoria(Categoria);
        Libro.setAutor(Autor);
    }

    @Test
    public void testLibroConstructor() {
        assertAll("Validar Constructor - libro",
                () -> assertEquals(10, Libro.getIdLibro()),
                () -> assertEquals("Cien años de soledad", Libro.getTitulo()),
                () -> assertEquals(25, Libro.getPrecio())
        );
    }

    @Test
    public void testLibroInyector() {
        assertAll("Validar inyección - libro",
                () -> assertNotNull(Libro.getCategoria()),
                () -> assertNotNull(Libro.getAutor()),
                () -> assertEquals("Ficción", Libro.getCategoria().getCategoria()),
                () -> assertEquals("Gabriel", Libro.getAutor().getNombre())
        );
    }

    @Test
    public void testLibroToString() {
        String s = Libro.toString();

        assertAll("Validar toString - libro",
                () -> assertTrue(s.contains("Cien años de soledad")),
                () -> assertTrue(s.contains("Sudamericana"))
        );
    }

    @Test
    public void testLibroValoresNegativos() {

        Libro.setPrecio(-25);

        assertAll("Validar valores negativos - libro",
                () -> assertEquals(-25, Libro.getPrecio())
        );
    }
}
