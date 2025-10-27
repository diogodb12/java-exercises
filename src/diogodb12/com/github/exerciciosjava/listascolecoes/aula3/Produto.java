package diogodb12.com.github.exerciciosjava.listascolecoes.aula3;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class MainProduto{
    public static void main(String[] args) {
        Produto produto1 = new Produto("Meia", 20.25);
        Produto produto2 = new Produto("Luva", 15.75);
        Produto produto3 = new Produto("Touca", 25.50);

        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : lista) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / lista.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}

