import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("coloque um número inteiro: ");
            String texto = sc.nextLine();
            try {
                int numero = Integer.parseInt(texto);
                System.out.println("número convertido: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("erro: \"" + texto + "\" não é um inteiro válido.");
            } finally {
                System.out.println("cabousse");
            }
        }
    }
}