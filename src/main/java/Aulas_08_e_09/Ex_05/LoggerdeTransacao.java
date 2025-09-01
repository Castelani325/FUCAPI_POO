package Aulas_08_e_09.Ex_05;

public class LoggerdeTransacao {
    public void registrar (Pedido pedido, ResultadoPagamento resultado){
        System.out.println("[LOG] Pedido: " + pedido.getId() + " | " + resultado.toString());
    }
}
