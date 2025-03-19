//Criar subclasses PagamentoCartao e PagamentoBoleto.
//PagamentoCartao deve ter numeroCartao, e PagamentoBoleto, codigoBarras.

import java.util.Scanner;

public class PagamentoCartao extends Pagamento {
    int numerocartao;

    public void pagandoComCartao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do seu cartão: ");
        numerocartao = scanner.nextInt();
        if(numerocartao > 0){
            System.out.printf("Pagamento no valor %.2f realizada", valor);
        }else{
            System.out.println("Número de cartão inválido");
        }
    }
}
