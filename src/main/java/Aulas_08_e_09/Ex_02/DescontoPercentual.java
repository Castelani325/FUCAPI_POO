package Aulas_08_e_09.Ex_02;

public class DescontoPercentual implements EstrategiaDeDesconto {
    private double percentual; // Formato 0.0 a 1.0

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double calcularPrecoFinal(Produto produto) {
        double valorDoDesconto = produto.getValorProduto() * this.percentual; // Porque this.percentual e não percentual ?
        return produto.getValorProduto() - valorDoDesconto;
    }
}