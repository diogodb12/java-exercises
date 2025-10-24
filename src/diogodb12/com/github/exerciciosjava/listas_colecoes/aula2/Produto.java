package diogodb12.com.github.exerciciosjava.listas_colecoes.aula2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + " | Preço: R$" + this.preco + " | Quantidade: " + this.quantidade;
    }
}
