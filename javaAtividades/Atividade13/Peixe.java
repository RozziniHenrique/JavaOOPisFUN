package Java.Codigos.javaAtividades.Atividade13;

public class Peixe extends Animal {
    public Peixe(){}

    public Peixe(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O peixe faz barulho de bolhas: Blub Blub!");
    }
    
}
