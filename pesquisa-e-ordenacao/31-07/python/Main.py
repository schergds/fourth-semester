from Util import Util


class Main:
    listaNumeros = []
    listaNumeros2 = []
    listaPalavras = []

    Util.popularAleatorioNumeros(listaNumeros, 10, 1, 100)
    print("Lista 1: ")
    Util.exibirLista(listaNumeros)

    listaNumeros2.extend(listaNumeros)
    listaNumeros2.sort()
    print("Lista 2 (ordenada): ")
    Util.exibirLista(listaNumeros2)

    print("Lista de palavras: ")
    Util.popularAleatorioPalavras(listaPalavras, 10, 5)
    Util.exibirLista(listaPalavras)