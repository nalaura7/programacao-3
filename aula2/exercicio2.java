class contar {
    static int totalObjetos = 0;

    contar() {
        totalObjetos++;
    }

    static void mostrarTotal() {
        System.out.println("numero de objetos criados: " + totalObjetos);
    }
}

public class exercicio2 {
    public static void main(String[] args) {
        contar c1 = new contar();
        contar c2 = new contar();
        contar c3 = new contar();

        contar.mostrarTotal();
    }
}