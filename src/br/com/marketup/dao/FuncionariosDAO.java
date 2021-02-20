
package br.com.marketup.dao;

import br.com.marketup.jdbc.ConnectionFactory;
import br.com.marketup.nogocio.Funcionario;
import br.com.marketup.views.frmMenu;
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
public class FuncionariosDAO {
    
     private final Connection con;
    
    public FuncionariosDAO(){
        this.con= new ConnectionFactory().getConnection();
    }
    
    public void inserirFuncionario(Funcionario obj){
        
        try {
            
            String sql="INSERT INTO tb_funcionarios(status,nome,nomecurto,cpf,email,"
                    + "nivelacesso,cargo,telefone,celular,senha,confirmasenha,cep,"
                    + "logradouro,numero,complemento,bairro,cidade,uf,ibge)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,obj.getStatus());
            stmt.setString(2,obj.getNome());
            stmt.setString(3,obj.getNomecurto());          
            stmt.setString(4,obj.getCpf());
            stmt.setString(5,obj.getEmail());
            stmt.setString(6,obj.getNivelacesso());
            stmt.setString(7,obj.getCargo());
            stmt.setString(8,obj.getTelefone());
            stmt.setString(9,obj.getCelular());
            stmt.setString(10,obj.getSenha());
            stmt.setString(11,obj.getConfirmasenha());
            stmt.setString(12,obj.getCep());
            stmt.setString(13,obj.getLogradouro());
            stmt.setInt(14,obj.getNumero());
            stmt.setString(15,obj.getComplemento());
            stmt.setString(16,obj.getBairro());
            stmt.setString(17,obj.getCidade());
            stmt.setString(18,obj.getUf());
            stmt.setString(19,obj.getIbge());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Cadastrado com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
    }
    
    public List<Funcionario> listarFuncionarios(){
        
        try {
            
            List<Funcionario> lista = new ArrayList<>();
            
            String sql = "SELECT * FROM  tb_funcionarios";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionario obj = new Funcionario();
                
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));   
                obj.setNivelacesso(rs.getString("nivelacesso"));               
                obj.setNomecurto(rs.getString("nomecurto"));
                obj.setSenha(rs.getString("senha"));
                obj.setConfirmasenha(rs.getString("confirmasenha"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCargo(rs.getString("cargo"));
                obj.setEmail(rs.getString("email")); 
                obj.setCelular(rs.getString("celular"));                 
                obj.setTelefone(rs.getString("telefone"));                            
                obj.setCep(rs.getString("cep"));
                obj.setLogradouro(rs.getString("logradouro"));
                obj.setNumero(rs.getInt("numero"));
                obj.setUf(rs.getString("uf"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));                
                obj.setIbge(rs.getString("ibge"));
                obj.setComplemento(rs.getString("Complemento"));
                
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    public void alterarFuncionario(Funcionario obj){
        
        try {
            
            String sql="UPDATE tb_funcionarios SET status=?, nivelacesso=?, nomecurto=?, senha=?,"
                    + "confirmasenha=?, nome=?, cpf=?, cargo=?, email=?, celular=?, telefone=?,"
                    + "cep=?, logradouro=?, numero=?, uf=?, bairro=?, cidade=?, ibge=?, complemento=? "
                    + "WHERE id=?";
                  
                    /*+ "nome=?,nomecurto,cpf=?,email=?,"
                    + "nivelacesso=?,cargo=?,telefone=?,celular=?,senha=?,confirmasenha=?,cep=?,"
                    + "logradouro=?,numero=?,complemento=?,bairro=?,cidade=?,uf=?,"
                    + "ibge=? WHERE id=?";*/
                    
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,obj.getStatus());
            stmt.setString(2,obj.getNivelacesso());
            stmt.setString(3,obj.getNomecurto());
            stmt.setString(4,obj.getSenha());
            stmt.setString(5,obj.getConfirmasenha());
            stmt.setString(6,obj.getNome());  
            stmt.setString(7,obj.getCpf());
            stmt.setString(8,obj.getCargo());
            stmt.setString(9,obj.getEmail());
            stmt.setString(10,obj.getCelular());     
            stmt.setString(11,obj.getTelefone());
            stmt.setString(12,obj.getCep());
            stmt.setString(13,obj.getLogradouro());
            stmt.setInt(14,obj.getNumero());
            stmt.setString(15,obj.getUf());
            stmt.setString(16,obj.getBairro());
            stmt.setString(17,obj.getCidade());
            stmt.setString(18,obj.getIbge());
            stmt.setString(19,obj.getComplemento());
            
            stmt.setInt(20, obj.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Alterado com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
        
    }
    
    public void excluirFuncionario(Funcionario obj){
        
        try {
            
            String sql="DELETE FROM tb_funcionarios WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getId());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Excluido com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro.\n " + "Esse Funcionario possui movimentações e não pode se excluido!");
        }
        
        
    }
     
    public Funcionario consultarPorNome(String nome){
        try {
            String sql = "SELECT * FROM tb_funcionarios WHERE nome= ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            Funcionario obj = new Funcionario();
            
            if(rs.next()){
                
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));   
                obj.setNivelacesso(rs.getString("nivelacesso"));               
                obj.setNomecurto(rs.getString("nomecurto"));
                obj.setSenha(rs.getString("senha"));
                obj.setConfirmasenha(rs.getString("confirmasenha"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCargo(rs.getString("cargo"));
                obj.setEmail(rs.getString("email")); 
                obj.setCelular(rs.getString("celular"));                 
                obj.setTelefone(rs.getString("telefone"));                            
                obj.setCep(rs.getString("cep"));
                obj.setLogradouro(rs.getString("logradouro"));
                obj.setNumero(rs.getInt("numero"));
                obj.setUf(rs.getString("uf"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));                
                obj.setIbge(rs.getString("ibge"));
                obj.setComplemento(rs.getString("Complemento"));
                

            }
            return obj;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Funcionario não Encontrado!\n" + erro);
            return null;
        }
    }
    
    public Funcionario consultarPorNomeCurto(String nome){
        try {
            String sql = "SELECT * FROM tb_funcionarios WHERE nomecurto= ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            Funcionario obj = new Funcionario();
            
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));   
                obj.setNivelacesso(rs.getString("nivelacesso"));               
                obj.setNomecurto(rs.getString("nomecurto"));
                obj.setSenha(rs.getString("senha"));
                obj.setConfirmasenha(rs.getString("confirmasenha"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCargo(rs.getString("cargo"));
                obj.setEmail(rs.getString("email")); 
                obj.setCelular(rs.getString("celular"));                 
                obj.setTelefone(rs.getString("telefone"));                            
                obj.setCep(rs.getString("cep"));
                obj.setLogradouro(rs.getString("logradouro"));
                obj.setNumero(rs.getInt("numero"));
                obj.setUf(rs.getString("uf"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));                
                obj.setIbge(rs.getString("ibge"));
                obj.setComplemento(rs.getString("Complemento"));

            }
            return obj;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Funcionario não Encontrado!\n" + erro);
            return null;
        }
    }
    
    public Funcionario consultarPorCodigo(String codigo){
        try {
            String sql = "SELECT * FROM tb_funcionarios WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            Funcionario obj = new Funcionario();
            
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));   
                obj.setNivelacesso(rs.getString("nivelacesso"));               
                obj.setNomecurto(rs.getString("nomecurto"));
                obj.setSenha(rs.getString("senha"));
                obj.setConfirmasenha(rs.getString("confirmasenha"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCargo(rs.getString("cargo"));
                obj.setEmail(rs.getString("email")); 
                obj.setCelular(rs.getString("celular"));                 
                obj.setTelefone(rs.getString("telefone"));                            
                obj.setCep(rs.getString("cep"));
                obj.setLogradouro(rs.getString("logradouro"));
                obj.setNumero(rs.getInt("numero"));
                obj.setUf(rs.getString("uf"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));                
                obj.setIbge(rs.getString("ibge"));
                obj.setComplemento(rs.getString("Complemento"));

            }
            return obj;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Funcionario não Encontrado!\n" + erro);
            return null;
        }
    }
      
    public List<Funcionario> buscarFuncionarioPorNOme(String nomecurto){
        
        try {
            
            List<Funcionario> lista = new ArrayList<>();
            
            String sql = "SELECT * FROM tb_funcionarios WHERE nomecurto LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nomecurto);
            ResultSet rs = stmt.executeQuery();
                       
            while(rs.next()){
                Funcionario obj = new Funcionario();
                
                obj.setId(rs.getInt("id"));
                obj.setStatus(rs.getString("status"));   
                obj.setNivelacesso(rs.getString("nivelacesso"));               
                obj.setNomecurto(rs.getString("nomecurto"));
                obj.setSenha(rs.getString("senha"));
                obj.setConfirmasenha(rs.getString("confirmasenha"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCargo(rs.getString("cargo"));
                obj.setEmail(rs.getString("email")); 
                obj.setCelular(rs.getString("celular"));                 
                obj.setTelefone(rs.getString("telefone"));                            
                obj.setCep(rs.getString("cep"));
                obj.setLogradouro(rs.getString("logradouro"));
                obj.setNumero(rs.getInt("numero"));
                obj.setUf(rs.getString("uf"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));                
                obj.setIbge(rs.getString("ibge"));
                obj.setComplemento(rs.getString("Complemento"));
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    public void efetuarLogin(String nomecurto,String nivelacesso, String senha){
        
        try {
            
            String sql = "SELECT * FROM tb_funcionarios WHERE nomecurto = ? and nivelacesso = ? and senha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nomecurto);
            stmt.setString(2, nivelacesso);
            stmt.setString(3, senha);
            
            ResultSet rs = stmt.executeQuery();
                       
            if(rs.next()){
                
                //Acesso administrador
                if(rs.getString("nivelacesso").equals("ADMINISTRADOR") || rs.getString("nivelacesso").equals("GERENTE")){
                    
                    JOptionPane.showMessageDialog(null, "Seja bem vindo ao sitema! " + nomecurto);
                    frmMenu viewMenu = new frmMenu();
                    viewMenu.usuarioLogado = rs.getString("nomecurto");
                    viewMenu.setVisible(true);                               
                }
                //Acesso limitado
                else if(rs.getString("nivelacesso").equals("VENDEDOR")){
                    
                    JOptionPane.showMessageDialog(null, "Seja bem vindo ao sitema! " + nomecurto);
                    frmMenu viewMenu = new frmMenu();
                    viewMenu.usuarioLogado = rs.getString("nomecurto");
                    viewMenu.setVisible(true);  
                    
                    //Permissões no acesso por nivel de acesso 
                    
                }
              
            }else{
                
                JOptionPane.showConfirmDialog(null, "Dados incorretos!\n Deseja corrigir? ");
                //new frmLogin().setVisible(true);                          
            }    
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, algo deu errado!\n " + erro);
        }
        
            
    }
}
