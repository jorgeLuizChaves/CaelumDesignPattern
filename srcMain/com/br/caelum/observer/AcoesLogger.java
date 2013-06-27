package com.br.caelum.observer;

public class AcoesLogger implements Observador {

    private static final String MODIFIED_MESSAGE = "Alterada a quantidade da ação %s para %d";

    public void mudancaQuantidade(String acao, Integer qtd) {
        System.out.println(String.format(MODIFIED_MESSAGE, acao, qtd));
    }
}