package com.example.orm_gestion_institutojpa.repositories;

import com.example.orm_gestion_institutojpa.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlumnoMyRepository extends JpaRepository<Alumno, Long> {
/*
    //@Autowired
    private MyRepository repositorio;

    @Override
    public List<Alumno> findAll() {

        return (List<Alumno>) repositorio.findAll();
    }

    @Override
    public Optional<Alumno> findOneById(int id){
        return Optional.of((Alumno) repositorio.findById(id).orElse(null));
    }



    @Override
    public Alumno updateById(int id){
        return (Alumno) repositorio.updateById(id);
    }


    @Override
    public void deleteById(int id) {

        repositorio.deleteById(id);
    }

*/

}
