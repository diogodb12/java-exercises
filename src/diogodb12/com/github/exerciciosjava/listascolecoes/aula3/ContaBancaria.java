package diogodb12.com.github.exerciciosjava.listascolecoes.aula3;

import diogodb12.com.github.exerciciosjava.javapoo.aula3.conta.ContaCorrente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ContaBancaria {
    int numeroDaConta;
    private double saldo;

    public ContaBancaria(int numero, double saldo) {
        this.numeroDaConta = numero;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + this.numeroDaConta + " | Saldo: " + this.saldo;
    }
}

class MainConta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, 1200);
        ContaBancaria conta2 = new ContaBancaria(231, 800);
        ContaBancaria conta3 = new ContaBancaria(312, 1000);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (!listaContas.isEmpty()) {
                if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                    contaMaiorSaldo = conta;
                }
            } else {
                System.out.println("Lista Vazia...");
            }
        }
        System.out.println("Conta com maior saldo: " + contaMaiorSaldo.numeroDaConta);
    }
}