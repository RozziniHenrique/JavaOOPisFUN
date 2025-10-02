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


/*Escreva uma classe abstrata chamada CartaoWeb.
Essa classe representa todos os tipos de cartões 
web e conterá apenas um atributo: destinatario (tipo String). 
Nessa classe você deverá também declarar o método public 
abstract void showMessage(). Crie classes filhas da classe 
CartaoWeb: DiaDosNamorados, Natal, Aniversario. Cada uma 
dessas classes deve conter um método construtor que receba 
o nome do destinatário do cartão. Cada classe também deve 
implementar o método showMessage(), mostrando uma mensagem 
ao usuário com seu nome e que seja específica para a data 
de comemorativa do cartão. Escreva um programa e no método
 main. Insira instâncias dos 3 tipos de cartões. Após,  
 exibir as mensagens deste cartão chamando o método showMessage(). */