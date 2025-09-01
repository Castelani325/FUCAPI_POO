package Aulas_08_e_09.Ex_05;

public class ResultadoPagamento {

    private final boolean sucesso;
    private final String mensagem;

    public ResultadoPagamento(boolean sucesso, String mensagem) {
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    public boolean foiSucesso() {
        return sucesso;
    }

    public String toString(){
      return "Resultado: " + (sucesso ? "Sucesso" : "Falha") + " | Mensagem : " + mensagem;
    };


}
