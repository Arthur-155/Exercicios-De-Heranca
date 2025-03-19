//Criar uma classe "Funcionario" com atributos nome e salario.
//Criar classes Gerente e Estagiario que herdam de Funcionario.
//Gerente deve ter um atributo bonus.
//Estagiario deve ter um atributo cargaHoraria.

import java.util.Scanner;

public class Gerente extends Funcionario{
    float bonus;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Bonus do Gerente: " + bonus);
    }



    public void calculoBonus(float salarioGerente){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do bonus do gerente: ");
        float bonus = scanner.nextFloat();


        if(bonus < 0){
            System.out.println("O bonus do gerente não pode ser negativo");
        }else{
            this.salario = salarioGerente;
            salarioGerente+=bonus;
            System.out.println("Salário do gerente pós recebimento do bonus: " + salarioGerente);
        }
    }
}
