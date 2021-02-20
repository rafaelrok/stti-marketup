
package br.com.marketup.nogocio;

/**
 *
 * @author rafae
 */
public class Produto {
    
    private Integer id;
    private String status;
    private String descricao;
    private Double precocusto;
    private Double precovenda;
    private int qtdestoque;
    private Estoque estoque;
    private Fornecedor fornecedor;
    private String grupoproduto;
    private String observacao;
    private String unidadetributada;
    private String datacadastro;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecocusto() {
        return precocusto;
    }

    public void setPrecocusto(Double precocusto) {
        this.precocusto = precocusto;
    }

    public Double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(Double precovenda) {
        this.precovenda = precovenda;
    }
    
    public Estoque getEstoque() {
    return estoque;
    }
    public void setEstoque(Estoque estoque) {
    this.estoque = estoque;
    }  

    public int getQtdestoque() {
        return qtdestoque;
    }

    public void setQtdestoque(int qtdestoque) {
        this.qtdestoque = qtdestoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getGrupoproduto() {
        return grupoproduto;
    }

    public void setGrupoproduto(String grupoproduto) {
        this.grupoproduto = grupoproduto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getUnidadetributada() {
        return unidadetributada;
    }

    public void setUnidadetributada(String unidadetributada) {
        this.unidadetributada = unidadetributada;
    }

    public String getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(String datacadastro) {
        this.datacadastro = datacadastro;
    }
    
    //Retorna a quantidade em estoque 
    public Double toDouble(){
        return this.getPrecocusto();
    }
    
}
