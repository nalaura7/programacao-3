public class exercicio2 {
    public static void main(String[] args) {

        boolean ingresso_comprado = true;
        boolean show_cancelado = false;
        boolean banda_confirmada = true;

        System.out.println("comprei o ingresso; " + ingresso_comprado);
        System.out.println("o show foi cancelado? " + show_cancelado);
        System.out.println("banda confirmou:" + banda_confirmada);

        if (ingresso_comprado) {
            System.out.println("já garantiu o ingresso");
        } else {
            System.out.println("falta comprar o ingresso amore");
        }

        if (show_cancelado) {
            System.out.println("O show foi cancelado.");
        } else {
            System.out.println("show confirmado!");
        }

        if (banda_confirmada) {
            System.out.println("A banda confirmou também");
        } else {
            System.out.println("A banda ainda não confirmou presença");
        }
    }
}