//Criar subclasses Cachorro e Gato, sobrescrevendo fazerSom() com sons específicos.
//Criar um main() que instancia os objetos e chama fazerSom().

public class Cachorro extends Animal{
    @Override
    public void fazerSom() {
        String fazendoSomDeCachorro = "AUAU";
        System.out.println("Som do cachorro: " + fazendoSomDeCachorro);
    }
}
