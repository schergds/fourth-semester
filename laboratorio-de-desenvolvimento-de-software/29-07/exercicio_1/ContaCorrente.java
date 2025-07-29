package exercicio_1;

public class ContaCorrente {
    private float saldo;

    public void definirSaldoInicial(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        else {
            return false;
        }
    }

    public float getSaldo() {
        return saldo;
    }
}
