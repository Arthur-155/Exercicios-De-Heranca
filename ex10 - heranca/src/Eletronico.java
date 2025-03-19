//Criar uma classe "Produto" com atributos nome e preco.
//Criar classes Roupa e Eletronico que herdam de Produto.
//Roupa deve ter um atributo tamanho.
//Eletronico deve ter um atributo garantia.

public class Eletronico extends Produto{
    boolean garantia;

    public void verificandoGarantia(){

        if(preco > 100){
            garantia = true;
            System.out.println("Você tem direito a 6 meses de garantia");
        }else {
            garantia = false;
            System.out.println("Você não tem direito a garantia!");
        }
    }
}
