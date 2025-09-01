package Aula_05.Revisao_Aula_05.Rev_Aula01;

public class verificadorVoto {
    public static void main (String[] args) {
        int idade = 17;
        boolean maiorDeIdade = idade >= 18;
        
        boolean votoObrigatorio = idade >= 18 && idade <= 70;

        System.out.println("É maior de idade : " + maiorDeIdade + "\n Voto obrigatório : " + votoObrigatorio);
    }
}
