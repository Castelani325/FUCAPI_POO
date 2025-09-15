package Aulas_10_e_11.EX_03_Singleton_Factory;

public class PagamentoFactory {
    // O metodo factory que decide qual objeto criar
    public static ProcessadorPagamento criarProcessador(String tipoPagamento) {
        if (tipoPagamento == null || tipoPagamento.isEmpty()) {
            throw new IllegalArgumentException("Tipo de pagamento não pode ser nulo ou vazio.");
        }

        return switch (tipoPagamento.toUpperCase()) {
            case "CARTAO" -> new CartaoCreditoProcessor();
            case "PIX" -> new PixProcessor();
            case "BOLETO" -> new BoletoProcessor();
            default -> throw new IllegalArgumentException("Tipo de pagamento inválido: " + tipoPagamento);
        };
    }
}