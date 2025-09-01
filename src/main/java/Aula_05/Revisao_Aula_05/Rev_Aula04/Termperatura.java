package Aula_05.Revisao_Aula_05.Rev_Aula04;

class Temperatura {
    private double celsius;

    public Temperatura(double tempInicialC) {
        setCelsius(tempInicialC);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double valor) {
        if (valor >= -273.15 && valor <= 5000.0) { double celsius = valor;}
        else { System.out.println("Range inválido.");}
    }

    public double getFahrenheit() {
         return (celsius * 9 / 5) + 32;

    }
}

