package ar.com.institucion.util;

import java.util.ArrayList;
import java.util.List;

import ar.com.institucion.model.Alumno;

public class ListadoAlumnos {
	
	private static List<Alumno> listado = new ArrayList<>();
	
	public ListadoAlumnos() {
		// TODO Auto-generated constructor stub
	}

	public static List<Alumno> getListado() {
		return listado;
	}

	public static void setListado(List<Alumno> listado) {
		ListadoAlumnos.listado = listado;
	}
	

}