package Aulas_08_e_09.Ex_01;

public class GeradorDeRelatorio {

    public void gerar(Funcionario funcionario) {
        System.out.println("--- Relatório do Funcionário ---");
        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário Base: " + funcionario.getSalario());

    }
}
