package diogodb12.com.github.exerciciosjava.javapoo.aula4.conversortemperatura;

public class TesteConversorTemperaturaPadrao {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        conversor.celsiusParaFahrenheit(20);


        conversor.fahrenheitParaCelsius(70);
    }
}
