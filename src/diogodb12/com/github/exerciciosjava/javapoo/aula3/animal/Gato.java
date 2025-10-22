package diogodb12.com.github.exerciciosjava.javapoo.aula3.animal;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis(){
        System.out.println("Gato está arranhando os móveis");
    }
}
