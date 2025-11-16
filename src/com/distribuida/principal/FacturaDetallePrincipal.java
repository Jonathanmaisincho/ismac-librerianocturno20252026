package com.distribuida.principal;
import com.distribuida.beans.*;


import java.util.Date;


public class FacturaDetallePrincipal {


    public static void main(String[] arg){

    Factura factura = new Factura();

        factura.setIdFactura(1);
        factura.setNumFactura("FAC-0001");
        factura.setFecha( new Date());
        factura.setTotalNeto(100.100);
        factura.setIva(15.00);
        factura.setTotal(115.00);

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



        FacturaDetalle facturaDetalle = new FacturaDetalle();

         facturaDetalle.setIdFacturaDetalle(2);
         facturaDetalle.setCantidad(4);
         facturaDetalle.setSubtotal(40.80);
         facturaDetalle.setFactura(factura);

                // inyecion de dependencias

        facturaDetalle.setFactura(factura);
        facturaDetalle.setLibro(libro);

        System.out.println(facturaDetalle.toString());
      System.out.println(libro.toString());

    }
}
