package diogodb12.com.github.exerciciosjava.javapoo.aula3.animal;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void abanarRabo(){
        System.out.println("Cachorro abanou o rabo");
    }
}
