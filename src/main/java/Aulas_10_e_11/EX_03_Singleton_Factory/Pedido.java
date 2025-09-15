package Aulas_10_e_11.EX_03_Singleton_Factory;

import java.util.ArrayList;

public class Pedido {
    private int idPedido;
    // Composição: Pedido "tem uma lista de" ItemPedido
    private ArrayList<ItemPedido> itens;
    private String status;

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.itens = new ArrayList<>();
        this.status = "PENDENTE"; // Status inicial padrão
    }

    public int getIdPedido() {
        return idPedido;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public String getStatus() {
        return status;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido novoItem = new ItemPedido(produto, quantidade);
        this.itens.add(novoItem);
    }

    public double calcularTotalPedido() {
        double total = 0.0;
        for (ItemPedido item : this.itens) {
            total += item.calcularTotalItem();
        }
        return total;
    }

    public void alterarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do Pedido " + this.idPedido + " alterado para: " + this.status);
    }

    public void exibirDetalhesPedido() {
        System.out.println("----------------------------------------");
        System.out.println("Detalhes do Pedido #" + this.idPedido);
        System.out.println("Status: " + this.status);
        System.out.println("Itens:");
        for (ItemPedido item : this.itens) {
            System.out.printf("  - %s (%d x R$ %.2f) = R$ %.2f\n",
                    item.getProduto().getNome(),
                    item.getQuantidade(),
                    item.getProduto().getPreco(),
                    item.calcularTotalItem());
        }
        System.out.printf("TOTAL DO PEDIDO: R$ %.2f\n", this.calcularTotalPedido());
        System.out.println("----------------------------------------");
    }
}