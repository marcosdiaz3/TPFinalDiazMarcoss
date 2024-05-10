package ar.com.institucion.controller;

import ar.com.institucion.model.Alumno;
import ar.com.institucion.service.AlumnoService;
import ar.com.institucion.util.ListadoAlumnos;
import ch.qos.logback.core.model.Model;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlumnoController {
	@Autowired
	Alumno alu;
	
	@Autowired
	AlumnoService alumnoservice;
	
	@GetMapping({"/index"})
	public String index(Model model) {
		return "index";
	}

	@GetMapping({"/alumno"})
	public ModelAndView cargarAlumno() {
		
		ModelAndView modelView = new ModelAndView ("alumno");
		modelView.addObject("alumno", alu);
		
		return modelView;	
	}
	
	@PostMapping("/cargarAlumno")
    public ModelAndView cargarAlumno(@ModelAttribute Alumno alumno) {
	
		alumnoservice.guardarAlumno(alumno);
        ModelAndView modelView = new ModelAndView ("listadoAlumnos");
        modelView.addObject("listado", alumnoservice.buscarTodosAlumnos());
		return modelView;	
	}
	
	//Metodo para eliminar un registro
	@GetMapping("/eliminarAlumno/{dni}")
	public String eliminarAlumno(@PathVariable Integer dni) throws Exception {
		alumnoservice.eliminarAlumno(dni);
		
		return "redirect:/mostrarListado";	
	}
	
	@GetMapping("/mostrarListado")
	public ModelAndView mostrarAlumnos(){

		ModelAndView listado = new ModelAndView("listadoAlumnos");
		listado.addObject("listado", alumnoservice.buscarTodosAlumnos());
		
		return listado;	
	}
	
	//Metodo para modificar alumno
	@GetMapping("/modificarAlumno/{dni}")
	public ModelAndView modificarAlumno(@PathVariable Integer dni) throws Exception {
		
		ModelAndView modificaAlumno = new ModelAndView("alumno");
		modificaAlumno.addObject("alumno", alumnoservice.encontrarUnAlumno(dni));
		
		return modificaAlumno;	
	}
	
	@PostMapping("/modificarAlumno")
    public ModelAndView modificarUnAlumno(@ModelAttribute("alumno") Alumno alumno) {
		
        alumnoservice.guardarAlumno(alumno);
        ModelAndView modelView = new ModelAndView ("listadoAlumnos");
        modelView.addObject("listado", alumnoservice.buscarTodosAlumnos());
		return modelView;	
	}
	
}
