// ENUM
enum NivelAtleta {
    NOVATO,
    AMADOR,
    PROFISSIONAL
}

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


// CLASSE ABSTRATA
abstract class Atleta {
    protected String nome;
    protected int idade;
    protected NivelAtleta nivel;

    public Atleta(String nome, int idade, NivelAtleta nivel) {
        this.nome = nome;
        this.idade = idade;
        this.nivel = nivel;
    }

    public abstract void exibirModalidades();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public NivelAtleta getNivel() {
        return nivel;
    }
}

//  CORREDOR PROFISSIONAL
class CorredorProfissional extends Atleta implements Corredor {

    public CorredorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println(nome + " pratica: corrida.");
    }
}


// NADADOR POFISSIONAL
class NadadorProfissional extends Atleta implements Nadador {

    public NadadorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println(nome + " pratica: natação.");
    }
}

// TRIATLETA
class Triatleta extends Atleta implements Corredor, Nadador, Ciclista {

    public Triatleta(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
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

    @Override
    public void exibirModalidades() {
        System.out.println(nome + " pratica: corrida, natação e ciclismo.");
    }
}

//MAIN
class exercicio7 {
    public static void main(String[] args) {
        Atleta[] atletas = new Atleta[4];
        atletas[0] = new CorredorProfissional("Ana", 25, NivelAtleta.PROFISSIONAL);
        atletas[1] = new NadadorProfissional("Laurinha", 22, NivelAtleta.AMADOR);
        atletas[2] = new Triatleta("Isa", 30, NivelAtleta.PROFISSIONAL);
        atletas[3] = new CorredorProfissional("Taina", 19, NivelAtleta.NOVATO);

        System.out.println("Infos dos atletas:");
        for (Atleta a : atletas) {
            System.out.println("Nome: " + a.getNome() + " Idade: " + a.getIdade() + "  Nível: " + a.getNivel());
            a.exibirModalidades();
        }

        System.out.println("usando a Isa (Triatleta) através das interfaces:");
        Atleta isa = atletas[2];

        if (isa instanceof Corredor) {
            ((Corredor) isa).correr();
        }
        if (isa instanceof Nadador) {
            ((Nadador) isa).nadar();
        }
        if (isa instanceof Ciclista) {
            ((Ciclista) isa).pedalar();
        }
    }
}