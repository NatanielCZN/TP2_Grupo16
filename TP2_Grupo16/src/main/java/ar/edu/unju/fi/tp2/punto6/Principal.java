package ar.edu.unju.fi.tp2.punto6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un numero entero:");
		int num = entrada.nextInt();
		while (num != 0 && num <= 10 && num>0) {
			if (num == 6) {
				System.out.println("El alumno Regulariza");
			} else {
				if (num >= 7 && num <= 10) {
					System.out.println("El Alumno Promociona");

				} else {
					if (num < 6 && num >= 1) {
						System.out.println("El Alumno desaprueba");
					}
				}

			}
			System.out.print("Ingrese un numero entero:");
			num = entrada.nextInt();
		}
		System.out.println("Valor no Permitido.");
	}

}
