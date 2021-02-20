
package br.com.marketup.dao;

import br.com.marketup.jdbc.ConnectionFactory;
import br.com.marketup.nogocio.ItemVenda;
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
public class ItemVendaDAO {
    
    private final Connection con;
    
    public ItemVendaDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    //Metodo para cadastrar itens da venda
    public void cadastraItens(ItemVenda obj){
        
        try {
                String sql = "INSERT INTO tb_itensvenda(venda_id,produto_id,qtd,precoitem,subtotal,descitem,acrescitem)"
                        + " VALUES(?,?,?,?,?,?,?)";

                PreparedStatement stmt = con.prepareStatement(sql);
                
                stmt.setInt(1, obj.getVenda().getId());
                stmt.setInt(2, obj.getProduto().getId());
                stmt.setInt(3, obj.getQtd());
                stmt.setDouble(4, obj.getPreco());
                stmt.setDouble(5, obj.getSubtotal());
                stmt.setDouble(6, obj.getDescitem());
                stmt.setDouble(7, obj.getAcrescitem());    
            
                stmt.execute();
                stmt.close();

                JOptionPane.showMessageDialog(null, " Itens Registrada com Sucesso! ");

            } catch (SQLException erro) {

                JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro ao cadastrar o item da compra!\n " + erro);
        }
        
    }
    
    //metod que lista itens de uma venda
    public List<ItemVenda> listaItensVenda(int venda_id){
        
        try {
            
            List<ItemVenda> lista = new ArrayList<>();
            
            String sql = "SELECT i.id,p.descricao,i.qtd,p.valor_venda,i.descitem,i.acrescitem,i.subtotal FROM tb_itensvenda AS i "
                       + "INNER JOIN tb_produto AS P ON (i.produto_id = p.id) "
                       + "WHERE i.venda_id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, venda_id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                ItemVenda obj = new ItemVenda();
                Produto p =  new Produto();
                
                obj.setId(rs.getInt("i.id"));
                p.setDescricao(rs.getString("p.descricao"));
                obj.setQtd(rs.getInt("i.qtd"));
                p.setPrecovenda(rs.getDouble("p.valor_venda"));                
                obj.setDescitem(rs.getDouble("i.descitem"));
                obj.setAcrescitem(rs.getDouble("i.acrescitem"));
                obj.setSubtotal(rs.getDouble("i.subtotal"));
                
                obj.setProduto(p);
                
                lista.add(obj);

            }
            
            return lista;            
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    
}
