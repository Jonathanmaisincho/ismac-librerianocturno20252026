package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibroTestUnitaria {


    private Libro libro;
    private Categoria categoria;
    private Autor autor;

    @BeforeEach
    public void setUp() {

        libro = new Libro();
        categoria = new Categoria(1, "Fantasía", "Libros que contienen elementos mágicos, mundos imaginarios o criaturas sobrenaturales");
        autor = new Autor(1, "Lucía", "García Montes", "España", "Calle de los Cipreses #214, Madrid", "0984562879", "lucia.garcia.montes@example.com");


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

        // inyeccion de dependencias

        libro.setAutor(autor);
        libro.setCategoria(categoria);


    }

    @Test
    public void testLibroConstructor() {
        assertAll("validar datos libro - Constructor",
                () -> assertEquals(1, libro.getIdLibro()),
                () -> assertEquals("La Sombra de los Vientos Eternos", libro.getTitulo()),
                () -> assertEquals("Aurora", libro.getEditorial()),
                () -> assertEquals(432, libro.getNumpaginas()),
                () -> assertEquals("1ª edición", libro.getEdicion()),
                () -> assertEquals("Español", libro.getIdioma()),
                () -> assertEquals("2023-09-15 00:00:00", libro.getFechapublicacion()),
                () -> assertEquals("Una novela fantástica que narra la aventura de un joven destinado a proteger un antiguo secreto", libro.getDescripcion()),
                () -> assertEquals("Tapa dura", libro.getTipodepasta()),
                () -> assertEquals("978-1-23456-789-7", libro.getISBN()),
                () -> assertEquals(25, libro.getNumejemplares()),
                () -> assertEquals("portadas/sombra_vientos.jpg", libro.getPortada()),
                () -> assertEquals("Libro de lujo con sobrecubierta", libro.getPresentacion()),
                () -> assertEquals(349.99, libro.getPrecio())

        );
    }

    @Test
    public void testLibroSetters() {

        libro.setIdLibro(2);
        libro.setTitulo("La Sombra de los Vientos Eternos2");
        libro.setEditorial("Aurora2");
        libro.setNumpaginas(432);
        libro.setEdicion("1ª edición2");
        libro.setIdioma("Español");
        libro.setFechapublicacion("2023-09-15 00:00:00");
        libro.setDescripcion("Una novela fantástica que narra la aventura de un joven destinado a proteger un antiguo secreto");
        libro.setTipodepasta("Tapa dura");
        libro.setISBN("978-1-23456-789-7");
        libro.setNumejemplares(25);
        libro.setPortada("portadas/sombra_vientos.jpg");
        libro.setPresentacion("Libro de lujo con sobrecubierta");
        libro.setPrecio(349.99);

        assertAll("validar datos libro - Setters",
                () -> assertEquals(2, libro.getIdLibro()),
                () -> assertEquals("La Sombra de los Vientos Eternos2", libro.getTitulo()),
                () -> assertEquals("Aurora2", libro.getEditorial()),
                () -> assertEquals(432, libro.getNumpaginas()),
                () -> assertEquals("1ª edición2", libro.getEdicion()),
                () -> assertEquals("Español", libro.getIdioma()),
                () -> assertEquals("2023-09-15 00:00:00", libro.getFechapublicacion()),
                () -> assertEquals("Una novela fantástica que narra la aventura de un joven destinado a proteger un antiguo secreto", libro.getDescripcion()),
                () -> assertEquals("Tapa dura", libro.getTipodepasta()),
                () -> assertEquals("978-1-23456-789-7", libro.getISBN()),
                () -> assertEquals(25, libro.getNumejemplares()),
                () -> assertEquals("portadas/sombra_vientos.jpg", libro.getPortada()),
                () -> assertEquals("Libro de lujo con sobrecubierta", libro.getPresentacion()),
                () -> assertEquals(349.99, libro.getPrecio())

        );

    }


    @Test
    public void LibroTestToString() {
        String str = libro.toString();
        assertAll("Validar to String - Libro",
                () -> assertTrue(str.contains("2")),
                () -> assertTrue(str.contains("La Sombra de los Vientos Eternos")),
                () -> assertTrue(str.contains("Aurora")),
                () -> assertTrue(str.contains("432")),
                () -> assertTrue(str.contains("1ª edición")),
                () -> assertTrue(str.contains("Español")),
                () -> assertTrue(str.contains("2023-09-15 00:00:00")),
                () -> assertTrue(str.contains("Una novela fantástica que narra la aventura de un joven destinado a proteger un antiguo secreto")),
                () -> assertTrue(str.contains("Tapa dura")),
                () -> assertTrue(str.contains("978-1-23456-789-7")),
                () -> assertTrue(str.contains("25")),
                () -> assertTrue(str.contains("portadas/sombra_vientos.jpg")),
                () -> assertTrue(str.contains("Libro de lujo con sobrecubierta")),
                () -> assertTrue(str.contains("349.99"))

        );
    }

    @Test
    public void LibroTestInyector() {
        assertAll("Validar metodo inyector - Libro",
                () -> assertNotNull(libro.getAutor()),
                () -> assertEquals("García Montes", libro.getAutor().getApellido()),
                () -> assertNotNull(libro.getCategoria()),
                () -> assertEquals("Libros que contienen elementos mágicos, mundos imaginarios o criaturas sobrenaturales", libro.getCategoria().getDescripcion())


        );
    }

    @Test
    public void setLibroValoresNegativos() {
        libro.setNumpaginas(-10);
        assertAll("Validar datos Negativos",
                () -> assertEquals(-10, libro.getNumpaginas())

        );
    }
}

