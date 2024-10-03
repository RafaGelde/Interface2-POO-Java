public class Pedido implements Pagamento,Notificacao {
    private String id;
    private double valor;

    public Pedido(String id, double valor) {
        this.id = id;
        this.valor = valor;
    }
    public void enviarNotificacao() {
        System.out.println("Notificação enviada para o cliente do pedido "+this.id);
    }
    public void processarPagamento() {
        System.out.println("Pagamento de "+this.valor+" para o pedido "+this.id+" processado.");
    }
}
