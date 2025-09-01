package Aula_05.Revisao_Aula_05.Rev_Aula03;

public class Circulo {

    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
        }


    public void calcularArea (double raio) {

        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é : " + area);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}


