import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class exercicio7 {
    static Scanner sc = new Scanner(System.in);

    static void cadastrar() {
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        System.out.print("Nota: ");
        String nota = sc.nextLine();

        try {
            Double.parseDouble(nota);
        } catch (NumberFormatException e) {
            System.out.println("Nota inválida, não salvei");
            return;
        }

        try (PrintStream ps = new PrintStream(new FileOutputStream("alunos.txt", true))) {
            ps.println(nome + ";" + curso + ";" + nota);
            System.out.println("Aluno salvo!");
        } catch (IOException e) {
            System.out.println("Deu erro ao gravar: " + e.getMessage());
        }
    }

    static void listar() {
        File arquivo = new File("alunos.txt");
        if (!arquivo.exists()) {
            System.out.println("O arquivo ainda não existe");
            return;
        }
        if (arquivo.length() == 0) {
            System.out.println("O arquivo tá vazio");
            return;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                System.out.println(partes[0] + " | " + partes[1] + " | nota " + partes[2]);
            }
        } catch (IOException e) {
            System.out.println("Deu erro ao ler: " + e.getMessage());
        }
    }

    static void calcularMedia() {
        File arquivo = new File("alunos.txt");
        if (!arquivo.exists()) {
            System.out.println("O arquivo ainda não existe");
            return;
        }
        if (arquivo.length() == 0) {
            System.out.println("O arquivo tá vazio");
            return;
        }

        double soma = 0;
        int qtd = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                soma += Double.parseDouble(partes[2]);
                qtd++;
            }
            System.out.println("Média das notas: " + (soma / qtd));
        } catch (IOException e) {
            System.out.println("Deu erro ao ler: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 4) {
            System.out.println();
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Ver média das notas");
            System.out.println("4 - Sair");
            System.out.print("Escolhe aí: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                cadastrar();
            } else if (opcao == 2) {
                listar();
            } else if (opcao == 3) {
                calcularMedia();
            } else if (opcao == 4) {
                System.out.println("Falou!");
            } else {
                System.out.println("tenta de novo");
            }
        }
    }
}