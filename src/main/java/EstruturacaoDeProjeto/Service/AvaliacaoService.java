package EstruturacaoDeProjeto.Service;

import EstruturacaoDeProjeto.Domain.Aluno;
import EstruturacaoDeProjeto.Domain.Avaliacao;
import EstruturacaoDeProjeto.Domain.Nota;
import EstruturacaoDeProjeto.Domain.Turma;

public class AvaliacaoService {

    public void lancarNota(Turma turma, Aluno aluno, Avaliacao avaliacao, double valorNota) {
        // Validações
        if (!turma.getAlunosMatriculados().contains(aluno)) {
            System.err.println("Erro: Aluno não está matriculado nesta turma.");
            return;
        }
        if (!turma.getAvaliacoesProgramadas().contains(avaliacao)) {
            System.err.println("Erro: Esta avaliação não pertence a esta turma.");
            return;
        }

        Nota novaNota = new Nota(aluno, avaliacao, valorNota);
        turma.lancarNota(novaNota);
        System.out.println("Nota " + valorNota + " lançada para " + aluno.getNome() + " na avaliação " + avaliacao.getDescricao());
    }

}