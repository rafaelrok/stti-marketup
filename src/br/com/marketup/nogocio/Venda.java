
package br.com.marketup.nogocio;

/**
 *
 * @author rafae
 */
public class Venda {
    
    private int id;
    private Pessoa pessoa;
    private String situacao;
    private String datavenda;
    private String horavenda;
    private Double totalvenda;
    private Double trocovenda;
    private Double descvenda;
    private Double acresvenda;
    private Funcionario funcionario;
    private String formadepagamento;
    private String tipo;
    private Integer parcela;
    private Double valorpagamento;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(String datavenda) {
        this.datavenda = datavenda;
    }

    public String getHoravenda() {
        return horavenda;
    }

    public void setHoravenda(String horavenda) {
        this.horavenda = horavenda;
    } 
    
    public Double getTotalvenda() {
        return totalvenda;
    }

    public void setTotalvenda(Double totalvenda) {
        this.totalvenda = totalvenda;
    }

    public Double getTrocovenda() {
        return trocovenda;
    }

    public void setTrocovenda(Double trocovenda) {
        this.trocovenda = trocovenda;
    }

    public Double getDescvenda() {
        return descvenda;
    }

    public void setDescvenda(Double descvenda) {
        this.descvenda = descvenda;
    }

    public Double getAcresvenda() {
        return acresvenda;
    }

    public void setAcresvenda(Double acresvenda) {
        this.acresvenda = acresvenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getFormadepagamento() {
        return formadepagamento;
    }

    public void setFormadepagamento(String formadepagamento) {
        this.formadepagamento = formadepagamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getParcela() {
        return parcela;
    }

    public void setParcela(Integer parcela) {
        this.parcela = parcela;
    }

    public Double getValorpagamento() {
        return valorpagamento;
    }

    public void setValorpagamento(Double valorpagamento) {
        this.valorpagamento = valorpagamento;
    }
    
    
    
    
}
