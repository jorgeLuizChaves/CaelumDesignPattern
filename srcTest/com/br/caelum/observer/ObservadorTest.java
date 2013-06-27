package com.br.caelum.observer;

import java.util.ArrayList;
import java.util.List;

import com.br.caelum.observer.Acao.AcaoBuilder;

public class ObservadorTest {

	private static List<Acao> acoes;
	private static final int TWO_SECONDS = 2000;

	static{
		Acao acao01 = new AcaoBuilder("COMP02", 200).build();
		Acao acao02 = new AcaoBuilder("EMP34", 400).build();
		Acao acao03 = new AcaoBuilder("ACDF89", 300).build();
		Acao acao04 = new AcaoBuilder("EMP34", -200).build();
		Acao acao05 = new AcaoBuilder("COMP02", 150).build();
		
		acoes = new ArrayList<Acao>();
		acoes.add(acao01);
		acoes.add(acao02);
		acoes.add(acao03);
		acoes.add(acao04);
		acoes.add(acao05);
	}

	public static void main(String[] args) throws Exception {

		Observador acoesLogger = new AcoesLogger();
		Observador graficoBarras = new GraficoBarras();
		CarteiraAcoes carteira = new CarteiraAcoes();

		carteira.addObservador(graficoBarras);
		carteira.addObservador(acoesLogger);

		for(Acao acao: acoes){
			Thread.sleep(TWO_SECONDS);
			carteira.adicionaAcoes(acao.getNome(), acao.getValor());
		}
	}
}