package Aula_05.Aluno_Curso;


public class Aluno {


    private int matricula;
    private String nome;
    private Curso cursoMatriculado;

    public Aluno (int matricula, String nome, Curso curso){

        this.matricula = matricula;
        this.nome = nome;
        //this.cursoMatriculado = cursoMatriculado;
        }

    public void setCursoMatriculado (Curso curso) {
        this.cursoMatriculado = cursoMatriculado;

    }

    public void exibirDadosCompletos () {
        System.out.printf("\n Nome do aluno : %s \n Matrícula do aluno : %s \n", nome, matricula);

        if (cursoMatriculado != null) {
            System.out.printf("\n Dados do curso matriculado : \n%s \n %n", cursoMatriculado.exibirDetalhes());;
        }
        else {
            System.out.println("O aluno não está associado a nenhum curso ainda.");
        }
    }

}
