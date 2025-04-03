public class Estoque{
    private Produto[] produtos;
    private int topo;
    public Estoque() {
        this.produtos = new Produto[100];
        this.topo = 0;
    }
    public void adicionarProduto(Produto produto) {
        this.produtos[this.topo] = produto;
        this.topo++;
    }
    public boolean removerProduto(String nome) {
        Produto prod = this.buscarProduto(nome);
        if(prod == null) {
            return false;
        }
        int posicaoProd = 0;
        for(int i = 0; i <= this.topo; i++) {
            if(this.produtos[i] == prod) {
                posicaoProd = i;
            }
        }
        for(int i = posicaoProd; i < this.topo - 1; i++) {
            this.produtos[i] = this.produtos[i + 1];
        }
        this.produtos[topo - 1] = null;
        this.topo--;
        return true;
    }
    public Produto buscarProduto(String nome) {
        for(int i = 0; i < this.topo; i++) {
            if(this.produtos[i].getNome().equals(nome)) {
                return this.produtos[i];
            }
        }
        return null;
    }
    @Override
    public String toString() {
        String retorno = "";
        for(int i = 0; i < this.topo; i++) {
            retorno += this.produtos[i].toString();
        }
        return retorno;
    }
}
