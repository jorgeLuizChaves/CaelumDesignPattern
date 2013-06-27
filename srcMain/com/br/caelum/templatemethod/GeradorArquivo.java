package com.br.caelum.templatemethod;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import com.br.caelum.bridge.PosProcessamento;

public abstract class GeradorArquivo {

    private PosProcessamento posProcessamento;

    public void setPosProcessamento(PosProcessamento posProcessamento) {
        this.posProcessamento = validarPosProcessamento(posProcessamento);
    }

    public final File gerarArquivo(String fileName, Map<String, Object> propriedades) throws IOException {
        String conteudo = gerarConteudo(propriedades);
        byte[] bytes = conteudo.getBytes();
        bytes = posProcessamento.processar(bytes);
        File file = new File(fileName);
        FileOutputStream fileout = new FileOutputStream(file);
        fileout.write(bytes);
        fileout.flush();
        fileout.close();
        return file;
    }

    protected abstract String gerarConteudo(Map<String, Object> propriedades);

    private PosProcessamento validarPosProcessamento(PosProcessamento posProcessamento) {
        if (posProcessamento != null) {
            return posProcessamento;
        }
        throw new IllegalArgumentException("the post processing can't be null");
    }
}