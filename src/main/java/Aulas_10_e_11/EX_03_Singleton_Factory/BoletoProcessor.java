package Aulas_10_e_11.EX_03_Singleton_Factory;

public class BoletoProcessor implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Gerando Boleto no valor de R$ %.2f...\n", valor);
        System.out.println("Aguardando confirmação do pagamento do boleto.");
    }
}