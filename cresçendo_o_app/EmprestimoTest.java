import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class EmprestimoTest {
    Date dataRetirada = new Date();
    Date dataDevolucao = new Date();
    Autor autor = new Autor("Alan Turing", 41, "Inglês");
    Livro livro = new Livro("Java Basics", autor, true);
    Usuario usuario = new Usuario("Gabriel", 21);
    Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

    @Test
    public void testGetLivro() {
        Assert.assertEquals(livro, emprestimo.getLivro());
    }

    @Test
    public void testGetUsuario() {
        Assert.assertEquals(usuario, emprestimo.getUsuario());
    }

    @Test
    public void testGetDataRetirada() {
        Assert.assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }

    @Test
    public void testGetDataDevolucao() {
        Assert.assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }
}
