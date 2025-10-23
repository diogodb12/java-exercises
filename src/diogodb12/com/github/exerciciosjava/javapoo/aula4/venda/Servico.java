package diogodb12.com.github.exerciciosjava.javapoo.aula4.venda;

public class Servico implements Vendavel{
    private String descricao;
    private double precoHora;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}
