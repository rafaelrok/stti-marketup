
package br.com.marketup.dao;

import br.com.marketup.jdbc.ConnectionFactory;
import br.com.marketup.nogocio.Formadepagamento;
import br.com.marketup.nogocio.Pessoa;
import br.com.marketup.nogocio.Produto;
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
public class PagamentoDAO {
    
     private Connection con;
    
    public PagamentoDAO(){
        this.con= new ConnectionFactory().getConnection();
    }

    public void cadastroPagamento(Formadepagamento obj){
    
            try {

                String sql = "INSERT INTO tb_formadepagamento(descricao,tipo,parcelas,idpessoa)"
                        + " VALUES(?,?,?,?)";

                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, obj.getDescricao());
            
                stmt.execute();
                stmt.close();

                JOptionPane.showMessageDialog(null, " Forma de pagamento cadastrado com Sucesso! ");

            } catch (SQLException erro) {

                JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
            
            
        
    }
    
    public void alterarPagamento(Formadepagamento obj){
    
        try {

                String sql = "UPDATE tb_formadepagamento SET descricao=?,tipo=?,parcelas=?,idpessoa=?, WHERE id=?";

                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, obj.getDescricao());
                
                stmt.setInt(5, obj.getId());
            
                stmt.execute();
                stmt.close();

                JOptionPane.showMessageDialog(null, " Forma de pagamento Alterado com Sucesso! ");

            } catch (SQLException erro) {

                JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
    }
    
    public void excluirPagamento(Formadepagamento obj){
    
           try {
            
            String sql="DELETE FROM tb_formadepagamento WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getId());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Forma de pagamento excluido com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
    }
    
    /*public List<Formadepagamento> listarPagamento(){
        
        try {
            
            List<Formadepagamento> lista = new ArrayList<>();
            
            String sql = "SELECT f.id, f.descricao, f.tipo, f.parcelas FROM tb_formadepagamento AS f INNER JOIN "
                    + "tb_pessoa AS p ON (p.idpessoa = p.id)";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Formadepagamento obj = new Formadepagamento();
                Pessoa p = new Pessoa();
                
                obj.setId(rs.getInt("f.id"));
                obj.setDescicao(rs.getString("f.descricao"));
                obj.setTipo(rs.getString("f.tipo"));
                obj.setParcelas(rs.getString("f.parcelas"));            
                p.setNome(rs.getString("p.nome"));
                   
                
                obj.setPessoa(p);
                
                lista.add(obj);
            }
            
            return lista;    
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }*/
    
    /*public List<Formadepagamento> buscarPagamentoPorNome(String nome){
        
        try {
            
            List<Formadepagamento> lista = new ArrayList<>();
            
            String sql = "SELECT f.id, f.descricao, f.tipo, f.parcelas FROM tb_formadepagamento AS f INNER JOIN "
                    + "tb_pessoa AS p ON (p.idpessoa = p.id) WHERE f.descricao LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
                       
            while(rs.next()){
                Formadepagamento obj = new Formadepagamento();
                Pessoa p = new Pessoa();
                
                obj.setId(rs.getInt("f.id"));
                obj.setDescicao(rs.getString("f.descricao"));
                obj.setTipo(rs.getString("f.tipo"));
                obj.setParcelas(rs.getString("f.parcelas"));            
                p.setNome(rs.getString("p.nome"));    
                
                obj.setPessoa(p);
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }*/
    
    /*public List<Formadepagamento> buscarPagamentoPorCodigo(String codigo){
        
        try {
            
            List<Formadepagamento> lista = new ArrayList<>();
            
            String sql = "SELECT f.id, f.descricao, f.tipo, f.parcelas FROM tb_formadepagamento AS f INNER JOIN "
                    + "tb_pessoa AS p ON (p.idpessoa = p.id) WHERE f.descricao LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, codigo);
            ResultSet rs = stmt.executeQuery();
                       
            while(rs.next()){
                Formadepagamento obj = new Formadepagamento();
                Pessoa p = new Pessoa();
                
                obj.setId(rs.getInt("f.id"));
                obj.setDescicao(rs.getString("f.descricao"));
                obj.setTipo(rs.getString("f.tipo"));
                obj.setParcelas(rs.getString("f.parcelas"));            
                p.setNome(rs.getString("p.nome"));   
                
                obj.setPessoa(p);
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }*/
    
    /*public Formadepagamento consultaPorNome(String nome){
        
        try {
            
            String sql = "SELECT f.id, f.descricao, f.tipo, f.parcelas FROM tb_formadepagamento AS f INNER JOIN "
                    + "tb_pessoa AS p ON (p.idpessoa = p.id) WHERE f.descricao LIKE ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            
            ResultSet rs = stmt.executeQuery();
            Formadepagamento obj = new Formadepagamento();
            Pessoa p = new Pessoa();     
            
            if(rs.next()){
                   
                obj.setId(rs.getInt("f.id"));
                obj.setDescicao(rs.getString("f.descricao"));
                obj.setTipo(rs.getString("f.tipo"));
                obj.setParcelas(rs.getString("f.parcelas"));            
                p.setNome(rs.getString("p.nome"));    
                
                obj.setPessoa(p);

            }
            return obj;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
    
    }*/
    
    /*public Formadepagamento consultaPorCodigo(String codigo){
        
        try {
            
            String sql = "SELECT f.id, f.descricao, f.tipo, f.parcelas FROM tb_formadepagamento AS f INNER JOIN "
                    + "tb_pessoa AS p ON (p.idpessoa = p.id) WHERE f.id LIKE ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, codigo);
            
            ResultSet rs = stmt.executeQuery();
            Formadepagamento obj = new Formadepagamento();
            Pessoa p = new Pessoa();     
            
            if(rs.next()){
                   
                obj.setId(rs.getInt("f.id"));
                obj.setDescicao(rs.getString("f.descricao"));
                obj.setTipo(rs.getString("f.tipo"));
                obj.setParcelas(rs.getString("f.parcelas"));            
                p.setNome(rs.getString("p.nome"));    
                
                obj.setPessoa(p);

            }
            return obj;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
    
    }*/
    
}
