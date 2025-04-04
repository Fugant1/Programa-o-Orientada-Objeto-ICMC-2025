public class Cartaodecredito implements Metodopagamento {
    private String limite;
    private int numeroCartao;
    public Cartaodecredito(String limite, int numeroCartao) {
        this.limite = limite;
        this.numeroCartao = numeroCartao;
    }
    @Override
    public boolean realizarPagamento(Double valor) {
        return true;
    }
    @Override
    public double getTaxaPagamento() {
        return 0.03;
    }
}