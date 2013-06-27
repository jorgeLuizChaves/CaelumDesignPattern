package com.br.caelum.strategy;

public class OperacaoAritmetica {

    private Aritmetica aritmetica;

    public OperacaoAritmetica(Aritmetica aritmetica) {
        this.aritmetica = aritmetica;
    }

    public int executarOperacao(int numero01, int numero02) {
        return aritmetica.operacao(numero01, numero02);
    }
}