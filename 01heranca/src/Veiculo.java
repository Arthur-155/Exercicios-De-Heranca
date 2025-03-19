//Criar uma classe "Veiculo" com atributos marca e modelo.
//Criar um metodo exibirInformacoes().
//Criar classes Carro e Moto que herdam de Veiculo e adicionam atributos próprios.
//Criar objetos das classes e exibir informações.

public class Veiculo {
    String marca;
    String modelo;


    public void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
