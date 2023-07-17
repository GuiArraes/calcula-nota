package com.calculanota.calculadora;

public class Calculadora {
	
	public Double multiplo(Double nota) {
		Double numero = nota;
		
		while(numero - nota < 10.0) {
			if (numero % 5 == 0) {
				return numero;
			}
			numero++;
		}
		return nota;
	}
	
	public Double novaNota(Double nota) {
		if (nota < 0.0 || nota > 100.0) {
			return -1.0;
		}
		if (nota < 38.0) {
			return nota;
		}
		Double novaNota = this.multiplo(nota);
		return novaNota;	
	}
}
