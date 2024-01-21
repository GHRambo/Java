package Pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "7864564984998";
        pessoa1.nome = "Daniele";
        pessoa1.idade = 31;

        System.out.println(pessoa1.imprimirDadosDaPessoa(1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "4841454161615";
        pessoa2.nome = "Maria";
        pessoa2.idade = 19;

        System.out.println(pessoa2.imprimirDadosDaPessoa(2));


    }
}
