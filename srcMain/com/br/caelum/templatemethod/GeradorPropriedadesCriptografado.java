package com.br.caelum.templatemethod;

import java.util.Map;

public class GeradorPropriedadesCriptografado extends GeradorArquivo {
	
	@Override
	protected String gerarConteudo(Map<String, Object> props) {
		StringBuilder propFileBuilder = new StringBuilder();
		for(String prop : props.keySet()){
			propFileBuilder.append(prop + " = " + props.get(prop) + "\n");
		}
		return propFileBuilder.toString();
	}
}