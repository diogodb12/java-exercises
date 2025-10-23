package diogodb12.com.github.exerciciosjava.javapoo.aula4.calculadora_preco;

import diogodb12.com.github.exerciciosjava.javapoo.aula2.Produto;

public class Livro extends Produto implements Calculavel{

    private String autor;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
