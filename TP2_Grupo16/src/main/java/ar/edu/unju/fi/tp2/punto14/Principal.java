package ar.edu.unju.fi.tp2.punto14;

import java.util.Calendar;
import ar.edu.unju.fi.tp2.punto13.Empleado;

public class Principal {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(2003,11,16);
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado("nicolas", 2, 3);
		Empleado empleado3 = new Empleado("xd", 5);
		Empleado empleado4 = new Empleado("onmbre", calendario, 10);
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(empleado3.toString());
		System.out.println(empleado4.toString());
	}
}
