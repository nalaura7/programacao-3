// ENUM
enum StatusPedido {
    AGUARDANDO_PAGAMENTO,
    PAGO,
    ENVIADO,
    ENTREGUE,
    CANCELADO
}

//PEDIDO
class Pedido {
    private int numero;
    private double valor;
    private StatusPedido status;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO; 
    }

    public void alterarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    public void exibirMensagem() {
        System.out.print("Pedido " + numero + " R$" + valor + ": ");

        switch (status) {
            case AGUARDANDO_PAGAMENTO:
                System.out.println("Aguardando pagamento");
                break;
            case PAGO:
                System.out.println("Confirmado");
                break;
            case ENVIADO:
                System.out.println("Pedido enviado");
                break;
            case ENTREGUE:
                System.out.println("Pedido entregue com sucesso");
                break;
            case CANCELADO:
                System.out.println("cancelado");
                break;
        }
    }
}

// MAIN
class exercicio5 {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1, 150.0);

        Pedido pedido2 = new Pedido(2, 300.0);
        pedido2.alterarStatus(StatusPedido.ENVIADO);

        Pedido pedido3 = new Pedido(3, 80.0);
        pedido3.alterarStatus(StatusPedido.CANCELADO);

        pedido1.exibirMensagem();
        pedido2.exibirMensagem();
        pedido3.exibirMensagem();
    }
}