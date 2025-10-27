package diogodb12.com.github.exerciciosjava.javapoo.desafio.principal;

import diogodb12.com.github.exerciciosjava.javapoo.desafio.modelos.MinhasPreferidas;
import diogodb12.com.github.exerciciosjava.javapoo.desafio.modelos.Musica;
import diogodb12.com.github.exerciciosjava.javapoo.desafio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.setTitulo("The Box");
        musica.setArtista("Roddy Ricch");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();

        podcast.setTitulo("Flow");
        podcast.setApresentador("Igor");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}
