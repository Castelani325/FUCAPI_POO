package Aulas_08_e_09.Ex_05;

public class PagamentoCartaoDeCredito implements MetodoPagamento {
    private final String numeroCartao;
    private final String nomeTitular;


    public PagamentoCartaoDeCredito(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public ResultadoPagamento processar (Pedido pedido) {

        System.out.println("Processando R$ " + pedido.getValorTotal() + "com Cartão de Crédito " + numeroCartao + "...");

        if (nomeTitular != null && !nomeTitular.isEmpty()) {
            return new ResultadoPagamento(true, "Pagamento com Cartão de Crédito aprovado.");
        }
        else {
            System.out.println("Falha na comunicação com a operadora");
            return new ResultadoPagamento(false, "Nome do titular inválido.");
        }

    };
}
