//Subclasse
public class ArquivoTexto extends ArquivoSuper {   //ganha o atribtuo da Super, agora é obrigada a usar os 3 métodos
    private int caracteres;

    public ArquivoTexto(String nome, int caracteres) {  //construtor da sub
        super(nome);    //que chama o construtor da super
        this.caracteres = caracteres;
    }

    public void abrir()  { System.out.println("Abrindo arquivo de texto: " + nome); }
    public void fechar() { System.out.println("Fechando arquivo de texto: " + nome); }
    public int estimativa() { return caracteres * 2; } // ~2 bytes por caractere
}