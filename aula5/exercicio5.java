public class exercicio5 {

    public static void validarIdade(int idade) throws Exception {
        if (idade < 0) {
            throw new Exception("sua idade não pode ser negativa, tá amore?");
        }
        System.out.println("falei que não podia negativo, ó, deu inválido: " + idade);
    }

    public static void testar(int idade) {
        try {
            validarIdade(idade);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        testar(20);
        testar(-5);
        testar(0);
    }
}