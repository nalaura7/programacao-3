// interface
interface Pagamento {
    void processarPagamento(double valor);
    void cancelarPagamento();
}

// CARTAO 
class PagamentoCartao implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado no cartão.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento no cartão cancelado");
    }
}

// PIX 
class PagamentoPix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via Pix.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento via Pix cancelado");
    }
}

// BOLETO
class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via boleto.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Boleto cancelado");
    }
}

// MAIN
class exercicio4 {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[3];
        pagamentos[0] = new PagamentoCartao();
        pagamentos[1] = new PagamentoPix();
        pagamentos[2] = new PagamentoBoleto();

        for (Pagamento p : pagamentos) {
            p.processarPagamento(150.0);
            p.cancelarPagamento();
            System.out.println();
        }
    }
}