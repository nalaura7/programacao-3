//Subclasse
public class ArquivoImagem extends ArquivoSuper { //ganha o atribtuo da Super, agora é obrigada a usar os 3 métodos
    private int largura, altura;

    public ArquivoImagem(String nome, int largura, int altura) {    //construtor da sub
        super(nome);    //que chama o construtor da super
        this.largura = largura;
        this.altura = altura;
    }

    public void abrir()  { System.out.println("Abrindo imagem: " + nome); }
    public void fechar() { System.out.println("Fechando imagem: " + nome); }
    public int estimativa() { return largura * altura * 3; } // 3 bytes por pixel (RGB)
}