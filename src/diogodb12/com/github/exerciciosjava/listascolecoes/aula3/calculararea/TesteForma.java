package diogodb12.com.github.exerciciosjava.listascolecoes.aula3.calculararea;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TesteForma {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 3;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listaForma = new ArrayList<>();
        listaForma.add(circulo);
        listaForma.add(quadrado);

        for (Forma forma : listaForma) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
