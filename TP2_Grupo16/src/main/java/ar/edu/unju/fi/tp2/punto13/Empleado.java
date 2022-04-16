package ar.edu.unju.fi.tp2.punto13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleado {
	private String nombre;
	private Date fecha;
	private Integer legajo;
	private String email;
	private Double sueldo;
	private Integer horas;
	
	/*
	 * Constructor parametrisado
	 */
	public Empleado(String nombre, Date fecha, Integer legajo, String email, Double sueldo, Integer horas) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.legajo = legajo;
		this.email = email;
		this.sueldo = sueldo;
		this.horas = horas;
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

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
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
		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
		return "Empleado [nombre=" + nombre + ", fecha=" + formateador.format(fecha) + ", legajo=" + legajo + ", email=" + email
				+ ", sueldo=" + sueldo + ", horas=" + horas + "]";
	}	
}