import java.util.ArrayList;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> livros = new ArrayList<>();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println();
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Pesquisar livro");
            System.out.println("4 - Remover livro");
            System.out.println("5 - Sair");
            System.out.print("Escolhe aí: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                System.out.print("Título do livro: ");
                livros.add(sc.nextLine());
                System.out.println("Livro adicionado!");
            } else if (opcao == 2) {
                if (livros.isEmpty()) {
                    System.out.println("Nenhum livro ainda");
                }
                for (int i = 0; i < livros.size(); i++) {
                    System.out.println(i + " - " + livros.get(i));
                }
            } else if (opcao == 3) {
                System.out.print("Qual título você procura? ");
                String titulo = sc.nextLine();
                if (livros.contains(titulo)) {
                    System.out.println("Achei! Tá no índice " + livros.indexOf(titulo));
                } else {
                    System.out.println("Esse livro não tá aqui");
                }
            } else if (opcao == 4) {
                System.out.print("Índice do livro pra remover: ");
                int indice = Integer.parseInt(sc.nextLine());
                if (indice >= 0 && indice < livros.size()) {
                    System.out.println("Removi: " + livros.remove(indice));
                } else {
                    System.out.println("Esse índice não existe");
                }
            } else if (opcao == 5) {
                System.out.println("Até mais!");
            } else {
                System.out.println("Opção estranha, tenta de novo");
            }
        }
    }
}