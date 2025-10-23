package algs;

import java.util.List;

public class ResultadoOrdenacao {
    private long comparacoes;
    private long trocas;
    private long tempoExecucao;
    private String metodo;
    private List<Integer> listaOrdenada;

    public ResultadoOrdenacao() {
        this.comparacoes = 0;
        this.trocas = 0;
    }

    public void incrementarComparacoes() {
        comparacoes++;
    }

    public void incrementarTrocas() {
        trocas++;
    }

    public long getComparacoes() {
        return comparacoes;
    }

    public long getTrocas() {
        return trocas;
    }

    public long getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(long tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public List<Integer> getListaOrdenada() {
        return listaOrdenada;
    }

    public void setListaOrdenada(List<Integer> listaOrdenada) {
        this.listaOrdenada = listaOrdenada;
    }

    @Override
    public String toString() {
        return "Método: " + metodo + "\n" +
               "Tempo: " + tempoExecucao + " ms\n" +
               "Comparações: " + comparacoes + "\n" +
               "Trocas: " + trocas + "\n" +
               "Resultado: " + listaOrdenada;
    }
}
