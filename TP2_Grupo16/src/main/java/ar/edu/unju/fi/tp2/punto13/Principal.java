package ar.edu.unju.fi.tp2.punto13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");

		Date fecha = new Date();
		
		Empleado empleado = new Empleado("Messi",fecha,10,"messirve10@gmail.com.ar",0d,60);
		
		int cont = 0;
		double sum = 0;
		do {
			cont++;
			if(cont < 161) {
				sum+=600d;
			}
			else {
				sum+=650d;
			}
		}while(cont < empleado.getHoras());
		
		
		empleado.setSueldo(sum);
		
		String datos = empleado.toString();		
		System.out.println(datos);
	}
}