
//Otávio Castelani
//RA : 212466


package Aula_03;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhe () {
        System.out.printf("O titulo é : %s \n" +
                " O autor é : %s \n" +
                " O ano de publicação é : %d", titulo, autor, anoPublicacao);

    };
}
