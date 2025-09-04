package aula_semana_6;

import java.util.ArrayList;
import java.util.Random;

public class exercicio {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista = listaAleatoria(lista, 10);
        System.out.println("Lista gerada: " + lista);
        bolha(lista);
        System.out.println("Lista ordenada: " + lista);
        System.out.println("A lista está ordenada? " + estaOrdenada(lista));
    }

    public static ArrayList<Integer> listaAleatoria(ArrayList<Integer> lista, int n){
        Random rand = new Random();
        for(int i = 0; i < n; i++){
            lista.add(rand.nextInt(100));
        }
        return lista;
    }

    public static boolean estaOrdenada(ArrayList<Integer> lista){
        for(int i = 1; i < lista.size(); i++){
            if(lista.get(i) < lista.get(i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void bolha(ArrayList<Integer> lista){
        boolean houveTroca;
        int tmp;

        do {
            houveTroca = false;
            for (int i = 0; i < lista.size()-1; i++){
                if (lista.get(i) > lista.get(i+1)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, tmp);
                }
            }
        } while (houveTroca);
    }
}
