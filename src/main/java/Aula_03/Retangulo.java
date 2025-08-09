package Aula_03;//Otávio Castelani
//RA : 212466

public class Retangulo {

    private double altura;
    private double largura;

    public Retangulo (double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    public Retangulo (){
        this.altura = 1.0;
        this.largura = 1.0;
    }

    public void calcularArea () {
        double resultado = altura * largura;
        System.out.println("A área do retângulo é : " + resultado);

    }

    public void calcularPerimetro (){
        double resultado = 2*(altura + largura);
        System.out.println("O perímetro desse retângulo é : "+ resultado);
    }
}
