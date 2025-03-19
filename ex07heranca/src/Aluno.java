//Criar classes Professor e Aluno que herdam de Pessoa.
//Professor deve ter um atributo disciplina.
//Aluno deve ter um atributo matricula.

import java.util.Scanner;

public class Aluno {
    int matricula;

    public void infoAluno(String nome){
        System.out.println("Nome do aluno: " + nome);
        Scanner scanner = new Scanner(System.in);
        System.out.println("O aluno está matricualdo ?");
        System.out.println("Digite 1 caso o aluno esteja matriculado");
        System.out.println("Digite 2 caso o aluno não esteja matriculado");
        matricula = scanner.nextInt();

        switch(matricula){
            case 1:
                System.out.println("Aluno está matriculado");
                break;
            case 2:
                System.out.println("O Aluno não está matriculado");
        }

    }

}
