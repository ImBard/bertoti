import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(String email) {
        for (Usuario usuario:usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }

    public String emprestarLivro(Livro livro, Usuario usuario) {
        if (livro.isDisponivel()) {
            livro.emprestarPara(usuario);
            return "Ok";
        } else {
            return "Indisponivel";
        }
    }

    public void devolverLivro(Livro livro) {
        if(!livro.isDisponivel()) {
            livro.devolver();
        }
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
