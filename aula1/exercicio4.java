import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("diga uma das operacoes: +, -, * ou /: ");
        char operacao = scanner.next().charAt(0);

        System.out.print("primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("tá errado ai..");
                return;
        }

        System.out.println("resultado: " + resultado);
    }
}