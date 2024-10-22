import org.junit.Assert;
import org.junit.Test;

public class AutorTest {
    Autor autor = new Autor("Alan Turing", 41, "Inglês", false);

    @Test
    public void testGetNome() {
        Assert.assertEquals("Alan Turing", autor.getNome());
    }

    @Test
    public void testSetNome() {
        autor.setNome("Ada Lovelace");
        Assert.assertEquals("Ada Lovelace", autor.getNome());
    }

    @Test
    public void testGetGenero() {
        Assert.assertEquals("Inglês", autor.getGenero());
    }

    @Test
    public void testSetGenero() {
        autor.setGenero("Científico");
        Assert.assertEquals("Científico", autor.getGenero());
    }

    @Test
    public void testIsUsuario() {
        Assert.assertFalse(autor.isUsuario());
    }

    @Test
    public void testSetUsuario() {
        autor.setUsuario(true);
        Assert.assertTrue(autor.isUsuario());
    }
}


