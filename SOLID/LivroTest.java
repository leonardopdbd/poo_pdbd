import org.junit.Assert;
import org.junit.Test;

public class LivroTest {
    Autor autor = new Autor("Jess", 35, "Brasileira");
    Livro livro1 = new Livro("Java Basico", autor, true);
    Livro livro2 = new Livro("Java Avançado", autor, false);

    @Test
    public void testGetTitulo() {
        Assert.assertEquals("Java Basico", livro1.getTitulo());
        Assert.assertEquals("Java Avançado", livro2.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        livro1.setTitulo("Novo Titulo");
        Assert.assertEquals("Novo Titulo", livro1.getTitulo());
    }

    @Test
    public void testIsDisponivel() {
        Assert.assertTrue(livro1.isDisponivel());
        Assert.assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testSetDisponivel() {
        livro1.setDisponivel(false);
        Assert.assertFalse(livro1.isDisponivel());
    }

    @Test
    public void testGetAutor() {
        Assert.assertEquals(autor, livro1.getAutor());
    }
}
