package diogodb12.com.github.exerciciosjava.javapoo.aula3.conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaCorrente contac = new ContaCorrente();

        contac.depositar(1000);
        contac.sacar(400);
        contac.cobrarTarifaMensal();
        contac.cansultarSaldo();
    }
}
