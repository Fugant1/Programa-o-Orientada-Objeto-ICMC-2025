public class Pix implements Metodopagamento {
    private String chavePix;
    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }
    @Override
    public boolean realizarPagamento(Double valor) {
        System.out.println("Pagamento Realizado com sucesso");
        return true;
    }
    @Override
    public double getTaxaPagamento() {
        return 0;
    }
}
