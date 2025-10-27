package diogodb12.com.github.exerciciosjava.listascolecoes.desafio;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.getValor()).compareTo(outraCompra.getValor());
    }

    @Override
    public String toString() {
        return "Compra: " +
                "  " + this.descricao + " : R$" + this.valor;
    }
}
