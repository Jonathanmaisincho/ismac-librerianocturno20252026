package com.distribuida.service;


import com.distribuida.dao.ClienteRepository;
import com.distribuida.dao.FacturaRepository;
import com.distribuida.model.Cliente;
import com.distribuida.model.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl implements FacturaService {


    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    @Override
    public Factura finOne(int id) {
        return null;
    }

    @Override
    public Factura save(Factura factura) {
        return null;
    }

    @Override
    public Factura update(Factura factura) {
        return null;
    }

    @Override
    public Factura update(int id, Factura factura) {

        Optional<Factura> facturaExistente = facturaRepository.findById(id);

        if (facturaExistente == null) {

            return null;
        }

        facturaExistente.orElse(null).setNumFactura(factura.getNumFactura());
        facturaExistente.orElse(null).setFecha(factura.getFecha());
        facturaExistente.orElse(null).setTotal(factura.getTotalNeto());
        facturaExistente.orElse(null).setIva(factura.getIva());
        facturaExistente.orElse(null).setTotal(factura.getTotal());

        facturaExistente.orElse(null).setCliente(factura.getCliente());

        return facturaRepository.save(facturaExistente.orElse(null));
    }

    @Override
    public void delete(int id) {

        if (facturaRepository.existsById(id)) {

            facturaRepository.deleteById(id);
        }

    }
}
