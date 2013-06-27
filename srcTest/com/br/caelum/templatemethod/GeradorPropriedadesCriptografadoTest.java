package com.br.caelum.templatemethod;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.br.caelum.bridge.PosProcessamentoDefault;

public class GeradorPropriedadesCriptografadoTest {

    private static final String FILE_NAME = "arquivoCriptografado";
    private GeradorPropriedadesCriptografado geradorPropriedadesCriptografado;

    @Before
    public void setup() {
        geradorPropriedadesCriptografado = new GeradorPropriedadesCriptografado();
    }

    @Test
    public void testGerarArquivo() throws IOException {
        Map<String, Object> propriedades = new HashMap<String, Object>();
        propriedades.put("language", "portuguese");
        geradorPropriedadesCriptografado.setPosProcessamento(new PosProcessamentoDefault());
        File arquivoGerado = geradorPropriedadesCriptografado.gerarArquivo(FILE_NAME, propriedades);
        Assert.assertTrue(arquivoGerado.isFile());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGerarArquivoQuandoPosProcessamentoIsNull() throws IOException {
        Map<String, Object> propriedades = new HashMap<String, Object>();
        geradorPropriedadesCriptografado.setPosProcessamento(null);
        geradorPropriedadesCriptografado.gerarArquivo(FILE_NAME, propriedades);

    }

}
