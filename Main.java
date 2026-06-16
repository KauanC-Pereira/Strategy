public class Main {

    public static void main(String[] args) {

        Pedido pedidoPac = new Pedido(10, new FretePac());
        System.out.println("Frete PAC: R$ " + pedidoPac.calcularFrete());

        Pedido pedidoSedex = new Pedido(10, new FreteSedex());
        System.out.println("Frete SEDEX: R$ " + pedidoSedex.calcularFrete());

        Pedido pedidoRetirada = new Pedido(10, new FreteRetirada());
        System.out.println("Frete Retirada: R$ " + pedidoRetirada.calcularFrete());
    }
}