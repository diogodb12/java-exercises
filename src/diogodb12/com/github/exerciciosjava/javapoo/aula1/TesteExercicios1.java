package diogodb12.com.github.exerciciosjava.javapoo.aula1;

public class TesteExercicios1 {
    public static void main(String[] args) {
        //Teste classe Perfil
        Perfil perfil = new Perfil();
        perfil.saudacao();

        System.out.println("======================================");

        //Teste classe Calculadora
        Calculadora calculadora = new Calculadora();
        System.out.println("Dobro do número " + 2 + ": " + calculadora.dobraNumero(2));

        System.out.println("======================================");

        //Teste classe Musica
        Musica musica = new Musica();
        musica.exibeFichaTecnica();
        musica.avaliaMusica(10);
        musica.avaliaMusica(6);
        musica.avaliaMusica(5);
        System.out.println("Média de notas: " + musica.mediaDasAvaliacoes());

        System.out.println("======================================");

        //Teste classe Carro
        Carro carro = new Carro();
        carro.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro.calculaIdadeDoCarro());

        System.out.println("======================================");

        //Teste classe Aluno
        Aluno aluno = new Aluno();
        aluno.nome = "Pedro";
        aluno.idade = 16;
        aluno.exibeInformacoes();

        System.out.println("======================================");
    }
}
