package diogodb12.com.github.exerciciosjava.javapoo.aula4.calculadorapreco;

import diogodb12.com.github.exerciciosjava.javapoo.aula2.Produto;

public class ProdutoFisico extends Produto implements Calculavel{

    @Override
    public double calcularPrecoFinal() {
        // Taxas adicionais para produtos físicos
        return preco * 1.05;
    }
}

