package Aula_05.Revisao_Aula_05.Rev_Aula05;

class Cliente {
    String nome;
    String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void exibirInfo() {
        System.out.println("Cliente: " + nome + ", Email: " + email);
    }
}

