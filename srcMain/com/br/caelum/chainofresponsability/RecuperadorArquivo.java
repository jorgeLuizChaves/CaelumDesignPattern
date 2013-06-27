package com.br.caelum.chainofresponsability;

import java.io.File;

public abstract class RecuperadorArquivo {
	private static final String ERROR_MESSAGE = "Não foi possível recuperar o arquivo";
	private RecuperadorArquivo proximo;

	public RecuperadorArquivo(RecuperadorArquivo proximo) {
		this.proximo = proximo;
	}

	public File recuperar(String nome){
		File file = recuperaArquivo(nome);
		if(dontFoundIt(file)){
			return chamarProximo(nome);
		}
		else{
			return file;
		}
	}

	protected File chamarProximo(String nome) {
		if(proximo == null){
			throw new RuntimeException(ERROR_MESSAGE);
		}
		return proximo.recuperar(nome);
	}

	protected abstract File recuperaArquivo(String nome);
	
	private boolean dontFoundIt(File file) {
		if(file == null){
			return true;
		}
		return false;
	}
}