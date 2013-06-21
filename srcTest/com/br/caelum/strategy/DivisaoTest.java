package com.br.caelum.strategy;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DivisaoTest {

	@Test
	public void testDivisao() {
		int divisor = 8;
		int dividendo = 2;
		int resultadoEsperado = 4;
		Aritmetica divisao = new Divisao();
		
		int resultado = divisao.operacao(divisor, dividendo);
		Assert.assertEquals(resultadoEsperado, resultado);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDivisaoWhenDividendoEZero(){
		int divisor = 6;
		int dividendo = 0;
		Aritmetica divisao = new Divisao();
		
		divisao.operacao(divisor, dividendo);
	}

}
