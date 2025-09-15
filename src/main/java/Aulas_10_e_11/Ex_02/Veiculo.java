package Aulas_10_e_11.Ex_02;


public abstract class Veiculo {
    // Atributos protegidos para serem acessíveis pelas classes filhas
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double precoBase;

        public Veiculo(String marca, String modelo, int ano, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoBase = precoBase;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    // --- Métodos Concretos e Abstratos ---


     //Exibe os detalhes básicos que são comuns a todos os veículos.

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.printf("Preço Base: R$ %.2f\n", precoBase);
    }

    /**
     * Metodo abstrato : Força todas as subclasses a implementarem sua própria lógica para calcular o preço final.
     * @return O preço final do veículo.
     */
    public abstract double calcularPrecoFinal();
}
