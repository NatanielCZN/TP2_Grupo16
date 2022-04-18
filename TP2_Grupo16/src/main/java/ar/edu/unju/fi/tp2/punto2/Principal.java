package ar.edu.unju.fi.tp2.punto2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int anio;
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año");
        anio = scanner.nextInt();

        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)){
        	System.out.println("El año es bisiesto");
        }
        else {
        	System.out.println("El año no es bisiesto");
        }
	}
}