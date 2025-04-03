public class Texto extends Documento {
    private int numeroPalavras;
    public Texto(String nome, String autor, int tamanho, int numeroPalavras) {
        super(nome, autor, tamanho);
        this.numeroPalavras = numeroPalavras;
    }
    public int getNumeroPalavras() {
        return this.numeroPalavras;
    }
    @Override
    public boolean abrir() {
        System.out.println("Texto aberto");
        return true;
    }
    @Override
    public void formatar() {
        System.out.println("Texto formatado");
    }
}
