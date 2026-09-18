class Produto {
    int id;
    String nome;
    double preco;

    void aplicarDesconto(double porcentagem) {
        preco = preco - (preco * porcentagem / 100);
    }

    void exibirDetalhes() {
        System.out.printf("ID: %d, nome: %s, preço: R$ %.2f%n", id, nome, preco);
    }
}

public class exercicio5 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.id = 1;
        produto1.nome = "Notebook";
        produto1.preco = 3000.00;

        Produto produto2 = new Produto();
        produto2.id = 2;
        produto2.nome = "Mouse";
        produto2.preco = 100.00;

        produto1.aplicarDesconto(10);
        produto2.aplicarDesconto(15);

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
    }
}