package Aulas_08_e_09.Ex_02;

public class CalculadoraDeDescontos {

       public void exibirPrecoFinal(Produto produto, EstrategiaDeDesconto estrategia) { // Aceita qualquer objeto que implemente a interface.
        double precoFinal = estrategia.calcularPrecoFinal(produto);
        System.out.println("Produto: " + produto.getNomeProduto());
        System.out.println("Preço Original: R$" + produto.getValorProduto());
        System.out.println("Preço com Desconto: R$" + String.format("%.2f", precoFinal));

    }
}