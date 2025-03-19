//Criar uma classe "Forma" com metodo calcularArea().
//Criar subclasses Retangulo e Circulo, implementando calcularArea().
//Criar um main() que instancia e exibe as áreas das formas.

public class Main {
    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo();
        novoRetangulo.calcularArea(25.5f,50);

        Circulo novoCirculo = new Circulo();
        novoCirculo.calcularArea(10);
    }
}