package Aulas_08_e_09.Ex_01;


public class CalculadoraSalarial {


    public double calcular(Funcionario funcionario, float bonus) {
        if (bonus < 1){
            System.out.println("Não é possível haver bonus negativo");
            return 0;
        }

        else {
            double salarioComBonus = funcionario.getSalario() * bonus;
            System.out.println("Salário calculado para " + funcionario.getNome() + ": " + salarioComBonus);
            return salarioComBonus;
        }
    }
}
