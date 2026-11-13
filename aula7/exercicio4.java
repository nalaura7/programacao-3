import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Arquivo de origem: ");
        String origem = sc.nextLine();
        System.out.print("Arquivo de destino: ");
        String destino = sc.nextLine();

        try (FileInputStream in = new FileInputStream(origem);
             FileOutputStream out = new FileOutputStream(destino)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            System.out.println("Cópia feita!");
        } catch (FileNotFoundException e) {
            System.out.println("Não achei o arquivo ou não dá pra criar o destino: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Deu erro na leitura ou na escrita: " + e.getMessage());
        }
    }
}