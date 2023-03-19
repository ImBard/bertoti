import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;



public class BibliotecaTest {
    @Test
    public void bibliotecaTest() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.cadastrarLivro(new Livro("Clean Code", "Marck", 2004));
        biblioteca.cadastrarLivro(new Livro("Eloquent JS", "Lil Renatinho", 1998));
        assertEquals(biblioteca.buscarLivro("Clean Code").getAutor(), "Marck");
        assertEquals(biblioteca.buscarLivro("Eloquent JS").getAutor(), "Lil Renatinho");

        biblioteca.cadastrarUsuario(new Usuario("Talison", 22, "email@gmail.com"));
        assertEquals(biblioteca.buscarUsuario("email@gmail.com").getNome(), "Talison");

        assertTrue(biblioteca.buscarLivro("Clean Code").isDisponivel());
        biblioteca.emprestarLivro(biblioteca.buscarLivro("Clean Code"), biblioteca.buscarUsuario("email@gmail.com"));
        assertFalse(biblioteca.buscarLivro("Clean Code").isDisponivel(), String.valueOf(false));
        assertEquals(biblioteca.buscarLivro("Clean Code").getUsuario().getNome(),"Talison");
        biblioteca.devolverLivro(biblioteca.buscarLivro("Clean Code"));
        assertTrue(biblioteca.buscarLivro("Clean Code").isDisponivel());

        assertTrue(biblioteca.buscarLivro("Eloquent JS").isDisponivel());

        assertEquals(biblioteca.buscarLivro("Eloquent JS").getAno(), 1998);


    }
}
