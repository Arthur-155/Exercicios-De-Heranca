//Criar subclasses Cachorro e Gato, sobrescrevendo fazerSom() com sons específicos.
//Criar um main() que instancia os objetos e chama fazerSom().

public class Gato extends Animal{
    @Override
    public void fazerSom() {
        String fazendoSomDeGato = "MIAU";
        System.out.println("Som do gato: " + fazendoSomDeGato);
    }
}
