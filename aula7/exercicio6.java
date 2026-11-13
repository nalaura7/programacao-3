import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Manda o caminho do diretório: ");
        File dir = new File(sc.nextLine());
        int opcao = 0;

        while (opcao != 6) {
            System.out.println();
            System.out.println("1 - Ver se o diretório existe");
            System.out.println("2 - Criar o diretório");
            System.out.println("3 - Listar o que tem dentro");
            System.out.println("4 - Mostrar caminho absoluto e tamanho dos arquivos");
            System.out.println("5 - Criar um arquivo de texto");
            System.out.println("6 - Sair");
            System.out.print("Escolhe aí: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                if (dir.exists()) {
                    System.out.println("Existe sim");
                } else {
                    System.out.println("Não existe");
                }
            } else if (opcao == 2) {
                if (dir.exists()) {
                    System.out.println("Já existe, não precisa criar");
                } else if (dir.mkdirs()) {
                    System.out.println("Diretório criado!");
                } else {
                    System.out.println("Não consegui criar o diretório");
                }
            } else if (opcao == 3) {
                if (!dir.isDirectory()) {
                    System.out.println("Isso não é um diretório válido");
                } else {
                    File[] itens = dir.listFiles();
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
            } else if (opcao == 4) {
                if (!dir.isDirectory()) {
                    System.out.println("Isso não é um diretório válido");
                } else {
                    System.out.println("Diretório: " + dir.getAbsolutePath());
                    File[] itens = dir.listFiles();
                    if (itens == null || itens.length == 0) {
                        System.out.println("Não tem nada aqui dentro");
                    } else {
                        for (File item : itens) {
                            if (item.isFile()) {
                                System.out.println(item.getAbsolutePath() + " - " + item.length() + " bytes");
                            }
                        }
                    }
                }
            } else if (opcao == 5) {
                if (!dir.isDirectory()) {
                    System.out.println("Isso não é um diretório válido");
                } else {
                    System.out.print("Nome do arquivo (ex: teste.txt): ");
                    File novo = new File(dir, sc.nextLine());
                    try {
                        if (novo.createNewFile()) {
                            System.out.println("Arquivo criado!");
                        } else {
                            System.out.println("Esse arquivo já existe");
                        }
                    } catch (IOException e) {
                        System.out.println("Não consegui criar o arquivo: " + e.getMessage());
                    }
                }
            } else if (opcao == 6) {
                System.out.println("Falou!");
            } else {
                System.out.println("Opção estranha, tenta de novo");
            }
        }
    }
}