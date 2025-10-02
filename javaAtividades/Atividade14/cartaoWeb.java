package Java.Codigos.javaAtividades.Atividade14;

public class cartaoWeb {
    protected String destinatario;

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public cartaoWeb(){}

    public cartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    public void showMessage(){
        System.out.println("Mensagem para: " + destinatario);
    }
}
