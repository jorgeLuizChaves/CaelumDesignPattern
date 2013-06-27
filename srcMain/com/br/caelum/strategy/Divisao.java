package com.br.caelum.strategy;

public class Divisao implements Aritmetica {

    private static final String ERROR_MESSAGE = "O dividendo não pode ser zero.";

    @Override
    public int operacao(int divisor, int dividendo) {

        if (dividendo == 0) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
        return (divisor / dividendo);
    }
}