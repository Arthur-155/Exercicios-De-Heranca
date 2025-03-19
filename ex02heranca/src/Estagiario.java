//Criar uma classe "Funcionario" com atributos nome e salario.
//Criar classes Gerente e Estagiario que herdam de Funcionario.
//Gerente deve ter um atributo bonus.
//Estagiario deve ter um atributo cargaHoraria.

import java.util.Scanner;

public class Estagiario extends Funcionario {
    int cargaHoraria;

    public void horasTrabalhadas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas horas o estágiario fez esse mes: ");
        cargaHoraria = scanner.nextInt();

        System.out.println("Esse mês o estágiario trabalhou: " + cargaHoraria + " Horas.");
    }
}
