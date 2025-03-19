//Criar uma classe "Animal" com o metodo fazerSom().
//o Criar subclasses Cachorro e Gato, sobrescrevendo fazerSom() com sons específicos.
//o Criar um main() que instancia os objetos e chama fazerSom().

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.fazerSom();

        Cachorro novoCachorro = new Cachorro();
        novoCachorro.fazerSom();

        Gato novoGato = new Gato();
        novoGato.fazerSom();
    }
}