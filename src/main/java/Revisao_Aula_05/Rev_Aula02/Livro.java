package Revisao_Aula_05.Rev_Aula02;

public class Livro {

    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livro (String titulo, String autor, int numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        };

    public String getTitulo() {
        return titulo;
    };

    public String getAutor (){
        return autor;
    };

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    };
}
