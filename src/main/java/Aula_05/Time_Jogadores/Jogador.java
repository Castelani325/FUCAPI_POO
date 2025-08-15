package Aula_05.Time_Jogadores;

public class Jogador {

    private String nomeJogador;
    private int numeroCamisa;
    private String posicao;
    private Time time;

    public Jogador (String nomeJogador, int numeroCamisa, String posicao) {
        this. nomeJogador = nomeJogador;
        this. numeroCamisa = numeroCamisa;
        this. posicao = posicao;
    }

    public void setTime (Time time){
        this.time = time;
    }

    public String getNomeJogador () {return nomeJogador;};
    public int getNumeroJogador () {return numeroCamisa;};
    public String getPosicao () {return posicao;};
    public Time getTime () {return time;};


    public void exibirDados() {
        System.out.printf("Nome do jogador: %s\n", this.nomeJogador);
        System.out.printf("Número da camisa: %d\n", this.numeroCamisa);
        System.out.printf("Posição: %s\n", this.posicao);

        if (this.time != null) {
            System.out.printf("Time atual: %s\n", this.time.getNomeTime());
        } else {
            System.out.println("Time atual: Sem time");
        }
    }





}
