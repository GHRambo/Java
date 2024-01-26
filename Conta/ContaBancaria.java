package Conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(){
        saldo = 200;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

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
        if (valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + ". Saldo atual de R$ " + saldo);
        }else {
            System.out.println("Valor indisponivel.");
        }
    }

}
