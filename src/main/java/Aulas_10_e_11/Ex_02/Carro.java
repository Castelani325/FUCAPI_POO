package Aulas_10_e_11.Ex_02;

public class Carro extends Veiculo {
    // Atributos específicos de Carro
    private int numeroPortas;
    private String tipoCombustivel;


    public Carro(String marca, String modelo, int ano, double precoBase, int numeroPortas, String tipoCombustivel) {
        // Chama o construtor da classe pai (Veiculo) para inicializar os atributos herdados
        super(marca, modelo, ano, precoBase);
        // Inicializa os atributos próprios da classe Carro
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

       public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    // Sobrescrita de Métodos (Polimorfismo)

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Carro ---");
        super.exibirDetalhes(); // Reutiliza o metodo da classe pai para mostrar os detalhes básicos
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Combustível: " + tipoCombustivel);
    }

    @Override
    public double calcularPrecoFinal() {
        // Lógica específica para Carro:
        // 10% de imposto sobre o preço base

        return this.precoBase * 1.10;
    }
}