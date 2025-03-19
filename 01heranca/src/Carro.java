//Criar classes Carro e Moto que herdam de Veiculo e adicionam atributos próprios.
//Criar objetos das classes e exibir informações.

public class Carro extends Veiculo{
    int anoDoCarro;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Ano do carro: " + anoDoCarro);
    }
}
