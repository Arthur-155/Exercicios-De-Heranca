//Trem deve ter um metodo acoplarVagao().

import java.util.Scanner;

public class Trem extends Transporte{
    int verificacao;
    public void acoplarVagao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("O trem está parado ?");
        System.out.println("Digite 1 para sim");
        System.out.println("Digite 2 para não");
        verificacao = scanner.nextInt();

        switch (verificacao){
            case 1:
                System.out.println("Permitido o acoplamento de vagões!");
                break;
            case 2:
                System.out.println("Com o trem em movimento não é permitido o acoplamento de vagões!");
                break;
        }
    }
}
