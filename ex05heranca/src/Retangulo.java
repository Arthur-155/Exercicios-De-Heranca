//Criar subclasses Retangulo e Circulo, implementando calcularArea().
//Criar um main() que instancia e exibe as áreas das formas.

public class Retangulo extends Forma{
    @Override
    public void calcularArea(float base, float altura) {
        super.calcularArea(base, altura);
        System.out.println("A área do retângulo é: " + calculoDaArea);
    }
}
