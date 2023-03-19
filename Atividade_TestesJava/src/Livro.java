public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private  boolean disponivel;
    private Usuario usuario;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
        this.usuario = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void emprestarPara(Usuario usuario) {
        this.disponivel = false;
        this.usuario = usuario;
    }

    public void devolver() {
        this.disponivel = true;
        this.usuario = null;
    }
}
