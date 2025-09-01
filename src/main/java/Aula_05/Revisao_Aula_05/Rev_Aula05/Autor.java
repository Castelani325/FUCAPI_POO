package Aula_05.Revisao_Aula_05.Rev_Aula05;

class Autor {
    String nome;
    String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public void exibirInfo() {
        System.out.println("Autor: " + nome + ", Nacionalidade: " + nacionalidade);
    }
}

