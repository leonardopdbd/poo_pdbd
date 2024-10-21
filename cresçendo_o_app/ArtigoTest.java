import org.junit.Assert;
import org.junit.Test;

public class ArtigoTest {
    Autor autor = new Autor("Jessica Felix", 30, "Tecnologia", true);
    Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);

    @Test
    public void testGetTitulo() {
        Assert.assertEquals("Entendendo Compiladores", artigo.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        artigo.setTitulo("Novo Título");
        Assert.assertEquals("Novo Título", artigo.getTitulo());
    }

    @Test
    public void testGetAutor() {
        Assert.assertEquals(autor, artigo.getAutor());
    }

    @Test
    public void testSetAutor() {
        Autor novoAutor = new Autor("Ada Lovelace", 35, "Matemática", false);
        artigo.setAutor(novoAutor);
        Assert.assertEquals(novoAutor, artigo.getAutor());
    }

    @Test
    public void testIsPublicado() {
        Assert.assertTrue(artigo.isPublicado());
    }

    @Test
    public void testSetPublicado() {
        artigo.setPublicado(false);
        Assert.assertFalse(artigo.isPublicado());
    }
}
