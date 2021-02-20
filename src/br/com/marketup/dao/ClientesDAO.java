
package br.com.marketup.dao;

import br.com.marketup.jdbc.ConnectionFactory;
import br.com.marketup.nogocio.Pessoa;
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
public class ClientesDAO {
    
    private final Connection con;
    
    public ClientesDAO(){
        this.con= new ConnectionFactory().getConnection();
    }
    
    public void inserirCliente(Pessoa obj){
        
        try {
            
            String sql="INSERT INTO tb_pessoa(nome,cpf,email,telefone,celular,cep,"
                    + "logradouro,numero,complemento,bairro,cidade,uf,status,"
                    + "pessoa,cnpj,referencia,nomeFantasia,ibge)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getCpf());
            stmt.setString(3,obj.getEmail());
            stmt.setString(4,obj.getTelefone());
            stmt.setString(5,obj.getCelular());
            stmt.setString(6,obj.getCep());
            stmt.setString(7,obj.getLogradouro());
            stmt.setInt(8,obj.getNumero());
            stmt.setString(9,obj.getComplemento());
            stmt.setString(10,obj.getBairro());
            stmt.setString(11,obj.getCidade());
            stmt.setString(12,obj.getUf());
            stmt.setString(13,obj.getStatus());
            stmt.setString(14,obj.getPessoa());
            stmt.setString(15,obj.getCnpj());
            stmt.setString(16,obj.getReferencia());
            stmt.setString(17,obj.getNomefantasia());
            stmt.setString(18,obj.getIbge());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Cadastrado com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
    }
    
    public void alterarCliente(Pessoa obj){
        
        try {
            
            String sql="UPDATE tb_pessoa SET nome=?,cpf=?,email=?,telefone=?,celular=?,cep=?,"
                    + "logradouro=?,numero=?,complemento=?,bairro=?,cidade=?,uf=?,status=?,"
                    + "pessoa=?,cnpj=?,referencia=?,nomeFantasia=?,ibge=? WHERE id=?";
                    
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getCpf());
            stmt.setString(3,obj.getEmail());
            stmt.setString(4,obj.getTelefone());
            stmt.setString(5,obj.getCelular());
            stmt.setString(6,obj.getCep());
            stmt.setString(7,obj.getLogradouro());
            stmt.setInt(8,obj.getNumero());
            stmt.setString(9,obj.getComplemento());
            stmt.setString(10,obj.getBairro());
            stmt.setString(11,obj.getCidade());
            stmt.setString(12,obj.getUf());
            stmt.setString(13,obj.getStatus());
            stmt.setString(14,obj.getPessoa());
            stmt.setString(15,obj.getCnpj());
            stmt.setString(16,obj.getReferencia());
            stmt.setString(17,obj.getNomefantasia());
            stmt.setString(18,obj.getIbge());
            
            stmt.setInt(19, obj.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Alterado com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
        
    }
    
    public void excluirCliente(Pessoa obj){
        
        try {
            
            String sql="DELETE FROM tb_pessoa WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getId());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Excluido com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
        
    }
    
    public List<Pessoa> listarClientes(){
        
        try {
            
            List<Pessoa> lista = new ArrayList<>();
            
            String sql = "SELECT * FROM  tb_pessoa";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Pessoa obj = new Pessoa();
                
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));
                obj.setPessoa(rs.getString("Pessoa"));
                obj.setNome(rs.getString("nome"));
                obj.setNomefantasia(rs.getString("nomefantasia"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("Email"));
                obj.setLogradouro(rs.getString("Logradouro"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setComplemento(rs.getString("Complemento"));
                obj.setNumero(rs.getInt("numero"));
                obj.setReferencia(rs.getString("referencia"));
                obj.setTelefone(rs.getString("Telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setIbge(rs.getString("ibge"));
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    public Pessoa consultarPorNome(String nome){
        try {
            String sql = "SELECT * FROM tb_pessoa WHERE nome = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            Pessoa obj = new Pessoa();
            
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));
                obj.setPessoa(rs.getString("Pessoa"));
                obj.setNome(rs.getString("nome"));
                obj.setNomefantasia(rs.getString("nomefantasia"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("Email"));
                obj.setLogradouro(rs.getString("Logradouro"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setComplemento(rs.getString("Complemento"));
                obj.setNumero(rs.getInt("numero"));
                obj.setReferencia(rs.getString("referencia"));
                obj.setTelefone(rs.getString("Telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setIbge(rs.getString("ibge"));

            }
            return obj;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Cliente não Encontrado!\n");
            return null;
        }
    }
    
    public Pessoa consultarPorCpf(String cpf){
        try {
            String sql = "SELECT * FROM tb_pessoa WHERE cpf = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            
            Pessoa obj = new Pessoa();
            
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));
                obj.setPessoa(rs.getString("Pessoa"));
                obj.setNome(rs.getString("nome"));
                obj.setNomefantasia(rs.getString("nomefantasia"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("Email"));
                obj.setLogradouro(rs.getString("Logradouro"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setComplemento(rs.getString("Complemento"));
                obj.setNumero(rs.getInt("numero"));
                obj.setReferencia(rs.getString("referencia"));
                obj.setTelefone(rs.getString("Telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setIbge(rs.getString("ibge"));

            }
            return obj;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "CPF não Encontrado!\n");
            return null;
        }
    }
    
    public List<Pessoa> buscarClientePorNOme(String nome){
        
        try {
            
            List<Pessoa> lista = new ArrayList<>();
            
            String sql = "SELECT * FROM tb_pessoa WHERE nome LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
                       
            while(rs.next()){
                Pessoa obj = new Pessoa();
                
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));
                obj.setPessoa(rs.getString("Pessoa"));
                obj.setNome(rs.getString("nome"));
                obj.setNomefantasia(rs.getString("nomefantasia"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("Email"));
                obj.setLogradouro(rs.getString("Logradouro"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setComplemento(rs.getString("Complemento"));
                obj.setNumero(rs.getInt("numero"));
                obj.setReferencia(rs.getString("referencia"));
                obj.setTelefone(rs.getString("Telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setIbge(rs.getString("ibge"));
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    //metod que lista itens de uma venda
    public List<Pessoa> listaCpfPessoa(int id){
        
        try {
            
            List<Pessoa> lista = new ArrayList<>();
            
            String sql = "SELECT p.cpf  FROM tb_pessoa AS p "
                       + "WHERE p.id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Pessoa obj = new Pessoa();

                obj.setCpf(rs.getString("v.cpf"));                                                              
                
                lista.add(obj);
            }
            
            return lista;            
                        
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    public Pessoa consultarCpfPorCodigo(int id_venda){
        try {
            
            String sql = "SELECT p.id, p.cpf  FROM tb_pessoa AS p "
                       + "WHERE p.id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id_venda);
            ResultSet rs = stmt.executeQuery();
            
            Pessoa obj = new Pessoa();
            
            if(rs.next()){

                obj.setId(rs.getInt("id"));
                obj.setCpf(rs.getString("cpf"));

            }
            return obj;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "CPF não Encontrado!\n");
            return null;
        }
    }
    
    
    
}
