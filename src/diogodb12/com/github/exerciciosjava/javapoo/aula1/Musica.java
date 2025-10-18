package diogodb12.com.github.exerciciosjava.javapoo.aula1;

public class Musica {
    String titulo = "Let me Love You";
    String artista = "Mario";
    int anoDeLancamento = 2004;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
    }

    void avaliaMusica(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
