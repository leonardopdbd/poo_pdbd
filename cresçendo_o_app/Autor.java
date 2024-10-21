public class Autor extends Pessoa {
    private String genero;
    private boolean isUsuario; // Campo que indica se o autor é um usuário

    // Construtor atualizado
    public Autor(String nome, int idade, String genero, boolean isUsuario) {
        super(nome, idade);
        this.genero = genero;
        this.isUsuario = isUsuario;
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
