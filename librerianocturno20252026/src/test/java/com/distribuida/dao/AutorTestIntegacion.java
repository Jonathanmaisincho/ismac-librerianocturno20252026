package com.distribuida.dao;

import com.distribuida.model.Autor;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)

public class AutorTestIntegacion {

    @Autowired
    private AutorRepository autorRepository;


    @Test
    public void testAutorFindAll(){

        List<Autor> autor = autorRepository.findAll();
        for (Autor item:autor){
            System.out.println(item.toString());
        }
    }

    @Test
    public void testAutorFindOne(){
        Optional<Autor> autor = autorRepository.findById(1);
        System.out.println(autor);
    }

    @Test
    public void testAutorSave(){
        Autor autor = new Autor(0, "Nelly","Coello","Ecuador","av. checa","0991801937","ncoello@correo.com");
    autorRepository.save(autor);

    }

    @Test
    public void testAutorActualizar(){
        Optional<Autor> autor = autorRepository.findById(59);



        autor.orElse(null).setNombre("Ingrid");
        autor.orElse(null).setApellido("Farinango");
        autor.orElse(null).setPais("Peru");
        autor.orElse(null).setDireccion("av. loma");
        autor.orElse(null).setTelefono("0998562431");
        autor.orElse(null).setCorreo("IFarinango@correo.com");

        autorRepository.save(autor.orElse(null));


    }

    @Test
    public void testClienteBorrar(){
        autorRepository.deleteById(54);
    }


}


