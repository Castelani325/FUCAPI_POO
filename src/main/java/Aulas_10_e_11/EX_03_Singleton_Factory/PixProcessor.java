package Aulas_10_e_11.EX_03_Singleton_Factory;

public class PixProcessor implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Gerando QR Code PIX para o valor de R$ %.2f...\n", valor);
        System.out.println("Pagamento confirmado via PIX!");
    }
}