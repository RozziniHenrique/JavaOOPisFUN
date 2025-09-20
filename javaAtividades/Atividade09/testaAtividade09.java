package javaAtividades.Atividade09;

public class testaAtividade09 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Carlos Silva", 40);
        Aluno aluno1 = new Aluno("Ana Souza", 31, 1234);
        Aluno aluno2 = new Aluno("Bia Nunes", 25, 5678);
        Aluno aluno3 = new Aluno("Paulo Santos", 45, 9876);

        pessoa1.Imprime();
        System.out.println();
        aluno1.imprimeAluno();
        System.out.println();
        aluno2.imprimeAluno();
        System.out.println();
        aluno3.imprimeAluno();
    }
}


/*Escrever a classe TestaAluno, que contém o método main, onde serão criadas 3 alunos: 
a Ana Souza 31 anos matricula 1234, a Bia Nunes 25 anos matricula 5678 e Paulo Santos 45 anos matricula 9876 .  */