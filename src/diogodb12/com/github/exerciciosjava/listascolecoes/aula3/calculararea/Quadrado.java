package diogodb12.com.github.exerciciosjava.listascolecoes.aula3.calculararea;

public class Quadrado implements Forma{
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
