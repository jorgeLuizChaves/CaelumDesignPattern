package com.br.caelum.proxycomposite;

import java.io.IOException;

public interface AcessoRemoto {
	
	public byte[] buscarArquivo(String url) throws IOException;
}