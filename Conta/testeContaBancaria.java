package Conta;

public class testeContaBancaria {
    public static void main(String [] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("123456");
        contaBancaria1.setTitular("Gustavo");


        contaBancaria1.depositar(50);
        contaBancaria1.sacar(100);
    }
}
