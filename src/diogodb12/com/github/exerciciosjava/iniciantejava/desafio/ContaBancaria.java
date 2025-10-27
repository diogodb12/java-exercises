package diogodb12.com.github.exerciciosjava.iniciantejava.desafio;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = "Oswaldo Cruz";
        String tipoConta = "Corrente";
        double saldo = 0;

        String dadosIniciais = """
                ===================================================
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$%.2f
                ===================================================
                """.formatted(nome, tipoConta, saldo);
        System.out.println(dadosIniciais);

        byte escolha = 0;

        while (escolha != 4){
            String textMenu = """
                    ****************************
                    Operações:
                        1. Consultar saldo
                        2. Depositar valor
                        3. Sacar valor
                        4. Sair
                    Digite a opção:""";

            System.out.println(textMenu);
            escolha = entrada.nextByte();

            switch (escolha){
                case 1:
                    System.out.printf("Saldo atual: R$%.2f\n", saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor a ser depositado em conta: ");
                    double valorDepositado = entrada.nextDouble();

                    System.out.println("Valor depositado com sucesso!");
                    System.out.printf("Saldo atualizado: R$%.2f\n", saldo += valorDepositado);
                    break;

                case 3:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSacado = entrada.nextDouble();

                    if (valorSacado > saldo){
                        System.out.println("Impossível realizar o saque, saldo insuficiente");
                        System.out.printf("Saldo atual: R$%.2f\n", saldo);
                    } else{
                        System.out.println("Valor sacado com sucesso!");
                        System.out.printf("Saldo atualizado: R$%.2f\n", saldo -= valorSacado);
                    }
                    break;

                case 4:
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida, digite novamente.");
                    break;
            }
        }

    }
}
