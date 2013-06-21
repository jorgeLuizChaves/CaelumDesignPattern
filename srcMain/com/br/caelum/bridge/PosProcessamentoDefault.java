package com.br.caelum.bridge;

import java.io.IOException;

public class PosProcessamentoDefault extends PosProcessamento {

	@Override
	public byte[] processar(byte[] bytes) throws IOException {
		return bytes;
	}
}