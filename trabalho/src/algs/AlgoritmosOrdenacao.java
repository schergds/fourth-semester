package algs;

import java.util.*;

public class AlgoritmosOrdenacao {

    public ResultadoOrdenacao ordenar(String metodo, List<Integer> numeros) {
        ResultadoOrdenacao resultado = new ResultadoOrdenacao();
        resultado.setMetodo(metodo);

        long inicio = System.currentTimeMillis();

        List<Integer> ordenada;
        switch (metodo.toLowerCase()) {
            case "selecao":
                ordenada = selecao(numeros, resultado);
                break;
            case "bolha":
                ordenada = bolha(numeros, resultado);
                break;
            case "insercao":
                ordenada = insercao(numeros, resultado);
                break;
            case "shell":
                ordenada = shell(numeros, resultado);
                break;
            case "pente":
                ordenada = pente(numeros, resultado);
                break;
            case "agitacao":
                ordenada = agitacao(numeros, resultado);
                break;
            case "quick":
                ordenada = quick(numeros, resultado);
                break;
            default:
                throw new IllegalArgumentException("Método inválido: " + metodo);
        }

        long fim = System.currentTimeMillis();
        resultado.setTempoExecucao(fim - inicio);
        resultado.setListaOrdenada(ordenada);

        return resultado;
    }

    public static List<Integer> bolha(List<Integer> input, ResultadoOrdenacao resultado) {
        List<Integer> lista = new ArrayList<>(input);
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                resultado.incrementarComparacoes();
                if (lista.get(j) > lista.get(j + 1)) {
                    Collections.swap(lista, j, j + 1);
                    resultado.incrementarTrocas();
                }
            }
        }
        return lista;
    }

    public static List<Integer> insercao(List<Integer> input, ResultadoOrdenacao resultado) {
        List<Integer> lista = new ArrayList<>(input);
        int n = lista.size();
        for (int i = 1; i < n; i++) {
            int chave = lista.get(i);
            int j = i - 1;
            while (j >= 0) {
                resultado.incrementarComparacoes();
                if (lista.get(j) > chave) {
                    lista.set(j + 1, lista.get(j));
                    resultado.incrementarTrocas();
                    j--;
                } else {
                    break;
                }
            }
            lista.set(j + 1, chave);
            resultado.incrementarTrocas(); // Inserção da chave
        }
        return lista;
    }

    public static List<Integer> selecao(List<Integer> input, ResultadoOrdenacao resultado) {
        List<Integer> lista = new ArrayList<>(input);
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                resultado.incrementarComparacoes();
                if (lista.get(j) < lista.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Collections.swap(lista, i, minIndex);
                resultado.incrementarTrocas();
            }
        }
        return lista;
    }

    public static List<Integer> agitacao(List<Integer> input, ResultadoOrdenacao resultado) {
        List<Integer> lista = new ArrayList<>(input);
        boolean trocou = true;
        int inicio = 0;
        int fim = lista.size() - 1;

        while (trocou) {
            trocou = false;

            for (int i = inicio; i < fim; i++) {
                resultado.incrementarComparacoes();
                if (lista.get(i) > lista.get(i + 1)) {
                    Collections.swap(lista, i, i + 1);
                    resultado.incrementarTrocas();
                    trocou = true;
                }
            }

            if (!trocou) break;

            trocou = false;
            fim--;

            for (int i = fim - 1; i >= inicio; i--) {
                resultado.incrementarComparacoes();
                if (lista.get(i) > lista.get(i + 1)) {
                    Collections.swap(lista, i, i + 1);
                    resultado.incrementarTrocas();
                    trocou = true;
                }
            }

            inicio++;
        }

        return lista;
    }

    public static List<Integer> pente(List<Integer> input, ResultadoOrdenacao resultado) {
        List<Integer> lista = new ArrayList<>(input);
        int n = lista.size();
        int gap = n;
        boolean trocou = true;
        double fator = 1.3;

        while (gap > 1 || trocou) {
            gap = (int) (gap / fator);
            if (gap < 1) gap = 1;

            trocou = false;
            for (int i = 0; i + gap < n; i++) {
                resultado.incrementarComparacoes();
                if (lista.get(i) > lista.get(i + gap)) {
                    Collections.swap(lista, i, i + gap);
                    resultado.incrementarTrocas();
                    trocou = true;
                }
            }
        }

        return lista;
    }

    public static List<Integer> shell(List<Integer> input, ResultadoOrdenacao resultado) {
        List<Integer> lista = new ArrayList<>(input);
        int n = lista.size();
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = lista.get(i);
                int j = i;
                while (j >= gap) {
                    resultado.incrementarComparacoes();
                    if (lista.get(j - gap) > temp) {
                        lista.set(j, lista.get(j - gap));
                        resultado.incrementarTrocas();
                        j -= gap;
                    } else {
                        break;
                    }
                }
                lista.set(j, temp);
                resultado.incrementarTrocas();
            }
        }
        return lista;
    }

    public static List<Integer> quick(List<Integer> input, ResultadoOrdenacao resultado) {
        List<Integer> lista = new ArrayList<>(input);
        quickSort(lista, 0, lista.size() - 1, resultado);
        return lista;
    }

    private static void quickSort(List<Integer> lista, int menor, int maior, ResultadoOrdenacao resultado) {
        if (menor < maior) {
            int pi = particiona(lista, menor, maior, resultado);
            quickSort(lista, menor, pi - 1, resultado);
            quickSort(lista, pi + 1, maior, resultado);
        }
    }

    private static int particiona(List<Integer> lista, int menor, int maior, ResultadoOrdenacao resultado) {
        int pivo = lista.get(maior);
        int i = menor - 1;
        for (int j = menor; j < maior; j++) {
            resultado.incrementarComparacoes();
            if (lista.get(j) < pivo) {
                i++;
                Collections.swap(lista, i, j);
                resultado.incrementarTrocas();
            }
        }
        Collections.swap(lista, i + 1, maior);
        resultado.incrementarTrocas();
        return i + 1;
    }
}
