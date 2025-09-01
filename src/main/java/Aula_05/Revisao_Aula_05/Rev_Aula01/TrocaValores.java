package Aula_05.Revisao_Aula_05.Rev_Aula01;

public class TrocaValores {
    public static void main (String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf(" antes da troca : a(%d) b(%d)", a , b);

        int temp;
        temp = a;
        a = b; 
        b = temp;

        System.out.printf(" Depois da troca : a(%d) b(%d)", a, b);
    }
}
