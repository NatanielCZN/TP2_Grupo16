package ar.edu.unju.fi.tp2.punto16;

public class CalculoMatematico {
private Integer num;
	
	/*
	 * Constructor parametrizado
	 */
	public CalculoMatematico(Integer num) {
		this.num = num;
	}
	
	/*		
	 * Metodos accesores
	 */
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}

	/*
	 * Metodo que calculara la sumatoria solicitada en el punto 16
	 */
	public Double calcularSumatoria() {
		Double suma = 0d;
		
		for(int i = 1;i<=num;i++) {
			suma = suma + Math.pow(num *(num + 1)/2,2);
		}
		return suma;
	}
	
	/*
	 * Metodo que calculara la productoria solicitada en el punto 16
	 */
	public Double calcularProductoria() {
		Double producto = 1d;
		
		for(int i = 1;i<=num;i++) {
			producto = producto * i * (i + 4);
		}
		return producto;
	}
}