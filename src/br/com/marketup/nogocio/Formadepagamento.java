package br.com.marketup.nogocio;

/**
 *
 * @author rafae
 */
public class Formadepagamento {
    
    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return this.getDescricao();
    }  
}
