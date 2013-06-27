package com.br.caelum.composite;

public class TrechoComposto implements TrechoAereo {
	
	private static final String ERROR_MESSAGE = "O destino do primeiro trecho não é igual a origem do segundo.";
	private TrechoAereo primeiro;
	private TrechoAereo segundo;
	private Double taxaAeroporto;
	
	public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo, Double taxaAeroporto){
		validarTrechos(primeiro, segundo);
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.taxaAeroporto = taxaAeroporto;
	}

	@Override
	public Double getPreco() {
		return primeiro.getPreco() + segundo.getPreco() + taxaAeroporto;
	}

	@Override
	public String getOrigem() {
		return primeiro.getOrigem();
	}

	@Override
	public String getDestino() {
		return segundo.getDestino();
	}

	private void validarTrechos(TrechoAereo primeiro, TrechoAereo segundo) {
		if(isNotValid(primeiro, segundo)){
			throw new IllegalArgumentException(ERROR_MESSAGE);
		}
	}
	
	private boolean isNotValid(TrechoAereo primeiro, TrechoAereo segundo){
		return !isValid(primeiro, segundo);
	}
	
	private boolean isValid(TrechoAereo primeiro, TrechoAereo segundo) {
		return primeiro.getDestino().equals(segundo.getOrigem());
	}
}