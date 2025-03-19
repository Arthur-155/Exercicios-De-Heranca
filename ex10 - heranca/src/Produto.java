//Criar uma classe "Produto" com atributos nome e preco.
//Criar classes Roupa e Eletronico que herdam de Produto.
//Roupa deve ter um atributo tamanho.
//Eletronico deve ter um atributo garantia.

import java.util.Scanner;

public class Produto {
    String nome;
    float preco;

    public void setNome(String nome) {
        this.nome = nome;

    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
