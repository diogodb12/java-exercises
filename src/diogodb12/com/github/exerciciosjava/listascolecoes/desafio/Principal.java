package diogodb12.com.github.exerciciosjava.listascolecoes.desafio;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while(sair != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada || cartao.getSaldo() != 0) {
                System.out.println("Compra realizada!");
                System.out.println("==========================");
                System.out.println( "       Menu\n" +
                                    "1. Nova Compra\n" +
                                    "0. Sair");
                System.out.println("==========================");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(cartao.getCompras());
        for (Compra compra : cartao.getCompras()) {
            System.out.println(compra.getDescricao() + " - " + compra.getValor());
        }

        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }
}
