package javaAtividades.Atividade08;

public class testaAtividade08 {
    public static void main(String[] args) {
        atividade08 X1 = new atividade08("Paulo", 55123, "800912345-12", 'M', 7.0, 6.0, 8.0);
        atividade08 X2 = new atividade08("Ana", 991239, "500876123-15", 'F', 2.0, 6.0, 9.0);

        System.out.println("----- Dados do Aluno X1 -----");
        X1.ImprimeAluno();
        System.out.printf("Média: %.2f\n", X1.MediaAluno());
        System.out.println("Resultado: " + X1.Resultado());
        X1.imprimeSexo();

        System.out.println("\n----- Dados do Aluno X2 -----");
        X2.ImprimeAluno();
        System.out.printf("Média: %.2f\n", X2.MediaAluno());
        System.out.println("Resultado: " + X2.Resultado());
        X2.imprimeSexo();
    }
}


/*Criar uma classe Java TesteAluno que possui um método main() para instanciar estudantes. Criar um objeto referenciado pela variável X1 por meio
 do construtor com os parâmetros: nome = “Paulo”, codmat = 55123, cpf=”800912345-12” , sexo = ‘M’, nota_P1 = 7.0, nota_P2=6.0 e nota_P3 = 8.0.
Criar um segundo objeto referenciado pela variável X2 por meio do construtor com os parâmetros: nome = “Ana”, codmat = 991239, cpf=”500876123-15” , 
sexo = ‘F’, nota_P1 = 2.0, nota_P2=6.0 e nota_P3=9.0.
Para cada objeto chamar a função ImprimeAluno() para imprimir os dados dos dois objetos criados, e as funções Media_Aluno() e Resultado() .
Executar para cada objeto criado a função ImprimeSexo().
A classe deve ser criada dentro de um package chamado uscs.



Esse material está disponível na aula Semana-05 em Aula-Materiais.

* */