//Criar uma classe "Transporte" com atributo capacidade.
//o Criar classes Onibus e Trem, herdando de Transporte.
//o Onibus deve ter um metodo abrirPorta().
//o Trem deve ter um metodo acoplarVagao().

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Você está num onibus");
        System.out.println("2 - Você está manuseando um trem");
        escolha = scanner.nextInt();

        switch(escolha){
            case 1:
                Onibus novoOnibus = new Onibus();
                novoOnibus.verificandoCapacidade();
                novoOnibus.abrirPorta();
                break;
            case 2:
                Trem novoTrem = new Trem();
                novoTrem.acoplarVagao();
                break;
        }



    }
}