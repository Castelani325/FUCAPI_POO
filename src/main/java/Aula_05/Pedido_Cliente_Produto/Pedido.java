package Aula_05.Pedido_Cliente_Produto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public int numeroPedido;
    public String data;
    public Cliente cliente;
    public List<itemPedido> itens;


    public Pedido (int numeroPedido, String data, Cliente cliente, itemPedido itens){
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.cliente = cliente;
        this.itens = new ArrayList<>();;

    }

    public void adicionarItem (Produto produto, int quantidade) {
        if (produto == null || quantidade <= 0) {
            System.out.println("Erro : Produto ou quantidade inválida.");
            return;
        }

        itemPedido novoItem = new itemPedido(produto, quantidade);
        this.itens.add(novoItem);
        System.out.printf("Item adicionado: %d e %s\n", quantidade, produto.getNome());
    }


    public int getNumeroPedido (){return numeroPedido; };
    public String getData (){return data; };
    public Cliente getCliente (){return cliente; };
    public List<itemPedido> getItens (){return itens; };

    public double calcularTotal() {

        double total = 0.0;

        for (itemPedido item : this.itens) {
            total += item.calcularSubTotal();
        }

        return total;
    };

    public void exibirDetalhesPedido() {

        System.out.println("Número de pedido : " + this.numeroPedido);

        System.out.println("Data do Pedido: " + this.data);

        System.out.println("\n--- Dados do Cliente ---");
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Email: " + this.cliente.getEmail());

        System.out.println("\n--- Itens do Pedido ---");

        if (this.itens.isEmpty()) {
            System.out.println("O pedido não contém itens.");
        } else {

            for (itemPedido item : this.itens) {
                System.out.printf("Produto: %s | Quantidade: %d | Subtotal: R$ %2f\n",
                        item.getProduto().getNome(), // Pega o nome do produto
                        item.getQuantidade(),        // Pega a quantidade
                        item.calcularSubTotal()           // Pega o subtotal do item
                );
            }
        }

        System.out.printf("TOTAL GERAL DO PEDIDO: R$ %.2f\n", this.calcularTotal());
    }


}
