package Aula_05.Revisao_Aula_05.Rev_Aula05;

class Livro {
    String titulo;
    int anoPublicacao;
    Autor autor; // Livro TEM UM Autor

    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.print("Detalhes do ");
        autor.exibirInfo();
    }
}
