package Java.Codigos.javaCarro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O " + modelo + " está ligado.");
    }

    public void acelerar() {
        System.out.println("O " + marca + " está acelerando.");
    }

    public void frear() {
        System.out.println("O " + marca + " de " + ano + " está fazendo barulho quando freia.");
    }
}