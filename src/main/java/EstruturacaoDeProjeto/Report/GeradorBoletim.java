package EstruturacaoDeProjeto.Report;

import EstruturacaoDeProjeto.Domain.Aluno;
import EstruturacaoDeProjeto.Domain.Nota;
import EstruturacaoDeProjeto.Domain.Turma;
import EstruturacaoDeProjeto.Service.AvaliacaoService;

public class GeradorBoletim {

    private final AvaliacaoService avaliacaoService;

    public GeradorBoletim(AvaliacaoService avaliacaoService) {
        this.avaliacaoService = avaliacaoService;
    }

    public String gerar(Turma turma, Aluno aluno) {
        StringBuilder boletim = new StringBuilder();
        boletim.append("========================================\n");
        boletim.append(" BOLETIM DO ALUNO\n");
        boletim.append("========================================\n");
        boletim.append("Aluno: ").append(aluno.getNome()).append("\n");
        boletim.append("Matrícula: ").append(aluno.getMatricula()).append("\n");
        boletim.append("Turma: ").append(turma.getCodigo()).append(" - Disciplina: ").append(turma.getDisciplina().getNome()).append("\n");
        boletim.append("----------------------------------------\n");
        boletim.append("Notas Lançadas:\n");

        for (Nota nota : turma.getNotasLancadas()) {
            if (nota.getAluno().equals(aluno)) {
                boletim.append(String.format("- %s (Peso %.2f): %.2f\n",
                        nota.getAvaliacao().getDescricao(),
                        nota.getAvaliacao().getPeso(),
                        nota.getValor()));
            }
        }



        return boletim.toString();
    }
}