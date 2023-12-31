package com.example.orm_gestion_institutojpa.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_profesor;
    @Column(length = 30)
    private String nombre;
    @Column(name = "primer_apellido", length = 50)
    private String apellidoUno;
    @Column(name = "segundo_apellido", length = 50)
    private String apellidoDos;
    @Column(unique = true, length = 9)
    private String telefono;
    @OneToOne(fetch =FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn no estaba
    @JoinColumn(name = "profesor_direccion")
    //@PrimaryKeyJoinColumn
    private Direccion direccion;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profesor", cascade = CascadeType.ALL)
    //private Set<Modulo> modulos = new HashSet<>();
    private List<Modulo> modulos = new ArrayList<>();

    public Profesor() {
    }

    public Profesor(String nombre, String apellidoUno, String apellidoDos, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Profesor(String nombre, String apellidoUno, String apellidoDos, String telefono, Direccion direccion, List<Modulo> modulos){//, Set<Modulo> modulos) {
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.modulos = modulos;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public int getId() {
        return id_profesor;
    }

    public void setId(int id) {
        this.id_profesor = id_profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public String getApellidoDos() {
        return apellidoDos;
    }

    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id_profesor +
                ", nombre='" + nombre + '\'' +
                ", apellidoUno='" + apellidoUno + '\'' +
                ", apellidoDos='" + apellidoDos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
