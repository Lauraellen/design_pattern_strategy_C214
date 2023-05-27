import org.example.OrdenacaoDados;
import org.example.OrderByBubbleSort;
import org.example.OrderByMergeSort;
import org.example.OrderByQuickSort;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestOrdenacao {
    OrdenacaoDados ordenacaoDados;

    @Test
    public void testeMergeSort() {
        ordenacaoDados = new OrderByMergeSort();
        ArrayList<Integer> dados = new ArrayList<>();
        dados.add(5);
        dados.add(3);
        dados.add(1);

        ArrayList<Integer> dadosEsperado = new ArrayList<>();
        dadosEsperado.add(1);
        dadosEsperado.add(3);
        dadosEsperado.add(5);
        assertEquals(ordenacaoDados.realizarOrdenacao(dados), dadosEsperado);
    }

    @Test
    public void testeQuickSort() {
        ordenacaoDados = new OrderByQuickSort();
        ArrayList<Integer> dados = new ArrayList<>();
        dados.add(5);
        dados.add(3);
        dados.add(1);

        ArrayList<Integer> dadosEsperado = new ArrayList<>();
        dadosEsperado.add(1);
        dadosEsperado.add(3);
        dadosEsperado.add(5);
        assertEquals(ordenacaoDados.realizarOrdenacao(dados), dadosEsperado);
    }

    @Test
    public void testeBubbleSort() {
        ordenacaoDados = new OrderByBubbleSort();
        ArrayList<Integer> dados = new ArrayList<>();
        dados.add(5);
        dados.add(3);
        dados.add(1);

        ArrayList<Integer> dadosEsperado = new ArrayList<>();
        dadosEsperado.add(1);
        dadosEsperado.add(3);
        dadosEsperado.add(5);
        assertEquals(ordenacaoDados.realizarOrdenacao(dados), dadosEsperado);
    }

    @Test
    public void testeArrayVazio() {
        ordenacaoDados = new OrderByBubbleSort();
        ArrayList<Integer> dados = new ArrayList<>();
        dados.add(5);
        dados.add(3);
        dados.add(1);

        ArrayList<Integer> dadosEsperado = new ArrayList<>();
        dadosEsperado.add(1);
        dadosEsperado.add(3);
        dadosEsperado.add(5);
        assertEquals(ordenacaoDados.realizarOrdenacao(dados), dadosEsperado);
    }
}
