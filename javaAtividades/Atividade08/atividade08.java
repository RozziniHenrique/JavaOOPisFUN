package javaAtividades.Atividade08;

public class atividade08 {
    private String nome;
    private int codmat;
    private String cpf;
    private char sexo;
    private double nota_P1;
    private double nota_P2;
    private double nota_P3;

    public atividade08(String nome, int codmat, String cpf, char sexo, double nota_P1, double nota_P2, double nota_P3) {
        this.nome = nome;
        this.codmat = codmat;
        this.cpf = cpf;
        this.sexo = sexo;
        this.nota_P1 = nota_P1;
        this.nota_P2 = nota_P2;
        this.nota_P3 = nota_P3;

    }
    public void ImprimeAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Código de Matrícula: " + codmat);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
        System.out.println("Nota P1: " + nota_P1);
        System.out.println("Nota P2: " + nota_P2);
        System.out.println("Nota P3: " + nota_P3);
    }

    public void imprimeSexo(){
        System.out.println("Nome: " + nome);
        if (sexo == 'M' || sexo == 'm'){
            System.out.println("Sexo: Masculino");
        } else if (sexo == 'F' || sexo == 'f'){
            System.out.println("Sexo: Feminino");
        } else {
            System.out.println("Sexo: Outro");
        }
    }
    public double MediaAluno(){
        double media;
        if (nota_P1 <= nota_P2 && nota_P1 <= nota_P3){
            media = (nota_P2 + nota_P3) / 2;
        } else if (nota_P2 <= nota_P1 && nota_P2 <= nota_P3){
            media = (nota_P1 + nota_P3) / 2;
        } else {
            media = (nota_P1 + nota_P2) / 2;
        }
        return media;
    }
    public String Resultado(){
        double media = MediaAluno();
        if (media >= 6.0){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

/*Criar uma classe Java chamada Aluno para modelar estudantes. A classe deve possuir os seguintes atributos de dados (propriedades):
nome – Nome do estudante - (tipo String)
codmat - Código de Matrícula – (tipo int)
cpf – (tipo String)
sexo – (tipo char)
nota_P1 – (double)
nota_P2 – (double)
nota_P3 – (double)
A classe deve conter métodos para construir objetos e um método ImprimeAluno() que irá imprimir os dados do estudante. Adicionalmente a classe deve conter um método chamado ImprimeSexo() que irá imprimir “Masculino” se o sexo for ‘M’ e “Feminino” se o sexo for ‘F’.
A função ImprimeSexo() também imprime o nome do estudante.
Codificar também a função MediaAluno() que retorna a média aritmética das duas maiores notas dentre as
notas P1, P2 e P3. (Exemplo: notas 2, 6 e 8 => considerar para a média as notas 6 e 8. )
Finalmente, codificar a função Resultado() que retorna “Aprovado” se a média for >= 6.0 ou “Reprovado”
se a média for inferior a 6.0.
A classe deve ser criada dentro de um package chamado uscs.



Esse material está disponível na aula Semana-05 em Aula-Materiais.

*
 */