package diogodb12.com.github.exerciciosjava.javapoo.aula4.venda;

public class Produto implements Vendavel{
    private String nome;
    private double precoUnitario;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }
}
