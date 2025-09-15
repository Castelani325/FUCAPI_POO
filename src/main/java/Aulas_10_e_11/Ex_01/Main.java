package Aulas_10_e_11.Ex_01;

public class Main {
    public static void main(String[] args) {
        // 1. Crie uma Biblioteca
        Biblioteca bibliotecaMunicipal = new Biblioteca("Biblioteca Municipal Central");
        System.out.println("Bem-vindo à " + bibliotecaMunicipal.getNome() + "!\n");

        // 2. Adicione alguns Livros
        bibliotecaMunicipal.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-0-261-10235-4"));
        bibliotecaMunicipal.adicionarLivro(new Livro("1984", "George Orwell", "978-0-452-28423-4"));
        bibliotecaMunicipal.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes", "978-84-204-1214-6"));
        bibliotecaMunicipal.adicionarLivro(new Livro("A Arte da Guerra", "Sun Tzu", "978-85-7153-228-4"));
        System.out.println();

        // Adicionando alguns Membros
        bibliotecaMunicipal.adicionarMembro(new Membro("Carlos Silva", 101));
        bibliotecaMunicipal.adicionarMembro(new Membro("Ana Pereira", 102));
        System.out.println();

        // Realize empréstimos
        // Um membro empresta um livro (sucesso)
        bibliotecaMunicipal.realizarEmprestimo(101, "1984");

        // Outro membro tenta emprestar o mesmo livro (deve falhar)
        bibliotecaMunicipal.realizarEmprestimo(102, "1984");

        // Membro 101 empresta mais 2 livros, atingindo seu limite
        bibliotecaMunicipal.realizarEmprestimo(101, "O Senhor dos Anéis");
        bibliotecaMunicipal.realizarEmprestimo(101, "Dom Quixote");

        // Membro 101 tenta emprestar mais um livro (deve falhar)
        bibliotecaMunicipal.realizarEmprestimo(101, "A Arte da Guerra");

        // Liste os livros emprestados pelo membro 101
        Membro carlos = bibliotecaMunicipal.buscarMembro(101);
        if (carlos != null) {
            carlos.listarLivrosEmprestados();
        }

        // Realize devoluções
        // Um membro devolve um livro (sucesso)
        bibliotecaMunicipal.realizarDevolucao(101, "1984");

        // Um membro tenta devolver um livro que ele não pegou (deve falhar)
        bibliotecaMunicipal.realizarDevolucao(102, "Dom Quixote");

        // Exiba o status final
        System.out.println("\n--- STATUS FINAL ---");
        // Verifica o status do livro "1984" que foi devolvido
        Livro livro1984 = bibliotecaMunicipal.buscarLivro("1984");
        if (livro1984 != null) {
            livro1984.exibirDetalhes();
        }

        // Verifica a lista de livros do membro Carlos
        if (carlos != null) {
            carlos.listarLivrosEmprestados();
        }
    }
}
