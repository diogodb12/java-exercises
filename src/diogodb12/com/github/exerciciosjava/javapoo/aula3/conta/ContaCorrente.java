package diogodb12.com.github.exerciciosjava.javapoo.aula3.conta;

public class ContaCorrente extends ContaBancaria{
    public void cobrarTarifaMensal(){
        double tarifa = 100;
        super.saldo -= tarifa;
        System.out.println("Tarifa cobrada: " + tarifa);
        System.out.println("Novo Saldo: " + super.saldo);
    }
}
