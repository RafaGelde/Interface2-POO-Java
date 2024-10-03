public class Main {
    public static void main(String[] args) {
        Pedido primeiroPedido = new Pedido("341A",432.37);

        primeiroPedido.processarPagamento();
        primeiroPedido.enviarNotificacao();
    }
}