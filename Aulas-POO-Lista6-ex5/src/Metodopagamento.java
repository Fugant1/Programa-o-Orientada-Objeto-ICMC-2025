public interface Metodopagamento {
    boolean realizarPagamento(Double valor);
    double getTaxaPagamento();
}