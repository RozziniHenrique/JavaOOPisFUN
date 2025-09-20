package javaAtividades.Atividade10;

public class Pessoa {
    private String nome, end, cpf, rg;

    public Pessoa(){}

    public Pessoa(String nome, String end, String cpf, String rg) {
        this.nome = nome;
        this.end = end;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void ImprimePessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + end);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
    }
}   
