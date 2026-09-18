import java.util.ArrayList;
import java.util.Iterator;

public class exercicio3 {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Ana");
        alunos.add("Laura");
        alunos.add("Tainá");
        alunos.add("Isabela");
        alunos.add("Kim Taehyung");

        System.out.println("lista original:");
        Iterator<String> it = alunos.iterator();
        while (it.hasNext()) {
            String nome = it.next();
            System.out.println(nome);
        }

        it = alunos.iterator();
        while (it.hasNext()) {
            String nome = it.next();
            if (nome.equals("Tainá")) {
                it.remove();
            }
        }

        System.out.println("\nLista atualizada:");
        for (String nome : alunos) {
            System.out.println(nome);
        }
    }
}