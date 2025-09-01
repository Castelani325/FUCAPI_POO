// Funcionario.java
package Aulas_08_e_09.Ex_01;

public class Funcionario {
    private String nome;
    private int id;
    private String cargo;
    private double salario;

    public Funcionario(String nome, int id, String cargo, double salario) {
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}