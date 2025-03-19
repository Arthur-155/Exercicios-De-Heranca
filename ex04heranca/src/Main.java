//Criar uma classe "ContaBancaria" com atributos saldo e titular.
//Criar subclasses ContaCorrente e ContaPoupanca.
//ContaCorrente deve ter um limite de crédito.
//ContaPoupanca deve ter um rendimento

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        //contaPoupanca.calculoRendimento();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.limiteCredito();
    }
}