package com.br.caelum.proxycomposite;

import java.io.IOException;

public class TentativasRepetidas {
	
	private int tentativas = 0;
	private int limiteTentativas;
	private AcessoRemoto acessoRemoto;

	public TentativasRepetidas(AcessoRemoto acessoRemoto, int tentativas){
		this.acessoRemoto = acessoRemoto;
		this.limiteTentativas = tentativas;
	}
	
	public byte[] buscarArquivo(String url) throws IOException{
		IOException exception = null;
		while(tentativas < limiteTentativas){
			try{
				return acessoRemoto.buscarArquivo(url);
			}catch(IOException ex){
				tentativas++;
				exception = ex;
			}
		}
		throw exception;
	}
}