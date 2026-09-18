import java.util.ArrayList;
import java.util.Iterator;

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class exercicio6 {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria(1, "Ana", 1500.00));
        contas.add(new ContaBancaria(2, "Tainá", 2300.50));
        contas.add(new ContaBancaria(3, "Laurinhaa", 800.75));

        double saldoTotal = 0;

        Iterator<ContaBancaria> it = contas.iterator();
        while (it.hasNext()) {
            ContaBancaria conta = it.next();
            System.out.println("numero: " + conta.numero + " e titular: " + conta.titular);
            saldoTotal += conta.saldo;
        }

        System.out.printf("%nSaldo total acumulado no banco: R$ %.2f%n", saldoTotal);
    }
}