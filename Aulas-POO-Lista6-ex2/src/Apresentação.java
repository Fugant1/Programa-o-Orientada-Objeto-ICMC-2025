public class Apresentação extends Documento{
    private int numeroSlides;
    public Apresentação(String nome, String autor, int tamanho, int numeroSlides) {
        super(nome, autor, tamanho);
        this.numeroSlides = numeroSlides;
    }
    public int numeroSlides() {
        return this.numeroSlides;
    }
    @Override
    public boolean abrir() {
        System.out.println("Apresetação aberta");
        return true;
    }
    @Override
    public void formatar() {
        System.out.println("Apresentação formatada");
    }
}
