package EstruturacaoDeProjeto.Repository;

import EstruturacaoDeProjeto.Domain.Turma;

import java.util.List;
import java.util.Optional;

public interface TurmaRepository {
    void salvar (Turma turma);
    Optional<Turma> buscarPorCodigo(String codigo) ;
    List<Turma> listarTodos();

}
