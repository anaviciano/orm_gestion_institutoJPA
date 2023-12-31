package com.example.orm_gestion_institutojpa.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "modulos")
public class Modulo{//} implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String curso;
    private int horas;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "modulo_alumno")
    private List<Alumno> alumnos = new ArrayList<>();

    public Modulo() {
    }

    public Modulo(String nombre, String curso, int horas) {
        this.nombre = nombre;
        this.curso = curso;
        this.horas = horas;
    }

    public Modulo(String nombre, String curso, int horas, Profesor profesor) {
        this.nombre = nombre;
        this.curso = curso;
        this.horas = horas;
        this.profesor = profesor;
    }

    public Modulo(int id, String nombre, String curso, int horas, Profesor profesor, List<Alumno> alumnos) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.horas = horas;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", horas=" + horas +
                ", profesor=" + profesor +
                ", alumnos=" + alumnos +
                '}';
    }

    public void anyadirAl(Alumno alumno) {
        this.alumnos.add(alumno);
        alumno.getModulos().add(this);
    }
    public void deleteAl(Alumno alumno) {
        this.alumnos.remove(alumno);
        alumno.getModulos().remove(this);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        Modulo modulo = (Modulo) o;
        return Objects.equals(this.nombre, modulo.nombre);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.nombre);
    }
}

