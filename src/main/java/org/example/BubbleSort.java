package org.example;

import java.util.ArrayList;

public class BubbleSort implements AlgoritmoDeOrdenacao{
    @Override
    public ArrayList<Integer> ordenarDados(ArrayList<Integer> dados) {

        int n = dados.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dados.get(j) > dados.get(j + 1)) {
                    // Troca os elementos
                    int temp = dados.get(j);
                    dados.set(j, dados.get(j + 1));
                    dados.set(j + 1, temp);
                }
            }
        }
        return dados;

    }
}
