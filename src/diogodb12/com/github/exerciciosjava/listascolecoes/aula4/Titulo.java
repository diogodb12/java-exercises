package diogodb12.com.github.exerciciosjava.listascolecoes.aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    //Permite que o objeto criado seja comparado pelo nome
    public int compareTo(Titulo titulo) {
        return this.nome.compareTo(titulo.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }
}

class Main{
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Demon Slayer - Castelo Infinito pt1");
        Titulo titulo2 = new Titulo("Jujutsu Kaizen - Execution");
        Titulo titulo3 = new Titulo("Chainsaw Man: O Filme - Arco da Reze");

        List<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(titulo1);
        listaTitulo.add(titulo2);
        listaTitulo.add(titulo3);

        System.out.println("Lista:");
        System.out.println(" " + listaTitulo);

        Collections.sort(listaTitulo);

        System.out.println("Lista Ordenada: ");
        System.out.println(" " + listaTitulo);
    }
}
