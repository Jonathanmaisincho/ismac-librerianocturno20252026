package com.distribuida.dao;


import com.distribuida.model.Autor;
import com.distribuida.model.Categoria;
import com.distribuida.model.Libro;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)

public class LibroTestIntegracion {

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private AutorRepository autorRepository;

    @Test
    public void testLibroFindAll(){
        List<Libro> libros = libroRepository.findAll();
        assertNotNull(libros);
        assertTrue(libros.size()>0);
        libros.forEach(System.out::println);
    }


    @Test
    public void testLibroFindOne(){
        Optional<Libro> libro = libroRepository.findById(1);
        assertTrue(libro.isPresent());
        assertEquals("Spring in Action", libro.orElse(null).getTitulo());
        assertEquals(700, libro.orElse(null).getNumpaginas());

        System.out.println(libro);

    }

    @Test
    public void testLibroSave(){
        Optional<Categoria> categoria = categoriaRepository.findById(1);
        assertTrue(categoria.isPresent());

        Optional<Autor> autor = autorRepository.findById(1);
        assertTrue(autor.isPresent());

        Libro libro1 = new Libro();
        libro1.setIdLibro(0);
        libro1.setTitulo("La dama tapada");
        libro1.setEditorial("la noche oscura");
        libro1.setNumpaginas(100);
        libro1.setEdicion("ISMAC SOFTWARE");
        libro1.setIdioma("Español");
        libro1.setFechapublicacion("12-11-2025");
        libro1.setDescripcion("es un relato hecho para los hombres borrachos");
        libro1.setTipodepasta("TRANS");
        libro1.setISBN("123456789");
        libro1.setNumejemplares(10);
        libro1.setPortada("Vestido de negro");
        libro1.setPresentacion("libro x 100pag");
        libro1.setPrecio(12.50);
        libro1.setCategoria(categoria.orElse(null));
        libro1.setAutor(autor.orElse(null));

        Libro libroGuardado = libroRepository.save(libro1);
        assertNotNull(libroGuardado);
        assertEquals("La dama tapada", libroGuardado.getTitulo());
        assertEquals(100, libroGuardado.getNumpaginas());

        libroRepository.save(libro1);


    }
    @Test
    public void testLibroUpdate(){
        Optional<Libro> libro = libroRepository.findById(79);
        assertTrue(libro.isPresent());
        Optional<Categoria> categoria = categoriaRepository.findById(2);
        assertTrue(categoria.isPresent());
        Optional<Autor> autor = autorRepository.findById(2);
        assertTrue(autor.isPresent());

        libro.orElse(null).setTitulo("caperucita");
        libro.orElse(null).setEditorial("Roja");
        libro.orElse(null).setNumpaginas(100);
        libro.orElse(null).setEdicion("camaleones");
        libro.orElse(null).setIdioma("Ingles");
        libro.orElse(null).setFechapublicacion("28-05-2025");
        libro.orElse(null).setDescripcion("cuentos jovenes");
        libro.orElse(null).setTipodepasta("duro");
        libro.orElse(null).setISBN("55555");
        libro.orElse(null).setNumejemplares(20);
        libro.orElse(null).setPortada("cuentos");
        libro.orElse(null).setPresentacion("antiguo");
        libro.orElse(null).setPrecio(49.50);
        libro.orElse(null).setCategoria(categoria.orElse(null));
        libro.orElse(null).setAutor(autor.orElse(null));

        Libro libroActualizado = libroRepository.save(libro.orElse(null));
        assertNotNull(libroActualizado);
        assertEquals("el lobo", libroActualizado.getTitulo());
        assertEquals(100, libroActualizado.getNumpaginas());

        libroRepository.save(libro.orElse(null));




    }
    @Test
    public void testLibroDelete(){
        libroRepository.deleteById(79);{
            libroRepository.deleteById(79);
        }
        assertFalse(libroRepository.existsById(79));
    }


}


