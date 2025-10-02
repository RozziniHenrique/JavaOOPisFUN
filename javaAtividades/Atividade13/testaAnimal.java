package Java.Codigos.javaAtividades.Atividade13;

public class testaAnimal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 3);
        Animal gato = new Gato("Mimi", 2);
        Animal peixe = new Peixe("Nemo", 1);
        Animal reptil = new Reptil("Kaa", 4);

        cachorro.emitirSom();
        gato.emitirSom();
        peixe.emitirSom();
        reptil.emitirSom();
    }
    
}
