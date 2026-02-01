package com.distribuida.Controller;


import com.distribuida.model.Libro;
import com.distribuida.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Libros")
public class LibroController {


    @Autowired
    private LibroService LibroService;

    @GetMapping
    public ResponseEntity<List<Libro>> findAll() {

        List<Libro> Libros = LibroService.findAll();
        return ResponseEntity.ok(Libros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> findOne(@PathVariable int id) {
        Optional<Libro> Libro = LibroService.findOne(id);
        if (Libro == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Libro.orElse(null));
    }

    @PostMapping
    public ResponseEntity<Libro> save(@RequestBody Libro Libro) {
        Libro LibroNuevo = LibroService.save(Libro);
        return ResponseEntity.ok(LibroNuevo);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> update(@PathVariable int id, @RequestBody Libro Libro) {
        Libro LibroActualizado = LibroService.update(id, Libro);
        if(LibroActualizado == null){
            return ResponseEntity.notFound().build();

        }
        return ResponseEntity.ok(LibroActualizado);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        LibroService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
