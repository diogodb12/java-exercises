package diogodb12.com.github.exerciciosjava.listas_colecoes.aula1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var pessoa1 = new Pessoa();
        pessoa1.setNome("Luffy");
        pessoa1.setIdade(19);
        pessoa1.setPaisDeOrigem("Brasil");

        var pessoa2 = new Pessoa();
        pessoa2.setNome("Zoro");
        pessoa2.setIdade(21);
        pessoa2.setPaisDeOrigem("Japão");

        var pessoa3 = new Pessoa();
        pessoa3.setNome("Franky");
        pessoa3.setIdade(36);
        pessoa3.setPaisDeOrigem("Estados Unidos");

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeiro da lista: " + listaDePessoas.get(0));
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println("   "+pessoa);
        }
    }
}
