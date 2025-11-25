package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTestUnitaria {

    private Cliente cliente;


    @BeforeEach
    public void setUp() {
        cliente = new Cliente(1, "1754421483", "Juan", "Taipe", "Direccion1", "0991801937", "jtaipe@correo.com");
    }

    @Test
    public void testClienteConstructor() {
        assertAll("validar datos cliente - Constructor",
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("1754421483", cliente.getCedula()),
                () -> assertEquals("Juan", cliente.getNombre()),
                () -> assertEquals("Taipe", cliente.getApellido()),
                () -> assertEquals("Direccion1", cliente.getDireccion()),
                () -> assertEquals("0991801937", cliente.getTelefono()),
                () -> assertEquals("jtaipe@correo.com", cliente.getCorreo())

        );
    }

    @Test
    public void testClienteSetters() {

        cliente.setIdCliente(2);
        cliente.setCedula("1754421482");
        cliente.setNombre("Juan2");
        cliente.setApellido("Taipe2");
        cliente.setDireccion("Direccion2");
        cliente.setTelefono("0998521453");
        cliente.setCorreo("jtaipe2@correo.com");

        assertAll("validar datos cliente - Setters",
                () -> assertEquals(2, cliente.getIdCliente()),
                () -> assertEquals("1754421482", cliente.getCedula()),
                () -> assertEquals("Juan2", cliente.getNombre()),
                () -> assertEquals("Taipe2", cliente.getApellido()),
                () -> assertEquals("Direccion2", cliente.getDireccion()),
                () -> assertEquals("0998521453", cliente.getTelefono()),
                () -> assertEquals("jtaipe2@correo.com", cliente.getCorreo())

        );


    }

    @Test
    public void clienteTestToString() {
        String str = cliente.toString();
        assertAll("Validar datos cliente - To String",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1754421483")),
                () -> assertTrue(str.contains("Juan")),
                () -> assertTrue(str.contains("Taipe")),
                () -> assertTrue(str.contains("Direccion1")),
                () -> assertTrue(str.contains("0991801937")),
                () -> assertTrue(str.contains("jtaipe@correo.com"))
        );
    }

    @Test
    public void AutorTestInyector() {
        assertAll("Validar metodo inyector - autor",
                () -> assertNotNull(cliente.getIdCliente())


        );
    }
}





