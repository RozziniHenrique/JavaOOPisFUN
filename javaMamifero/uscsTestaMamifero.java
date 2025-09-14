public class uscsTestaMamifero{
    public static void main(String[] args) {
        Mamifero cachorro = new Mamifero ("Cachorro", "Doméstico", 10.5, true, "Carnivoro", 25, "Auau");
        Mamifero gato = new Mamifero ("Gato", "Doméstico", 3.7, true, "Carnivoro", 21, "Miau");
        cachorro.emitirSom();
        gato.imprimeMam();
        
    }
}