package com.example.orm_gestion_institutojpa;

import com.example.orm_gestion_institutojpa.entities.Alumno;
import com.example.orm_gestion_institutojpa.entities.Direccion;
import com.example.orm_gestion_institutojpa.entities.Modulo;
import com.example.orm_gestion_institutojpa.entities.Profesor;
import com.example.orm_gestion_institutojpa.repositories.AlumnoMyRepository;
import com.example.orm_gestion_institutojpa.repositories.DireccionMyRepository;
import com.example.orm_gestion_institutojpa.repositories.ModuloMyRepository;
import com.example.orm_gestion_institutojpa.repositories.ProfesorMyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest

public class InsertTest {

    @Autowired
    AlumnoMyRepository alumno;
    @Autowired
    DireccionMyRepository direccion;
    @Autowired
    ModuloMyRepository modulo;
    @Autowired
    ProfesorMyRepository profesor;

    Alumno a1 = new Alumno("Juan", "Lopez", "Tormo", "111111111", "123456789");
    Alumno a2 = new Alumno("Roberto", "Sanchez", "Martín", "222222222", "987654321");
    Direccion d1 = new Direccion("Gran Via", 28, "Madrid", "Madrid");
    Direccion d2 = new Direccion("Boqueras", 17, "Almazora", "Castellon");
    Profesor p1 = new Profesor("Juan", "Rodriguez", "Gil", "751359684", d1);
    Profesor p2 = new Profesor("Sara", "Fernandez", "Mera", "153957846", d2);
    Modulo m1 = new Modulo("Matematicas", "2ESO", 8, p1);
    Modulo m2 = new Modulo("Fisica", "3ESO", 5, p2);
    @Test
    public void inseralumno() {
        alumno.save(a1);
        alumno.save(a2);
    }

    @Test
    public void insertaDireccion() {
        direccion.save(d1);
        direccion.save(d2);
    }

    @Test
    public void insertaProfesor() {
         modulo.save(m1);
        modulo.save(m2);
    }

    @Test
    public void insertaModulo() {
        modulo.save(m1);
        modulo.save(m2);
    }

    @Test
    public void findModById(){
        System.out.println("Buscar al modulo por su id");
        Optional<Modulo> m1copia = modulo.findById(Long.valueOf(m1.getId()));
        if(m1copia.isPresent()) {
            System.out.println(m1copia);
        } else {
            System.out.println("El id del modulo no existe");
        }
    }

    @Test
    public void updateModulo(){
        System.out.println("Actualizo un modulo");
        m2.setNombre("Inglés");
        modulo.save(m2);
        System.out.println(m2);
    }

}
