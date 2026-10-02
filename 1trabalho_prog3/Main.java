import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Lista polimórfica
        ArrayList<ArquivoSuper> arquivos = new ArrayList<>(); 
        //guarda objetos do tipo ArquvioSuper, e 
        //como todas as subcasses são um ArquviSuper, então a lista aceita qualquer uma delas

        //varios objetos de um tipo diferente na mesma lista VAI TOMANDO
        arquivos.add(new ArquivoTexto("relatorio.txt", 1000));
        arquivos.add(new ArquivoImagem("foto.png", 800, 600));
        arquivos.add(new ArquivoAudio("musica.mp3", 180));
        arquivos.add(new ArquivoBytecode("Programa.class", 500));
        arquivos.add(new ArquivoMorse("sos.morse", 20));
        arquivos.add(new ArquivoASCII("dados.asc", 300));
        arquivos.add(new ArquivoNotacaoAlgebricaXadrez("partida.pgn", 40));
        arquivos.add(new ArquivoJson("ISSO AQUI É O JSON AMORE", 67));

        System.out.println("ABRINDO");
        for (ArquivoSuper a : arquivos) {
            a.abrir();
        }

        System.out.println("\n ESTIMATIVAS ");
        for (ArquivoSuper a : arquivos) {
            System.out.println(a.getNome() + ": " + a.estimativa() + " bytes");
        }

        System.out.println("\n FECHANDO");
        for (ArquivoSuper a : arquivos) {
            a.fechar();
        }
    }
}