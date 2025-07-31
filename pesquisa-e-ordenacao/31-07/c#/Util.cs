using System;
using System.Collections.Generic;
using System.Linq;

namespace _31_07
{
    internal class Util
    {
        private static Random gerador = new Random();

        public static void popularAleatorioNumeros(List<int> lista, long quantidade, int inicio, int fim)
        {
            for (; quantidade > 0; quantidade--)
            {
                lista.Add(gerador.Next(inicio, fim));
            }
        }

        public static void popularAleatorioPalavras(List<string> lista, long quantidade, int tamanhoPalavra)
        {
            string letras = "abcdefghijklmnopqrstuvwxyz ";
            for (; quantidade > 0; quantidade--)
            {
                string palavraGerada = "";
                for (int i = 0; i < tamanhoPalavra; i++)
                {
                    char letraSorteada = letras[gerador.Next(letras.Length)];
                    palavraGerada += letraSorteada;
                }
                lista.Add(palavraGerada);
            }
        }

        public static void exibirListaNumeros(List<int> lista)
        {
            foreach (int i in lista)
            {
                Console.WriteLine(i);
            }
        }

        public static void exibirListaPalavras(List<string> lista)
        {
            foreach (string i in lista)
            {
                Console.WriteLine(i);
            }
        }
    }
}
