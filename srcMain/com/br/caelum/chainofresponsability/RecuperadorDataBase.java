package com.br.caelum.chainofresponsability;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public class RecuperadorDataBase extends RecuperadorArquivo{
	
	private static Map<String, File> db = new TreeMap<String, File>();
	
	static{
		db.put("key", new File("db"));
	}
	
	
	public RecuperadorDataBase(RecuperadorArquivo proximo){
		super(proximo);
	}

	@Override
	protected File recuperaArquivo(String nome) {
		if(db.containsKey(nome)){
			return db.get(nome);
		}
		return null;
	}

}
