package EstruturacaoDeProjeto.Domain;

public class Nota {

    private Aluno aluno;
    private Avaliacao avaliacao;
    private double valor; // A nota em si, ex: 8.5

    public Nota(Aluno aluno, Avaliacao avaliacao, double valor) {
        this.aluno = aluno;
        this.avaliacao = avaliacao;
        this.valor = valor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public double getValor() {
        return valor;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}