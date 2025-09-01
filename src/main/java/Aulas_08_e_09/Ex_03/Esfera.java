package Aulas_08_e_09.Ex_03;

public class Esfera extends Forma2D implements Volumetrico {
    private final double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        return 4 * Math.PI * raio * raio;
    }


    @Override
    public double calcularVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(raio, 3);
    }
}
