//Criar uma classe "Veiculo" com atributos marca e modelo.
//Criar um metodo exibirInformacoes().
//Criar classes Carro e Moto que herdam de Veiculo e adicionam atributos próprios.
//Criar objetos das classes e exibir informações.

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio classe veiculo");
        Veiculo novoVeiculo = new Veiculo();
        novoVeiculo.modelo = "onix";
        novoVeiculo.marca = "vg";
        novoVeiculo.exibirInformacoes();
        System.out.println("Fim classe veiculo");

        System.out.println("Inicio classe Carro");
        Carro novoCarro = new Carro();
        novoCarro.modelo = "Corsa";
        novoCarro.marca = "Dos sonhos";
        novoCarro.anoDoCarro = 1998;
        novoCarro.exibirInformacoes();
        System.out.println("Fim classe Carro");

        System.out.println("Inicio classe Moto");
        Moto novaMoto = new Moto();
        novaMoto.modelo = "honda";
        novaMoto.marca = "Kawasaki nina";
        novaMoto.anoDaMoto = 2000;
        novaMoto.exibirInformacoes();
        System.out.println("Fim classe Moto");

    }
}