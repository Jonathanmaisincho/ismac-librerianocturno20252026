package com.distribuida.Controller;

import com.distribuida.model.Autor;
import com.distribuida.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autores")
public class AutorController {


    @Autowired
    private AutorService AutorService;

    @GetMapping
    public ResponseEntity<List<Autor>> findAll() {

        List<Autor> Autors = AutorService.findAll();
        return ResponseEntity.ok(Autors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> findOne(@PathVariable int id) {
        Optional<Autor> Autor = AutorService.findOne(id);
        if (Autor == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Autor.orElse(null));
    }

    @PostMapping
    public ResponseEntity<Autor> save(@RequestBody Autor Autor) {
        Autor AutorNuevo = AutorService.save(Autor);
        return ResponseEntity.ok(AutorNuevo);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> update(@PathVariable int id, @RequestBody Autor Autor) {
        Autor AutorActualizado = AutorService.update(id, Autor);
        if(AutorActualizado == null){
            return ResponseEntity.notFound().build();

        }
        return ResponseEntity.ok(AutorActualizado);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        AutorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
