package Java.Codigos.javaAtividades.Atividade11;

public class testaEmpregado {
    public static void main(String[] args){
        Empregado e1 = new Empregado("Paulo Silva", "Gerente Financeiro", 15400.00);
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado("Carlos Eduardo", "Desenvolvedor de Software", 8500.00);
        Empregado e4 = new Empregado("Mariana Costa", "Designer UX/UI", 7200.00);
        
        e2.setNome("Ana Paula");
        e2.setCargo("Analista de Sistemas Senior");
        e2.setSalario(10700.00);
        
        System.out.println();
        e1.ImprimeEmpregado();
        System.out.println();
        e2.ImprimeEmpregado();
        System.out.println();
        e3.ImprimeEmpregado();
        System.out.println();
        e4.ImprimeEmpregado();

        System.out.println();
        Empregado.TotalEmpregados();

    }
}
    