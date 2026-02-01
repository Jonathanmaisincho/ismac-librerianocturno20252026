package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoriaTestUnitaria {

    private Categoria categoria;

    @BeforeEach
    public void setUp() {

        categoria = new Categoria();

        categoria.setIdCategoria(1);
        categoria.setCategoria("Fantasía");
        categoria.setDescripcion("Libros que contienen elementos mágicos, mundos imaginarios o criaturas sobrenaturales");

    }

    @Test
    public void testCategoriaConstructor() {
        assertAll("validar datos Categoria - Constructor",
                () -> assertEquals(1, categoria.getIdCategoria()),
                () -> assertEquals("Fantasía", categoria.getCategoria()),
                () -> assertEquals("Libros que contienen elementos mágicos, mundos imaginarios o criaturas sobrenaturales", categoria.getDescripcion())

        );
    }

    @Test
    public void testCategoriaSetters() {

        categoria.setIdCategoria(2);
        categoria.setCategoria("Fantasía2");
        categoria.setDescripcion("Libros que contienen2");


        assertAll("validar datos categoria - Setters",
                () -> assertEquals(2, categoria.getIdCategoria()),
                () -> assertEquals("Fantasía2", categoria.getCategoria()),
                () -> assertEquals("Libros que contienen2", categoria.getDescripcion())
        );
    }

    @Test
    public void categoriaTestToString() {
        String str = categoria.toString();
        assertAll("Validar datos categoria - To String",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Fantasía")),
                () -> assertTrue(str.contains("Libros que contienen elementos mágicos, mundos imaginarios o criaturas sobrenaturales"))

        );

    }

    @Test
    public void CategoriaTestInyector() {
        assertAll("Validar metodo inyector - autor",
                () -> assertNotNull(categoria.getIdCategoria())

        );
    }

    @Test
    public void categoriaValoresNegativos() {
        categoria.setIdCategoria(-8);
        assertAll("Validar datos Negativos",
                () -> assertEquals(-8, categoria.getIdCategoria()),
                () -> assertEquals(-8, categoria.getIdCategoria())
        );
    }
}

