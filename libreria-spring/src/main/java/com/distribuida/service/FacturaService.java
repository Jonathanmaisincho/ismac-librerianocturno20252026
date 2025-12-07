package com.distribuida.service;

import com.distribuida.model.Cliente;
import com.distribuida.model.Factura;

import java.util.List;

public interface FacturaService {

    public List<Factura> findAll();

    public Factura finOne(int id);

    public Factura save(Factura factura);

    public Factura update (Factura factura);

    Factura update(int id, Factura factura);

    public void delete(int id);


}
