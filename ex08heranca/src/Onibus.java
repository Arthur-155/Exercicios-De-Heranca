//Criar classes Onibus e Trem, herdando de Transporte.
//Onibus deve ter um metodo abrirPorta().
//Trem deve ter um metodo acoplarVagao().

import java.util.Scanner;

public class Onibus extends Transporte{
    int escolhaPuxarLinha;

    public void verificandoCapacidade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas tem no onibus? ");
        capacidade = scanner.nextInt();
        if(capacidade > 200){
            System.out.println("Onibus está cheio, motorista não deixará mais ninguém entrar");
        }else{
            System.out.println("O onibus ainda tem capacidade, motorista ainda deixará pessoas entrar");
        }
    }

    public void abrirPorta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja puxar a linha para indicar parada ?");
        System.out.println("Digite 1 para puxar");
        System.out.println("Digite 2 para não puxar");
        escolhaPuxarLinha = scanner.nextInt();

        switch (escolhaPuxarLinha){
            case 1:
                System.out.println("Como você puxou a linha, o onibus irá abrir as portas para você sair");
                break;
            case 2:
                System.out.println("Linha não foi puxada, o onibus não irá abrir a porta");
        }
    }
}
