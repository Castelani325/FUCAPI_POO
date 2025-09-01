package Aulas_08_e_09.Ex_03;

public class Retangulo extends Forma2D {
    private  double largura;
    private  double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}