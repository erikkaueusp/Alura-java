package com.company;

public class ContaCorrente extends ContaI {

    public ContaCorrente(int agencia, int numero) {
        super(agencia,numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
       super.saldo += valor;
    }
}
