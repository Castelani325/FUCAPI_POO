package Aulas_10_e_11.Ex_02;

public class Main {
    public static void main(String[] args) {
        //Crie uma Concessionaria
        Concessionaria minhaConcessionaria = new Concessionaria("AutoMais Veículos");
        System.out.println();

        // Crie alguns Carros e Motos
        Carro carro1 = new Carro("Toyota", "Corolla", 2024, 140000.00, 4, "Flex");
        Carro carro2 = new Carro("Honda", "Civic", 2023, 150000.00, 4, "Gasolina");
        Moto moto1 = new Moto("Yamaha", "MT-07", 2024, 45000.00, 689); // Cilindrada > 500
        Moto moto2 = new Moto("Honda", "Biz 125", 2025, 15000.00, 125); // Cilindrada <= 500
        System.out.println();

        // Adicione esses veículos à Concessionaria
        minhaConcessionaria.adicionarVeiculo(carro1);
        minhaConcessionaria.adicionarVeiculo(carro2);
        minhaConcessionaria.adicionarVeiculo(moto1);
        minhaConcessionaria.adicionarVeiculo(moto2);

        // Liste todos os veículos da concessionária
        minhaConcessionaria.listarTodosVeiculos();

        //Calcule e exiba os valores do estoque
        System.out.println("\n=================================================");
        System.out.println("== Resumo Financeiro do Estoque");
        System.out.println("=================================================");

        double valorBaseTotal = minhaConcessionaria.calcularValorTotalEstoque();
        System.out.printf("Valor Total do Estoque (Preço Base): R$ %.2f\n", valorBaseTotal);

        double valorFinalTotal = minhaConcessionaria.calcularValorTotalFinalEstoque();
        System.out.printf("Valor Total do Estoque (Preço Final com Taxas): R$ %.2f\n", valorFinalTotal);


    }
}
