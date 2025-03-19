//ContaPoupanca deve ter um rendimento

import java.util.Scanner;

public class ContaCorrente extends contaBancaria{
    float credito;
    float sobraCredito;

    public void limiteCredito(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor deseja gastar no crédito: ");
        credito = scanner.nextFloat();

        if(credito > 1000){
            System.out.println("O limite do seu crédito é apenas R$1000,00 reais");
        }else{
            System.out.println("Compra realizada com sucesso");
            sobraCredito = 1000-credito;
            System.out.println("Saldo ainda disponível: " + sobraCredito);
        }
    }
}
