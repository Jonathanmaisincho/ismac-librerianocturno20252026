package com.distribuida.principal;
import com.distribuida.beans.Factura;
import com.distribuida.beans.FacturaDetalle;


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


    FacturaDetalle facturaDetalle = new FacturaDetalle();

         facturaDetalle.setIdFacturaDetalle(2);
         facturaDetalle.setCantidad(4);
         facturaDetalle.setSubtotal(40.80);
         facturaDetalle.setFactura(factura);

                // inyecion de dependencias

        facturaDetalle.setFactura(factura);

        System.out.println(facturaDetalle.toString());

    }
}
