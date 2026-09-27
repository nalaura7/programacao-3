// INTERFACES
interface Corredor {
    void correr();
}

interface Nadador {
    void nadar();
}

interface Ciclista {
    void pedalar();
}

// TRIATLETA
class Triatleta implements Corredor, Nadador, Ciclista {
    private String nome;

    public Triatleta(String nome) {
        this.nome = nome;
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }

    @Override
    public void pedalar() {
        System.out.println(nome + " está pedalando.");
    }

    public void mostrarModalidades() {
        System.out.println(nome + " pratica: corrida, natação e ciclismo.");
    }
}

// MAIN
class exercicio3 {
    public static void main(String[] args) {
        Triatleta atleta1 = new Triatleta("Beca");
        Triatleta atleta2 = new Triatleta("Laurinha");

        System.out.println("Atleta1:");
        atleta1.mostrarModalidades();
        atleta1.correr();
        atleta1.nadar();
        atleta1.pedalar();

        System.out.println();
        System.out.println("Atleta2:");
        atleta2.mostrarModalidades();
        atleta2.correr();
        atleta2.nadar();
        atleta2.pedalar();
    }
}