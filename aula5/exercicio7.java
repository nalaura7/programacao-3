import java.util.Scanner;

public class exercicio7 {
    static int aceitos = 0;
    static int rejeitados = 0;

    static int validarIdade(String texto) throws IllegalArgumentException {
        int idade = Integer.parseInt(texto);
        if (idade < 0) {
            throw new IllegalArgumentException("sua idade não pode ser negativa, tá amore?");
        }
        return idade;
    }

    static double validarNota(String texto) throws IllegalArgumentException {
        double nota = Double.parseDouble(texto);
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        return nota;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            String textoIdade = sc.nextLine();
            System.out.print("Nota: ");
            String textoNota = sc.nextLine();

            try {
                int idade = validarIdade(textoIdade);
                double nota = validarNota(textoNota);
                System.out.println("Cadastro ACEITO: " + nome + ", " + idade + " anos, nota " + nota);
                aceitos++;
            } catch (NumberFormatException e) {
                System.out.println("Cadastro REJEITADO: idade e nota devem ser números válidos.");
                rejeitados++;
            } catch (IllegalArgumentException e) {
                System.out.println("Cadastro REJEITADO: " + e.getMessage());
                rejeitados++;
            } finally {
                System.out.println("Fim do processamento do cadastro.");
            }

            System.out.print("Deseja cadastrar outro aluno? (s/n): ");
            continuar = sc.nextLine();
        }

        System.out.println("Cadastros aceitos: " + aceitos);
        System.out.println("Cadastros rejeitados: " + rejeitados);
    }
}