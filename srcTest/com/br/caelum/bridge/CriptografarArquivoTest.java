package com.br.caelum.bridge;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CriptografarArquivoTest {

    private CriptografarArquivo criptografarArquivo;

    @Before
    public void setup() {
        criptografarArquivo = new CriptografarArquivo();
    }

    @Test
    public void testProcessar() throws IOException {
        String password = "123abc";
        criptografarArquivo.processar(password.getBytes());
    }

}
