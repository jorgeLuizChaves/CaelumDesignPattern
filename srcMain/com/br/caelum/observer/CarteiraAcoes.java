package com.br.caelum.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarteiraAcoes {
	
    private Map<String, Integer> acoes;
    private List<Observador> observadores;

    public CarteiraAcoes(){
        init();
    }
    
    public void addObservador(Observador observador){
    	observadores.add(observador);
    }
    
    public void removeObservador(Observador observador){
    	observadores.remove(observador);
    }

    public void adicionaAcoes(String acao, Integer quantidade) {
    	int novaQuantidade = 0;
        if (isAcaoCadastrada(acao)) {
        	novaQuantidade = somarValor(acao, quantidade);
        }
        acoes.put(acao, novaQuantidade);
        notificar(acao, novaQuantidade);
    }

    private void init() {
        acoes = new HashMap<String, Integer>();
        observadores = new ArrayList<Observador>();
    }

	private boolean isAcaoCadastrada(String acao) {
		return acoes.containsKey(acao);
	}

	private Integer somarValor(String acao, Integer quantidade) {
		return quantidade + acoes.get(acao);
	}
	
    private void notificar(String acao, Integer quantidade) {
        for (Observador observador : observadores){
        	observador.mudancaQuantidade(acao, quantidade);
        }
    }
}