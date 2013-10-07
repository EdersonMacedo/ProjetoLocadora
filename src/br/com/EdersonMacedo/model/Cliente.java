package br.com.EdersonMacedo.model;

public class Cliente extends Pessoa {
    private double saldo;

    @Override
    public String toString() {
        return "Cliente{" + "saldo=" + saldo + '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
