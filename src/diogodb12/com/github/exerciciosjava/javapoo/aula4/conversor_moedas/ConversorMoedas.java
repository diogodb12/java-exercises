package diogodb12.com.github.exerciciosjava.javapoo.aula4.conversor_moedas;

public class ConversorMoedas implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.38; //Cotação do dólar em 23/10/2025
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("Valor em reais: R$" + valorReal);
    }
}
