package org.example;

import java.util.ArrayList;

public class QuickSort implements AlgoritmoDeOrdenacao{
    @Override
    public ArrayList<Integer> ordenarDados(ArrayList<Integer> dados) {
        quickSort(dados, 0, dados.size() - 1);
        return dados;
    }

    public static void quickSort(ArrayList<Integer> array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }



    public static int partition(ArrayList<Integer> array, int low, int high) {
        int pivot = array.get(high);
        int i = low - 1;



        for (int j = low; j < high; j++) {
            if (array.get(j) <= pivot) {
                i++;
                swap(array, i, j);
            }
        }



        swap(array, i + 1, high);
        return i + 1;
    }



    public static void swap(ArrayList<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}