package com.br.caelum.templatemethod;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import org.junit.Assert;
import org.junit.Test;

import com.br.caelum.bridge.PosProcessamentoDefault;

public class GeradorXMLCompactadoTest {

    private static final String FILE_NAME = "pais.xml";

    @Test(expected = IllegalArgumentException.class)
    public void testGerarConteudoQuandoPosProcessamentoIsNull() throws IOException {
        Map<String, Object> propriedades = new HashMap<String, Object>();
        GeradorXMLCompactado geradorXMLCompactado = new GeradorXMLCompactado();
        geradorXMLCompactado.setPosProcessamento(null);
        geradorXMLCompactado.gerarArquivo(FILE_NAME, propriedades);
    }

    @Test
    public void testGerarConteudoQuandoArquivoNaoExiste() throws IOException {
        Map<String, Object> propriedades = new HashMap<String, Object>();
        propriedades.put("pais", "Brasil");
        propriedades.put("capital", "Brasilia");
        GeradorXMLCompactado geradorXMLCompactado = new GeradorXMLCompactado();
        geradorXMLCompactado.setPosProcessamento(new PosProcessamentoDefault());
        File arquivoGerado = geradorXMLCompactado.gerarArquivo(FILE_NAME, propriedades);

        Assert.assertTrue(arquivoGerado.isFile());
    }

}
