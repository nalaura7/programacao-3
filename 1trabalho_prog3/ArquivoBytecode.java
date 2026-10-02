//Subclasse
public class ArquivoBytecode extends ArquivoSuper {     //ganha o atribtuo da Super, agora é obrigada a usar os 3 métodos
    private int instrucoes;

    public ArquivoBytecode(String nome, int instrucoes) { //construtor da sub 
        super(nome); //que chama o construtor da super
        this.instrucoes = instrucoes;
    }

    public void abrir()  { System.out.println("Abrindo bytecode: " + nome); }
    public void fechar() { System.out.println("Fechando bytecode: " + nome); }
    public int estimativa() { return instrucoes * 2; } // ~2 bytes por instrução
}