package org.example;

public abstract class OrdenaçãoDados {
    protected AlgoritmoDeOrdenação algoritmoDeOrdenação;
    public int[] realizarOrdenacao(int[] dados) {

        return algoritmoDeOrdenação.ordenarDados(dados);
    }

}
