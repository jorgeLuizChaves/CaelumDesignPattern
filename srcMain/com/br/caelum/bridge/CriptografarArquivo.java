package com.br.caelum.bridge;

import java.io.IOException;

public class CriptografarArquivo extends PosProcessamento{

	private static final byte  DELAY = 5;

	@Override
	public byte[] processar(byte[] bytes) throws IOException {
		byte[] newBytes = new byte[bytes.length];
		for(int i=0;i<bytes.length;i++){
			newBytes[i]= (byte) ((bytes[i]+ DELAY) % Byte.MAX_VALUE);
		}
		return newBytes;
	}

}