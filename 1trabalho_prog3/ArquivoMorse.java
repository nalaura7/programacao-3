//Subclasse
public class ArquivoMorse extends ArquivoSuper {    //ganha o atribtuo da Super, agora é obrigada a usar os 3 métodos
    private int simbolos;

    public ArquivoMorse(String nome, int simbolos) {    //construtor da sub
        super(nome); //que chama o construtor da super
        this.simbolos = simbolos;
    }

    public void abrir()  { System.out.println("Abrindo arquivo Morse: " + nome); }
    public void fechar() { System.out.println("Fechando arquivo Morse: " + nome); }
    public int estimativa() { return simbolos; } // 1 byte por símbolo
}