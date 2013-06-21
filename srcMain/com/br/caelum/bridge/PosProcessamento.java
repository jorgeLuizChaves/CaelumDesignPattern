package com.br.caelum.bridge;

import java.io.IOException;

public abstract class PosProcessamento {

	public abstract byte[] processar(byte[] bytes) throws IOException;
}