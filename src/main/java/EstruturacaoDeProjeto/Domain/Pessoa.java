package EstruturacaoDeProjeto.Domain;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public Pessoa (String nome, String cpf, LocalDate dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // Construtores, Getters e Setters...
}