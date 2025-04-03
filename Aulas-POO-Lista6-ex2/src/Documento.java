public abstract class Documento {
    protected String titulo;
    protected String autor;
    protected int tamanho;
    public Documento(String titulo, String autor, int tamanho) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanho = tamanho;
    }
    public abstract boolean abrir();
    public abstract void formatar();
    public String toString() {
        return titulo;
    }
 }
