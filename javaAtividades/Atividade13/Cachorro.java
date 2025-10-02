package Java.Codigos.javaAtividades.Atividade13;

public class Cachorro extends Animal {
    public Cachorro(){}

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
    
}
