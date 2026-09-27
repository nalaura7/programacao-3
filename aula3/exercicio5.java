class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
    public double somar(double a, double b) {
        return a + b;
    }
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}

public class exercicio5 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.somar(5, 10);
        double resultado2 = calc.somar(3.5, 2.7);
        int resultado3 = calc.somar(1, 2, 3);

        System.out.println("Soma de doubles (3.5 + 2.7): " + resultado2);
        System.out.println("Soma de inteiros (5 + 10): " + resultado1);
        System.out.println("Soma de três inteiros (1 + 2 + 3): " + resultado3);
    }
}