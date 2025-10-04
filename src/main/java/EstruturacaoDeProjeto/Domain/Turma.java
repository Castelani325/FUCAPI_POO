package EstruturacaoDeProjeto.Domain;

import java.util.List;
import java.util.ArrayList;


/**
 * Classe central que conecta Disciplina, Professor e Alunos.
 */
public class Turma {

    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunosMatriculados;
    private List<Avaliacao> avaliacoesProgramadas;
    private List<Nota> notasLancadas;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunosMatriculados = new ArrayList<>();
        this.avaliacoesProgramadas = new ArrayList<>();
        this.notasLancadas = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno != null && !this.alunosMatriculados.contains(aluno)) {
            this.alunosMatriculados.add(aluno);
        }
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        if (avaliacao != null) {
            this.avaliacoesProgramadas.add(avaliacao);
        }
    }

    public void lancarNota(Nota nota) {
        if (nota != null) {
            this.notasLancadas.add(nota);
        }
    }


    public String getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public List<Avaliacao> getAvaliacoesProgramadas() {
        return avaliacoesProgramadas;
    }

    public List<Nota> getNotasLancadas() {
        return notasLancadas;
    }
}