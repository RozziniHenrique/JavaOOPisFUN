package JavaUscs.Codigos.javaAtividades.Atividade15;

public class Principal {
    public static void main(String[] args){
        Circulo c1 = new Circulo(5.2);
        Retangulo r1 = new Retangulo(4.5, 6.7);
        Quadrado q1 = new Quadrado(3.3);

        System.out.println("Area do circulo: %.2f" + c1.calculaArea());
        System.out.println("Area do retangulo: " + r1.calculaArea());
        System.out.println("Area do quadrado: " + q1.calculaArea());
    }
    
}
