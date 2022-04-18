package ar.edu.unju.fi.tp2.punto8;

public class Principal {

	public static void main(String[] args) {
		int val=1;
		int multiplicador=4;
		int resultado=0;
		
		do
		{
			resultado = val*multiplicador;
			System.out.print(resultado+" ");
			val++;
			}
		while(resultado<100);
	}

}