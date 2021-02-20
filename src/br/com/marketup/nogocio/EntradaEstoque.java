
package br.com.marketup.nogocio;

/**
 *
 * @author rafae
 */
public class EntradaEstoque {
    
    private Integer id;
    private Produto produto;
    private Estoque estoque;
    private String data_entrada;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }
    
    
}
