package EstruturacaoDeProjeto.Domain;

import java.time.LocalDate;

public class Professor extends Pessoa {
    private String especialidade; // Ex: "Matemática", "História"

    public Professor (String nome, String cpf, LocalDate dataNascimento, String especialidade){
        super (nome, cpf, dataNascimento);
        this.especialidade = especialidade;
        }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}