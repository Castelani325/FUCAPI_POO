package EstruturacaoDeProjeto.Domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno (String matricula, String nome, String cpf, LocalDate dataNascimento) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
