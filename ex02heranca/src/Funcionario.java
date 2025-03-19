//Criar uma classe "Funcionario" com atributos nome e salario.
//Criar classes Gerente e Estagiario que herdam de Funcionario.
//Gerente deve ter um atributo bonus.
//Estagiario deve ter um atributo cargaHoraria.

public class Funcionario {
    String nome;
    float salario;

    public void exibirInformacoes(){
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: " + salario);
    }
}
