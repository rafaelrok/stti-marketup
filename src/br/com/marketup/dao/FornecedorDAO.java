
package br.com.marketup.dao;

import br.com.marketup.jdbc.ConnectionFactory;
import br.com.marketup.nogocio.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */

public class FornecedorDAO {
    
    private final Connection con;
    
    public FornecedorDAO(){
        this.con= new ConnectionFactory().getConnection();
    }
    
    public void inserirFornecedor(Fornecedor obj){
        
        try {
            
            String sql="INSERT INTO tb_fornecedores(status,nome,cnpj,email,telefone,celular,cep,logradouro,"
                    + "numero,complemento,bairro,cidade,uf,ibge,inscestadual,caracteristica,observacao)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,obj.getStatus());
            stmt.setString(2,obj.getNome());
            stmt.setString(3,obj.getCnpj());
            stmt.setString(4,obj.getEmail());
            stmt.setString(5,obj.getTelefone());
            stmt.setString(6,obj.getCelular());
            stmt.setString(7,obj.getCep());
            stmt.setString(8,obj.getLogradouro());
            stmt.setInt(9,obj.getNumero());
            stmt.setString(10,obj.getComplemento());
            stmt.setString(11,obj.getBairro());
            stmt.setString(12,obj.getCidade());
            stmt.setString(13,obj.getUf());  
            stmt.setString(14,obj.getIbge());
            stmt.setString(15,obj.getInscestadual());           
            stmt.setString(16,obj.getCaracteristica());
            stmt.setString(17,obj.getObservacao());
            
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Cadastrado com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
    }
    
    public void excluirFornecedor(Fornecedor obj){
        
        try {
            
            String sql="DELETE FROM tb_fornecedores WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getId());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Excluido com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
        
    }
    
    public void alterarFornecedor(Fornecedor obj){
        
        try {
            
            String sql="UPDATE tb_fornecedores SET status=?,nome=?,cnpj=?,email=?,telefone=?,"
                    + "celular=?,cep=?,logradouro=?,numero=?,complemento=?,bairro=?,cidade=?,"
                    + "uf=?,ibge=?,inscestadual=?,caracteristica=?,observacao=?, WHERE id=?";
                    
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,obj.getStatus());
            stmt.setString(2,obj.getNome());
            stmt.setString(3,obj.getCnpj());
            stmt.setString(4,obj.getEmail());
            stmt.setString(5,obj.getTelefone());
            stmt.setString(6,obj.getCelular());
            stmt.setString(7,obj.getCep());
            stmt.setString(8,obj.getLogradouro());
            stmt.setInt(9,obj.getNumero());
            stmt.setString(10,obj.getComplemento());
            stmt.setString(11,obj.getBairro());
            stmt.setString(12,obj.getCidade());
            stmt.setString(13,obj.getUf());  
            stmt.setString(14,obj.getIbge());
            stmt.setString(15,obj.getInscestadual());           
            stmt.setString(16,obj.getCaracteristica());
            stmt.setString(17,obj.getObservacao());
            
            stmt.setInt(18, obj.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Alterado com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
        
    }
    
    public List<Fornecedor> listarFornecedor(){
        
        try {
            
            List<Fornecedor> lista = new ArrayList<>();
            
            String sql = "SELECT * FROM  tb_fornecedores";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor obj = new Fornecedor();
                
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("Telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setLogradouro(rs.getString("Logradouro"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("Complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setIbge(rs.getString("ibge"));
                obj.setInscestadual(rs.getString("inscestadual"));
                obj.setCaracteristica(rs.getString("caracteristica"));
                obj.setObservacao(rs.getString("observacao"));
                
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    public Fornecedor consultarPorNome(String nome){
        try {
            String sql = "SELECT * FROM tb_fornecedores WHERE nome = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            Fornecedor obj = new Fornecedor();
            
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("Telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setLogradouro(rs.getString("Logradouro"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("Complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setIbge(rs.getString("ibge"));
                obj.setInscestadual(rs.getString("inscestadual"));
                obj.setCaracteristica(rs.getString("caracteristica"));
                obj.setObservacao(rs.getString("observacao"));

            }
            return obj;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Fornecedor não Encontrado!\n");
            return null;
        }
    }
    
    public List<Fornecedor> buscarFornecedorPorNOme(String nome){
        
        try {
            
            List<Fornecedor> lista = new ArrayList<>();
            
            String sql = "SELECT * FROM tb_fornecedores WHERE nome LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
                       
            while(rs.next()){
                Fornecedor obj = new Fornecedor();
                
               obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("Telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setLogradouro(rs.getString("Logradouro"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("Complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setIbge(rs.getString("ibge"));
                obj.setInscestadual(rs.getString("inscestadual"));
                obj.setCaracteristica(rs.getString("caracteristica"));
                obj.setObservacao(rs.getString("observacao"));
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
}
