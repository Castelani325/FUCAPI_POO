package Aulas_10_e_11.Ex_01;

public class Livro  {

    private String titulo;
    private String autor;
    private String isbn;
    static boolean estaEmprestado;

    public Livro (String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estaEmprestado = false; // false por padrão, já que é necessário que o livro esteja na biblioteca para que possa ser emprestado
    }

    public String getTitulo() { //Getter simples do atributo Titulo
        return titulo;
    }

    public String getAutor() { //Getter simples do atributo Autor
        return autor;
    }

    public String getIsbn() { //Getter simples do atributo Isbn
        return isbn;
    }

   public void emprestar () {  //Caso já tenha sido emprestado, haverá um SOUT informando
        if (estaEmprestado == false) {
            estaEmprestado = true;
            System.out.println("Livro emprestado : " + titulo);
        }
        else {
            System.out.println("Este livro não pode ser emprestado pois já se encontra emprestado");
        }
    }

    public void devolver () { //Caso já tenha sido devolvido, haverá um SOUT informando

        if (estaEmprestado == true){
            estaEmprestado = false;
            System.out.println("Livro devolvido : " + titulo);
        }
        else {
            System.out.println("Este livro ainda não foi emprestado.");
        }
    }

    public void exibirDetalhes() {  //Este metodo foi feito com auxílio da IA para que pudesse ter um layout mais formatado
        System.out.println("--- Detalhes do Livro ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Status: " + (this.estaEmprestado ? "Emprestado" : "Disponível")); // Essa sintaxe se assemelha a um IF : caso seja True, "Emprestado, caso seja False, "Disponível
        System.out.println("-------------------------");
    }
}
