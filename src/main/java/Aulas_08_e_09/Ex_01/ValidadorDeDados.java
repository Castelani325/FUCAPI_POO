package Aulas_08_e_09.Ex_01;


public class ValidadorDeDados {

    public boolean validar(Funcionario funcionario) {
        if (funcionario.getNome() == null || funcionario.getNome().isEmpty()) {
            System.out.println("Erro de validação: Nome do funcionário não pode ser vazio.");
            return false;
        }
        if (funcionario.getSalario() <= 0) {
            System.out.println("Erro de validação: Trabalho escravo não é mais permitido.");
            return false;
        }
        System.out.println("Dados do funcionário " + funcionario.getNome() + " validados com sucesso.");
        return true;
    }
}