package Aulas_08_e_09.Ex_02;

public class Produto {

    String nomeProduto;
    double valorProduto ;

    public Produto (String nomeProduto, double valorProduto){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public Produto() {
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
}
