import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Manda o caminho do arquivo: ");
        String caminho = sc.nextLine();

        int linhas = 0;
        int palavras = 0;
        int caracteres = 0;
        String maiorLinha = "";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas++;
                caracteres += linha.length();
                if (!linha.trim().isEmpty()) {
                    palavras += linha.trim().split("\\s+").length;
                }
                if (linha.length() > maiorLinha.length()) {
                    maiorLinha = linha;
                }
            }
            System.out.println("Linhas: " + linhas);
            System.out.println("Palavras: " + palavras);
            System.out.println("Caracteres: " + caracteres);
            System.out.println("Maior linha (" + maiorLinha.length() + " caracteres): " + maiorLinha);
        } catch (IOException e) {
            System.out.println("Não consegui ler o arquivo: " + e.getMessage());
        }
    }
}