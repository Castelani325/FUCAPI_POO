package Aulas_08_e_09.Ex_02;

public class DescontoProgressivo implements EstrategiaDeDesconto {

    @Override
    public double calcularPrecoFinal(Produto produto) {
        double valor = produto.getValorProduto();
        double percentualDesconto = 0.0; // Desconto inicial


        if (valor > 1000) {
            percentualDesconto = 0.20; // 20%
        } else if (valor > 500) {
            percentualDesconto = 0.15; // 15%
        } else if (valor > 100) {
            percentualDesconto = 0.10; // 10%
        }

        return valor * (1 - percentualDesconto);
    }
}