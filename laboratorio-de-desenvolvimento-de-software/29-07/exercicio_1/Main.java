package exercicio_1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.definirSaldoInicial(1000);
        System.out.println(conta.getSaldo());
        conta.sacar(500);
        conta.depositar(50);
        System.out.println(conta.getSaldo());
        conta.sacar(600);
        System.out.println(conta.getSaldo());
    }
}