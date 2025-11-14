package com.distribuida.principal;

import com.distribuida.beans.Categoria;

public class CategoriaPrincipal {

    public static void main(String[] arg){

        Categoria categoria = new Categoria();

        categoria.setIdCategoria(1);
        categoria.setCategoria("Fantasía");
        categoria.setDescripcion("Libros que contienen elementos mágicos, mundos imaginarios o criaturas sobrenaturales");

        System.out.println(categoria.toString());
    }
}
