package ar.edu.unju.fi.tp2.punto14;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(1990, 2, 28);

		Persona persona = new Persona("Nataniel",calendario);
		System.out.println("Datos de " + persona.getNombre() + ": ");
		System.out.println("Edad: " + persona.calcularEdad());
		System.out.println("Signo del zodiaco: " + persona.obtenerSignoDelZodiaco());
		System.out.println("Estacion del año cuando nacio: " + persona.obtenerEstacionDelAño());
	}
}
