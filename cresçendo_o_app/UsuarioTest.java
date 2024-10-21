import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {
    Usuario usuario = new Usuario("Gabriel", 21);

    @Test
    public void testGetNome() {
        Assert.assertEquals("Gabriel", usuario.getNome());
    }

    @Test
    public void testSetNome() {
        usuario.setNome("Novo Nome");
        Assert.assertEquals("Novo Nome", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        Assert.assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSetIdade() {
        usuario.setIdade(30);
        Assert.assertEquals(30, usuario.getIdade());
    }
}
