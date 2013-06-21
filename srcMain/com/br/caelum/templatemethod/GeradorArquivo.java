package com.br.caelum.templatemethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import com.br.caelum.bridge.PosProcessamento;

public abstract class GeradorArquivo {

	private PosProcessamento posProcessamento;

	public void setPosProcessamento(PosProcessamento posProcessamento){
		this.posProcessamento = validarPosProcessamento(posProcessamento);
	}

	public final void gerarArquivo(String fileName,	Map<String, Object> propriedades) throws IOException {
		String conteudo = gerarConteudo(propriedades);
		byte[] bytes = conteudo.getBytes();
		bytes = posProcessamento.processar(bytes);
		FileOutputStream fileout = new FileOutputStream(fileName);
		fileout.write(bytes);
		fileout.flush();
		fileout.close();
	}

	protected abstract String gerarConteudo(Map<String, Object> propriedades);

	private PosProcessamento validarPosProcessamento(PosProcessamento posProcessamento) {
			return posProcessamento;
	}
}