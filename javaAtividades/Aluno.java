package javaAtividades.Atividade10;

public class Aluno extends Pessoa{
    private int matricula, falta;
    private double p1,p2;

    public Aluno(){}

    public Aluno(String nome, String end, String cpf, String rg, int matricula, int falta, double p1, double p2) {
        super(nome, end, cpf, rg);
        this.matricula = matricula;
        this.falta = falta;
        this.p1 = p1;
        this.p2 = p2;
    }
public void imprimeAluno(){
    ImprimePessoa();
    System.out.println("Matrícula: " + matricula);
    System.out.println("Faltas: " + falta);
    System.out.println("P1: " + p1);
    System.out.println("P2: " + p2);
    System.out.println("Média: " + ((p1+p2)/2));
}
public void imprimeFaltas(){
    System.out.println("Faltas: " + falta);

}

public void Resultado(){
    double media = (p1+p2)/2;
    if(media >= 7 && falta <= 20){
        System.out.println("Aprovado");
    } else if (media >= 3 && media < 7 && falta <= 20) {
        System.out.println("Exame");
    } else {
        System.out.println("Reprovado");
    }
}
}