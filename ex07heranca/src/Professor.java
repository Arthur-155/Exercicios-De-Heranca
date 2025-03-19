//Criar classes Professor e Aluno que herdam de Pessoa.
//Professor deve ter um atributo disciplina.
//Aluno deve ter um atributo matricula.

public class Professor extends Pessoa{
    String disciplina;

    public void infoProfessor(String nome, String disciplina){
        System.out.println("Nome do professor: " + nome);
        System.out.printf("Disciplina do professor %s: %s", nome, disciplina);
    }
}
