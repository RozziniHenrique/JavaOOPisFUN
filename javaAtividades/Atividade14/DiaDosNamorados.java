package Java.Codigos.javaAtividades.Atividade14;

public class DiaDosNamorados extends cartaoWeb{
    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Dia dos Namorados, " + getDestinatario() + "! Que o amor esteja sempre presente em sua vida.");
    }
    
}
