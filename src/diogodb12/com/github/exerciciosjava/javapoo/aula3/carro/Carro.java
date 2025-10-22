package diogodb12.com.github.exerciciosjava.javapoo.aula3.carro;

public class Carro {
    protected String nomeModelo;
    protected double precoAno1, precoAno2, precoAno3;

    public void setNomeModelo(String nome) {
        this.nomeModelo = nome;
    }

    public void setPrecos(double p1, double p2, double p3) {
        this.precoAno1 = p1;
        this.precoAno2 = p2;
        this.precoAno3 = p3;
    }

    public double calculaMenorPreco() {
        double menor = precoAno1;
        if (precoAno2 < menor) menor = precoAno2;
        if (precoAno3 < menor) menor = precoAno3;
        return menor;
    }

    public double calculaMaiorPreco() {
        double maior = precoAno1;
        if (precoAno2 > maior) maior = precoAno2;
        if (precoAno3 > maior) maior = precoAno3;
        return maior;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preços:");
        System.out.println(" Ano 1: R$ " + precoAno1);
        System.out.println(" Ano 2: R$ " + precoAno2);
        System.out.println(" Ano 3: R$ " + precoAno3);
        System.out.println("Menor preço: R$ " + calculaMenorPreco());
        System.out.println("Maior preço: R$ " + calculaMaiorPreco());
    }
}