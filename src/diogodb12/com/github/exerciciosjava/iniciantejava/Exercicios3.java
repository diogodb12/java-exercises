package diogodb12.com.github.exerciciosjava.iniciantejava;

import java.util.Random;
import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Jogo da Advinhação - Advinhe o número secreto");
        System.out.println("Você terá 5 tentativas");

        for (int i = 0; i <= 5; i++) {
            if (i == 5){
                System.out.println("Que pena, acabaram suas tentativas, o número secreto era " + numeroAleatorio);
            } else{
                System.out.println("Digite seu palpite: ");
                int palpite = entrada.nextInt();

                if (palpite == numeroAleatorio) {
                    System.out.println("Parabéns, acertou na mosca!");
                    break;
                } else{
                    if (palpite < numeroAleatorio){
                        System.out.println("O numero secreto é maior que " + palpite);
                    } else{
                        System.out.println("O numero secreto é menor que " + palpite);
                    }
                }
            }

        }
    }
}
