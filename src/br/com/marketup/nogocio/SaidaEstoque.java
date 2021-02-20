
package br.com.marketup.nogocio;

/**
 *
 * @author rafae
 */
public class SaidaEstoque {
    
    private Integer id;
    private Estoque estoque;
    private Produto produto;
    private String data_saida;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getData_saida() {
        return data_saida;
    }

    public void setData_saida(String data_saida) {
        this.data_saida = data_saida;
    }
    
    
    
}
