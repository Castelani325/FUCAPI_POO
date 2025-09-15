package Aulas_10_e_11.Ex_02;

public class Moto extends Veiculo {
    // Atributo específico de Moto
    private int cilindradas;

    // Construtor
    public Moto(String marca, String modelo, int ano, double precoBase, int cilindradas) {
        // Chama o construtor da classe pai (Veiculo)
        super(marca, modelo, ano, precoBase);
        this.cilindradas = cilindradas;
    }


    public int getCilindradas() {
        return cilindradas;
    }

    //Sobrescrita de Métodos (Polimorfismo)

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes da Moto ---");
        super.exibirDetalhes(); // Reutiliza o metodo da classe pai
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }

    @Override
    public double calcularPrecoFinal() {
        // Lógica específica para Moto:
        // 5% de imposto sobre o preço base


        return this.precoBase * 1.05;
    }
}
