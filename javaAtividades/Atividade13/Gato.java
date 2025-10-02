package Java.Codigos.javaAtividades.Atividade13;

public class Gato extends Animal {
    public Gato(){}

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau Miau!");
    }
}
