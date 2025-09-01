package Aulas_08_e_09.Ex_05;

public class ExemploDeMain {
    public static void main(String[] args) {
        LoggerdeTransacao logger = new LoggerdeTransacao();
        ProcessadorDePagamentos processador = new ProcessadorDePagamentos(logger);

        // Cenario de Pagamento com Cartão de Crédito
        System.out.println("--- CENÁRIO 1: CARTÃO DE CRÉDITO ---");
        Pedido pedido1 = new Pedido("PED-001", 250.75);
        MetodoPagamento cartao = new PagamentoCartaoDeCredito("1234-5678-9012-3456", "Fulano de Tal");
        processador.realizarPagamento(pedido1, cartao); // LSP: "cartao" é um substituto válido para "MetodoDePagamento"



    }
}