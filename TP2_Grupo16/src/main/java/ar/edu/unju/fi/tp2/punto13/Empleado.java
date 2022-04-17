package ar.edu.unju.fi.tp2.punto13;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Empleado {
	private String nombre;
	private Calendar fecha;
	private Integer legajo;
	private String email;
	private Double sueldo;
	private Integer horas;
	
	/*
	 * Constructores parametrisados
	 */
	public Empleado(String nombre, Calendar fecha, Integer legajo, String email, Double sueldo, Integer horas) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.legajo = legajo;
		this.email = email;
		this.sueldo = sueldo;
		this.horas = horas;
	}
	
	public Empleado(String nombre, Integer legajo, Integer horas) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(1900,0,1);
		this.nombre = nombre;
		this.legajo = legajo;
		this.horas = horas;
		this.fecha = calendario;
	}
	
	public Empleado(String nombre, Integer horas) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(1900,0,1);
		this.nombre = nombre;
		this.horas = horas;
		this.legajo = -9999;
		this.fecha = calendario;
	}
	
	public Empleado(String nombre, Calendar fecha, Integer horas) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.horas = horas;
		this.legajo = -9999;
	}
	
	public Empleado( ) {
		
	}
	

	/*
	 * Metodos accesores
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		/*
		 * Cambio el formato de fecha para mostrarlo de una forma mas corta
		 */
		if (fecha==null) {
			return "Empleado [nombre=" + nombre + ", fecha=" + "null" + ", legajo=" + legajo + ", email=" + email
					+ ", sueldo=" + sueldo + ", horas=" + horas + "]";
		}
		else {
		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
		return "Empleado [nombre=" + nombre + ", fecha=" + formateador.format(fecha.getTime()) + ", legajo=" + legajo + ", email=" + email
				+ ", sueldo=" + sueldo + ", horas=" + horas + "]";
		}
	}	
}