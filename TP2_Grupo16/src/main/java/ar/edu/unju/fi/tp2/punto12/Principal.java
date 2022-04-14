package ar.edu.unju.fi.tp2.punto12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
	public static double g = 9.81;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatoDecimal = new DecimalFormat("#.00");
		// la clase DecimalFormat nos permite mostrar los
		// numeros en pantalla con el formato que queremos
		// por ejempo 2 digitos.
		System.out.print("Ingrese la Altura en metros:");
		double h = entrada.nextDouble();
		double tiempo = Math.sqrt(2 * h / g);
		System.out.println("El tiempo que tarda en caer el objeto es:" + formatoDecimal.format(tiempo)+" segundos");

	}

}
