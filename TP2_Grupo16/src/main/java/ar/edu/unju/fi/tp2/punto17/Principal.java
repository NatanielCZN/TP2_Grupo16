package ar.edu.unju.fi.tp2.punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Punto 17b.1
		 */
		LocalDate f1 = LocalDate.of(2020, 3, 16);
		LocalDate f2 = LocalDate.of(2022, 3, 16);		
		ProcesoFecha pf1 = new ProcesoFecha(f1,f2);
		System.out.println("b.1) Facha1: " + pf1.formatearFecha(f1) + " - Fecha2: " + pf1.formatearFecha(f2));
		
		/*
		 * Punto 17b.2
		 */
		LocalTime hoy = LocalTime.now();
		LocalTime t1 = hoy.minusHours(5);
		LocalTime t2 = hoy.minusMinutes(20);
		ProcesoFecha pf2 = new ProcesoFecha(t1,t2);
		System.out.println("b.2) Time1: " + pf2.getTime1() + " - Time2: " + pf2.getTime2());
		
		/*
		 * Punto 17b.3
		 */
		System.out.println("b.3) " + pf1.compararFechas());
		
		/*
		 * Punto 17b.4
		 */
		LocalDateTime dt1 = LocalDateTime.of(f1.getYear(),f1.getMonth(),f1.getDayOfMonth(),t1.getHour(),t1.getMinute(),t1.getSecond());
		LocalDateTime dt2 = LocalDateTime.of(f2.getYear(),f2.getMonth(),f2.getDayOfMonth(),t2.getHour(),t2.getMinute(),t2.getSecond());
		ProcesoFecha pf3 = new ProcesoFecha(dt1,dt2);
		System.out.println("b.4) Fecha&Hora1: " + dt1 + " - Fecha&Hora2: " + dt2);
		
		/*
		 * Punto 17b.5
		 */
		LocalDate f3 = LocalDate.of(1995, 5, 16);
		LocalDate f4 = LocalDate.now();
		ProcesoFecha pf4 = new ProcesoFecha(f3,f4);
		System.out.println("b.5) Han transcurrido " + pf4.contarTiempoTranscurrido().getYears() + " años, " + pf4.contarTiempoTranscurrido().getMonths() + " meses y " + pf4.contarTiempoTranscurrido().getDays() + " dias desde la fecha " + pf4.formatearFecha(f3) + " hasta la fecha " + pf4.formatearFecha(f4));
	
		/*
		 * Punto 17b.6
		 */
		ProcesoFecha pf5 = new ProcesoFecha();
		Scanner scan = new Scanner(System.in);
		
		/*
		 * Parte 1 del punto 17b.6 - Punto 17b.7
		 * Establesco el formato para cumplir con la consigna. La cual es que el formato sea dd/MM/yyyy
		 */
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		LocalDate f5 = null;
		LocalDate f6 = null;
		do {
			try {
				System.out.println("b.6.1) Ingrese una fecha con formato dd/MM/yyyy: ");
				String fecha1 = scan.next();
				/*
				 * Almaceno la fecha introducida por el usuario.
				 * Mediante el metodo parse() cambio la variable tipo String a LocalDate y le aplico el formato
				 */
				f5 = LocalDate.parse(fecha1,formateador);		
				pf5.setFecha1(f5);
				f6 = f5.plusDays(365);
				System.out.println("b.6.1) Fecha ingresada " + pf5.formatearFecha(pf5.getFecha1()) + " - Nueva Fecha: " + pf5.formatearFecha(f6));
			}catch(DateTimeParseException dte) {
				System.out.println("Ocurrio un error -> " + dte.getMessage());
			}
		}while(f5 == null);
		
		/*
		 * Parte 2 del punto 17b.6 - Punto 17b.7
		 */
		LocalDate f7 = null;
		LocalDate f8 = null;
		do {
			try {
				System.out.println("Ingrese otra fecha con formato dd/MM/yyyy: ");
				String fecha2 = scan.next();
				f7 = LocalDate.parse(fecha2,formateador);
				pf5.setFecha2(f7);
				f8 = f7.minusMonths(6);
				System.out.println("b.6.2) Fecha ingresada " + pf5.formatearFecha(pf5.getFecha2()) + " - Nueva Fecha: " + pf5.formatearFecha(f8));
			}catch(DateTimeParseException dte) {
				System.out.println("Ocurrio un error -> " + dte.getMessage());
			}
		}while(f7 == null);	
	}
}