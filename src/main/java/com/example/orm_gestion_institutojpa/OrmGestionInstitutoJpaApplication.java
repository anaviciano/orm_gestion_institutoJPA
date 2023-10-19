package com.example.orm_gestion_institutojpa;

import com.example.orm_gestion_institutojpa.entities.Alumno;
import com.example.orm_gestion_institutojpa.entities.Direccion;
import com.example.orm_gestion_institutojpa.entities.Modulo;
import com.example.orm_gestion_institutojpa.entities.Profesor;
import com.example.orm_gestion_institutojpa.repositories.AlumnoMyRepository;
//import com.example.orm_gestion_institutojpa.repositories.DireccionMyRepository;
//import com.example.orm_gestion_institutojpa.repositories.ModuloMyRepository;
//import com.example.orm_gestion_institutojpa.repositories.ProfesorMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Optional;

@SpringBootApplication
public class OrmGestionInstitutoJpaApplication {
    //static Servicio servicio = new Servicio();

    public static void main(String[] args) {

        SpringApplication.run(OrmGestionInstitutoJpaApplication.class, args);
//
//        Direccion d1 = new Direccion("Gran Via", 28, "Madrid", "Madrid");
//        Direccion d2 = new Direccion("Boqueras", 17, "Almazora", "Castellon");
//
//        Profesor p1 = new Profesor("Juan", "Rodriguez", "Gil", "751359684", d1);
//        Profesor p2 = new Profesor("Sara", "Fernandez", "Mera", "153957846", d2);
//
//        Alumno a1 = new Alumno("Juan", "Lopez", "Tormo", "111111111", "123456789");
//        Alumno a2 = new Alumno("Roberto", "Sanchez", "Martín", "222222222", "987654321");
//
//        Modulo m1 = new Modulo("Matematicas", "2ESO", 8, p1);
//        m1.anyadirAl(a1);
//        Modulo m2 = new Modulo("Fisica", "3ESO", 5, p2);
//        m2.anyadirAl(a2);
///*
//        ModuloMyRepository modulos = new ModuloMyRepository();
//        modulos.save(m1);
//        modulos.save(m2);
//
//        DireccionMyRepository direcciones = new DireccionMyRepository();
//        direcciones.save(d1);
//        direcciones.save(d2);
//*/
//        System.out.println();
//
//        System.out.println("Creación de los alumnos");
//        servicio.inseralumno(a1);
//        servicio.inseralumno(a2);
///*
//        System.out.println();
//
//        System.out.println("Creación de los profesores");
//        ProfesorMyRepository profesores = new ProfesorMyRepository();
//        profesores.save(p1);
//        profesores.save(p2);
//
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println("Imprimo modulos");
//        modulos.findAll().forEach(System.out::println);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//        System.out.println();
//
//        System.out.println("Buscar al modulo por su id");
//        Optional<Modulo> m1copia = modulos.findOneById(m1.getId());
//        if(m1copia.isPresent()) {
//            System.out.println(m1copia);
//        } else {
//            System.out.println("El id del modulo no existe");
//        }
//
//        System.out.println();
//
//        Optional<Modulo> moduloNoExiste = modulos.findOneById(4);
//        if(moduloNoExiste.isPresent()) {
//            System.out.println(moduloNoExiste);
//        } else {
//            System.out.println("El id del modulo no existe");
//        }
//
//        System.out.println();
//
//        System.out.println("Actualizo un modulo");
//        m2.setNombre("Inglés");
//        modulos.updateById(m2.getId());
//        System.out.println(m2);
//
//        System.out.println();
//        modulos.delete(m2);
//
//        System.out.println();
//
//        System.out.println("Borrado y lectura");
//        modulos.findAll().forEach(System.out::println);
//*/
    }

}
