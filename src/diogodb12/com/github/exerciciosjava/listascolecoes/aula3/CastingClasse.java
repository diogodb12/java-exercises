package diogodb12.com.github.exerciciosjava.listascolecoes.aula3;

import diogodb12.com.github.exerciciosjava.javapoo.aula3.animal.Animal;
import diogodb12.com.github.exerciciosjava.javapoo.aula3.animal.Cachorro;

public class CastingClasse {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            //O casting de classe permite que um objeto animal
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
