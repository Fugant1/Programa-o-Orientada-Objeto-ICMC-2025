public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public boolean vender(int qtd) {
        if(this.quantidade <= 0) {
            System.out.println("Produto sem estoque");
            return false;
        }
        this.quantidade -= qtd;
        System.out.println("Produto Vendido\n"
        + "Quantidade atual: " + this.quantidade);
        return true;
    }
    public void repor(int qtd) {
        this.quantidade += qtd;
        System.out.println("Produto reposto no estoque\n" +
                "Estoque atual: " + this.quantidade);
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
