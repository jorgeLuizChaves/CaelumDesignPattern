package com.br.caelum.strategy;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicacaoTest {

    @Test
    public void testMultiplicacao() {
        int numero01 = 5;
        int numero02 = 5;
        int resultadoEsperado = 25;
        Aritmetica operacaoMultiplicacao = new Multiplicacao();

        int resultadoAtual = operacaoMultiplicacao.operacao(numero01, numero02);
        Assert.assertEquals(2, resultadoAtual);
    }

}
