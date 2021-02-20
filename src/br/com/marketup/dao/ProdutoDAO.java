
package br.com.marketup.dao;

import br.com.marketup.jdbc.ConnectionFactory;
import br.com.marketup.nogocio.Estoque;
import br.com.marketup.nogocio.Fornecedor;
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
public class ProdutoDAO {
    
    private final Connection con;
    
    public ProdutoDAO(){
        this.con= new ConnectionFactory().getConnection();
    }
    
    public void cadastroProduto(Produto obj){
    
            try {

                String sql = "INSERT INTO tb_produto(status,descricao,valor_unitario,valor_venda,qtdestoque,"
                        + "idfornecedor,grupoproduto,observacao,unidadetributada,datacadastro)"
                        + " VALUES(?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, obj.getStatus());
                stmt.setString(2, obj.getDescricao());
                stmt.setDouble(3, obj.getPrecocusto());
                stmt.setDouble(4, obj.getPrecovenda());
                stmt.setInt(5, obj.getQtdestoque());
                stmt.setInt(6, obj.getFornecedor().getId());
                stmt.setString(7, obj.getGrupoproduto());
                stmt.setString(8, obj.getObservacao());
                stmt.setString(9, obj.getUnidadetributada());
                stmt.setString(10, obj.getDatacadastro());
            
                stmt.execute();
                stmt.close();

                JOptionPane.showMessageDialog(null, " Produto cadastrado com Sucesso! ");

            } catch (SQLException erro) {

                JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
            
            
        
    }
    
    public void alterarProduto(Produto obj){
    
        try {

                String sql = "UPDATE tb_produto SET status=?,descricao=?,valor_unitarioo=?,valor_venda=?,qtdestoque=?,"
                        + "idfornecedor=?,grupoproduto=?,observacao=?,unidadetributada=?,datacadastro=? WHERE id=?";

                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, obj.getStatus());
                stmt.setString(2, obj.getDescricao());
                stmt.setDouble(3, obj.getPrecocusto());
                stmt.setDouble(4, obj.getPrecovenda());
                stmt.setInt(5, obj.getQtdestoque());
                stmt.setInt(6, obj.getFornecedor().getId());
                stmt.setString(7, obj.getGrupoproduto());
                stmt.setString(8, obj.getObservacao());
                stmt.setString(9, obj.getUnidadetributada());
                stmt.setString(10, obj.getDatacadastro());
                
                stmt.setInt(11, obj.getId());
            
                stmt.execute();
                stmt.close();

                JOptionPane.showMessageDialog(null, " Produto Alterado com Sucesso! ");

            } catch (SQLException erro) {

                JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
    }
    
    public void excluirProduto(Produto obj){
    
           try {
            
            String sql="DELETE FROM tb_produtos WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getId());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Produto excluido com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
    }
    
    public List<Produto> listarProduto(){
        
        try {
            
            List<Produto> lista = new ArrayList<>();
            
            String sql = "SELECT p.id, p.status, p.descricao, p.valor_unitario, p.valor_venda, p.qtdestoque, f.nome,"
                    + "p.grupoproduto, p.observacao, p.unidadetributada, p.datacadastro FROM tb_produto AS p INNER JOIN "
                    + "tb_fornecedores AS f ON (p.idfornecedor = f.id)";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto obj = new Produto();
                Fornecedor f = new Fornecedor();
                
                obj.setId(rs.getInt("p.id"));
                obj.setStatus(rs.getString("p.status"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPrecocusto(rs.getDouble("p.valor_unitario"));
                obj.setPrecovenda(rs.getDouble("p.valor_venda"));
                obj.setQtdestoque(rs.getInt("p.qtdestoque"));
                f.setNome(rs.getString("f.nome"));
                obj.setGrupoproduto(rs.getString("p.grupoproduto"));
                obj.setObservacao(rs.getString("p.observacao"));
                obj.setUnidadetributada(rs.getString("p.unidadetributada"));
                obj.setDatacadastro(rs.getString("p.datacadastro"));    
                
                obj.setFornecedor(f);
                
                lista.add(obj);
            }
            
            return lista;    
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    public List<Produto> buscarProdutoPorNOme(String nome){
        
        try {
            
            List<Produto> lista = new ArrayList<>();
            
            String sql = "SELECT p.id, p.status, p.descricao, p.valor_unitario, p.valor_venda, p.qtdestoque, f.nome,"
                    + "p.grupoproduto, p.observacao, p.unidadetributada, p.datacadastro FROM tb_produto AS p INNER JOIN "
                    + "tb_fornecedores AS f ON (p.idfornecedor = f.id) WHERE p.descricao LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
                       
            while(rs.next()){
                Produto obj = new Produto();
                Fornecedor f = new Fornecedor();
                
                obj.setId(rs.getInt("p.id"));
                obj.setStatus(rs.getString("p.status"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPrecocusto(rs.getDouble("p.valor_unitario"));
                obj.setPrecovenda(rs.getDouble("p.valor_venda"));
                obj.setQtdestoque(rs.getInt("p.qtdestoque"));
                f.setNome(rs.getString("f.nome"));
                obj.setGrupoproduto(rs.getString("p.grupoproduto"));
                obj.setObservacao(rs.getString("p.observacao"));
                obj.setUnidadetributada(rs.getString("p.unidadetributada"));
                obj.setDatacadastro(rs.getString("p.datacadastro"));    
                
                obj.setFornecedor(f);
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    public List<Produto> buscarProdutoPorCodigo(String codigo){
        
        try {
            
            List<Produto> lista = new ArrayList<>();
            
            String sql = "SELECT p.id, p.status, p.descricao, p.valor_unitario, p.valor_venda, p.qtdestoque, f.nome,"
                    + "p.grupoproduto, p.observacao, p.unidadetributada, p.datacadastro FROM tb_produto AS p INNER JOIN "
                    + "tb_fornecedores AS f ON (p.idfornecedor = f.id) WHERE p.id= ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, codigo);
            ResultSet rs = stmt.executeQuery();
                       
            while(rs.next()){
                Produto obj = new Produto();
                Fornecedor f = new Fornecedor();
                
                obj.setId(rs.getInt("p.id"));
                obj.setStatus(rs.getString("p.status"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPrecocusto(rs.getDouble("p.valor_unitario"));
                obj.setPrecovenda(rs.getDouble("p.valor_venda"));
                obj.setQtdestoque(rs.getInt("p.qtdestoque"));
                f.setNome(rs.getString("f.nome"));
                obj.setGrupoproduto(rs.getString("p.grupoproduto"));
                obj.setObservacao(rs.getString("p.observacao"));
                obj.setUnidadetributada(rs.getString("p.unidadetributada"));
                obj.setDatacadastro(rs.getString("p.datacadastro"));    
                
                obj.setFornecedor(f);
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    public Produto consultaPorNome(String nome){
        
        try {
            
            String sql = "SELECT p.id, p.status, p.descricao, p.valor_unitario, p.valor_venda, p.qtdestoque, f.nome,"
                    + "p.grupoproduto, p.observacao, p.unidadetributada, p.datacadastro FROM tb_produto AS p INNER JOIN "
                    + "tb_fornecedores AS f ON (p.idfornecedor = f.id) WHERE p.descricao = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            
            ResultSet rs = stmt.executeQuery();
            Produto obj = new Produto();
            Fornecedor f = new Fornecedor();     
            
            if(rs.next()){
                   
                obj.setId(rs.getInt("p.id"));
                obj.setStatus(rs.getString("p.status"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPrecocusto(rs.getDouble("p.valor_unitario"));
                obj.setPrecovenda(rs.getDouble("p.valor_venda"));
                obj.setQtdestoque(rs.getInt("p.qtdestoque"));
                f.setNome(rs.getString("f.nome"));
                obj.setGrupoproduto(rs.getString("p.grupoproduto"));
                obj.setObservacao(rs.getString("p.observacao"));
                obj.setUnidadetributada(rs.getString("p.unidadetributada"));
                obj.setDatacadastro(rs.getString("p.datacadastro"));    
                
                obj.setFornecedor(f);

            }
            return obj;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
    
    }
    
    public Produto consultaPorCodigo(String codigo){
        
        try {
            
            String sql = "SELECT p.id, p.status, p.descricao, p.valor_unitario, p.valor_venda, p.qtdestoque, f.nome,"
                    + "p.grupoproduto, p.observacao, p.unidadetributada, p.datacadastro FROM tb_produto AS p INNER JOIN "
                    + "tb_fornecedores AS f ON (p.idfornecedor = f.id) WHERE p.id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, codigo);
            
            ResultSet rs = stmt.executeQuery();
            Produto obj = new Produto();
            Fornecedor f = new Fornecedor();     
            
            if(rs.next()){
                   
                obj.setId(rs.getInt("p.id"));
                obj.setStatus(rs.getString("p.status"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPrecocusto(rs.getDouble("p.valor_unitario"));
                obj.setPrecovenda(rs.getDouble("p.valor_venda"));
                obj.setQtdestoque(rs.getInt("p.qtdestoque"));
                f.setNome(rs.getString("f.nome"));
                obj.setGrupoproduto(rs.getString("p.grupoproduto"));
                obj.setObservacao(rs.getString("p.observacao"));
                obj.setUnidadetributada(rs.getString("p.unidadetributada"));
                obj.setDatacadastro(rs.getString("p.datacadastro"));    
                
                obj.setFornecedor(f);

            }
            return obj;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
    
    }
    
    public void entradaEstoqueProduto(int id, int qtde, double valor_unitario){
        
        try {
            String sql="UPDATE tb_produto SET qtdestoque=?, valor_unitario=?  WHERE id = ?";
            
            //DATE_FORMAT(data_entrada,'%d/%m/%y')AS dtformat
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, qtde);
            stmt.setDouble(2, valor_unitario);                      
            stmt.setInt(3, id);
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, " Estoque Atualizado com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
    }
    
    public void saidaEstoqueProduto(int id, int qtde, double valor_unitario, String data_saida){
        
        try {
            String sql="UPDATE tb_saida_produto SET qtde=?, valor_unitario=?, "
                     + "DATE_FORMAT(data_entrada,'%d/%m/%y')AS dtformat WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            //stmt.setInt(1, produto.getId());
            stmt.setInt(1, qtde);
            stmt.setDouble(2, valor_unitario);
            stmt.setString(3, data_saida);
            
            stmt.setInt(4, id);
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, " Estoque Atualizado com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
    }
}
    

