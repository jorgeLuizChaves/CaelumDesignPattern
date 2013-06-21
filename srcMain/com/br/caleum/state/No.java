package com.br.caleum.state;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class No {

	private Cor cor;
	private String name;
	private Set<No> adjacentes = new HashSet<No>();
	
	
	public No(String name){
		this.name = name;
		cor = Cor.BRANCO;
	}
	
	public void buscaProfundidade(List<No> list){
		cor.busca(this, list);
	}
	
	public Set<No> getAdjacentes() {
		return adjacentes;
	}
	
	public void addAdjacentes(No adj) {
		adjacentes.add(adj);
	}
	
	public void setCor(Cor cor, List<No> list) {
		this.cor = cor;
		cor.assumiu(this ,list);
	}
	
	@Override
	public String toString() {
		return name;
	}

}