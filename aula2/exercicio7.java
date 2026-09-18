import java.util.ArrayList;
import java.util.Iterator;

public class exercicio7 {

    static boolean validarNome(String nome) {
        if (nome == null) {
            return false;
        }
        nome = nome.trim();
        return !nome.isEmpty() && nome.length() >= 3;
    }

    static boolean buscarNome(ArrayList<String> lista, String busca) {
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            String nome = it.next();
            if (nome.equalsIgnoreCase(busca)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();

        String[] candidatos = {"Ana", "Laura", "Tainá", "Isbaelaa"};

        for (String nome : candidatos) {
            if (validarNome(nome)) {
                usuarios.add(nome);
            }
        }

        System.out.println("Usuários cadastrados: " + usuarios);

        String busca = "ana";
        boolean encontrado = buscarNome(usuarios, busca);

        if (encontrado) {
            System.out.println("Usuário \"" + busca + "\" encontrado na lista.");
        } else {
            System.out.println("Usuário \"" + busca + "\" não encontrado na lista.");
        }
    }
}