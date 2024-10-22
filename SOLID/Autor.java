public class Autor extends Pessoa {
    private String genero;
    private boolean isUsuario;
    private PublicavelInterface estrategiaPublicacao;  // Referência para a estratégia

    public Autor(String nome, int idade, String genero, boolean isUsuario) {
        super(nome, idade);
        this.genero = genero;
        this.isUsuario = isUsuario;
    }

    // Método para definir a estratégia de publicação
    public void setEstrategiaPublicacao(PublicavelInterface estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    // Método para realizar a publicação usando a estratégia
    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();  // Delegando a responsabilidade para a estratégia
        } else {
            System.out.println("Nenhuma estratégia de publicação foi definida.");
        }
    }

    // Getters e Setters
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isUsuario() {
        return isUsuario;
    }

    public void setUsuario(boolean isUsuario) {
        this.isUsuario = isUsuario;
    }
}
