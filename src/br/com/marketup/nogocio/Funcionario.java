/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marketup.nogocio;

/**
 *
 * @author rafae
 */
public class Funcionario {
    
    private int id;
    private String status;
    private String nome;
    private String nomecurto;
    private String cpf;
    private String email;
    private String nivelacesso;
    private String cargo;    
    private String telefone;
    private String celular;
    private String senha;
    private String confirmasenha;
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;           
    private String ibge;

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getStatus() {
        return status;
    }

    
    public void setStatus(String status) {
        this.status = status;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomecurto() {
        return nomecurto;
    }

    public void setNomecurto(String nomecurto) {
        this.nomecurto = nomecurto;
    }

    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmasenha() {
        return confirmasenha;
    }

    public void setConfirmasenha(String confirmasenha) {
        this.confirmasenha = confirmasenha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivelacesso() {
        return nivelacesso;
    }

    public void setNivelacesso(String nivelacesso) {
        this.nivelacesso = nivelacesso;
    }

   
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getCelular() {
        return celular;
    }

    
    public void setCelular(String celular) {
        this.celular = celular;
    }

    
    public String getCep() {
        return cep;
    }

    
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    public String getLogradouro() {
        return logradouro;
    }

    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    
    public int getNumero() {
        return numero;
    }

    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public String getComplemento() {
        return complemento;
    }

    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
    public String getBairro() {
        return bairro;
    }

    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    public String getCidade() {
        return cidade;
    }

    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
    public String getUf() {
        return uf;
    }

    
    public void setUf(String uf) {
        this.uf = uf;
    }

   
    public String getIbge() {
        return ibge;
    }

    
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }
    
    //Retorna o nome do fornecedor no cadastro de produto
    @Override
    public String toString(){
        return this.getNomecurto();
    }
    
    
}
