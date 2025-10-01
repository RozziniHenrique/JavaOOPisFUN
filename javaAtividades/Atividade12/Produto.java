package Java.Codigos.javaAtividades.Atividade12;

public class Produto {
    private int codigo;
    private String descricao;
    private int quantidade;
    private static int totalProdutos = 0;
    private static int limiteEstoque = 10;

    // Construtor padrão
    public Produto() {
        totalProdutos++;
    }
    // Construtor com parâmetros
    public Produto(int codigo, String descricao, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        totalProdutos++;
}
    // Métodos getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static int getTotalProdutos() {
        return totalProdutos;
    }

    public static int getLimiteEstoque() {
        return limiteEstoque;
    }

    public static void alteraLimite(int novoLimite) {
        if (novoLimite > 0) {
            limiteEstoque = novoLimite;
        } else {
            System.out.println("O limite de estoque deve ser maior que zero.");
        }
    }

    // Métodos para manipular o estoque
    public void retiraEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade a ser retirada deve ser maior que zero.");
            return;
        }
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Estoque insuficiente para retirar " + quantidade + " unidades.");
        }
    }

    public void adicionaEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("A quantidade a ser adicionada deve ser maior que zero.");
        }
    }

    public void imprimeProduto() {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    public static void imprimeTotalDeProdutos() {
        System.out.println("Total de produtos criados: " + totalProdutos);
    }

    public void statusEstoque() {
        if (quantidade == 0) {
            System.out.println("Estoque Nulo");
        } else if (quantidade <= limiteEstoque) {
            System.out.println("Estoque Restrito");
        } else {
            System.out.println("Estoque Regular");
        }
    }
}