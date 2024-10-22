import org.junit.Assert;
import org.junit.Test;

public class AutorStrategyTest {
    @Test
    public void testPublicacaoDeLivro() {
        // Criar um autor
        Autor autor = new Autor("Jessica Felix", 30, "Tecnologia", true);

        // Definir a estratégia de publicação como Livro
        PublicavelInterface estrategiaLivro = new EstrategiaPublicacaoLivro();
        autor.setEstrategiaPublicacao(estrategiaLivro);

        // Validar se a estratégia está funcionando (Impressão do console pode ser verificada manualmente)
        autor.publicar();  // Deve imprimir "Publicando um livro..."
    }

    @Test
    public void testPublicacaoDeArtigo() {
        // Criar um autor
        Autor autor = new Autor("Jessica Felix", 30, "Tecnologia", true);

        // Definir a estratégia de publicação como Artigo
        PublicavelInterface estrategiaArtigo = new EstrategiaPublicacaoArtigo();
        autor.setEstrategiaPublicacao(estrategiaArtigo);

        // Validar se a estratégia está funcionando (Impressão do console pode ser verificada manualmente)
        autor.publicar();  // Deve imprimir "Publicando um artigo..."
    }

    @Test
    public void testSemEstrategiaDePublicacao() {
        // Criar um autor
        Autor autor = new Autor("Jessica Felix", 30, "Tecnologia", true);

        // Não definir nenhuma estratégia
        autor.publicar();  // Deve imprimir "Nenhuma estratégia de publicação foi definida."
    }
}
