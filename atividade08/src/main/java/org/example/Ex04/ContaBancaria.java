package org.example.Ex04;

public class ContaBancaria {
    private Double saldo = (double) 0;

    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void sacar(Double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public Double getSaldo() {
        return saldo;
    }
}
