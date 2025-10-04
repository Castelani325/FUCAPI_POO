package EstruturacaoDeProjeto.Domain;

import java.util.List;

public class Turma_NOK {
    private String codigo; // Ex: "MAT01-2025"
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunosMatriculados;
    private List<Avaliacao_NOK> avaliacoes;

    public Turma_NOK(List<Aluno> alunosMatriculados, String codigo) {
        this.alunosMatriculados = alunosMatriculados;
        this.codigo = codigo;
    }


    public void matricularAluno(Aluno aluno) {
        this.alunosMatriculados.add(aluno);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    // Ainda falta adicionar os métodos para adicionar aluno, registrar avaliação e definir máximo de alunos por turma.








}