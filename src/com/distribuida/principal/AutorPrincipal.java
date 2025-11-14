package com.distribuida.principal;

import com.distribuida.beans.Autor;
import com.distribuida.beans.Libro;

public class AutorPrincipal {

    public static void main(String[] arg){

        Autor autor = new Autor();

        autor.setIdAutor(1);
        autor.setNombre("Lucía");
        autor.setApellido("García Montes");
        autor.setPais("España");
        autor.setDireccion("Calle de los Cipreses #214, Madrid");
        autor.setTelefono("0984562879");
        autor.setCorreo("lucia.garcia.montes@example.com");

        System.out.println(autor.toString());
    }






}
