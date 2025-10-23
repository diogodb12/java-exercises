package diogodb12.com.github.exerciciosjava.javapoo.aula2;

public abstract class Produto {
    private String nome;
    protected double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }
}
