package com.example.orm_gestion_institutojpa.controladores;

import com.example.orm_gestion_institutojpa.entities.Alumno;
import com.example.orm_gestion_institutojpa.servicios.Servicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.plaf.metal.MetalLabelUI;


@Controller
public class WebController {

    //No usamos autowired porque servicio no es una interfaz,
    // está implementado por lo que puedo crear una instancia sin problema
    //@Autowired
    private Servicio servicio;


    public WebController(Servicio servicio) {
        this.servicio = servicio;
    }


    //Index
    @GetMapping({"/", "", "/index", "/home"})
    public String index(){
    //model.addAttribute("pilotos", servicio.findAllPilotos());
        //model.addAttribute("titulo", "Springboot backend API MVC");
        return "index";
    }

    //Apartado Alumnos
    @GetMapping({"/alumnos"})
    public String apartadoAlumnos(){
        return "alumnado/alumnos";
    }

    //Apartado Profesorado
    @GetMapping({"/profesorado"})
    public String apartadoProfesorado(){
        return "profesorado/profesorado";
    }

    //Apartado Modulos
    @GetMapping({"/modulos"})
    public String apartadoModulos(){
        return "modulos/modulos";
    }

    /*
    GESTION ALUMNADO
     */

    //Listar Alumnado
    @GetMapping({"/alumnos/listarAlumnado"})
    public String listarAlumnado(Model model){
        model.addAttribute("alumnos", servicio.listarAlumno());
        model.addAttribute("titulo", "LISTA DE ALUMNADO");
        return "alumnado/listarAlumnado";
    }

    //NuevoAlumno
    @GetMapping(value = "/alumnos/nuevoAlumno")
    public String nuevoAlumno(Model model) {
        Alumno alumno = new Alumno();
        model.addAttribute("alumno", alumno);
        model.addAttribute("titulo", "NUEVO ALUMNO");
        return "alumnado/nuevoAlumno";
    }

    //Cuando desde nuevoAlumno.html le doy al botón y guardo al alumno, vuelvo a /alumnos
    //pero esta vez con post, porque vengo desde un formulario,
    // por eso tengo que tener una función @PostMapping
    //GUARDAR ALUMNO
    @PostMapping(value = "/alumnos")
    public String guardarAlumno(@ModelAttribute("alumno") Alumno alumno) {
        servicio.inseralumno(alumno);
        return "redirect:/alumnos";
    }

    //BORRAR ALUMNO
    @GetMapping(value="/alumnos/borrarAlumno")
    public String borrarAlumno(Model model){
        Alumno alumno = new Alumno();
        model.addAttribute("alumno", alumno);
        model.addAttribute("titulo", "BORRAR ALUMNO");
        return "alumnado/borrarAlumno";
    }
    @PostMapping(value = "/alumnoBorrado")
    public String deleteAlumno(@ModelAttribute("alumno") Alumno alumno) {
        servicio.borrarAlumno(Long.valueOf(alumno.getId()));
        return "redirect:/alumnos";
    }

    /*
    GESTION MODULOS
     */

    //Listar Modulos
    @GetMapping({"/modulos/listarModulos"})
    public String listarModulos(Model model){
        model.addAttribute("modulos", servicio.listarModulo());
        model.addAttribute("titulo", "LISTA DE MODULOS");
        return "modulos/listarModulos";
    }


    /*
    GESTION PROFESORADO
     */

    //Listar Profesorado
    @GetMapping({"/profesorado/listarProfesorado"})
    public String listarProfesorado(Model model){
        model.addAttribute("profesorado", servicio.listarProfesorado());
        model.addAttribute("titulo", "LISTA DE PROFESORADO");
        return "profesorado/listarProfesorado";
    }

}