class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void mostrarInformacoes() {
        System.out.println("nome: " + getNome());
        System.out.println("idade: " + getIdade());
        System.out.println("matrícula: " + getMatricula());
    }
}

public class exercicio3 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Taina", 67, "67");
        aluno.mostrarInformacoes();

        aluno.setNome("Isabela"); // testando os set
        aluno.setIdade(67);
        aluno.setMatricula("67");

        aluno.mostrarInformacoes();

        System.out.println("acessando com get:");  // testando os get 
        System.out.println("getNome() " + aluno.getNome());
        System.out.println("getIdade() " + aluno.getIdade());
        System.out.println("getMatricula() " + aluno.getMatricula());
    }
}