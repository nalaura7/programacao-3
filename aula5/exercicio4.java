import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Laura", "Tainá", "Isabela", "taehyung"};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("digite um índice ");
            int indice = sc.nextInt();
            try {
                System.out.println("Nome: " + nomes[indice]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: o índice " + indice + " não existe no vetor.");
            }
        }
    }
}