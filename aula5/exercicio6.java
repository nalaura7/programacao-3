import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("descrição do produto: ");
                String descricao = sc.nextLine();
                System.out.print("preço: ");
                double preco = Double.parseDouble(sc.nextLine());
                System.out.print("quantidade: ");
                int quantidade = Integer.parseInt(sc.nextLine());

                if (preco < 0 || quantidade < 0) {
                    throw new IllegalArgumentException("preço e quantidade não podem ser negativos");
                }

                System.out.println("Produto: " + descricao);
                System.out.println("Valor total do estoque: R$ " + (preco * quantidade));
            } catch (NumberFormatException e) {
                System.out.println("Erro: preço e quantidade devem ser números válidos.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } finally {
            }
        }
    }
}