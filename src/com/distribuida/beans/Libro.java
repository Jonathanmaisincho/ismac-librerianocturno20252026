package com.distribuida.beans;

import java.util.Date;

public class Libro {

    private int idLibro;
    private String titulo;
    private String editorial;
    private int numpaginas;
    private String edicion;
    private String idioma;
    private String fechapublicacion;
    private String descripcion;
    private String tipodepasta;
    private String ISBN;
    private int numejemplares;
    private String portada;
    private String presentacion;
    private Double precio;


    private Categoria categoria;
    private Autor autor;

    public Libro(){

    }

    public Libro(int idLibro, String titulo, String editorial, int numpaginas, String edicion, String idioma, String fechapublicacion, String descripcion, String tipodepasta, String ISBN, int numejemplares, String portada, String presentacion, Double precio, Categoria categoria, Autor autor) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.numpaginas = numpaginas;
        this.edicion = edicion;
        this.idioma = idioma;
        this.fechapublicacion = fechapublicacion;
        this.descripcion = descripcion;
        this.tipodepasta = tipodepasta;
        this.ISBN = ISBN;
        this.numejemplares = numejemplares;
        this.portada = portada;
        this.presentacion = presentacion;
        this.precio = precio;
        this.categoria = categoria;
        this.autor = autor;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(String fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipodepasta() {
        return tipodepasta;
    }

    public void setTipodepasta(String tipodepasta) {
        this.tipodepasta = tipodepasta;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumejemplares() {
        return numejemplares;
    }

    public void setNumejemplares(int numejemplares) {
        this.numejemplares = numejemplares;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro=" + idLibro +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numpaginas=" + numpaginas +
                ", edicion='" + edicion + '\'' +
                ", idioma='" + idioma + '\'' +
                ", fechapublicacion=" + fechapublicacion +
                ", descripcion='" + descripcion + '\'' +
                ", tipodepasta='" + tipodepasta + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numejemplares=" + numejemplares +
                ", portada='" + portada + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", autor=" + autor +
                '}';
    }

    public void setLibro(Libro libro) {
    }
}
