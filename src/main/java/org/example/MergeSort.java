package org.example;

import java.util.ArrayList;

public class MergeSort implements AlgoritmoDeOrdenacao{
    @Override
    public ArrayList<Integer> ordenarDados(ArrayList<Integer> dados) {
        mergeSort(dados, 0, dados.size() - 1);
        System.out.println("dados => " + dados);
        return dados;
    }

    public static void mergeSort(ArrayList<Integer> array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    public static void merge(ArrayList<Integer> array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];



        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array.get(left + i);
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array.get(mid + 1 + j);
        }



        int i = 0, j = 0;
        int k = left;



        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array.set(k, leftArray[i]);
                i++;
            } else {
                array.set(k, rightArray[j]);
                j++;
            }
            k++;
        }



        while (i < n1) {
            array.set(k, leftArray[i]);
            i++;
            k++;
        }



        while (j < n2) {
            array.set(k, rightArray[j]);
            j++;
            k++;
        }
    }
}
