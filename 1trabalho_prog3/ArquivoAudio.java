//Subclasse
public class ArquivoAudio extends ArquivoSuper {    //ganha o atribtuo da Super, agora é obrigada a usar os 3 métodos
    private int segundos; 

    public ArquivoAudio(String nome, int segundos) { //construtor da sub
        super(nome);    //que chama o construtor da super
        this.segundos = segundos;
    }

    public void abrir()  { System.out.println("Abrindo áudio: " + nome); }
    public void fechar() { System.out.println("Fechando áudio: " + nome); }
    public int estimativa() { return segundos * 16000; } // ~16 KB por segundo
}