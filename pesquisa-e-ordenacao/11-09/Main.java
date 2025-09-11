import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            lista.add(random.nextInt(10000));
        }

        for (Integer i : lista) System.out.println(i);
        quickSort(lista, 0, lista.size() - 1);
        System.out.println("//////////");
        for (Integer i : lista) System.out.println(i);
    }

    public static int particiona(ArrayList<Integer> vetor, int ini, int fim) {
        int pivo = ini;
        int tmp;

        while (fim > ini) {
            while (fim > pivo && vetor.get(fim) > vetor.get(pivo)) fim--;

            if (fim > pivo) {
                tmp = vetor.get(pivo);
                vetor.set(pivo, vetor.get(fim));
                vetor.set(fim, tmp);
                pivo = fim;
            }

            while (ini < pivo && vetor.get(ini) < vetor.get(pivo)) ini++;

            if (ini < pivo) {
                tmp = vetor.get(pivo);
                vetor.set(pivo, vetor.get(ini));
                vetor.set(ini, tmp);
                pivo = ini;
            }
        }

        return pivo;
    }

    public static void quickSort(ArrayList<Integer> vetor, int ini, int fim) {
            int pivo;
            pivo = particiona(vetor, ini, fim);
            if (ini < pivo - 1) quickSort(vetor, ini, pivo - 1);
            if (pivo + 1 < fim) quickSort(vetor, pivo + 1, fim);
    }
}