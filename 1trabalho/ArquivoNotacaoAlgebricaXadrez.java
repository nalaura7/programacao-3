//Subclasse
public class ArquivoNotacaoAlgebricaXadrez extends ArquivoSuper {   //ganha o atribtuo da Super, agora é obrigada a usar os 3 métodos
    private int jogadas;

    public ArquivoNotacaoAlgebricaXadrez(String nome, int jogadas) {    //construtor da sub
        super(nome);    //que chama o construtor da super
        this.jogadas = jogadas;
    }

    public void abrir()  { System.out.println("Abrindo partida de xadrez: " + nome); }
    public void fechar() { System.out.println("Fechando partida de xadrez: " + nome); }
    public int estimativa() { return jogadas * 6; } // ~6 bytes por jogada

}