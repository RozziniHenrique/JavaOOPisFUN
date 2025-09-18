package javaAtividades.Atividade09;  
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