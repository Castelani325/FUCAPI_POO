package Aulas_10_e_11.EX_03_Singleton_Factory;

public class CartaoCreditoProcessor implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Processando R$ %.2f no Cartão de Crédito...\n", valor);
        System.out.println("Pagamento aprovado!");
    }
}