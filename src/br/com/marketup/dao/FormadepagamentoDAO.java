
package br.com.marketup.dao;

import br.com.marketup.jdbc.ConnectionFactory;
import br.com.marketup.nogocio.Formadepagamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rafae
 */
public class FormadepagamentoDAO {
    
    private final Connection con;
    
    public FormadepagamentoDAO(){
        this.con= new ConnectionFactory().getConnection();
    }
    
    public void inserirFormadepagamento(Formadepagamento obj){
        
        try {
            
            String sql="INSERT INTO tb_formadepagamento(descricao) VALUES(?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,obj.getDescricao());
                       
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Cadastrado com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
    }
    
    public void excluirFormadepagamento(Formadepagamento obj){
        
        try {
            
            String sql="DELETE FROM tb_formadepagamento WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getId());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Excluido com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
        
    }
    
    public void alterarFormadepagamento(Formadepagamento obj){
        
        try {
            
            String sql="UPDATE tb_formadepagamento SET descricao=? WHERE id=?";
                    
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,obj.getDescricao());
            
            stmt.setInt(2, obj.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Alterado com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
        
        
    }
    
    public List<Formadepagamento> listarFormadepagamento(){
        
        try {
            
            List<Formadepagamento> lista = new ArrayList<>();
            
            String sql = "SELECT * FROM  tb_formadepagamento";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Formadepagamento obj = new Formadepagamento();
                
                obj.setId(rs.getInt("id"));
                obj.setDescricao(rs.getString("descricao"));               
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    public Formadepagamento consultarPorDescricao(String descricao){
        try {
            String sql = "SELECT * FROM tb_formadepagamento WHERE descricao = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, descricao);
            ResultSet rs = stmt.executeQuery();
            
            Formadepagamento obj = new Formadepagamento();
            
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setDescricao(rs.getString("descricao"));

            }
            return obj;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Forma de pagamento não Encontrado!\n");
            return null;
        }
    }
    
    public List<Formadepagamento> buscarFormadepagamentoPorDescricao(String descricao){
        
        try {
            
            List<Formadepagamento> lista = new ArrayList<>();
            
            String sql = "SELECT * FROM tb_formadepagamento WHERE descricao LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, descricao);
            ResultSet rs = stmt.executeQuery();
                       
            while(rs.next()){
                Formadepagamento obj = new Formadepagamento();
                
                obj.setId(rs.getInt("id"));
                obj.setDescricao(rs.getString("descricao"));
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
}
