import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (PrintStream ps = new PrintStream("anotacoes.txt")) {
            while (true) {
                System.out.print("Escreve algo (FIM pra parar): ");
                String linha = sc.nextLine();
                if (linha.equals("FIM")) {
                    break;
                }
                ps.println(linha);
            }

            if (ps.checkError()) {
                System.out.println("Deu problema na hora de gravar");
            } else {
                System.out.println("Gravação concluída, tudo certo!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Não consegui criar o arquivo: " + e.getMessage());
        }
    }
}