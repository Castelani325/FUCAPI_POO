package Aula_05.Aluno_Curso;

public class Curso {

    private String codigo;
    private String nome;

    public Curso (String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo () {return codigo;}
    public String getNome () {return nome;};

    public String exibirDetalhes (){
        return System.out.printf("\nCódigo do curso : %s \n Nome do curso : %s \n", codigo, nome).toString();

    }

}
