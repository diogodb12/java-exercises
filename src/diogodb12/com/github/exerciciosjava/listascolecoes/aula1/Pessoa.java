package diogodb12.com.github.exerciciosjava.listascolecoes.aula1;

public class Pessoa {
    private String nome;
    private int idade;
    private String paisDeOrigem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Idade: " + this.idade + " | País de origem: " + this.paisDeOrigem;
    }
}
