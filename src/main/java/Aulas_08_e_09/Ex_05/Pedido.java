package Aulas_08_e_09.Ex_05;

public class Pedido {
    private final String id;
    private final double valorTotal;

    public Pedido(String id, double valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getId() {
        return id;
    }
}
