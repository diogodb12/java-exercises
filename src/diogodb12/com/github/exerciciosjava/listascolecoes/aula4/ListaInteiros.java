package diogodb12.com.github.exerciciosjava.listascolecoes.aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaInteiros {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listaInteiros.add((int)(Math.random() * 40) + 10);
        }
        System.out.println("Lista: ");
        System.out.println(" " + listaInteiros);

        Collections.sort(listaInteiros);

        System.out.println("Lista depois de ordenada: ");
        System.out.println(" " + listaInteiros);
    }
}
