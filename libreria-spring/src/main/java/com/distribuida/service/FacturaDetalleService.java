package com.distribuida.service;

import com.distribuida.model.Cliente;
import com.distribuida.model.FacturaDetalle;

import java.util.List;

public interface FacturaDetalleService {

    public List<FacturaDetalle> findAll();

    public FacturaDetalle finOne(int id);

    public FacturaDetalle save(FacturaDetalle facturaDetalle);

    public FacturaDetalle update (FacturaDetalle facturaDetalle);

    FacturaDetalle update(int id, FacturaDetalle facturaDetalle);

    public void delete(int id);

}
