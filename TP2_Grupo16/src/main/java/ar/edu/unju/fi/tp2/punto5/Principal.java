package ar.edu.unju.fi.tp2.punto5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean band = true;
		do {
			/*
			 * Solicito el ingreso de dato
			 */
			System.out.println("Ingrese un numero correspondiente a un mes del año: ");
			int num = scan.nextInt();
			
			/*
			 * Determino si el numero ingresado pertenece a un mes del año
			 */
			switch (num) {
			case 1:
				System.out.println("El numero 1 corresponde al mes de ENERO");
				break;
			case 2:
				System.out.println("El numero 2 corresponde al mes de FEBRERO");
				break;
			case 3:
				System.out.println("El numero 3 corresponde al mes de MARZO");
				break;
			case 4:
				System.out.println("El numero 4 corresponde al mes de ABRIL");
				break;
			case 5:
				System.out.println("El numero 5 corresponde al mes de MAYO");
				break;
			case 6:
				System.out.println("El numero 6 corresponde al mes de JUNIO");
				break;
			case 7:
				System.out.println("El numero 7 corresponde al mes de JULIO");
				break;
			case 8:
				System.out.println("El numero 8 corresponde al mes de AGOSTO");
				break;
			case 9:
				System.out.println("El numero 9 corresponde al mes de SEPTIEMBRE");
				break;
			case 10:
				System.out.println("El numero 10 corresponde al mes de OCTUBRE");
				break;
			case 11:
				System.out.println("El numero 11 corresponde al mes de NOVIEMBRE");
				break;
			case 12:
				System.out.println("El numero 12 corresponde al mes de DICIEMBRE");
				break;
			default:
				System.out.println("No existe ese mes");
				band = false;
				break;
			}
		}while(band == true);		
	}
}