import java.io.File;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Manda um caminho: ");
        File f = new File(sc.nextLine());

        if (!f.exists()) {
            System.out.println("Isso não existe");
            return;
        }

        System.out.println("Caminho absoluto: " + f.getAbsolutePath());

        if (f.isFile()) {
            System.out.println("É um arquivo");
            System.out.println("Tamanho: " + f.length() + " bytes");
        } else if (f.isDirectory()) {
            System.out.println("É um diretório, olha o que tem dentro:");
            File[] itens = f.listFiles();
            if (itens == null || itens.length == 0) {
                System.out.println("Tá vazio");
            } else {
                for (File item : itens) {
                    if (item.isDirectory()) {
                        System.out.println("[pasta] " + item.getName());
                    } else {
                        System.out.println("[arquivo] " + item.getName());
                    }
                }
            }
        }
    }
}