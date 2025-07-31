import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<Integer> listaNumeros2 = new ArrayList<>();
        ArrayList<String> listaPalavras = new ArrayList<>();

        Util.popularAleatorioNumeros(listaNumeros, 10, 1, 100);
        System.out.println("Lista 1: ");
        Util.exibirListaNumeros(listaNumeros);

        listaNumeros2.addAll(listaNumeros);
        Collections.sort(listaNumeros2);
        System.out.println("Lista 2 (ordenada): ");
        Util.exibirListaNumeros(listaNumeros2);

        Util.popularAleatorioPalavras(listaPalavras, 10, 5);
        Util.exibirListaPalavras(listaPalavras);
    }
    