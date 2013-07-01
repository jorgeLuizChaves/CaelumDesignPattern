package com.br.caelum.adaptor;

public class Adaptador implements InterfaceAlvo {
	
	private Adaptada adaptada;
	
	public Adaptador(Adaptada adaptada){
		this.adaptada = adaptada;
	}

	@Override
	public void requisicao() {
		adaptada.requisicaoDiferente();
	}
}