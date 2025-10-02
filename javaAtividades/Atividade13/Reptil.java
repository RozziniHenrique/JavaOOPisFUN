package Java.Codigos.javaAtividades.Atividade13;

public class Reptil extends Animal {
    public Reptil(){}

    public Reptil(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O réptil faz um som estranho: Hiss Hiss!");
    }
    
}
