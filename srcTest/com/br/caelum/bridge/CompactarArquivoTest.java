package com.br.caelum.bridge;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CompactarArquivoTest {

    private static final String FILE_NAME = "arquivoCriptografado.zip";
    private CompactarArquivo compactarArquivo;

    @Before
    public void setup() {
        compactarArquivo = new CompactarArquivo();
    }

    @Test
    public void testProcessar() throws IOException {
        File file = new File(FILE_NAME);
        FileOutputStream fileOutPutStream = new FileOutputStream(file);
        String arquivoCompactado = "conteudo zipado";
        byte[] processar = compactarArquivo.processar(arquivoCompactado.getBytes());
        fileOutPutStream.write(processar);
        fileOutPutStream.flush();
        fileOutPutStream.close();
    }

}
