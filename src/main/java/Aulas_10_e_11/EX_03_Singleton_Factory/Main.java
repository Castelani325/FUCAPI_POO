package Aulas_10_e_11.EX_03_Singleton_Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Sistema de Pedidos Online ---");

        // Obtenha a instância do GerenciadorPedidos (Singleton)
        GerenciadorPedidos gerenciador1 = GerenciadorPedidos.getInstance();
        GerenciadorPedidos gerenciador2 = GerenciadorPedidos.getInstance();

        // Demonstra que o GerenciadorPedidos é um Singleton
        System.out.println("\nVerificando o Singleton...");
        System.out.println("As duas referências do gerenciador apontam para a mesma instância? " + (gerenciador1 == gerenciador2));

        // Crie alguns Produtos
        System.out.println("\nCriando produtos disponíveis...");
        Produto notebook = new Produto("Notebook Gamer", 7500.00);
        Produto mouse = new Produto("Mouse Vertical", 150.00);
        Produto teclado = new Produto("Teclado Mecânico", 350.00);
        Produto monitor = new Produto("Monitor Ultrawide 34\"", 2800.00);

        // Crie Pedidos usando o Gerenciador
        System.out.println("\nCriando novos pedidos...");
        Pedido pedido101 = gerenciador1.criarNovoPedido(101);
        Pedido pedido102 = gerenciador1.criarNovoPedido(102);

        // Adicione itens aos pedidos
        System.out.println("\nAdicionando itens aos pedidos...");
        // Pedido 101
        pedido101.adicionarItem(notebook, 1);
        pedido101.adicionarItem(mouse, 1);

        // Pedido 102
        pedido102.adicionarItem(monitor, 2);
        pedido102.adicionarItem(teclado, 2);

        // Exibe detalhes e processa pagamento do Pedido 101
        pedido101.exibirDetalhesPedido();
        gerenciador1.processarPagamento(pedido101, "CARTAO");

        // Exibe detalhes e processa pagamento do Pedido 102
        pedido102.exibirDetalhesPedido();
        gerenciador1.processarPagamento(pedido102, "PIX");

        // Tenta um pagamento com tipo inválido
        gerenciador1.processarPagamento(pedido102, "CHEQUE");

        // Liste todos os pedidos no final
        gerenciador1.listarPedidos();
    }
}