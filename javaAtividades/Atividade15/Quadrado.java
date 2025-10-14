package JavaUscs.Codigos.javaAtividades.Atividade15;

public class Quadrado implements AreaCalculavel {
    private double lado;

    public Quadrado(){}

    public Quadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calculaArea(){
        return lado*lado;
    }

}