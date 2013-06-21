package com.br.caelum.strategy;

public class Subtracao implements Aritmetica{

	@Override
	public int operacao(int numero01, int numero02) {
		return (numero01 - numero02);
	}

}
