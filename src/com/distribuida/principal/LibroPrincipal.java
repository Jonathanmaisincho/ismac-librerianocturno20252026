package com.distribuida.principal;


import com.distribuida.beans.Autor;
import com.distribuida.beans.Categoria;
import com.distribuida.beans.Libro;

public class LibroPrincipal {

    public static void main(String[] arg){

        Libro libro = new Libro(1, "La Sombra de los Vientos Eternos", "Aurora", 432, "1ª edición", "Español", "2023-09-15 00:00:00", "Una novela fantástica que narra la aventura de un joven destinado a proteger un antiguo secreto", "Tapa dura", "978-1-23456-789-7", 25, "portadas/sombra_vientos.jpg", "Libro de lujo con sobrecubierta", 349.99);

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

        Categoria categoria = new Categoria(1,"Fantasía","Libros que contienen elementos mágicos, mundos imaginarios o criaturas sobrenaturales");


        Autor autor = new Autor(1,"Lucía","García Montes","España","Calle de los Cipreses #214, Madrid","0984562879","lucia.garcia.montes@example.com");


        // inyecion de dependencias


        libro.setCategoria(categoria);
        libro.setAutor(autor);

        System.out.println(libro.toString());
        System.out.println(categoria.toString());
        System.out.println(autor.toString());

    }
}
