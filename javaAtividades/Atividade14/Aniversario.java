package Java.Codigos.javaAtividades.Atividade14;

public class Aniversario extends cartaoWeb{
    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Aniversário, " + getDestinatario() + "! Que seu dia seja repleto de alegria e felicidade.");
    }
    
}
