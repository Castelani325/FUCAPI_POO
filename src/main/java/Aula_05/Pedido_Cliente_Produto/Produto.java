package Aula_05.Pedido_Cliente_Produto;

public class Produto {
    private String nome;
    private double precoUnitario;

    public Produto (String nome, double precoUnitario){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome (){return nome;};
    public double getPrecoUnitario (){return precoUnitario;};


    public void exibirInfo(){
        System.out.println("Nome : " + nome + "\n Preço Unitário : " + precoUnitario);
    }
}
