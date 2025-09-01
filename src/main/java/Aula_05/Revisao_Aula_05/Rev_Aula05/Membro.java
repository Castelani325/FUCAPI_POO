package Aula_05.Revisao_Aula_05.Rev_Aula05;

class Membro {
    String nomeMembro;
    String papel;
    Equipe equipe;

    public Membro(String nome, String papel) {
        this.nomeMembro = nome;
        this.papel = papel;
    }

    public String getNomeMembro() {
        return nomeMembro;
    }

    public String getPapel() {
        return papel;
    }

    public void setEquipe(Equipe e) {
        this.equipe = e;
    }

    public void exibirDetalhes() {
        System.out.println("Membro: " + nomeMembro + " (" + papel + ")" +
        (equipe != null ? ", Equipe: " + equipe.nomeEquipe : ", Sem equipe."));
    }
}

