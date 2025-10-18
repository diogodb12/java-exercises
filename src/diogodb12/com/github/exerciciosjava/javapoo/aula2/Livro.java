package diogodb12.com.github.exerciciosjava.javapoo.aula2;

public class Livro {
    private String titulo;
    private String autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDetalhes() {
        System.out.println(titulo);
        System.out.println(autor);
    }
}
