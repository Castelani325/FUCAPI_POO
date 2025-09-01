package Aula_05.Revisao_Aula_05.Rev_Aula05;

import java.util.ArrayList;
import java.util.List;

class Equipe {
    String nomeEquipe;
    List<Membro> membros; // Equipe TEM MUITOS Membros

    public Equipe(String nome) {
        this.nomeEquipe = nome;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Membro m) {
        if (!this.membros.contains(m)) {
            this.membros.add(m);
            m.setEquipe(this); // Garante bidirecionalidade
        }
    }

    public void exibirMembros() {
        System.out.println("Equipe: " + nomeEquipe);
        if (membros.isEmpty()) {
            System.out.println("  Nenhum membro nesta equipe.");
        } else {
            for (Membro m : membros) {
                System.out.println("  - " + m.getNomeMembro() + " (" + m.getPapel() + ")");
            }
        }
    }
}
