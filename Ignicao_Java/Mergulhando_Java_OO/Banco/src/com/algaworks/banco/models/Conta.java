package com.algaworks.banco.models;

import java.util.Objects;

public class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private static double saldo;

    Conta() {
    }

    public Conta(Pessoa titular, int agencia, int numero) {
        //Validando se o Objeto não e NULL
        Objects.requireNonNull(titular);

        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

   public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
        saldo = saldo + valor;
    }

    public static void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }

        if (saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo = saldo - valor;
    }

    public void sacar(double valor, double taxaSaque) {
        sacar(valor + taxaSaque);
    }

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}