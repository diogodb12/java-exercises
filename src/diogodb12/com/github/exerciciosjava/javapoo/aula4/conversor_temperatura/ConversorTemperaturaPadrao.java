package diogodb12.com.github.exerciciosjava.javapoo.aula4.conversor_temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        temperatura = (temperatura * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit: " + temperatura);
    }

    @Override
    public void fahrenheitParaCelsius(double temperatura) {
        temperatura = (temperatura - 32) / 1.8;
        System.out.println("Temperatura em Celsius: " + temperatura);
    }
}
