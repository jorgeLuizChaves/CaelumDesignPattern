package com.br.caelum.chainofresponsability;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class RecuperadorCacheMemoria extends RecuperadorArquivo {
	private Map<String, File> cache = new HashMap<String, File>();
	
	public RecuperadorCacheMemoria(RecuperadorArquivo proximo) {
		super(proximo);
	}
	
	@Override
	protected File recuperaArquivo(String fileName) {
		if(cache.containsKey(fileName)){
			return cache.get(fileName);
		}
		return null;
	}
	
	@Override
	protected File chamarProximo(String fileName) {
		File file = super.chamarProximo(fileName);
		addInCache(fileName, file);
		return file;
	}

	public void addInCache(String fileName, File file) {
		cache.put(fileName, file);
	}
}