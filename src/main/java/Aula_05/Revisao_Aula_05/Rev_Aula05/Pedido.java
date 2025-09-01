package Aula_05.Revisao_Aula_05.Rev_Aula05;

class Pedido {
    int numeroPedido;
    String data;
    Cliente cliente;

    public Pedido(int numeroPedido, String data, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.cliente = cliente;
    }

    public void exibirDetalhes() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Data: " + data);
        System.out.print("Feito por: ");
        cliente.exibirInfo();
    }
}

