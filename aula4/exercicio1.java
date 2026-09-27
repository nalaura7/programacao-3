// CLASSE ABSTRATA
abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

// CONTA CORRENTE
class ContaCorrente extends ContaBancaria {
    private static final double TAXA_SAQUE = 1.0;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double totalNecessario = valor + TAXA_SAQUE;

        if (totalNecessario <= saldo) {
            saldo -= totalNecessario;
            System.out.println("Saque de R$" + valor + " realizado (taxa de R$1,00 aplicada).");
        } else {
            System.out.println("Saque de R$" + valor + " inválido: saldo insuficiente (considerando a taxa de R$1,00).");
        }
    }
}

// CONTA POUPANÇA
class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saque de R$" + valor + " inválido: saldo insuficiente.");
        }
    }
}

class exercicio1 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Tainá", 100.0);
        ContaPoupanca cp = new ContaPoupanca("Laura", 100.0);

        System.out.println("depósitos:");
        cc.depositar(50.0);
        cp.depositar(50.0);
        System.out.println("Depósito de R$50,00 feito nas duas contas.");

        System.out.println("Saques válidos:");
        cc.sacar(30.0);
        cp.sacar(30.0);

        System.out.println("saldo insuficciente:");
        cc.sacar(200.0);
        cp.sacar(200.0);

        System.out.println();
        System.out.println("Saldos finais:");
        System.out.println("Conta corrente (" + cc.getTitular() + "): R$" + cc.getSaldo());
        System.out.println("Conta poupança (" + cp.getTitular() + "): R$" + cp.getSaldo());
    }
}