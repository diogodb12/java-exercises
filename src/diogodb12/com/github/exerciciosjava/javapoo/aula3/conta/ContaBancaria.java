package diogodb12.com.github.exerciciosjava.javapoo.aula3.conta;

public class ContaBancaria {
    protected double saldo = 0;

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + valor);
        System.out.println("Novo saldo: "+ this.saldo);
    }

    public void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void cansultarSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }
}
