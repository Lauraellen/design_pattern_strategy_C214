package org.example;

import java.util.ArrayList;

public abstract class OrdenacaoDados {
    protected AlgoritmoDeOrdenacao algoritmoDeOrdenacao;
    public ArrayList<Integer> realizarOrdenacao(ArrayList<Integer> dados) {

        return algoritmoDeOrdenacao.ordenarDados(dados);
    }

}
