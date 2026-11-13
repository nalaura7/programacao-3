import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("digite o primeiro número: ");
            int a = sc.nextInt();
            System.out.print("digite o segundo número: ");
            int b = sc.nextInt();
            try {
                System.out.println("Resultado: " + (a / b));
            } catch (ArithmeticException e) {
                System.out.println("Erro: não é possível dividir por zero.");
            }
        }
    }
}