package javaAtividades.Atividade09;

public class atividade09 {
    public class Pessoa{
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public void Imprime() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
        public class Aluno extends Pessoa{
            private int matricula;

            public Aluno(String nome, int idade, int matricula) {
                super(nome, idade);
                this.matricula = matricula;
            }

            @Override
            public void Imprime() {
                super.Imprime();
                System.out.println("Matrícula: " + matricula);
            }
    }
}
}
/*Escrever a classe TestaAluno, que contém o método main, onde serão criadas 3 alunos: 
a Ana Souza 31 anos matricula 1234, a Bia Nunes 25 anos matricula 5678 e Paulo Santos 45 anos matricula 9876 .  */