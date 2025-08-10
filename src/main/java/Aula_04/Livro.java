//Otávio Castelani
//RA : 212466

//Exercício 3 : Livro

package Aula_04;

public class Livro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int anoPublicacao;


    public Livro (String titulo, String autor, int numeroPaginas, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.setNumeroPaginas(numeroPaginas);
        this.setAnoPublicacao(anoPublicacao);

    };

    public String getTitulo (){
        return titulo;
    };

    public String getAutor (){
        return autor;
    };

    public int getNumeroPaginas (){
        return numeroPaginas;
    };

    public int getAnoPublicacao  (){
        return anoPublicacao;
    };

    public void setNumeroPaginas (int numeroDePaginas) {
        if (numeroDePaginas > 0)
            this.numeroPaginas = numeroDePaginas;
        else {
            this.numeroPaginas = 1;
        }

    };

    public void setAnoPublicacao (int anoPublicacao) {
         if (anoPublicacao < 2025) {
             this.anoPublicacao = anoPublicacao;
         }
         else {
             this.anoPublicacao = 2025;
         }
     };

    public boolean ehLivroGrande() {
        if (numeroPaginas > 500){
            return true;
        }

        else {
            return false;
        }

    };


    public void exibirDadosLivro(){
        System.out.printf("\n--- Detalhes do Livro ---");
        System.out.printf(" \n O título é : %s ", titulo);
        System.out.printf(" \n O autor é : %s ", autor);
        System.out.printf(" \n O número de páginas é : %d ", numeroPaginas);
        System.out.printf(" \n O ano de publicação é : %d ", anoPublicacao);
    }
    //

}
