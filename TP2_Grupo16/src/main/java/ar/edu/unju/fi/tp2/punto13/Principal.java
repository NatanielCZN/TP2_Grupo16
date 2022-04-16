package ar.edu.unju.fi.tp2.punto13;

import java.util.Calendar;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 * Solicito el ingreso de dato
		 */
		System.out.println("Ingrese horas de trabajo: ");
		int horas = scan.nextInt();
		
		/*
		 * Creo y seteo la fecha de un objeto de la clase Calendar 
		 */
		Calendar calendario = Calendar.getInstance();
		calendario.set(2003,11,16);		
		
		Empleado empleado = new Empleado("Messi",calendario,10,"messirve10@gmail.com.ar",0d,horas);
		
		int cont = 0;
		double sum = 0;
		
		/*
		 * Realizo una suma sucesiva para obtener el sueldo
		 */
		do {
			cont++;
			if(cont < 161) {
				sum+=600d;
			}
			else {
				sum+=650d;
			}
		}while(cont < empleado.getHoras());
		
		/*
		 * Cambio el dato de sueldo de empleado por el resultado de la suma sucesiva
		 */
		empleado.setSueldo(sum);
		
		/*
		 * Almaceno los datos del empleado y los muestro por consola
		 */
		String datos = empleado.toString();		
		System.out.println(datos);
	}
}