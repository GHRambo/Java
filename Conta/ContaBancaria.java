package Conta;

public class ContaBancaria {
    String numero;
    String titular;
    double saldo;

    //depositar
    void depositar(double valor){

        if ( valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$" + valor + ". Saldo atual de R$ " + saldo);
        }else {
            System.out.println("Valor de depósitos inválido.");
        }
    }

    // sacar
    void sacar(double valor){
        saldo = saldo - valor;
        if (valor > 0 && valor <= saldo){
            System.out.println("Saque de R$" + valor + ". Saldo atual de R$ " + saldo);
        }
    }

}
