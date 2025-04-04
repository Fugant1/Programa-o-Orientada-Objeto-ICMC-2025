public class Boletobancario implements Metodopagamento {
    private String codigoBarras;
    private String dataVencimento;
    public Boletobancario(String codigoBarras, String dataVencimento) {
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }
    @Override
    public boolean realizarPagamento(Double valor) {
        System.out.println("Pagamento Realizado com sucesso");
        return true;
    }
    @Override
    public double getTaxaPagamento() {
        return 0.1;
    }
}