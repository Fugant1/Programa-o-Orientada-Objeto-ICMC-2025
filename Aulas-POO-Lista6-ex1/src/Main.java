public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(new Produto(1, "Mouse Gamer", 120.0, 15));
        estoque.adicionarProduto(new Produto(2, "Teclado Mecânico", 250.0, 10));
        estoque.adicionarProduto(new Produto(3, "Monitor LED", 900.0, 5));
        Produto produtoBuscado = estoque.buscarProduto("Mouse Gamer");
        produtoBuscado.vender(3);
        produtoBuscado.repor(2);
        System.out.println(estoque);
    }
}