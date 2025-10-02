package Java.Codigos.javaAtividades.Atividade14;

public class Natal extends cartaoWeb{
    public Natal(String destinatario) {
        super();
        this.destinatario = destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Natal, " + getDestinatario() + "! Que a magia do Natal encha seu coração de alegria e paz.");
    }
}
