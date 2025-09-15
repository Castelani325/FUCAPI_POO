package Aulas_10_e_11.Ex_01;

import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private ArrayList<Livro> catalogoLivros;
    private ArrayList<Membro> listaMembros;


    public Biblioteca(String nome) {
        this.nome = nome;
        this.catalogoLivros = new ArrayList<>();
        this.listaMembros = new ArrayList<>();
    }


    public void adicionarLivro(Livro livro) {
        this.catalogoLivros.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado ao catálogo.");
    }

    public void adicionarMembro(Membro membro) {
        this.listaMembros.add(membro);
        System.out.println("Membro '" + membro.getNome() + "' adicionado à biblioteca.");
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : catalogoLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null; // Retorna null se não encontrar
    }

    public Membro buscarMembro(int id) {
        for (Membro membro : listaMembros) {
            if (membro.getIdMembro() == id) {
                return membro;
            }
        }
        return null; // Retorna null se não encontrar
    }

   public void realizarEmprestimo(int idMembro, String tituloLivro) {
        System.out.println("\n>>> Tentativa de empréstimo: Membro ID " + idMembro + " | Livro '" + tituloLivro + "'");
        Membro membro = buscarMembro(idMembro);
        Livro livro = buscarLivro(tituloLivro);

        if (membro == null) {
            System.out.println("Erro: Membro com ID " + idMembro + " não encontrado.");
            return;
        }
        if (livro == null) {
            System.out.println("Erro: Livro com título '" + tituloLivro + "' não encontrado.");
            return;
        }

        // Delega a lógica de empréstimo para o objeto Membro
        membro.emprestarLivro(livro);
    }

    public void realizarDevolucao(int idMembro, String tituloLivro) {
        System.out.println("\n>>> Tentativa de devolução: Membro ID " + idMembro + " | Livro '" + tituloLivro + "'");
        Membro membro = buscarMembro(idMembro);
        Livro livro = buscarLivro(tituloLivro);

        if (membro == null) {
            System.out.println("Erro: Membro com ID " + idMembro + " não encontrado.");
            return;
        }
        if (livro == null) {
            System.out.println("Erro: Livro com título '" + tituloLivro + "' não encontrado.");
            return;
        }

        // Delega a lógica de devolução para o objeto Membro
        membro.devolverLivro(livro);
    }

    public String getNome() {return nome; }
}