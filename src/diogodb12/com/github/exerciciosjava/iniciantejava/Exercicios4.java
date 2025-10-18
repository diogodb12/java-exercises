package diogodb12.com.github.exerciciosjava.iniciantejava;

import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        //Verificar número positivo ou negativo
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número positivo ou negativo: ");
        double numeroPositivoOuNegativo = entrada.nextDouble();
        if (numeroPositivoOuNegativo < 0){
            System.out.println("Número negativo!");
        } else if (numeroPositivoOuNegativo > 0){
            System.out.println("Número positivo!");
        } else{
            System.out.println("Esse número é 0...");
        }

        System.out.println("--------------------------------");

        //Comparador do tamanho de dois números
        System.out.println("Digite um número inteiro: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os dois números são iguais.");
        } else{
            System.out.println("OS dois números são diferentes.");
            if (numero1 > numero2){
                System.out.println("O número " + numero1 + " é maior.");
            } else{
                System.out.println("O número " + numero2 + " é maior.");
            }
        }

        System.out.println("--------------------------------");

        //Menu para calcular área de quadrado ou círculo
        String msg = """
                Menu
                    1. Calcular área do quadrado
                    2. Calcular área do círculo
                """;
        System.out.println(msg);
        byte escolha = entrada.nextByte();

        switch (escolha){
            case 1:
                System.out.println("Digite o valor do lado do quadrado: ");
                double ladoDoQuadrado = entrada.nextDouble();
                System.out.println("A área total do quadrado é " + ladoDoQuadrado * ladoDoQuadrado);
                break;

            case 2:
                System.out.println("Digite o valor do raio do círculo: ");
                double raio = entrada.nextDouble();
                System.out.println("A área total do círculo é " + 3.14 * (raio * raio));
                break;
        }

        System.out.println("--------------------------------");

        //Tábuada de um número solicitado
        System.out.println("Digite um número inteiro: ");
        int numeroTabuada = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " X " + i + " = " + numeroTabuada * i);
        }

        System.out.println("--------------------------------");

        //Verificador de número ímper ou par
        System.out.println("Digite um número inteiro: ");
        int numeroImparOuPar = entrada.nextInt();

        if (numeroImparOuPar % 2 == 0){
            System.out.println("Esse número é par.");
        } else{
            System.out.println("Esse número é ímpar.");
        }

        System.out.println("--------------------------------");

        //Calcula fatorial de número solicitado
        System.out.println("Digite um número para calcular o fatorial: ");
        int fatorialResultado = 1;
        int numeroFatorado = entrada.nextInt();


        for (int i = 1; i <= numeroFatorado; i++) {
            fatorialResultado *= i;
        }

        System.out.println(fatorialResultado);

        System.out.println("--------------------------------");
    }
}
