package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutorTestUnitaria {

    private Autor autor;

    @BeforeEach
    public void setUp() {

        autor = new Autor();

        autor.setIdAutor(1);
        autor.setNombre("Lucía");
        autor.setApellido("García Montes");
        autor.setPais("España");
        autor.setDireccion("Calle de los Cipreses #214, Madrid");
        autor.setTelefono("0984562879");
        autor.setCorreo("lucia.garcia.montes@example.com");

    }

    @Test
    public void testAutorConstructor() {
        assertAll("validar datos autor - Constructor",
                () -> assertEquals(1, autor.getIdAutor()),
                () -> assertEquals("Lucía", autor.getNombre()),
                () -> assertEquals("García Montes", autor.getApellido()),
                () -> assertEquals("España", autor.getPais()),
                () -> assertEquals("Calle de los Cipreses #214, Madrid", autor.getDireccion()),
                () -> assertEquals("0984562879", autor.getTelefono()),
                () -> assertEquals("lucia.garcia.montes@example.com", autor.getCorreo())

        );

    }

    @Test
    public void testAutorSetters() {

        autor.setIdAutor(2);
        autor.setNombre("Lucía2");
        autor.setApellido("García Montes");
        autor.setPais("España");
        autor.setDireccion("Calle de los Cipreses #214, Madrid");
        autor.setTelefono("0984562879");
        autor.setCorreo("lucia.garcia.montes@example.com");

        assertAll("validar datos autor - Setters",
                () -> assertEquals(2, autor.getIdAutor()),
                () -> assertEquals("Lucía2", autor.getNombre()),
                () -> assertEquals("García Montes", autor.getApellido()),
                () -> assertEquals("España", autor.getPais()),
                () -> assertEquals("Calle de los Cipreses #214, Madrid", autor.getDireccion()),
                () -> assertEquals("0984562879", autor.getTelefono()),
                () -> assertEquals("lucia.garcia.montes@example.com", autor.getCorreo())

        );
    }

    @Test
    public void autorTestToString() {
        String str = autor.toString();
        assertAll("Validar datos autor - To String",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Lucía")),
                () -> assertTrue(str.contains("García Montes")),
                () -> assertTrue(str.contains("España")),
                () -> assertTrue(str.contains("Calle de los Cipreses #214, Madrid")),
                () -> assertTrue(str.contains("0984562879")),
                () -> assertTrue(str.contains("lucia.garcia.montes@example.com"))
        );
    }

    @Test
    public void AutorTestInyector() {
        assertAll("Validar metodo inyector - autor",
                () -> assertNotNull(autor.getIdAutor())


        );
    }
    @Test
    public void setLibroValoresNegativos() {
        autor.setIdAutor(-1);
        assertAll("Validar datos Negativos",
                () -> assertEquals(-1, autor.getIdAutor()),
                () -> assertEquals(-1, autor.getIdAutor())

        );
    }
}


