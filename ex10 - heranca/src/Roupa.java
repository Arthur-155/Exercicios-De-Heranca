//Criar uma classe "Produto" com atributos nome e preco.
//Criar classes Roupa e Eletronico que herdam de Produto.
//Roupa deve ter um atributo tamanho.
//Eletronico deve ter um atributo garantia.

import java.util.Scanner;

public class Roupa extends Produto {
    String tamanho;

    public void verificacaoTamanho(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho da roupa");
        tamanho = scanner.nextLine();
    }
}
