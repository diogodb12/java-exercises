package diogodb12.com.github.exerciciosjava.javapoo.aula2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void verificaIdade(int idade) {
        if (idade < 18) {
            System.out.println("Menor de idade.");
        } else {
            System.out.println("Maior de idade.");
        }
    }
}
