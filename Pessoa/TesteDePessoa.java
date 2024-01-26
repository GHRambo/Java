package Pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("65465451361");
        professor.setNome("Daniela");
        professor.setIdade(31);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("415646446641");
        aluno.setNome("Cleu");
        aluno.setIdade(29);
        aluno.setMatricula("164164165146416");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
