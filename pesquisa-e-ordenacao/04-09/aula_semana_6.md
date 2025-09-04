- Revisão: bolha, seleção, inserção, agitação, pente, shell
    - O que é ordenação e por que é importante ordenar estruturas de dados?
        Ordenação é o processo de organizar os elementos de uma estrutura de dados em uma ordem definida. Ela facilita buscas rápidas, melhora a organização e interpretação dos dados e serve de base para outros algoritmos.

    - Dos vários algoritmos de ordenação, há categorias que os classificam, como:
        - estabilidade
        - complexidade
        Explique o que é estabilidade e complexidade. Se necessário, dar exemplos. Quais os métodos estudados que são estáveis e quais que são instáveis
            Complexidade é a medida de quanto recurso um algoritmo consome, e um algoritmo é estável se, quando dois elementos têm o mesmo valor eles mantêm a mesma ordem relativa que tinham antes de ordenar.
            Estáveis: bolha, inserção, agitação
            Instáveis: seleção, pente, shell

    - Dos métodos estudados, quais suas complexidades? Como é avaliada a complexidade de um método de ordenação?
        É avaliada mediante a quantidade de comparações e quantidade de trocas.
        Bolha: Alta complexidade - O(n^2)
        Seleção: Alta complexidade - O(n^2)
        Inserção: Alta complexidade - O(n^2)
        Agitação: Alta complexidade - O(n^2)
        Comb: ~O(n log n)
        Shell: depende dos gaps

    - Dos métodos estudados, qual o melhor método de ordenação?
        Depende da circunstância, mas geralmente pente.

    - Faça um método na sua linguagem de preferência que retorne true/True se a lista enviada como parâmetro está ordenada, o false/False caso contrário
        Feito.

    - Da a sequência de valores na estrutura abaixo, contabilize quantas comparações e quantas trocas há para os métodos:
        - bolha
        - pente
        - seleção

        0   1   2   3   4   5   6   7   8
        30  90  10  20  80  10  20  40  10
        30  10  20  80  10  20  40  10  90
        10  20  30  10  20  40  10  80  90
        10  20  10  20  30  10  40  80  90
        10  10  20  20  10  30  40  80  90
        10  10  20  10  20  30  40  80  90
        10  10  10  20  20  30  40  80  90  

        Bolha - Comparações:    Trocas:
        Pente - Comparações:    Trocas:
        Seleção - Comparações:    Trocas:

    - Na sua linguagem de preferência, implemente (sem consulta) seu método escolhido para saber.
        Feito.