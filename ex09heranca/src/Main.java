//Criar uma classe "Eletronico" com atributo marca.
//Criar classes Smartphone e Notebook que herdam de Eletronico.
//Smartphone deve ter um atributo sistemaOperacional.
//Notebook deve ter um atributo memoriaRAM.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Você possui um Smartphone ou um Notebook ?");
        System.out.println("Digite 1 - Caso tenha um SmartPhone.");
        System.out.println("Digite 2 - Caso tenha um Notebook");
        escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                Smartphone novoCelular = new Smartphone();
                novoCelular.nomeMarca("Xiaomi");
                novoCelular.verificandoSistemaOperacional();
                break;
            case 2:
                Notebook novoNotebook = new Notebook();
                novoNotebook.nomeMarca("Acer");
                novoNotebook.infoNotebook();
                break;
        }
    }
}