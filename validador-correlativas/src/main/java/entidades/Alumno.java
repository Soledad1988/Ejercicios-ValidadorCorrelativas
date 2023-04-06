package entidades;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;
	private String legajo;
	private List<Materia> materiasAprobadas;
	
	public Alumno() {
		this.materiasAprobadas = new ArrayList<Materia>();
	}
	
	public Alumno(String nombre, String legajo) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.materiasAprobadas = new ArrayList<Materia>();
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public List<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(Materia materia) {
		materiasAprobadas.add(materia);
	}
	
	
}
