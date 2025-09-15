package Aulas_10_e_11.EX_03_Singleton_Factory;

public class ItemPedido {
    // Composição: ItemPedido "tem um" Produto
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularTotalItem() {
        return produto.getPreco() * quantidade;
    }
}
