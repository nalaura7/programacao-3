public class exercicio4 {
    public static void main(String[] args) {
        String frase = " hoje é domingo pé de caximbo ";

        frase = frase.trim();
        System.out.println("frase: " + frase);

        System.out.println("qtd de caracteres: " + frase.length());

        System.out.println("maiúsculas: " + frase.toUpperCase());

        String substituida = frase.replace("caximbo", "caximbo");
        System.out.println("Com substituição: " + substituida);

        System.out.println("Caractere no índice 5: " + frase.charAt(5));
    }
}