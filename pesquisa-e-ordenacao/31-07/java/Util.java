import java.util.ArrayList;
import java.util.Random;

public class Util {
    /***
     * método estático que popula uma lista de números inteiros com valores aleatórios
     * @param lista estrutura de armazenamento dos números
     * @param quantidade quantidade de números a serem gerados
     * @param inicio valor inicial da extensão do número gerado
     * @param fim valor final da extensão do número gerado
     */
    public static void popularAleatorioNumeros(ArrayList<Integer> lista, long quantidade, int inicio, int fim) {
        Random gerador = new Random();
        for(; quantidade > 0; quantidade--) {
            lista.add(gerador.nextInt(inicio, fim));
        }
    }

    /***
     * método estático que popula uma lista de palavras com strings aleatórias
     * @param lista estrutura que armazena as palavras
     * @param quantidade quantidade de palavras a serem geradas
     * @param tamanhoPalavra tamanho da palavra a ser gerada
     */
    public static void popularAleatorioPalavras(ArrayList<String> lista, long quantidade, int tamanhoPalavra){
        String letras = "abcdefghijklmnopqrstuvwxyz ";
        Random gerador = new Random();
        for(; quantidade > 0; quantidade--) {
            String palavraGerada = "";
            char letraSorteada;
            for(int i = 0; i < tamanhoPalavra; i++){
                letraSorteada = letras.charAt(gerador.nextInt(letras.length()));
                palavraGerada = palavraGerada + letraSorteada;
            }
            lista.add(palavraGerada);
        }
    }

    /***
     * método estático que exibe uma lista de números
     * @param lista estrutura que armazena os números
     */
    public static void exibirListaNumeros(ArrayList<Integer> lista){
        for(Integer i : lista){
            System.out.println(i);
        }
    }

    /***
     * método estático que exibe uma lista de palavras
     * @param lista estrutura que armazena as palavras
     */
    public static void exibirListaPalavras(ArrayList<String> lista){
        for(String i : lista){
            System.out.println(i);
        }
    }
}
