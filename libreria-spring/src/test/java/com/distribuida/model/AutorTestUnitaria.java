package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;

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
}
