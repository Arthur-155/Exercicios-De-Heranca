//Criar uma classe "Forma" com metodo calcularArea().
//Criar subclasses Retangulo e Circulo, implementando calcularArea().
//Criar um main() que instancia e exibe as áreas das formas.

public class Forma {
    float calculoDaArea;
    public void calcularArea(float base, float altura){
        calculoDaArea = base*altura;
    }
}
