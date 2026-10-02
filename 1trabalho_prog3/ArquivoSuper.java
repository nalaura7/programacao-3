// Superclasse abstrata
public abstract class ArquivoSuper {
    protected String nome;

    public ArquivoSuper(String nome) { 
        this.nome = nome; //this.nome: atributo da classe
    }                     // nome: é o parâmetro do construtor

    public String getNome() {
        return nome;
    }
//métodos abstrados
    public abstract void abrir();
    public abstract void fechar();
    public abstract int estimativa(); // tamanho estimado em bytes
}