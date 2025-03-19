//ContaPoupanca deve ter um rendimento

import java.util.Scanner;

public class ContaPoupanca extends contaBancaria{
    float valorNaPoupanca;
    float rendimento =0.001f;
    int mes;
    int mesDigitado;
    float calculandoRendimento, calculoMensal;


    public void calculoRendimento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor deseja guardar na poupança: ");
        valorNaPoupanca = scanner.nextFloat();
        System.out.println("Por quantos meses deseja guardar seu dinheiro na poupança? ");
        mesDigitado = scanner.nextInt();
        for(mes = 0; mes<=mesDigitado; mes++){
            if(valorNaPoupanca > 0 && mesDigitado > 0){
                calculandoRendimento = valorNaPoupanca*rendimento;
                calculoMensal += calculandoRendimento;
                System.out.printf("\nValor rendido no %d mês: %.2f",mes,calculoMensal);
            }
        }
    }
}
