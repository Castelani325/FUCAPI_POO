package Aulas_10_e_11.EX_03_Singleton_Factory;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirProduto() {
        System.out.printf("  - Produto: %s | Preço Unit.: R$ %.2f\n", nome, preco);
    }
}