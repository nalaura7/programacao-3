import java.util.HashSet;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> palavras = new HashSet<>();

        while (true) {
            System.out.print("digita uma palavra (fim pra parar): ");
            String p = sc.nextLine();
            if (p.equals("fim")) {
                break;
            }
            palavras.add(p);
        }

        System.out.println("palavras sem repetir:");
        for (String p : palavras) {
            System.out.println("- " + p);
        }

        if (palavras.contains("Java")) {
            System.out.println("Você digitou Java, arrasou!");
        } else {
            System.out.println("Nada de Java por aqui...");
        }

        System.out.println("Total de palavras diferentes: " + palavras.size());
    }
}