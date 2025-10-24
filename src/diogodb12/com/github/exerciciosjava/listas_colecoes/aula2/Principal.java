package diogodb12.com.github.exerciciosjava.listas_colecoes.aula2;

import diogodb12.com.github.exerciciosjava.listas_colecoes.aula1.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var produto1 = new Produto("Prato", 15.5, 10);
        var produto2 = new Produto("Garfo", 5.25, 15);
        var produto3 = new Produto("Faca", 6.75, 12);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produto 2: " + listaDeProdutos.get(1));

        System.out.println("Lista de produtos: ");
        for (Produto produto : listaDeProdutos) {
            System.out.println("   " + produto);
        }

        var produto4 = new ProdutoPerecivel("Pão", 2.35, 32);

        System.out.println(produto4);
    }
}
