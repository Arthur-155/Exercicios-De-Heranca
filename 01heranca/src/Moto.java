//Criar classes Carro e Moto que herdam de Veiculo e adicionam atributos próprios.
//Criar objetos das classes e exibir informações.

public class Moto extends Veiculo {
    int anoDaMoto;


    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Ano da Moto: " + anoDaMoto);
    }
}
