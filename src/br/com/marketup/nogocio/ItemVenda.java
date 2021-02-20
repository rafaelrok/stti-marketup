
package br.com.marketup.nogocio;

/**
 *
 * @author rafae
 */
public class ItemVenda {
    
    private int id;
    private Venda venda;
    private Produto produto;
    private int qtd;
    private Double preco;
    private Double subtotal;
    private Double descitem;
    private Double acrescitem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDescitem() {
        return descitem;
    }

    public void setDescitem(Double descitem) {
        this.descitem = descitem;
    }

    public Double getAcrescitem() {
        return acrescitem;
    }

    public void setAcrescitem(Double acrescitem) {
        this.acrescitem = acrescitem;
    }
    
    
    
}
