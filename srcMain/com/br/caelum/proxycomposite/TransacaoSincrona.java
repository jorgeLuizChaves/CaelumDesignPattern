package com.br.caelum.proxycomposite;

public class TransacaoSincrona implements Transacao{

	@Override
	public String executar() {
		return "Transacao Sincrona.";
	}

}