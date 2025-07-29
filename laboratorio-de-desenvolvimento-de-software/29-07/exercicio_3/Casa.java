package exercicio_3;

public class Casa {
    public double calcularPreco(int tamanho) {
        return 10 * tamanho;
    }

    public double calcularPreco(int tamanho, int quartos) {
        return 3 * tamanho * quartos;
    }
}
