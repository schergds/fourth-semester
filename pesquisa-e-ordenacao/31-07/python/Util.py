import random


class Util:

    @staticmethod
    def popularAleatorioNumeros(lista, quantidade, inicio, fim):
        for i in range(quantidade):
            lista.append(random.randint(inicio, fim - 1))

    @staticmethod
    def popularAleatorioPalavras(lista, quantidade, tamanho):
        letras = "abcdefghijklmnopqrstuvwxyz "
        for i in range(quantidade):
            palavragerada = ""
            for i in range (tamanho):
                palavragerada += random.choice(letras)
            lista.append(palavragerada)

    @staticmethod
    def exibirLista(lista):
        for palavra in lista:
            print(palavra)