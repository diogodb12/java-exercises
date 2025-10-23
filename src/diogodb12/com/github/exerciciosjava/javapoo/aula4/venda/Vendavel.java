package diogodb12.com.github.exerciciosjava.javapoo.aula4.venda;

public interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}
