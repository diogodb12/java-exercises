package diogodb12.com.github.exerciciosjava.listascolecoes.aula3.calculararea;

public class Circulo implements Forma{
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}
