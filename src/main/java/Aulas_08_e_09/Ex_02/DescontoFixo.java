package Aulas_08_e_09.Ex_02;

public class DescontoFixo implements EstrategiaDeDesconto {
    private double valorFixoDoDesconto;

    // O valor do desconto é injetado quando a estratégia é criada
    public DescontoFixo(double valorFixoDoDesconto) {
        this.valorFixoDoDesconto = valorFixoDoDesconto;
    }

    @Override
    public double calcularPrecoFinal(Produto produto) {
        return produto.getValorProduto() - valorFixoDoDesconto;
    }
}