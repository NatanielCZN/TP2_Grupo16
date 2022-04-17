package ar.edu.unju.fi.tp2.punto15;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fecha;
	
	/*
	 * Constructor parametrizado
	 */
	public Persona(String nombre, Calendar fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
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
	
	/*
	 * Metodo que calcula la edad de la persona
	 */
	public Integer calcularEdad() {
		/*
		 * Coloco la fecha en un formato legible para comparar
		 */
		LocalDate fechaA = LocalDate.of(fecha.get(Calendar.YEAR),fecha.get(Calendar.MONTH),fecha.get(Calendar.DAY_OF_MONTH));
		
		/*
		 * Creo el objeto calendario que contendra la fecha actual. Luego lo coloco en un formato legible para comparar
		 */
		Calendar calendario = Calendar.getInstance();
		LocalDate fechaB = LocalDate.of(calendario.get(Calendar.YEAR),calendario.get(Calendar.MONTH),calendario.get(Calendar.DAY_OF_MONTH));		
		
		/*
		 * Almaceno el resultado de aplicar el metodo between. El cual compara 2 fechas entre si
		 */
		Period periodo = Period.between(fechaA, fechaB);
		
		return periodo.getYears();
	}
	
	/*
	 * Metodo que retornara el signo zodiacal correspondiente a la persona
	 */
	public String obtenerSignoDelZodiaco() {
		String signo;
		
		switch (fecha.get(Calendar.MONTH)) {
		case 0:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 19) {
				signo = "ACUARIO";
			}else {
				signo = "CAPRICORNIO";
			}
			break;
		case 1:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 18) {
				signo = "PISCIS";
			}else {
				signo = "ACUARIO";
			}
			break;
		case 2:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 20) {
				signo = "ARIES";
			}else {
				signo = "PISCIS";
			}
			break;
		case 3:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 19) {
				signo = "TAURO";
			}else {
				signo = "ARIES";
			}
			break;
		case 4:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 20) {
				signo = "GEMINIS";
			}else {
				signo = "TAURO";
			}
			break;
		case 5:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 20) {
				signo = "CANCER";
			}else {
				signo = "GEMINIS";
			}
			break;
		case 6:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 22) {
				signo = "LEO";
			}else {
				signo = "CANCER";
			}
			break;
		case 7:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 22) {
				signo = "VIRGO";
			}else {
				signo = "LEO";
			}
			break;
		case 8:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 22) {
				signo = "LIBRA";
			}else {
				signo = "VIRGO";
			}
			break;
		case 9:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 22) {
				signo = "ESCORPIO";
			}else {
				signo = "LIBRA";
			}
			break;
		case 10:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 21) {
				signo = "SAGITARIO";
			}else {
				signo = "ESCORPIO";
			}
			break;
		case 11:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 21) {
				signo = "CAPRICORNIO";
			}else {
				signo = "SAGITARIO";
			}
			break;
		default:
			signo = null;
			break;
		}
		return signo;
	}
	
	/*
	 * Metodo que retornara la estacion del año cuando nacio la persona
	 */
	public String obtenerEstacionDelAño() {
		String estacion;
		
		switch (fecha.get(Calendar.MONTH)) {
		case 0:
			estacion = "VERANO";
			break;
		case 1:
			estacion = "VERANO";
			break;
		case 2:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 20) {
				estacion = "OTOÑO";
			}else {
				estacion = "VERANO";
			}
			break;
		case 3:
			estacion = "OTOÑO";
			break;
		case 4:
			estacion = "OTOÑO";
			break;
		case 5:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 20) {
				estacion = "INVIERNO";
			}else {
				estacion = "OTOÑO";
			}
			break;
		case 6:
			estacion = "INVIERNO";
			break;
		case 7:
			estacion = "INVIERNO";
			break;
		case 8:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 20) {
				estacion = "PRIMAVERA";
			}else {
				estacion = "INVIERNO";
			}
			break;
		case 9:
			estacion = "PRIMAVERA";
			break;
		case 10:
			estacion = "PRIMAVERA";
			break;
		case 11:
			if(fecha.get(Calendar.DAY_OF_MONTH) > 20) {
				estacion = "VERANO";
			}else {
				estacion = "PRIMAVERA";
			}
			break;
		default:
			estacion = null;
			break;
		}
		return estacion;
	}
}