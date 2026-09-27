//ENUM 
enum NivelAcesso {
    BASICO,
    INTERMEDIARIO,
    ADMIN
}

// USUARIO
class Usuario {
    private String nome;
    private NivelAcesso nivelAcesso;

    public Usuario(String nome, NivelAcesso nivelAcesso) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }

    public boolean verificarPermissao(String recurso) {
        switch (nivelAcesso) {
            case BASICO:
                return recurso.equals("CONSULTAR");

            case INTERMEDIARIO:
                return recurso.equals("CONSULTAR") || recurso.equals("EDITAR");

            case ADMIN:
                return true; // acessa tudo

            default:
                return false;
        }
    }

    public String getNome() {
        return nome;
    }
}

// MAIN
class exercicio6 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana", NivelAcesso.BASICO);
        Usuario usuario2 = new Usuario("Bruno", NivelAcesso.INTERMEDIARIO);
        Usuario usuario3 = new Usuario("Carla", NivelAcesso.ADMIN);

        String[] recursos = {"CONSULTAR", "EDITAR", "GERENCIAR_USUARIOS"};
        Usuario[] usuarios = {usuario1, usuario2, usuario3};

        for (Usuario u : usuarios) {
            System.out.println("--- " + u.getNome() + " ---");
            for (String recurso : recursos) {
                boolean permitido = u.verificarPermissao(recurso);
                System.out.println(recurso + ": " + (permitido ? "PERMITIDO" : "NEGADO"));
            }
            System.out.println();
        }
    }
}