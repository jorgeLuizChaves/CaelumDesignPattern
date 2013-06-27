package com.br.caelum.composite;

public class Elemento{
	private Object valor;
	private Elemento proximo;
	
	public Elemento(Object valor){
		this.valor = valor;
	}
	
	public Object getValor(){
		return valor;
	}
	
	public Elemento getProximo(){
		return proximo;
	}
	
	public void setProximo(Elemento proximo){
		this.proximo = proximo;
	}
	
	public int contar(){
		if(proximo == null){
			return 1;
		}
		return 1 + proximo.contar();
	}
}