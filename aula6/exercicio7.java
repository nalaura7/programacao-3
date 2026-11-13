import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class exercicio7 {
    static double media(List<Double> notas) {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Double>> alunos = new HashMap<>();
        int opcao = 0;

        while (opcao != 6) {
            System.out.println();
            System.out.println("1 - Cadastrar aluno e notas");
            System.out.println("2 - Mostrar média de cada aluno");
            System.out.println("3 - Listar alunos");
            System.out.println("4 - Consultar aluno");
            System.out.println("5 - Remover aluno");
            System.out.println("6 - Sair");
            System.out.print("Escolhe aí: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                System.out.print("Nome do aluno: ");
                String nome = sc.nextLine();
                if (!alunos.containsKey(nome)) {
                    alunos.put(nome, new ArrayList<>());
                }
                String continuar = "s";
                while (continuar.equalsIgnoreCase("s")) {
                    System.out.print("Nota de " + nome + ": ");
                    alunos.get(nome).add(Double.parseDouble(sc.nextLine()));
                    System.out.print("Quer botar mais uma nota? (s/n): ");
                    continuar = sc.nextLine();
                }
                System.out.println("Aluno salvo!");
            } else if (opcao == 2) {
                if (alunos.isEmpty()) {
                    System.out.println("Ninguém cadastrado ainda");
                }
                for (String nome : alunos.keySet()) {
                    System.out.println(nome + " -> média " + media(alunos.get(nome)));
                }
            } else if (opcao == 3) {
                if (alunos.isEmpty()) {
                    System.out.println("Ninguém cadastrado ainda");
                }
                for (String nome : alunos.keySet()) {
                    System.out.println(nome + " | notas " + alunos.get(nome) + " | média " + media(alunos.get(nome)));
                }
            } else if (opcao == 4) {
                System.out.print("Qual aluno? ");
                String nome = sc.nextLine();
                if (alunos.containsKey(nome)) {
                    System.out.println(nome + " tem as notas " + alunos.get(nome) + " e média " + media(alunos.get(nome)));
                } else {
                    System.out.println("Esse aluno não existe");
                }
            } else if (opcao == 5) {
                System.out.print("Qual aluno? ");
                String nome = sc.nextLine();
                if (alunos.containsKey(nome)) {
                    alunos.remove(nome);
                    System.out.println("Aluno removido! Ficou assim:");
                    for (String n : alunos.keySet()) {
                        System.out.println(n + " | notas " + alunos.get(n) + " | média " + media(alunos.get(n)));
                    }
                } else {
                    System.out.println("Esse aluno não existe");
                }
            } else if (opcao == 6) {
                System.out.println("Falou!");
            } else {
                System.out.println("Opção estranha, tenta de novo");
            }
        }
    }
}