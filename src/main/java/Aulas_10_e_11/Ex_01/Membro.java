package Aulas_10_e_11.Ex_01;
import java.util.ArrayList;

public class Membro {

    private String nome;
    private int idMembro;
    private ArrayList<Livro> livrosEmprestados;
    private final int maxLivros = 3; // Limite fixo de livros por membro


    public Membro(String nome, int idMembro) {
        this.nome = nome;
        this.idMembro = idMembro;
        this.livrosEmprestados = new ArrayList<>(); // Inicializa a lista vazia
    }


    public String getNome() {
        return nome;
    }

    public int getIdMembro() {
        return idMembro;
    }

    // --- Métodos de Ação ---
    public void emprestarLivro(Livro livro) {
        // Verifica se o membro pode pegar mais livros
        if (livrosEmprestados.size() >= maxLivros) {
            System.out.println("Erro: Membro '" + this.nome + "' atingiu o limite de " + maxLivros + " livros emprestados.");
            return;
        }
        // Verifica se o livro está disponível
        if (livro.estaEmprestado) {
            System.out.println("Erro: O livro '" + livro.getTitulo() + "' não está disponível para empréstimo.");
            return;
        }

        // Se tudo estiver OK, realiza o empréstimo
        livro.emprestar();
        this.livrosEmprestados.add(livro);
        System.out.println("Sucesso: Livro '" + livro.getTitulo() + "' emprestado para '" + this.nome + "'.");
    }

    public void devolverLivro(Livro livro) {
        // Verifica se o livro está na lista de empréstimos do membro
        if (this.livrosEmprestados.contains(livro)) {
            livro.devolver();
            this.livrosEmprestados.remove(livro);
            System.out.println("Sucesso: Livro '" + livro.getTitulo() + "' devolvido por '" + this.nome + "'.");
        } else {
            System.out.println("Erro: Livro '" + livro.getTitulo() + "' não encontrado na lista de empréstimos de '" + this.nome + "'.");
        }
    }

    public void listarLivrosEmprestados() {  //Este metodo foi feito com auxílio da IA para que pudesse ter um layout mais formatado
        System.out.println("\n--- Livros emprestados por " + this.nome + " (ID: " + this.idMembro + ") ---");
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado no momento.");
        } else {
            for (Livro livro : livrosEmprestados) {
                System.out.println("- " + livro.getTitulo());
            }
        }
        System.out.println("----------------------------------------------");
    }
}