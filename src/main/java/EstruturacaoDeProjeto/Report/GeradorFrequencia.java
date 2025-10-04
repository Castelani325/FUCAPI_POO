package EstruturacaoDeProjeto.Report;

import EstruturacaoDeProjeto.Domain.Aluno;
import EstruturacaoDeProjeto.Domain.Turma;

public class GeradorFrequencia {

    public String gerar(Turma turma) {
        StringBuilder pauta = new StringBuilder();
        pauta.append("========================================\n");
        pauta.append(" LISTA DE FREQUÊNCIA\n");
        pauta.append("========================================\n");
        pauta.append("Turma: ").append(turma.getCodigo()).append(" - Disciplina: ").append(turma.getDisciplina().getNome()).append("\n");
        pauta.append("Professor: ").append(turma.getProfessor().getNome()).append("\n");
        pauta.append("----------------------------------------\n");
        pauta.append("Alunos Matriculados:\n");

        int count = 1;
        for (Aluno aluno : turma.getAlunosMatriculados()) {
            pauta.append(String.format("%d. %s (%s)\n", count++, aluno.getNome(), aluno.getMatricula()));
        }

        pauta.append("========================================\n");

        return pauta.toString();
    }
}