package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacturaDetalleTestUnitaria {

    private Factura factura;
    private Libro libro;
    private FacturaDetalle facturaDetalle;

    @BeforeEach
    public void setUp() {


        factura = new Factura(1, "FAC-0001", new Date(), 100.100, 15.00, 15.00, 1);
        libro = new Libro(1,"La Sombra de los Vientos Eternos","Aurora",432,"1ª edición","Español","2023-09-15 00:00:00","Una novela fantástica que narra la aventura de un joven destinado a proteger un antiguo secreto","Tapa dura","978-1-23456-789-7",25,"portadas/sombra_vientos.jpg","Libro de lujo con sobrecubierta",349.99);

        facturaDetalle = new FacturaDetalle();
        facturaDetalle.setIdFacturaDetalle(2);
        facturaDetalle.setCantidad(4);
        facturaDetalle.setSubtotal(40.80);

        // inyeccion de dependencias

        facturaDetalle.setFactura(factura);
        facturaDetalle.setLibro(libro);

    }

//Factura
    @Test
    public void facturadetalleTestConstructor() {
        assertAll("Validad Constructor - FacturaDetalle",
                () -> assertEquals(2, facturaDetalle.getIdFacturaDetalle()),
                () -> assertEquals(4, facturaDetalle.getCantidad()),

                () -> assertEquals(40.80, facturaDetalle.getSubtotal())

        );
    }

    @Test
    public void facturaTestSetters() {

        factura = new Factura(1, "FAC-0001", new Date(), 100.100, 15.00, 15.00, 1);
        libro = new Libro(1,"La Sombra de los Vientos Eternos","Aurora",432,"1ª edición","Español","2023-09-15 00:00:00","Una novela fantástica que narra la aventura de un joven destinado a proteger un antiguo secreto","Tapa dura","978-1-23456-789-7",25,"portadas/sombra_vientos.jpg","Libro de lujo con sobrecubierta",349.99);


        facturaDetalle.setIdFacturaDetalle(3);
        facturaDetalle.setCantidad(4);
        facturaDetalle.setSubtotal(40.25);

        facturaDetalle.setFactura(factura);
        facturaDetalle.setLibro(libro);

        assertAll("Validar Setters - FacturaDetalle",
                () -> assertEquals(3, facturaDetalle.getIdFacturaDetalle()),
                () -> assertEquals(4, facturaDetalle.getCantidad()),
                () -> assertEquals(40.25, facturaDetalle.getSubtotal()),
                () -> assertEquals(0, facturaDetalle.getFactura().getIdFactura()),
                () -> assertEquals(1, facturaDetalle.getLibro().getIdLibro())


        );
    }

    @Test
    public void facturadetalleTestToString() {
        String str = facturaDetalle.toString();
        assertAll("Validar to String - FacturaDetalle",
                () -> assertTrue(str.contains("2")),
                () -> assertTrue(str.contains("4")),
                () -> assertTrue(str.contains("40.8"))

        );
    }

    @Test
    public void facturadetalleTestInyector() {
        assertAll("Validar metodo inyector - FacturaDetalle",
                () -> assertNotNull(facturaDetalle.getFactura()),
                () -> assertEquals(0, facturaDetalle.getFactura().getIdFactura()),
                () -> assertEquals(1, facturaDetalle.getLibro().getIdLibro())


        );
    }

    @Test
    public void facturadetalleValoresNegativos() {
        facturaDetalle.setCantidad(-8);
        assertAll("Validar datos Negativos",
                () -> assertEquals(-8, facturaDetalle.getCantidad()),
                () -> assertEquals(-8, facturaDetalle.getCantidad())
        );
    }


}
