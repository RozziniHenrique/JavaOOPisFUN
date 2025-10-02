package Java.Codigos.javaAtividades.Atividade13;

public class Animal {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Animal() {}

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}


/*Implementar em uma folha de papel a classe abstrata Animal,
conforme o modelo do slide, bem como criar as classes Cachorro,
Gato, Peixe e Reptil. Adote os métodos novos necessários.
Desenvolva a classe executora (MAIN) TestaAnimal.

Implementar em uma Interface Imprimivel, conforme o modelo
do presente slide.
Implemente os métodos de instâncias necessários. */