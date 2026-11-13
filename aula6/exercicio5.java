import java.util.HashSet;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> participantes = new HashSet<>();

        while (true) {
            System.out.print("Nome do participante (fim pra parar): ");
            String nome = sc.nextLine();
            if (nome.equals("fim")) {
                break;
            }
            if (participantes.add(nome)) {
                System.out.println(nome + " entrou na lista");
            } else {
                System.out.println(nome + " já tava na lista, ignorei");
            }
        }

        System.out.println("Quem tá inscrito:");
        for (String p : participantes) {
            System.out.println("- " + p);
        }

        System.out.println("Total de participantes: " + participantes.size());

        System.out.print("Qual nome você quer conferir? ");
        String busca = sc.nextLine();
        if (participantes.contains(busca)) {
            System.out.println(busca + " tá inscrito!");
        } else {
            System.out.println(busca + " não tá inscrito");
        }
    }
}