package com.company;

public class TesteTributaveis {

    public static void main(String[] args) {
     ContaCorrente cc = new ContaCorrente(222,333);
     cc.deposita(100.0);

     SeguroDeVida seguro = new SeguroDeVida();

     CalculadoraDeImposto calc = new CalculadoraDeImposto();

     calc.registra(cc);
     calc.registra(seguro);
        //Aqui temos um comentário em tributaveis
        System.out.println(calc.getTotalImposto());

    }

}
