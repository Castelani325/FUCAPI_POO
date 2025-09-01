package Aula_05.Revisao_Aula_05.Rev_Aula02;

public class Produto {

    private String produto;
    private String nome;
    private int preco;
    private int quantidadeEstoque;

    public Produto (String produto, String nome, int preco, int quantidadeEstoque) {
        this.produto = produto;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        }

    public int getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public String getProduto() {
        return produto;
    }



}
