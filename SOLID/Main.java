import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando autor
        Autor autor = new Autor("Jessica Felix", 30, "Tecnologia");
        
        // Criando livro
        Livro livro = new Livro("Java for Beginners", autor);
        
        // Criando usuário
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        
        // Criando datas de retirada e devolução
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        
        // Criando um novo empréstimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        // Imprimindo os detalhes do empréstimo
        System.out.println("O livro não está disponível");
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
        System.out.println("Genero: " + emprestimo.getLivro().getAutor().getGenero());
        System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
        System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
