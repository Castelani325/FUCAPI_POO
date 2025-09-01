package Aulas_08_e_09.Ex_05;


public class ProcessadorDePagamentos {
    private final LoggerdeTransacao logger;

    public ProcessadorDePagamentos(LoggerdeTransacao logger) {
        this.logger = logger;
        }

    public void realizarPagamento(Pedido pedido, MetodoPagamento metodo) {
        // A mágica do OCP e LSP: ele não sabe qual é o método, só sabe que pode chamar "processar".
        ResultadoPagamento resultado = metodo.processar(pedido);

        logger.registrar(pedido, resultado);

    }
}