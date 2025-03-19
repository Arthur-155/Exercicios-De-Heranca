//Criar uma classe "Funcionario" com atributos nome e salario.
//o Criar classes Gerente e Estagiario que herdam de Funcionario.
//o Gerente deve ter um atributo bonus.
//o Estagiario deve ter um atributo cargaHoraria.

public class Main {
    public static void main(String[] args) {
        Gerente novoGerente = new Gerente();
        novoGerente.calculoBonus(2000);

        Estagiario estagiario = new Estagiario();
        estagiario.horasTrabalhadas();
    }
}