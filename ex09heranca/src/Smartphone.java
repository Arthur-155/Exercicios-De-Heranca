//Criar classes Smartphone e Notebook que herdam de Eletronico.
//Smartphone deve ter um atributo sistemaOperacional.
//Notebook deve ter um atributo memoriaRAM.


import java.util.Scanner;

public class Smartphone extends Eletronico {
    String sistemaOperacional;
    int verificacao;


    public void verificandoSistemaOperacional(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o sistema operacional do seu SmartPhone:");
        System.out.println("Digite 1 - Para Ios");
        System.out.println("Digite 2 - Para Android");
        verificacao = scanner.nextInt();

        switch (verificacao){
            case 1:
                System.out.println("===INFORMAÇÕES RECEBIDAS===");
                System.out.println("Marca do celular " + marca);
                System.out.println("Sistemas Operacional: Ios ");
                break;
            case 2:
                System.out.println("===INFORMAÇÕES RECEBIDAS===");
                System.out.println("Marca do celular " + marca);
                System.out.println("Sistemas Operacional: Android ");
        }
    }
}
