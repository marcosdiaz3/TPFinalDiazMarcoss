package ar.com.institucion.model;

import java.time.LocalDate;
import java.time.Period;
import org.springframework.stereotype.Component;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
@Entity
@Component

public class Alumno {
	@Column 	
@Id
	private Integer dni;
	@Column 
	private String nombre;
	@Column 
	private String apellido;
	@Column 
	private String direccionCiudad;
	@Column 
	private LocalDate fechaNac;
	@Column 
	private String telefono;
	@Column
	private Boolean estado;
	
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccionCiudad() {
		return direccionCiudad;
	}
	public void setDireccionCiudad(String direccionCiudad) {
		this.direccionCiudad = direccionCiudad;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}
	