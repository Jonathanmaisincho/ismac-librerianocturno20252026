package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;

public class LibroTestUnitaria {


    private Libro libro;

    @BeforeEach
    public void setUp() {

        libro = new Libro();

        libro.setIdLibro(1);
        libro.setTitulo("La Sombra de los Vientos Eternos");
        libro.setEditorial("Aurora");
        libro.setNumpaginas(432);
        libro.setEdicion("1ª edición");
        libro.setIdioma("Español");
        libro.setFechapublicacion("2023-09-15 00:00:00");
        libro.setDescripcion("Una novela fantástica que narra la aventura de un joven destinado a proteger un antiguo secreto");
        libro.setTipodepasta("Tapa dura");
        libro.setISBN("978-1-23456-789-7");
        libro.setNumejemplares(25);
        libro.setPortada("portadas/sombra_vientos.jpg");
        libro.setPresentacion("Libro de lujo con sobrecubierta");
        libro.setPrecio(349.99);



    }

}
