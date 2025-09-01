package Aula_05.Revisao_Aula_05.Rev_Aula04;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public void setPreco(double novoPreco) {
        if (novoPreco > 0){
            double preco = novoPreco;
        }
    }

       public void setQuantidade(int novaQuantidade) {
        if (quantidade >= 0) {
            int quantidade = novaQuantidade;
        }
        else {
            System.out.println("Valores abaixo de zero não permitidos");
        }
    }
}

