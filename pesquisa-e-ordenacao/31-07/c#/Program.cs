using System;
using System.Collections.Generic;

namespace _31_07
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> listaNumeros = new List<int>();
            List<int> listaNumeros2 = new List<int>();
            List<string> listaPalavras = new List<string>();

            Util.popularAleatorioNumeros(listaNumeros, 10, 1, 100);
            Console.WriteLine("Lista 1: ");
            Util.exibirListaNumeros(listaNumeros);

            listaNumeros2.AddRange(listaNumeros);
            listaNumeros2.Sort();
            Console.WriteLine("Lista 2 (ordenada): ");
            Util.exibirListaNumeros(listaNumeros2);

            Util.popularAleatorioPalavras(listaPalavras, 10, 5);
            Console.WriteLine("Lista de palavras:");
            Util.exibirListaPalavras(listaPalavras);
        }
    }
}
