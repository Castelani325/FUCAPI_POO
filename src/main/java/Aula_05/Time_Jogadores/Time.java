package Aula_05.Time_Jogadores;

import java.util.ArrayList;
import java.util.List;

public class Time {

    private String nomeTime;
    private List<Jogador> jogadores;

    public Time (String nomeTime) {
        this.nomeTime = nomeTime;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        if (!this.jogadores.contains(jogador)) { // Evita duplicatas

            this.jogadores.add(jogador);
            jogador.setTime(this);
        }
    }

    public String getNomeTime (){return nomeTime;}
    public List<Jogador> getJogadores(){return jogadores;};

    public void listarJogadores () {
        for (Jogador a : this.jogadores) {
            System.out.println("- " + a.getNomeJogador());
        }
    }


}
