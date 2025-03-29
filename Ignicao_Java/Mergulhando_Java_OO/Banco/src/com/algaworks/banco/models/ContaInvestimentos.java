package com.algaworks.banco.models;

public class ContaInvestimentos extends Conta{

    public ContaInvestimentos(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        depositar(valorRendimentos);
    }
}
