import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("início do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("fim do intervalo: ");
        int fim = scanner.nextInt();

        System.out.println("intervalo será " + inicio + " e " + fim + ":");

        for (int num = inicio; num <= fim; num++) {
            if (ehPrimo(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean ehPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}