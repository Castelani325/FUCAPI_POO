package Revisao_Aula_05.Rev_Aula05;

class Funcionario {
    String nomeFuncionario;
    Departamento departamento; // Funcionário TEM UM Departamento

    public Funcionario(String nome) {
        this.nomeFuncionario = nome;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setDepartamento(Departamento d) {
        this.departamento = d;
    }

    public void exibirDetalhes() {
        System.out.println("Funcionário: " + nomeFuncionario +
        (departamento != null ? ", Depto: " + departamento.nomeDepartamento : ", Sem departamento."));
    }
}

