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
			if (numero==1) {
				System.out.println("Enero");
			}
			if (numero==2) {
				System.out.println("Febrero");
			}
			if (numero==3) {
				System.out.println("Marzo");
			}
			if (numero==4) {
				System.out.println("Abril");
			}
			if (numero==5) {
				System.out.println("Mayo");
			}
			if (numero==6) {
				System.out.println("Junio");
			}
			if (numero==7) {
				System.out.println("Julio");
			}
			if (numero==8) {
				System.out.println("Agosto");
			}
			if (numero==9) {
				System.out.println("Septiembre");
			}
			if (numero==10) {
				System.out.println("Octubre");
			}
			if (numero==11) {
				System.out.println("Noviembre");
			}
			if (numero==12) {
				System.out.println("Diciembre");
			}
		}
	}
}
