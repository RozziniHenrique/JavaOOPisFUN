package javaAtividades.AtividadesOutras.javaCarro;

public class uscsTestaCarro {
    public static void main(String[] args) {
        // Criação dos objetos Carro
        Carro corolla = new Carro("Toyota", "Corolla", 2020);
        Carro nivus = new Carro("Volkswagen", "Nivus", 2021);
        Carro civic = new Carro("Honda", "Civic", 2019);

        // Operações com os carros
        corolla.ligar();
        corolla.acelerar();

        nivus.ligar();
        nivus.acelerar();

        civic.ligar();
        civic.acelerar();
    }
}