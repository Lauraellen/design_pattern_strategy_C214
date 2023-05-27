package org.example;

public class BubbleSort implements AlgoritmoDeOrdenação{
    @Override
    public int[] ordenarDados(int[] dados) {

        int n = dados.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dados[j] > dados[j + 1]) {
                    // Troca os elementos
                    int temp = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = temp;
                }
            }
        }
        return dados;

    }
}
