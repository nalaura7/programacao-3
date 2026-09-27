class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade); 
        this.matricula = matricula;
    }
    public void mostrarInformacoes() {
        System.out.println("matrícula: " + matricula);
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }
}
public class exercicio2 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Tainá", 67, "676767");
        aluno.mostrarInformacoes();
    }
}