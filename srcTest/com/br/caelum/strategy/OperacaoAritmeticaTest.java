package com.br.caelum.strategy;

import java.util.Arrays;
import java.util.List;


import org.junit.Assert;
import org.junit.Test;

public class OperacaoAritmeticaTest {

	@Test
	public void testOperacaoAritmeticaAdicao() {
		int numero01 = 4;
		int numero02 = 2;
		int resultadoAdicao = numero01 + numero02;
		int resultadoSubtracao = numero01 - numero02;
		int resultadoMultiplicacao = numero01 * numero02;
		int resultadoDivisao = numero01 / numero02;
		List<? extends Aritmetica> operacoes = Arrays.asList(new Adicao(), new Subtracao(), new Multiplicacao(), new Divisao());
		List<Integer> resultadosEsperados = Arrays.asList(resultadoAdicao, resultadoSubtracao, resultadoMultiplicacao, resultadoDivisao);
		
		for(int index=0; index < operacoes.size(); index++){
			Aritmetica aritmetica = operacoes.get(index);
			int resultadoEsperado = resultadosEsperados.get(index);
			OperacaoAritmetica operacaoAritmetica = new OperacaoAritmetica(aritmetica);
			int resultadoAtual = operacaoAritmetica.executarOperacao(numero01, numero02);
			Assert.assertEquals((index + 1) + "º operacao", resultadoEsperado, resultadoAtual);
		}
		
	}

}
