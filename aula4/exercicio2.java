import java.util.Scanner;

//CLASSE ABSTRATA
abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}

// FUNCIONARIO CLT
class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.10);
    }
}

// O OUTRO FUNCIONARIO (COMISSIONADO0)
class FuncionarioComissionado extends Funcionario {
    private double comissao;

    public FuncionarioComissionado(String nome, String matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}

// MAIN
class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a comissão do funcionário comissionado: R$");
        double comissao = scanner.nextDouble();

        // Referências do tipo Funcionario (classe abstrata)
        Funcionario f1 = new FuncionarioCLT("Ana", "001", 2000.0);
        Funcionario f2 = new FuncionarioComissionado("Laura", "002", 1500.0, comissao);

        System.out.println();
        System.out.println(f1.getNome() + " (CLT) - Salário: R$" + f1.calcularSalario());
        System.out.println(f2.getNome() + " (Comissionado) - Salário: R$" + f2.calcularSalario());
    }
}