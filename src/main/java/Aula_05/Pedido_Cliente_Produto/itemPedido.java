package Aula_05.Pedido_Cliente_Produto;

public class itemPedido {

    private Produto produto;
    public int quantidade;

    public itemPedido (Produto produto, int quantidade){
        this.quantidade = quantidade;

    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {return quantidade;};
    public Produto getProduto() {return produto;};

    public double calcularSubTotal () { return quantidade * produto.getPrecoUnitario();};

}
