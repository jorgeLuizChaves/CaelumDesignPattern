package com.br.caelum.strategy;


import org.junit.Assert;
import org.junit.Test;

public class AdicaoTest {

	@Test
	public void testAdicao() {
		Aritmetica operacaoAdicao = new Adicao();
		int resultadoEsperado = 11;
		int resultadoAtual = operacaoAdicao.operacao(5, 6);
		Assert.assertEquals(resultadoEsperado, resultadoAtual);
	}

}
