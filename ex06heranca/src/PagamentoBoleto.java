//Criar subclasses PagamentoCartao e PagamentoBoleto.
//PagamentoCartao deve ter numeroCartao, e PagamentoBoleto, codigoBarras.

import java.util.Scanner;

public class PagamentoBoleto extends Pagamento{
    int codigoDeBarras;

    public void pagandoComBoleto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de barras do boleto que deseja pagar: ");
        codigoDeBarras = scanner.nextInt();
        if(codigoDeBarras > 0){
            System.out.printf("Pagamento no valor %.2f realizada", valor);
            System.out.println("\nO pagamento pode demorar 1 dia para contabilizar");
        }else{
            System.out.println("Número de cartão inválido");
        }
    }
}
