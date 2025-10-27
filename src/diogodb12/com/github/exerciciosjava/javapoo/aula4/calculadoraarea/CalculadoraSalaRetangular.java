package diogodb12.com.github.exerciciosjava.javapoo.aula4.calculadoraarea;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        System.out.println("Area da sala: " + altura * largura + "m");
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        System.out.println("Perímetro da sala: " + 2 * (altura + largura) + "m");
    }
}
