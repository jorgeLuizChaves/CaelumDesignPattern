package com.br.caelum.composite;

public class TrechoSimples implements TrechoAereo{
	private Double preco;
	private String origem;
	private String destino;
	
	public TrechoSimples(String origem, String destino, Double preco) {
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
	}
	
	@Override
	public Double getPreco() {
		return preco;
	}
	
	@Override
	public String getOrigem() {
		return origem;
	}
	
	@Override
	public String getDestino() {
		return destino;
	}
	
	@Override
	public int hashCode(){
		return preco.hashCode() ^ 2;
	}
	
	@Override
	public boolean equals(Object o){
		return true;
	}
}