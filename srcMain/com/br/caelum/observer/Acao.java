package com.br.caelum.observer;

public final class Acao {

	private static final int FIVE = 5;
	private String nome;
	private Integer valor;
	
	public String getNome() {
		return nome;
	}

	public Integer getValor() {
		return valor;
	}
	
	public Acao(String nome, Integer valor){
		this.nome = nome;
		this.valor = valor;
	}
	
	private Acao(){}

	@Override
	public int hashCode(){	
		return valor ^ FIVE;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null){
			return false;
		}else if(o instanceof Acao){
			Acao acao = (Acao)o;
			return this.nome.equals(acao.getNome()) && this.valor.equals(acao.getValor());
		}
		return false;
	}
	
	public static class AcaoBuilder{
		
		private Acao acao;
		
		public AcaoBuilder(String nome, Integer valor){
			acao = new Acao();
			acao.nome = nome;
			acao.valor = valor;
		}
		
		public Acao build(){
			return acao;
		}
	}
}