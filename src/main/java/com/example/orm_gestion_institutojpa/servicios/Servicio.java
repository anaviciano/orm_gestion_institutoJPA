package com.example.orm_gestion_institutojpa.servicios;

import com.example.orm_gestion_institutojpa.entities.Alumno;
import com.example.orm_gestion_institutojpa.entities.Direccion;
import com.example.orm_gestion_institutojpa.entities.Modulo;
import com.example.orm_gestion_institutojpa.entities.Profesor;
import com.example.orm_gestion_institutojpa.repositories.AlumnoMyRepository;
import com.example.orm_gestion_institutojpa.repositories.DireccionMyRepository;
import com.example.orm_gestion_institutojpa.repositories.ModuloMyRepository;
import com.example.orm_gestion_institutojpa.repositories.ProfesorMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio {
    //AlumnoMyRepository es una interfaz, y al no estar implementada no la puedo instanciar.
    //Por ello utilizo @Autowired
    @Autowired
    AlumnoMyRepository alumno;

    @Autowired
    DireccionMyRepository direccion;

    @Autowired
    ModuloMyRepository modulo;

    @Autowired
    ProfesorMyRepository profesor;

    //INSERCIONES
    public Alumno inseralumno(Alumno alum) {
        //Save se encarga de registra los datos.
        return alumno.save(alum);
    }

    public Direccion inserDireccion(Direccion dire) {
        //Save se encarga de registra los datos.
        return direccion.save(dire);
    }

    public Profesor inserProfesor(Profesor prof) {
        //Save se encarga de registra los datos.
        return profesor.save(prof);
    }

    public Modulo inserModulo(Modulo mod) {
        //Save se encarga de registra los datos.
        return modulo.save(mod);
    }

    //LISTAR ALUMNO
    public List<Alumno> listarAlumno() {
        //Save se encarga de registra los datos.
        return alumno.findAll();
        //return (List<Alumno>) alumno.findAll();
    }

    //LISTAR MODULO
    public List<Modulo> listarModulo() {
        //Save se encarga de registra los datos.
        return modulo.findAll();
    }

    //LISTAR PROFESORADO
    public List<Profesor> listarProfesorado() {
        return profesor.findAll();
    }

    //BORRAR ALUMNO
    public void borrarAlumno(Long id){
         alumno.deleteById(id);
    }


}
