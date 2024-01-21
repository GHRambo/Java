package Pessoa;

public class Pessoa {

    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa(int indice) {
        return "O nome da pessoa é " + nome + " a idade é " + idade + " E o documento é " + cpf + " e o indice é " + indice ;
    }
}
