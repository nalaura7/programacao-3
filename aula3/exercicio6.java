import java.util.Objects;

class Conta {
    private int numero;

    public Conta(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conta: numero=" + numero ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Conta outra = (Conta) obj;
        return numero == outra.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}

public class exercicio6 {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1001);
        Conta conta2 = new Conta(1001);
        Conta conta3 = new Conta(2002);

        System.out.println("conta1.equals(conta2): " + conta1.equals(conta2));
        System.out.println("conta1.equals(conta3): " + conta1.equals(conta3));
        System.out.println("\nImprimindo os objetos diretamente:");
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
    }
}