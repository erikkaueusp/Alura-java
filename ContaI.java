package com.company;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

public abstract class ContaI {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public ContaI(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        total++;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }

    }

    public void setAgencia(int agencia) {
        if (agencia<=0) {
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public boolean transfere(double valor, ContaI destino){

        if (this.saca(valor)){

            destino.deposita(valor);
            return true;
        }
        else{
            return false;
        }






    }









}
