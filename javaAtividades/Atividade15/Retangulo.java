package JavaUscs.Codigos.javaAtividades.Atividade15;

public class Retangulo implements AreaCalculavel {
    private double base;
    private double altura;

    public Retangulo(){}

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea(){
        return base*altura;
    }
}