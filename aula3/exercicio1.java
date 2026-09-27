class Livro {
    String titulo;
    String autor;

    Livro() {
        titulo = "sem título";
        autor = "autor desconhecido";
    }
    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}

public class exercicio1{
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Bíblia", "DEUS");

        System.out.println("título: " + livro1.titulo + " e autor: " + livro1.autor);
        System.out.println("autor: " + livro2.autor + "e yítulo: " + livro2.titulo);
    }
}