package ar.com.institucion.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import ar.com.institucion.model.Alumno;

//@Repository
public interface AlumnoRepository extends CrudRepository <Alumno, Integer>{
	public List<Alumno> findByEstado(Boolean estado);
}