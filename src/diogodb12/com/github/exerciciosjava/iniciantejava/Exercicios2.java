package diogodb12.com.github.exerciciosjava.iniciantejava;

public class Exercicios2 {
    public static void main(String[] args) {

        //Conversor de Temperatura °C → °F
        double temperaturaEmCelsius = 23.2;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        System.out.printf("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit\n", temperaturaEmCelsius, temperaturaEmFahrenheit);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;

        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

        System.out.println("--------------------------------");

        //Média de notas de um aluno
        double nota1 = 8.5;
        double nota2 = 4.5;
        int notaFinal = (int) (nota1 + nota2) / 2;

        System.out.println("A nota final do aluno foi: " + notaFinal);

        System.out.println("--------------------------------");

       //Concatenar char e String
        char letra = 'A';
        String frase = " maçã é vermelha.";

        System.out.println(letra + frase);

        System.out.println("--------------------------------");

        //Preço total de produtos (Prdt X Qtde)
        double precoProduto = 25.5;
        int quantidade = 5;
        double precoTotal = precoProduto * quantidade;

        System.out.printf("O preço de %d produtos é R$%.2f\n", quantidade, precoTotal);

        System.out.println("--------------------------------");

        //Conversor de $ → R$
        double valorEmDolares = 154.32;
        double valorEmReais = valorEmDolares * 4.94;

        System.out.printf("Valor Convertido para reais: R$%.2f\n",valorEmReais);

        System.out.println("--------------------------------");

        double precoOriginal = 59.99;
        double percentualDesconto = 10;
        double precoComDesconto = precoOriginal - (precoOriginal / percentualDesconto);

        System.out.printf("Preço final com desconto: R$%.2f\n", precoComDesconto);

        System.out.println("--------------------------------");
    }
}
