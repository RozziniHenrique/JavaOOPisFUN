package Java.Codigos.javaAtividades.Atividade11;

public class Empregado {
    private static int nextCodigo = 1; // Variável estática para controle do próximo código
    private int codigo;
    private String nome;
    private String cargo;
    private double salario;
    private static int totalEmpregados = 0;
    

    // Construtor padrão (sem parâmetros)
    public Empregado() {
        this.codigo = nextCodigo++;
        totalEmpregados++;
    }

    // Construtor com parâmetros
    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.codigo = nextCodigo++;
        totalEmpregados++;
    }

    // Método para imprimir as informações do empregado
    public void ImprimeEmpregado() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }
    // Método para imprimir o total de empregados
    public static void TotalEmpregados() {
        System.out.println("Total de Empregados: " + totalEmpregados);
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

/*
7. Modificar a classe “Empregado” para que o código do Empregado seja AUTO-INCREMENTADO.
Ou seja, o código do Empregado deverá ser automaticamente fornecido a partir do valor 1 para
cada Empregado criado. Modifique os construtores da classe “Empregado” e a classe
“TesteEmpregado” para que esta manutenção seja efetivada.
Obs. As duas classes devem ser criadas dentro de um package chamado uscs.
 */