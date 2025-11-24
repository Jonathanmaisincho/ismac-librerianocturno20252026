package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;

public class CategoriaTestUnitaria {

    private Categoria categoria;

    @BeforeEach
    public void setUp() {

         categoria = new Categoria();

        categoria.setIdCategoria(1);
        categoria.setCategoria("Fantasía");
        categoria.setDescripcion("Libros que contienen elementos mágicos, mundos imaginarios o criaturas sobrenaturales");



    }
}
