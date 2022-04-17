package ar.edu.unju.fi.tp2.punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {
	private LocalDate fecha1;
	private LocalDate fecha2;
	private LocalTime time1;
	private LocalTime time2;
	private LocalDateTime dateTime1;
	private LocalDateTime dateTime2;
	
	/*
	 * Constructor no parametrizado
	 */
	public ProcesoFecha() {
		
	}
	
	/*
	 * Primer constructor parametrizado
	 */
	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}
	
	/*
	 * Segundo constructor parametrizado
	 */
	public ProcesoFecha(LocalTime time1, LocalTime time2) {
		this.time1 = time1;
		this.time2 = time2;
	}
	
	/*
	 * Tercer constructor parametrizado
	 */
	public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}

	/*
	 * Metodos accesores
	 */
	public LocalDate getFecha1() {
		return fecha1;
	}
	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}

	public LocalDate getFecha2() {
		return fecha2;
	}
	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}

	public LocalTime getTime1() {
		return time1;
	}
	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}

	public LocalTime getTime2() {
		return time2;
	}
	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}

	public LocalDateTime getDateTime1() {
		return dateTime1;
	}
	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}

	public LocalDateTime getDateTime2() {
		return dateTime2;
	}
	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}
	
	/*
	 * Metodo que retorna el tiempo transcurrido entre 2 fechas
	 */
	public Period contarTiempoTranscurrido() {
		Period periodo = Period.between(fecha1, fecha2);
		return periodo;
	}
	
	/*
	 * Metodo que formatea la fecha en dd/MM/yyyy
	 */
	public String formatearFecha(LocalDate fecha) {		
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fecha.format(formateador);
	}
	
	/*
	 * Metodo que determina que fecha es mayor
	 */
	public String compararFechas() {
		String mensaje;
		int num = fecha1.compareTo(fecha2);
		
		if(num > 0) {
			mensaje = "La fecha " + formatearFecha(fecha1) + " es posterior a la fecha " + formatearFecha(fecha2);
		}else if(num < 0){
			mensaje = "La fecha " + formatearFecha(fecha1) + " es anterior a la fecha " + formatearFecha(fecha2);
		}else {
			mensaje = "La fecha " + formatearFecha(fecha1) + " es igual a la fecha " + formatearFecha(fecha2);;
		}
		
		return mensaje;
	}
}