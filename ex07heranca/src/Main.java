//Criar uma classe "Pessoa" com atributo nome.
//o Criar classes Professor e Aluno que herdam de Pessoa.
//o Professor deve ter um atributo disciplina.
//o Aluno deve ter um atributo matricula.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você deseja acessar as informações de que pessoa ?");
        System.out.println("Digite 1 para ver as informações do professor");
        System.out.println("Digite 2 para acessar as informações do aluno");
        escolha = scanner.nextInt();

        switch(escolha){
            case 1:
                Professor novoProfessor = new Professor();
                novoProfessor.infoProfessor("Arthur", "Matemática");
                break;
            case 2:
                Aluno novoAluno = new Aluno();
                novoAluno.infoAluno("Arthur");
        }
    }
}