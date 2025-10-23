package diogodb12.com.github.exerciciosjava.javapoo.aula4.conversor_temperatura;

public class TesteConversorTemperaturaPadrao {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        conversor.celsiusParaFahrenheit(20);


        conversor.fahrenheitParaCelsius(70);
    }
}
