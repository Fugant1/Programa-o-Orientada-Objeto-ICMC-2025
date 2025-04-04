import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        List<Metodopagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new Cartaodecredito("1234-5678-9876-5432", 1000));
        pagamentos.add(new Pix("usuario@pix.com"));
        pagamentos.add(new Boletobancario("23793", "2025-04-10"));
        double valorCompra = 300;
        double total = 0;
        for (Metodopagamento metodo : pagamentos) {
            metodo.realizarPagamento(valorCompra);
            total += metodo.getTaxaPagamento();
        }
        System.out.printf("Custo total com taxas: R$ %.2f%n", total);
    }
}