class Program
{
    static void Main()
    {
        Random random = new Random();
        List<int> lista = new List<int>();
        for (int i = 0; i < 50; i++) 
        {
            lista.Add(random.Next(10000));
        }
        foreach (int i in lista) Console.WriteLine(i);
        quickSort(lista, 0, lista.Count - 1);
        Console.WriteLine("//////////");
        foreach (int i in lista) Console.WriteLine(i);
    }

    public static int particiona(List<int> vetor, int ini, int fim)
    {
        int pivo;
        int tmp;
        pivo = ini;

        while (fim > ini)
        {
            for (; fim > pivo && vetor[fim] > vetor[pivo]; fim--);

            if (fim > pivo)
            {
                tmp = vetor[pivo];
                vetor[pivo] = vetor[fim];
                vetor[fim] = tmp;
                pivo = fim;
            }

            for (ini++; ini < pivo && vetor[ini] < vetor[pivo]; ini++);

            if (ini < pivo)
            {
                tmp = vetor[pivo];
                vetor[pivo] = vetor[ini];
                vetor[ini] = tmp;
                pivo = ini;
            }
        }
        return pivo;
    }

    public static void quickSort(List<int> vetor, int ini, int fim)
    {
        int pivo;
        pivo = particiona(vetor, ini, fim);

        if (ini < pivo - 1) quickSort(vetor, ini, pivo - 1);
        if (pivo + 1 < fim) quickSort(vetor, pivo + 1, fim);
    }
}