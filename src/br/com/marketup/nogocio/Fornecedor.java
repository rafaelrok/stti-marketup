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
public class Fornecedor extends Pessoa {
    
    private String inscestadual;
    private String caracteristica;
    private String observacao;

    public String getInscestadual() {
        return inscestadual;
    }

    public void setInscestadual(String inscestadual) {
        this.inscestadual = inscestadual;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    //Retorna o nome do fornecedor no cadastro de produto
    @Override
    public String toString(){
        return this.getNome();
    }
}
