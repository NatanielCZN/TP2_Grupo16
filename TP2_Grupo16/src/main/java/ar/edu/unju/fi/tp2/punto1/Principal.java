package ar.edu.unju.fi.tp2.punto1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int factorial = 1;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un numero:");
		int numero = entrada.nextInt();
		if (numero >= 0 && numero <= 10) {

			for (int i = 1; i <= numero; i++) {

				factorial = factorial * i;
				System.out.println(factorial);
				
			}
			System.out.println("EL FACTORIAL DE " + numero + " ES:" + factorial);
		}

		else {
			System.out.println("No ingreso un numero entre el 0-10");

		}

	}
}
	


