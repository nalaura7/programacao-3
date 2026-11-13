public class exercicio3 {
    public static double calcularRaiz(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Não existe raiz quadrada real de número negativo.");
        }
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        int[] testes = {0, 16, -4};
        for (int n : testes) {
            try {
                System.out.println("Raiz de " + n + " = " + calcularRaiz(n));
            } catch (IllegalArgumentException e) {
                System.out.println("Erro para " + n + ": " + e.getMessage());
            }
        }
    }
}