package EstruturacaoDeProjeto.Repository;

import EstruturacaoDeProjeto.Domain.Aluno;

import java.util.List;
import java.util.Optional;

public interface AlunoRepository {
    void salvar(Aluno aluno);
    Optional<Aluno> buscarPorMatricula (String matricula);
    List<Aluno> listarTodos();

}
