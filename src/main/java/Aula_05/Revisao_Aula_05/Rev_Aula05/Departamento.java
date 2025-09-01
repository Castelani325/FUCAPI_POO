package Aula_05.Revisao_Aula_05.Rev_Aula05;

import java.util.ArrayList;
import java.util.List;

class Departamento {
    String nomeDepartamento;
    List<Funcionario> funcionarios; // Departamento TEM MUITOS Funcionários

    public Departamento(String nome) {
        this.nomeDepartamento = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        if (!this.funcionarios.contains(f)) { // Evita duplicatas
            this.funcionarios.add(f);
            f.setDepartamento(this); // Mantém a bidirecionalidade
        }
    }

    public void listarFuncionarios() {
        System.out.println("Departamento: " + nomeDepartamento);
        if (funcionarios.isEmpty()) {
            System.out.println("  Nenhum funcionário neste departamento.");
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println("  - " + f.getNomeFuncionario());
            }
        }
    }
}

