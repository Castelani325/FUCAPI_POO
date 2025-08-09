//Otávio Castelani
//RA : 212466

//Exercício 1: Gerenciando Informações de um Funcionário


package Aula_04;


public class Funcionario {

    public String nome;
    private double salario;
    private String cargo;

    public Funcionario (String nome, Double salario, String cargo) {
        this.nome = nome;
        this.setSalario(salario);
        this.setCargo(cargo);
    }

    public String getNome (){
        return nome;
    };

    public double getSalario (){
        return salario;
    };

    public String getCargo (){
        return cargo;
    };

    public void setSalario (double novoSalario) {
        if (novoSalario < 0){
            throw new IllegalArgumentException ("O salário não pode ser negativo.");

        }

        this.salario = novoSalario;
    }

    public void aumentaSalario (double percentualDeAumento) {
        if (percentualDeAumento < 0) {
            throw new IllegalArgumentException("O percentual de aumento não pode ser inferior a 0.");
        }

        this.salario = this.salario * (1 + (percentualDeAumento / 100.0));
        //System.out.printf("O novo salário é de :%.2f ", salario);;
    };

    public void setCargo (String cargo) {
        if (cargo.equals("Desenvolvedor") || cargo.equals("Analista") || cargo.equals("Gerente")) {
            this.cargo = cargo;
        }

        else {
            cargo = "Indefinido";
            this.cargo = cargo;
        }
    }

    public void exibirDetalhes(){
        System.out.println("Os dados do funcionário são : ");
        System.out.printf("Nome : %s ", nome);
        System.out.printf("Salário : %f ", salario);
        System.out.printf("Cargo : %s ", cargo);
    }


}
