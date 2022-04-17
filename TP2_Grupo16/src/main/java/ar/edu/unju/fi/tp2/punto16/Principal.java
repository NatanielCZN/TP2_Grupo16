package ar.edu.unju.fi.tp2.punto16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese un numero para realizar calculos: ");
		int numero = scan.nextInt();
		
		CalculoMatematico calculo = new CalculoMatematico(numero);
		
		System.out.println("El resultado de la sumatoria es: " + calculo.calcularSumatoria());
		System.out.println("El resultado de la productoria es: " + calculo.calcularProductoria());
	}
}