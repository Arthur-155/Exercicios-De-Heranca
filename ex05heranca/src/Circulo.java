//Criar subclasses Retangulo e Circulo, implementando calcularArea().
//Criar um main() que instancia e exibe as áreas das formas.

public class Circulo extends Forma {
    float raio;
    float pi = 3.14f;


    public void calcularArea(float raio) {
        calculoDaArea = (raio*raio)*pi;
        System.out.println("A área do circulo é: " + calculoDaArea + "m²");
    }
}
