import java.util.HashMap;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> estoque = new HashMap<>();
        int opcao = 0;

        while (opcao != 6) {
            System.out.println();
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Consultar quantidade");
            System.out.println("3 - Atualizar quantidade");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Mostrar todos");
            System.out.println("6 - Sair");
            System.out.print("Escolhe aí: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();
                System.out.print("Quantidade: ");
                int qtd = Integer.parseInt(sc.nextLine());
                estoque.put(nome, qtd);
                System.out.println("Produto cadastrado!");
            } else if (opcao == 2) {
                System.out.print("Qual produto? ");
                String nome = sc.nextLine();
                if (estoque.containsKey(nome)) {
                    System.out.println("Tem " + estoque.get(nome) + " de " + nome);
                } else {
                    System.out.println("Esse produto não existe");
                }
            } else if (opcao == 3) {
                System.out.print("Qual produto? ");
                String nome = sc.nextLine();
                if (estoque.containsKey(nome)) {
                    System.out.print("Nova quantidade: ");
                    estoque.put(nome, Integer.parseInt(sc.nextLine()));
                    System.out.println("Quantidade atualizada!");
                } else {
                    System.out.println("Esse produto não existe");
                }
            } else if (opcao == 4) {
                System.out.print("Qual produto? ");
                String nome = sc.nextLine();
                if (estoque.containsKey(nome)) {
                    estoque.remove(nome);
                    System.out.println("Produto removido!");
                } else {
                    System.out.println("Esse produto não existe");
                }
            } else if (opcao == 5) {
                if (estoque.isEmpty()) {
                    System.out.println("Estoque vazio");
                }
                for (String nome : estoque.keySet()) {
                    System.out.println(nome + ": " + estoque.get(nome));
                }
            } else if (opcao == 6) {
                System.out.println("Falou!");
            } else {
                System.out.println("Opção estranha, tenta de novo");
            }
        }
    }
}