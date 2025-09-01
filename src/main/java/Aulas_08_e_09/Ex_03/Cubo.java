package Aulas_08_e_09.Ex_03;

public class Cubo extends Forma2D implements Volumetrico {
    private final double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return 6 * lado * lado;
    }


    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }
}
