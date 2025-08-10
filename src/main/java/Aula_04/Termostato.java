//Otávio Castelani
//RA : 212466

//Exercício 2 : Termostato

package Aula_04;

import java.io.StringWriter;

public class Termostato {

    private double temperaturaAtual;
    private double temperaturaDesejada;

    public Termostato (Double temperaturaAtual, double temperaturaDesejada){
        this.temperaturaAtual = 20;
        this.setTemperatura(temperaturaDesejada) ;
    }

    private void setTemperatura(double temperaturaDesejada) {
        if (temperaturaDesejada < 18 || temperaturaDesejada > 28) {
            throw new IllegalArgumentException("A temperatura deve estar entre 18 e 28 Graus Celcius");
            }

        this.temperaturaDesejada = temperaturaDesejada;
        }

    public void simularMudancaTemperatura (double delta) {
        this.temperaturaAtual = delta;
        System.out.printf("\n Temperatura alterada com sucesso para : %f", delta);

    }

    public double getTemperaturaAtual () {

        System.out.printf("\n A temperatura atual é : %f", temperaturaAtual);
        return temperaturaAtual;
    };

    public double getTemperaturaDesejada (){

        System.out.printf("\n A temperatura Desejada é : %f", temperaturaDesejada);
        return temperaturaDesejada;
    }

    public void exibirDetalhes(){
        System.out.printf("\n A temperatura atual é de : %f",temperaturaAtual);
        System.out.printf("\n A temperatura desejada é de : %f",temperaturaDesejada);
    }

    public String obterStatus(){
        if (temperaturaAtual > temperaturaDesejada){
            System.out.println("\n A temperatura atual é maior que a desejada : RESFRIANDO...");
            return "A temperatura atual é maior que a desejada : RESFRIANDO...";
        }
        else if (temperaturaAtual < temperaturaDesejada) {
            System.out.println("\n A temperatura atual é menor que a desejada : ESQUENTANDO...");
            return "A temperatura atual é menor que temperatura desejada : ESQUENTANDO...";
        }

        else {
            System.out.println("Temperaturas iguais.");
            return "Temperaturas iguais";
        }

    }
}
