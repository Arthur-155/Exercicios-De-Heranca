//Criar classes Smartphone e Notebook que herdam de Eletronico.
//Smartphone deve ter um atributo sistemaOperacional.
//Notebook deve ter um atributo memoriaRAM.

import java.util.Scanner;

public class Notebook extends Eletronico {
    int memoriaRAM;

    public void infoNotebook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos GB de Memória RAM, tem seu notebook: ");
        memoriaRAM = scanner.nextInt();

        System.out.println("======INFORMAÇÕES COLETADAS======");
        System.out.println("Quantidade de memória RAM: " + memoriaRAM);
        System.out.println("Marca: " + marca);
    }
}
