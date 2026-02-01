package com.distribuida.Controller;

import com.distribuida.model.FacturaDetalle;
import com.distribuida.service.FacturaDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/facturadetalles")
public class FacturaDetalleController {


    @Autowired
    private FacturaDetalleService FacturaDetalleService;

    @GetMapping
    public ResponseEntity<List<FacturaDetalle>> findAll() {

        List<FacturaDetalle> FacturaDetalles = FacturaDetalleService.findAll();
        return ResponseEntity.ok(FacturaDetalles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FacturaDetalle> findOne(@PathVariable int id) {
        Optional<FacturaDetalle> FacturaDetalle = FacturaDetalleService.findOne(id);
        if (FacturaDetalle == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(FacturaDetalle.orElse(null));
    }

    @PostMapping
    public ResponseEntity<FacturaDetalle> save(@RequestBody FacturaDetalle FacturaDetalle) {
        FacturaDetalle FacturaDetalleNuevo = FacturaDetalleService.save(FacturaDetalle);
        return ResponseEntity.ok(FacturaDetalleNuevo);

    }

    @PutMapping("/{id}")
    public ResponseEntity<FacturaDetalle> update(@PathVariable int id, @RequestBody FacturaDetalle FacturaDetalle) {
        FacturaDetalle FacturaDetalleActualizado = FacturaDetalleService.update(id, FacturaDetalle);
        if(FacturaDetalleActualizado == null){
            return ResponseEntity.notFound().build();

        }
        return ResponseEntity.ok(FacturaDetalleActualizado);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        FacturaDetalleService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
