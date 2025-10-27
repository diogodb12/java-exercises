package diogodb12.com.github.exerciciosjava.listascolecoes.aula3;

import java.util.ArrayList;

public class ListaDeStrings {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Amarelo");
        lista.add("Azul");
        lista.add("Vermelho");

        System.out.println("Lista: ");
        for (String s : lista) {
            System.out.println("  " + s);
        }
    }
}
