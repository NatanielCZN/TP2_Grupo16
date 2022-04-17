package ar.edu.unju.fi.tp2.punto4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean band=true;
		while (band==true) {
			System.out.println("Ingrese numero de mes:");
			int numero = entrada.nextInt();
			if (numero<=0 || numero>12) {
				System.out.println("no existe este mes");
				band=false;
			}
		}
	}
}
