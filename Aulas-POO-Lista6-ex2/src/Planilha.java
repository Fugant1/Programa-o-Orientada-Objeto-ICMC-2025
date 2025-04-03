public class Planilha extends Documento{
    private int numeroCelulas;
    public Planilha(String nome, String autor, int tamanho, int numeroCelulas) {
        super(nome, autor, tamanho);
        this.numeroCelulas = numeroCelulas;
    }
    public int getnumeroCelulas() {
        return this.numeroCelulas;
    }
    @Override
    public boolean abrir() {
        System.out.println("Planilha aberta");
        return true;
    }
    @Override
    public void formatar() {
        System.out.println("Planilha formatada");
    }
}
