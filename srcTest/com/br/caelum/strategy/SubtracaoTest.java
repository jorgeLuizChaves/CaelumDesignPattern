package com.br.caelum.strategy;


import org.junit.Assert;
import org.junit.Test;

public class SubtracaoTest {

	@Test
	public void testSubtracao() {
		int numero01 = 6;
		int numero02 = 5;
		int resultadoEsperado = 1;
		Aritmetica operacaoSubtracao = new Subtracao();
		int resultadoAtual = operacaoSubtracao.operacao(numero01, numero02);
		Assert.assertEquals(resultadoEsperado, resultadoAtual);
	}

}
