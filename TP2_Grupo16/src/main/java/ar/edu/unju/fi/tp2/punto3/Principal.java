package ar.edu.unju.fi.tp2.punto3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese 5 numeros enteros");
		for (i = 0; i < 5; i++) {
			System.out.print("Ingrese un numero:");
			int numero= entrada.nextInt();
			if (numero%2==0) {
				System.out.println("El numero "+numero+" es Par");
				
			} else {
				System.out.println("El numero "+numero+" es Impar");
			}
		}
		
	}

}
