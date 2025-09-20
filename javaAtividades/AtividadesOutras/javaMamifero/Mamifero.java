package javaAtividades.AtividadesOutras.javaMamifero;
public class Mamifero{
    String tipoMam;
    String habitatMam;
    double pesoMam;
    boolean pelosMam;
    String dietaMam;
    int qtdDentesMam;
    String sonoplastiaMam;

    public Mamifero (){

    }

    public Mamifero (String tipoMam, String habitatMam, double pesoMam, boolean pelosMam, String dietaMam, int qtdDentesMam, String sonoplastiaMam){
        this.tipoMam = tipoMam;
        this.habitatMam = habitatMam;
        this.pesoMam = pesoMam;
        this.pelosMam = pelosMam;
        this.dietaMam = dietaMam;
        this.qtdDentesMam = qtdDentesMam;
        this.sonoplastiaMam = sonoplastiaMam;
    }

    public void emitirSom(){
        System.out.println("O " + tipoMam + " faz " + sonoplastiaMam);
    }
    public void imprimeMam(){
        System.out.println("Nome: " + tipoMam);
        System.out.println("Habitat: " + habitatMam);
        System.out.println("Peso: " + pesoMam + " Kgs");
        System.out.println("Pelos: " + pelosMam);
        System.out.println("Dieta: " + dietaMam);
        System.out.println("Quantidade de Dentes: " + qtdDentesMam);
        System.out.println("Sonoplastia: " + sonoplastiaMam);
        
    }
}
