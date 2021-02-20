
package br.com.marketup.nogocio;

/**
 *
 * @author rafae
 */
public class Estoque {
    
    private Integer id;
    private Produto produto;
    private Integer qtde;

    public Integer getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }   

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }
   
    //Retorna a quantidade em estoque 
    public Integer toInt(){
        return this.getQtde();
    }
    
}
