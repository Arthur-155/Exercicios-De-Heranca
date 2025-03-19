//Criar uma classe "Produto" com atributos nome e preco.
//Criar classes Roupa e Eletronico que herdam de Produto.
//Roupa deve ter um atributo tamanho.
//Eletronico deve ter um atributo garantia.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Produto produto = new Produto();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Qual o nome do cliente ?");
       String nome = scanner.nextLine();
       produto.setNome(nome);
        System.out.println("Qual o preço do produto ?");
        float preco = scanner.nextFloat();
        Eletronico novoEletronico = new Eletronico();
        novoEletronico.setPreco(preco);
       Roupa novaRoupa = new Roupa();
        novaRoupa.verificacaoTamanho();




        System.out.println("======INFORMAÇÕES FORNECIDAS======");
        System.out.println("Nome do cliente: " +nome);
        System.out.println("Preço do produto: " +preco);
        System.out.println("Tamanho da roupa: " +novaRoupa.tamanho);
        novoEletronico.verificandoGarantia();
        System.out.println("======FIM INFORMAÇÕES FORNECIDAS======");


    }
}