package Java.Codigos.javaAtividades.Atividade14;

public class testaCartaoWeb {
    public static void main(String[] args) {
        cartaoWeb cartao1 = new DiaDosNamorados("Ana");
        cartaoWeb cartao2 = new Natal("Bruno");
        cartaoWeb cartao3 = new Aniversario("Carla");

        cartao1.showMessage();
        cartao2.showMessage();
        cartao3.showMessage();
    }
    
}
