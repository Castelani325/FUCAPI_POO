package EstruturacaoDeProjeto.Service;

import EstruturacaoDeProjeto.Domain.Aluno;
import EstruturacaoDeProjeto.Domain.Turma;

public class MatriculaService {

    private static final int MAX_ALUNOS_POR_TURMA = 30;

    public boolean realizarMatricula(Aluno aluno, Turma turma) {
        if (aluno == null || turma == null) {
            System.err.println("Erro: Aluno ou Turma não podem ser nulos.");
            return false;
        }

        if (turma.getAlunosMatriculados().size() >= MAX_ALUNOS_POR_TURMA) {
            System.err.println("Matrícula falhou: Turma lotada.");
            return false;
        }

        if (turma.getAlunosMatriculados().contains(aluno)) {
            System.err.println("Matrícula falhou: Aluno já matriculado nesta turma.");
            return false;
        }

        turma.adicionarAluno(aluno);
        System.out.println("Matrícula de " + aluno.getNome() + " na turma " + turma.getCodigo() + " realizada com sucesso.");
        return true;
    }
}