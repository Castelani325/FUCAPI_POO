package EstruturacaoDeProjeto.Domain;

public class Disciplina {

    private String nome;
    private int cargaHoraria;

    public Disciplina (String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;

    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
