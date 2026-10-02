//Subclasse
public class ArquivoASCII extends ArquivoSuper {    //ganha o atribtuo da Super, agora é obrigada a usar os 3 métodos 
    private int caracteres;

    public ArquivoASCII(String nome, int caracteres) {   //construtor da sub
        super(nome); //que chama o construtor da super                      
        this.caracteres = caracteres;  
    }

    public void abrir()  { System.out.println("Abrindo arquivo ASCII: " + nome); }
    public void fechar() { System.out.println("Fechando arquivo ASCII: " + nome); }
    public int estimativa() { return caracteres; } // 1 byte por caractere
}