import java.util.Arrays;

//LETRA A
class letraa implements Comparable<letraa> {
    protected String nome;
    protected double preco;
    protected String codigoBarras;

    public letraa(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Preço: R$" + preco + " Código de barras: " + codigoBarras;
    }

    // LETRA B
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof letraa)) {
            return false;
        }
        letraa outro = (letraa) obj;
        return this.codigoBarras.equals(outro.codigoBarras);
    }

    // Comparação por PREÇO
    @Override
    public int compareTo(letraa outro) {
        return Double.compare(this.preco, outro.preco);
    }
}


// LETRA C
class letrab extends letraa {
    private String autor;

    public letrab(String nome, double preco, String autor, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " Autor: " + autor;
    }
}


// LETRA D
class letrac extends letraa {
    private int numFaixas;

    public letrac(String nome, double preco, int numFaixas, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + " Número de faixas: " + numFaixas;
    }
}


class letrad extends letraa {
    private int duracaoMinutos;

    public letrad(String nome, double preco, int duracaoMinutos, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString() {
        return super.toString() + " Duração: " + duracaoMinutos + " min";
    }
}


// main
class letrae {
    // LETRA C
    public static int buscar(letraa produto, letraa[] produtos) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equals(produto)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        letraa[] produtos = new letraa[5];

        produtos[0] = new letrab("Bíblia", 70.0, "DEUS", "0001");
        produtos[1] = new letrab("As aventuras de Alice", 41.90, "Lewis Carroll", "0002");
        produtos[2] = new letrac("Arirang", 39.90, 14, "0003");
        produtos[3] = new letrad("Say Anything", 29.90, 169, "0004");
        produtos[4] = new letrad("Friends", 59.90, 1320, "0005");

        System.out.println("Produtos da loja:");
        for (letraa p : produtos) {
            System.out.println(p);
        }

        // LETRA D
        letraa produtoOriginal = produtos[0];

        letraa produtoMesmoCodigo = new letrab("Bíblia", 70.0, "DEUS", "0001");

        letraa produtoCodigoDiferente = new letrab("Bíblia", 70.0, "DEUS", "9999");

        System.out.println();
        System.out.println("Buscando com o mesmo código de barras:");
        int posicao1 = buscar(produtoMesmoCodigo, produtos);
        if (posicao1 != -1) {
            System.out.println("Produto encontrado na posição " + posicao1);
        } else {
            System.out.println("Produto não encontrado.");
        }

        System.out.println();
        System.out.println("Buscando com código de barras diferente:");
        int posicao2 = buscar(produtoCodigoDiferente, produtos);
        if (posicao2 != -1) {
            System.out.println("Produto encontrado na posição " + posicao2);
        } else {
            System.out.println("Produto não encontrado.");
        }

        // EXERCÍCIO 9 de verdade!!!!!!!
        Arrays.sort(produtos);

        System.out.println();
        System.out.println("Produtos ordenados:");
        for (letraa p : produtos) {
            System.out.println(p);
        }
    }
}