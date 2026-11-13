import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Manda o caminho do arquivo: ");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(caminho)))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Não consegui abrir esse arquivo: " + e.getMessage());
        }
    }
}