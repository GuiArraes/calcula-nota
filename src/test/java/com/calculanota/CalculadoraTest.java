package com.calculanota;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.calculanota.calculadora.Calculadora;

@SpringBootTest
public class CalculadoraTest {
	
	@Test
	void multiploTest() {
		Calculadora calculadora = new Calculadora();
		
		Double multiplo1 = calculadora.multiplo(38.0);
		Double multiplo2 = calculadora.multiplo(50.0);
		Double multiplo3 = calculadora.multiplo(31.0);
		
		Assertions.assertEquals(multiplo1, 40.0);
		Assertions.assertEquals(multiplo2, 50.0);
		Assertions.assertEquals(multiplo3, 35.0);	
	}
	
	@Test
	void novaNotaTest() {
		Calculadora calculadora = new Calculadora();
		
		Double novaNota = calculadora.novaNota(0.0);
		Double novaNota1 = calculadora.novaNota(84.0);
		Double novaNota2 = calculadora.novaNota(29.0);
		Double novaNota3 = calculadora.novaNota(57.0);
		Double novaNota4 = calculadora.novaNota(38.0);
		Double novaNota5 = calculadora.novaNota(100.0);
		
		Double novaNota6 = calculadora.novaNota(-10.0);
		Double novaNota7 = calculadora.novaNota(101.0);
		
		Assertions.assertEquals(novaNota, 0.0);
		Assertions.assertEquals(novaNota1, 85.0);
		Assertions.assertEquals(novaNota2, 29.0);
		Assertions.assertEquals(novaNota3, 60.0);
		Assertions.assertEquals(novaNota4, 40.0);
		Assertions.assertEquals(novaNota5, 100.0);
		
		Assertions.assertEquals(novaNota6, -1.0);
		Assertions.assertEquals(novaNota7, -1.0);
	}

}
