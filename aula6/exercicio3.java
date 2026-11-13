import java.util.HashMap;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> pessoas = new HashMap<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Nome da pessoa " + i + ": ");
            String nome = sc.nextLine();
            System.out.print("Idade de " + nome + ": ");
            int idade = Integer.parseInt(sc.nextLine());
            pessoas.put(nome, idade);
        }

        System.out.print("Quem você quer procurar? ");
        String busca = sc.nextLine();
        if (pessoas.containsKey(busca)) {
            System.out.println(busca + " tem " + pessoas.get(busca) + " anos");
        } else {
            System.out.println("Não achei ninguém com esse nome");
        }

        System.out.print("Quem você quer remover? ");
        String remover = sc.nextLine();
        if (pessoas.containsKey(remover)) {
            pessoas.remove(remover);
            System.out.println(remover + " foi removido");
        } else {
            System.out.println("Esse nome nem tá na lista");
        }

        System.out.println("Como ficou: " + pessoas);
    }
}