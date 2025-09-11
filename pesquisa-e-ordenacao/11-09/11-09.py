import random

class Quick:

    @staticmethod
    def particiona(vetor, ini, fim):
        pivo = ini

        while (fim > ini) :
            while (fim > pivo and vetor[fim] > vetor[pivo]): 
                fim -= 1

            if (fim > pivo) :
                vetor[pivo], vetor[fim] = vetor[fim], vetor[pivo]
                pivo = fim


            while (ini < pivo and vetor[ini] < vetor[pivo]): 
                ini += 1

            if (ini < pivo) :
                vetor[pivo], vetor[ini] = vetor[ini], vetor[pivo]
                pivo = ini

        return pivo

    @staticmethod
    def quickSort(vetor, ini, fim):
        if (ini < fim) :
            pivo = Quick.particiona(vetor, ini, fim);
            Quick.quickSort(vetor, ini, pivo - 1);
            Quick.quickSort(vetor, pivo + 1, fim);

lista = [random.randint(0, 9999) for _ in range(50)]

for i in lista:
    print(i)

Quick.quickSort(lista, 0, len(lista) - 1)

print("//////////")

for i in lista:
    print(i)