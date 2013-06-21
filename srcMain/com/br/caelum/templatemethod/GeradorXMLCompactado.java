package com.br.caelum.templatemethod;

import java.util.Map;

public class GeradorXMLCompactado extends GeradorArquivo {
	
	private static final String OPEN_TAG_PROPERTIES = "<properties>";
	private static final String CLOSE_TAG_PROPERTIES = "</properties>";

	@Override
	protected String gerarConteudo(Map<String, Object> props) {
		StringBuilder propertiesFileBuilder = new StringBuilder();
		propertiesFileBuilder.append(OPEN_TAG_PROPERTIES);
		for(String prop : props.keySet()){
			propertiesFileBuilder.append("<"+prop+">"+props.get(prop)+"</"+prop+">");
		}
		propertiesFileBuilder.append(CLOSE_TAG_PROPERTIES);
		return propertiesFileBuilder.toString();
	}
}