package diogodb12.com.github.exerciciosjava.javapoo.aula1;

public class Carro {
    String modelo = "Palio";
    int ano = 2010;
    String cor = "Prata";

    void exibeFichaTecnica(){
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }

    int calculaIdadeDoCarro(){
        return 2025 - ano;
    }
}
