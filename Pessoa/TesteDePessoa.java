package Pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCpf("65465451361");
        pessoa1.setNome("Daniela");
        pessoa1.setIdade(31);

        System.out.println(pessoa1.imprimirDadosDaPessoa(1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCpf("4841454161615");
        pessoa2.setNome("Maria");
        pessoa2.setIdade(19);

        System.out.println(pessoa2.imprimirDadosDaPessoa(2));


    }
}
