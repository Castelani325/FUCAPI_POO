package Aulas_10_e_11.Ex_02;

import java.util.ArrayList;

public class Concessionaria {
    private String nome;
    // A lista armazena o tipo genérico "Veiculo"
    private ArrayList<Veiculo> estoqueVeiculos;

        public Concessionaria(String nome) {
        this.nome = nome;
        this.estoqueVeiculos = new ArrayList<>(); // Inicializa a lista
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.estoqueVeiculos.add(veiculo);
        System.out.println("Veículo " + veiculo.getMarca() + " " + veiculo.getModelo() + " adicionado ao estoque.");
    }

    public void listarTodosVeiculos() {
        System.out.println("\n=================================================");
        System.out.println("== Estoque da Concessionária: " + this.nome);
        System.out.println("=================================================");
        for (Veiculo veiculo : estoqueVeiculos) {
            veiculo.exibirDetalhes();
            System.out.println("-------------------------");
        }
    }

    public double calcularValorTotalEstoque() {
        double total = 0.0;
        for (Veiculo veiculo : estoqueVeiculos) {
            total += veiculo.getPrecoBase();
        }
        return total;
    }

    public double calcularValorTotalFinalEstoque() {
        double total = 0.0;
        for (Veiculo veiculo : estoqueVeiculos) {
            total += veiculo.calcularPrecoFinal();
        }
        return total;
    }
}
