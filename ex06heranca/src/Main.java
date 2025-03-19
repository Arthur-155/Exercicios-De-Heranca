//Criar uma classe "Pagamento" com atributo valor.
//Criar subclasses PagamentoCartao e PagamentoBoleto.
//PagamentoCartao deve ter numeroCartao, e PagamentoBoleto, codigoBarras.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o meio de pagamento? ");
        System.out.println("Digite 1 para pagar com cartão");
        System.out.println("Digite 2 para pagar com boleto");
        escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                PagamentoCartao pagandoCartao = new PagamentoCartao();
                pagandoCartao.pagandoComCartao();
                break;
            case 2:
                PagamentoBoleto pagandoBoleto = new PagamentoBoleto();
                pagandoBoleto.pagandoComBoleto();
                break;
        }
    }
}