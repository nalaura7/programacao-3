import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("diga um número " + i + ": ");
            lista.add(sc.nextInt());
        }

        System.out.println("lista: " + lista);

        int soma = 0;
        for (int n : lista) {
            soma += n;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma / 10.0));

        lista.removeIf(n -> n % 2 == 0);
        System.out.println("Sem os pares: " + lista);
    }
}