package avpob;

public class ItemGerencia {
	
    private int produtoId;
    private int quantidade;
    private double preco;

    public ItemGerencia(int produtoId, int quantidade, double preco) {
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getPreco() {
        return (int) preco;
    }
    public void setPreco (double preco) {
    	this.preco = preco;
    }
    public int getProdutoId() {
        return produtoId;
    }
    public void setProdutoId (int produtoId){
    	this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}