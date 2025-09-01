package Aula_05.Revisao_Aula_05.Rev_Aula04;

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salarioInicial) {
        this.nome = nome;
        setSalario(salarioInicial);
    }

    public String getNome() {
        return nome;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double novoSalario) {
        if (novoSalario >= 0) {
            setSalario(novoSalario);
        }
        else {
            System.out.println("Valores negativos não são aceitos.");
        }
    }
}
