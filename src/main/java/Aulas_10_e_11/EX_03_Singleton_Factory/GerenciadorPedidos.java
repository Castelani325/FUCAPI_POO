package Aulas_10_e_11.EX_03_Singleton_Factory;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    // Única instância da classe (privada, estática e volátil para thread-safety)
    private static volatile GerenciadorPedidos instancia;

    private List<Pedido> pedidos;

    // Construtor privado para impedir a criação de instâncias
    private GerenciadorPedidos() {
        this.pedidos = new ArrayList<>();
    }

    // Metodo estático público para obter a instância única
    public static GerenciadorPedidos getInstance() {
        if (instancia == null) { // Double-checked locking para performance e thread-safety
            synchronized (GerenciadorPedidos.class) {
                if (instancia == null) {
                    instancia = new GerenciadorPedidos();
                }
            }
        }
        return instancia;
    }

    public Pedido criarNovoPedido(int id) {
        Pedido novoPedido = new Pedido(id);
        this.pedidos.add(novoPedido);
        System.out.println("Novo pedido #" + id + " criado e adicionado ao gerenciador.");
        return novoPedido;
    }

    public void processarPagamento(Pedido pedido, String tipoPagamento) {
        System.out.println("\n>>> Tentando processar pagamento para o Pedido #" + pedido.getIdPedido() + " via " + tipoPagamento);
        try {
            // Usa a Factory para criar o processador correto
            ProcessadorPagamento processador = PagamentoFactory.criarProcessador(tipoPagamento);

            // Polimorfismo: chama o metodo processar() do objeto criado pela factory
            processador.processar(pedido.calcularTotalPedido());

            // Se o pagamento for bem-sucedido, altera o status
            pedido.alterarStatus("PAGO");

        } catch (IllegalArgumentException e) {
            System.err.println("Erro no pagamento: " + e.getMessage());
            pedido.alterarStatus("FALHA_PAGAMENTO");
        }
    }

    public void listarPedidos() { //Este metodo foi feito com auxílio da IA para que pudesse ter um layout mais formatado

        System.out.println("\n########################################");
        System.out.println("###       LISTA DE TODOS OS PEDIDOS    ###");
        System.out.println("########################################");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido no sistema.");
        } else {
            for (Pedido p : this.pedidos) {
                p.exibirDetalhesPedido();
            }
        }
    }
}