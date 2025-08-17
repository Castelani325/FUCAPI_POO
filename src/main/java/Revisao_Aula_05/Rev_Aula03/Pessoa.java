package Revisao_Aula_05.Rev_Aula03;

class Pessoa {
    String nome;
    int idade;


    public Pessoa(String n) {
         this.nome = n;
         this.idade = 0; // Idade padrão
    }


    public Pessoa(String n, int i) {
         this.nome = n;
         this.idade = i;
    }


    public void apresentar() {
         System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

