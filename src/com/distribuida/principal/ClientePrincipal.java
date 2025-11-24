package com.distribuida.principal;

import com.distribuida.beans.Cliente;

public class ClientePrincipal {

    public static void main(String[] arg){

        Cliente cliente = new Cliente(1, "1754421483", "Juan", "Taip", "Av. por ahi", "099182457","hola@goo.edu.ec");
        System.out.println(cliente.toString());




    }
}
