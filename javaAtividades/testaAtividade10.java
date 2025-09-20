package javaAtividades.Atividade10;

public class testaAtividade10 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("`José", "Rua Antonio Marques 30", "568.234.981-15", "3.698.222-5");

        pessoa1.ImprimePessoa();

        Aluno aluno1 = new Aluno("Pedro", "Rua Almeida, 20","456.876.123-12", "4.687.098-2",58751,10,4.5,8.0);
        aluno1.imprimeAluno();
        aluno1.imprimeFaltas();
        aluno1.Resultado();
    }
    
}
