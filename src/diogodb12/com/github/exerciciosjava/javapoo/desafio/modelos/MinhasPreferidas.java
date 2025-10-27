package diogodb12.com.github.exerciciosjava.javapoo.desafio.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " está no em alta do momento!");
        } else{
            System.out.println(audio.getTitulo() + " é excelente para ouvir mais tarde");
        }
    }
}
