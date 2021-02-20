
package br.com.marketup.dao;

import br.com.marketup.jdbc.ConnectionFactory;
import br.com.marketup.nogocio.Funcionario;
import br.com.marketup.nogocio.Pessoa;
import br.com.marketup.nogocio.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class VendaDAO {
    
     private final Connection con;
    
    public VendaDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    ///Cadastro de venda
    public void CadastrarVenda(Venda obj){
        
        try {
                String sql = "INSERT INTO tb_vendas(clienteid,stvenda,datavenda,hrvenda,totalvenda,trocovenda,descvenda,"
                        + "acresvenda,funcionarioid,formapagamento,tipo,parcela,valorpagamento)"
                        + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, obj.getPessoa().getId());
                stmt.setString(2, obj.getSituacao());
                stmt.setString(3, obj.getDatavenda());
                stmt.setString(4, obj.getHoravenda());
                stmt.setDouble(5, obj.getTotalvenda());
                stmt.setDouble(6, obj.getTrocovenda());
                stmt.setDouble(7, obj.getDescvenda());
                stmt.setDouble(8, obj.getAcresvenda()); 
                stmt.setInt(9, obj.getFuncionario().getId());
                stmt.setString(10, obj.getFormadepagamento());
                stmt.setString(11, obj.getTipo());
                stmt.setInt(12, obj.getParcela());
                stmt.setDouble(13, obj.getValorpagamento());    
            
                stmt.execute();
                stmt.close();

                JOptionPane.showMessageDialog(null, " Venda Registrada com Sucesso! ");

            } catch (SQLException erro) {

                JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
           
    }

    ///Retorna Ultima Venda
    public int retornaUltimaVenda(){
        
            try {
                int idvenda=0;

                String sql ="SELECT MAX(id) id FROM tb_vendas";
                PreparedStatement ps = con.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

                if(rs.next()){
                    Venda v = new Venda();
                    v.setId(rs.getInt("id"));
                    idvenda = v.getId();
                }

                return idvenda;

            } catch (SQLException erro) {
                throw new RuntimeException(erro);
            }
    }
    
    //Lista venda
    public List<Venda> listarVendas(){
        
        try {
            
            List<Venda> lista = new ArrayList<>();
            
            String sql = "SELECT v.id, p.nome,v.stvenda,DATE_FORMAT(v.datavenda,'%d/%m/%y')AS dtformat,TIME_FORMAT(v.hrvenda,'%h:%i:%s')AS hrformat,"
                    + "v.totalvenda,v.trocovenda,v.descvenda,"
                  + "v.acresvenda,f.nomecurto,v.formapagamento,v.tipo,v.parcela,v.valorpagamento FROM tb_vendas AS v "
                  + "INNER JOIN tb_funcionarios AS f ON (v.funcionarioid = f.id)"
                  + "INNER JOIN tb_pessoa AS p ON (v.clienteid = p.id)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Venda obj = new Venda();
                Pessoa p = new Pessoa();
                Funcionario f = new Funcionario();
                
                obj.setId(rs.getInt("v.id"));
                p.setNome(rs.getString("p.nome"));
                obj.setSituacao(rs.getString("v.stvenda"));
                obj.setDatavenda(rs.getString("dtformat"));
                obj.setHoravenda(rs.getString("hrformat"));
                obj.setTotalvenda(rs.getDouble("v.totalvenda"));
                obj.setTrocovenda(rs.getDouble("v.trocovenda"));
                obj.setDescvenda(rs.getDouble("v.descvenda"));
                obj.setAcresvenda(rs.getDouble("v.acresvenda"));
                f.setNomecurto(rs.getString("f.nomecurto"));
                obj.setFormadepagamento(rs.getString("v.formapagamento"));
                obj.setTipo(rs.getString("v.tipo"));
                obj.setParcela(rs.getInt("v.parcela"));
                obj.setValorpagamento(rs.getDouble("v.valorpagamento"));
                
                obj.setPessoa(p);
                obj.setFuncionario(f);
                
                lista.add(obj);

            }
            
            return lista;
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    //Listar vendas por periodo
    public List<Venda> listarVendasPorPeriodo(LocalDate dtInicial, LocalDate dtFinal){
        
        try {
            
            List<Venda> lista = new ArrayList<>();
            
            String sql = "SELECT v.id, p.nome,v.stvenda,DATE_FORMAT(v.datavenda,'%d/%m/%y')AS dtformat,TIME_FORMAT(v.hrvenda,'%h:%i:%s')AS hrformat,"
                  + "v.totalvenda,v.trocovenda,v.descvenda,"
                  + "v.acresvenda,f.nomecurto,v.formapagamento,v.tipo,v.parcela,v.valorpagamento FROM tb_vendas AS v "
                  + "INNER JOIN tb_funcionarios AS f ON (v.funcionarioid = f.id)"
                  + "INNER JOIN tb_pessoa AS p ON (v.clienteid = p.id)"
                  + "WHERE v.datavenda BETWEEN ? AND ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, dtInicial.toString());
            stmt.setString(2, dtFinal.toString());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Venda obj = new Venda();
                Pessoa p = new Pessoa();
                Funcionario f = new Funcionario();
                
                obj.setId(rs.getInt("v.id"));
                p.setNome(rs.getString("p.nome"));
                obj.setSituacao(rs.getString("v.stvenda"));
                obj.setDatavenda(rs.getString("dtformat"));
                obj.setHoravenda(rs.getString("hrformat"));
                obj.setTotalvenda(rs.getDouble("v.totalvenda"));
                obj.setTrocovenda(rs.getDouble("v.trocovenda"));
                obj.setDescvenda(rs.getDouble("v.descvenda"));
                obj.setAcresvenda(rs.getDouble("v.acresvenda"));
                f.setNomecurto(rs.getString("f.nomecurto"));
                obj.setFormadepagamento(rs.getString("v.formapagamento"));
                obj.setTipo(rs.getString("v.tipo"));
                obj.setParcela(rs.getInt("v.parcela"));
                obj.setValorpagamento(rs.getDouble("v.valorpagamento"));
                
                obj.setPessoa(p);
                obj.setFuncionario(f);
                
                lista.add(obj);

            }
            
            return lista;
            
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    //Excluir Venda
    public void excluirVenda(Venda obj){
    
           try {
            
            String sql="DELETE FROM tb_vendas WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getId());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, " Venda excluida com Sucesso! ");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }
    }
    
    //Busca venda por nome do cliente registrado na venda
    public List<Venda> buscarVendaPorNomeCliente(String nome){
        
        try {
            
            List<Venda> lista = new ArrayList<>();
            
            String sql = "SELECT v.id, p.nome,v.stvenda,DATE_FORMAT(v.datavenda,'%d/%m/%y')AS dtformat,TIME_FORMAT(v.hrvenda,'%h:%i:%s')AS hrformat,v.totalvenda,v.trocovenda,v.descvenda,"
                  + "v.acresvenda,f.nomecurto,v.formapagamento,v.tipo,v.parcela,v.valorpagamento FROM tb_vendas AS v "
                  + "INNER JOIN tb_funcionarios AS f ON (v.funcionarioid = f.id)"
                  + "INNER JOIN tb_pessoa AS p ON (v.clienteid = p.id) WHERE p.nome LIKE ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
                       
            while(rs.next()){
                Venda obj = new Venda();
                Pessoa p = new Pessoa();
                Funcionario f = new Funcionario();
                
                obj.setId(rs.getInt("v.id"));
                p.setNome(rs.getString("p.nome"));
                obj.setSituacao(rs.getString("v.stvenda"));
                obj.setDatavenda(rs.getString("dtformat"));
                obj.setHoravenda(rs.getString("hrformat"));
                obj.setTotalvenda(rs.getDouble("v.totalvenda"));
                obj.setTrocovenda(rs.getDouble("v.trocovenda"));
                obj.setDescvenda(rs.getDouble("v.descvenda"));
                obj.setAcresvenda(rs.getDouble("v.acresvenda"));
                f.setNomecurto(rs.getString("f.nomecurto"));
                obj.setFormadepagamento(rs.getString("v.formapagamento"));
                obj.setTipo(rs.getString("v.tipo"));
                obj.setParcela(rs.getInt("v.parcela"));
                obj.setValorpagamento(rs.getDouble("v.valorpagamento"));   
                
                obj.setFuncionario(f);
                obj.setPessoa(p);
                
                lista.add(obj);

            }            
            return lista;            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    //Busca venda por código de venda
    public List<Venda> buscarVendaPorCodigo(String codigo){
        
        try {
            
            List<Venda> lista = new ArrayList<>();
            
            String sql = "SELECT v.id, p.nome,v.stvenda,DATE_FORMAT(v.datavenda,'%d/%m/%y')AS dtformat,TIME_FORMAT(v.hrvenda,'%h:%i:%s')AS hrformat,v.totalvenda,v.trocovenda,v.descvenda,"
                  + "v.acresvenda,f.nomecurto,v.formapagamento,v.tipo,v.parcela,v.valorpagamento FROM tb_vendas AS v "
                  + "INNER JOIN tb_funcionarios AS f ON (v.funcionarioid = f.id)"
                  + "INNER JOIN tb_pessoa AS p ON (v.clienteid = p.id) WHERE v.id= ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, codigo);
            ResultSet rs = stmt.executeQuery();
                       
            while(rs.next()){
                Venda obj = new Venda();
                Pessoa p = new Pessoa();
                Funcionario f = new Funcionario();
                
                obj.setId(rs.getInt("v.id"));
                p.setNome(rs.getString("p.nome"));
                obj.setSituacao(rs.getString("v.stvenda"));
                obj.setDatavenda(rs.getString("dtformat"));
                obj.setHoravenda(rs.getString("hrformat"));
                obj.setTotalvenda(rs.getDouble("v.totalvenda"));
                obj.setTrocovenda(rs.getDouble("v.trocovenda"));
                obj.setDescvenda(rs.getDouble("v.descvenda"));
                obj.setAcresvenda(rs.getDouble("v.acresvenda"));
                f.setNomecurto(rs.getString("f.nomecurto"));
                obj.setFormadepagamento(rs.getString("v.formapagamento"));
                obj.setTipo(rs.getString("v.tipo"));
                obj.setParcela(rs.getInt("v.parcela"));
                obj.setValorpagamento(rs.getDouble("v.valorpagamento"));   
                
                obj.setFuncionario(f);
                obj.setPessoa(p);
                
                lista.add(obj);

            }            
            return lista;            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    //Consultar venda por nome cliente direto
    public Venda consultarPorCliente(String nome){
        
        try {
            
            String sql = "SELECT v.id, p.nome,v.stvenda,DATE_FORMAT(v.datavenda,'%d/%m/%y')AS dtformat,TIME_FORMAT(v.hrvenda,'%h:%i:%s')AS hrformat,v.totalvenda,v.trocovenda,v.descvenda,"
                  + "v.acresvenda,f.nomecurto,v.formapagamento,v.tipo,v.parcela,v.valorpagamento FROM tb_vendas AS v "
                  + "INNER JOIN tb_funcionarios AS f ON (v.funcionarioid = f.id)"
                  + "INNER JOIN tb_pessoa AS p ON (v.clienteid = p.id) WHERE p.nome = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            Venda obj = new Venda();
            Pessoa p = new Pessoa();
            Funcionario f = new Funcionario();
                       
            if(rs.next()){              
                
                obj.setId(rs.getInt("v.id"));
                p.setNome(rs.getString("p.nome"));
                obj.setSituacao(rs.getString("v.stvenda"));
                obj.setDatavenda(rs.getString("dtformat"));
                obj.setHoravenda(rs.getString("hrformat"));
                obj.setTotalvenda(rs.getDouble("v.totalvenda"));
                obj.setTrocovenda(rs.getDouble("v.trocovenda"));
                obj.setDescvenda(rs.getDouble("v.descvenda"));
                obj.setAcresvenda(rs.getDouble("v.acresvenda"));
                f.setNomecurto(rs.getString("f.nomecurto"));
                obj.setFormadepagamento(rs.getString("v.formapagamento"));
                obj.setTipo(rs.getString("v.tipo"));
                obj.setParcela(rs.getInt("v.parcela"));
                obj.setValorpagamento(rs.getDouble("v.valorpagamento"));   
                
                obj.setFuncionario(f);
                obj.setPessoa(p);

            }            
            return obj;            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    //Consultar venda por id
    public Venda consultarPorCodigo(String codigo){
        
        try {
            
            String sql = "SELECT v.id, p.nome,v.stvenda,DATE_FORMAT(v.datavenda,'%d/%m/%y')AS dtformat,TIME_FORMAT(v.hrvenda,'%h:%i:%s')AS hrformat,v.totalvenda,v.trocovenda,v.descvenda,"
                  + "v.acresvenda,f.nomecurto,v.formapagamento,v.tipo,v.parcela,v.valorpagamento FROM tb_vendas AS v "
                  + "INNER JOIN tb_funcionarios AS f ON (v.funcionarioid = f.id)"
                  + "INNER JOIN tb_pessoa AS p ON (v.clienteid = p.id) WHERE v.id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            Venda obj = new Venda();
            Pessoa p = new Pessoa();
            Funcionario f = new Funcionario();
                       
            if(rs.next()){              
                
                obj.setId(rs.getInt("v.id"));
                p.setNome(rs.getString("p.nome"));
                obj.setSituacao(rs.getString("v.stvenda"));
                obj.setDatavenda(rs.getString("dtformat"));
                obj.setHoravenda(rs.getString("hrformat"));
                obj.setTotalvenda(rs.getDouble("v.totalvenda"));
                obj.setTrocovenda(rs.getDouble("v.trocovenda"));
                obj.setDescvenda(rs.getDouble("v.descvenda"));
                obj.setAcresvenda(rs.getDouble("v.acresvenda"));
                f.setNomecurto(rs.getString("f.nomecurto"));
                obj.setFormadepagamento(rs.getString("v.formapagamento"));
                obj.setTipo(rs.getString("v.tipo"));
                obj.setParcela(rs.getInt("v.parcela"));
                obj.setValorpagamento(rs.getDouble("v.valorpagamento"));   
                
                obj.setFuncionario(f);
                obj.setPessoa(p);

            }            
            return obj;            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    //metod que lista itens de uma venda
    public List<Venda> listaPagamentoVenda(int id){
        
        try {
            
            List<Venda> lista = new ArrayList<>();
            
            String sql = "SELECT v.formapagamento,v.tipo,v.parcela,v.valorpagamento FROM tb_vendas AS v "
                       + "WHERE v.id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Venda obj = new Venda();
                
                //obj.setId(rs.getInt("v.id"));
                obj.setFormadepagamento(rs.getString("v.formapagamento"));                
                obj.setTipo(rs.getString("v.tipo"));                
                obj.setParcela(rs.getInt("v.parcela"));                
                obj.setValorpagamento(rs.getDouble("v.valorpagamento"));                                
                
                //obj.setProduto(p);
                
                lista.add(obj);
            }
            
            return lista;            
                        
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ops, Ocorreu um erro!\n" + erro);
            return null;
        }
        
    }
    
    public Venda consultarClientePorCodigo(int id_venda){
        try {
            
            String sql = "SELECT v.id, p.id, p.cpf  FROM tb_vendas AS v " 
                       + "INNER JOIN tb_pessoa AS P ON (v.clienteid = p.id) "
                       + "WHERE v.id =  ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id_venda);
            ResultSet rs = stmt.executeQuery();
            
            Venda obj = new Venda();
            Pessoa p = new Pessoa();
            
            if(rs.next()){

                obj.setId(rs.getInt("id"));
                p.setId(rs.getInt("id"));
                p.setCpf(rs.getString("cpf"));

            }
            return obj;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "CPF não Encontrado!\n");
            return null;
        }
    }
    
    ///Retorna total de vendas por data
    public double retornaTotalVendaPorData(LocalDate datavenda){
        
            try {
                double totalvenda =0;

                String sql ="SELECT SUM(totalvenda) AS total FROM tb_vendas WHERE datavenda = ?";
                
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, datavenda.toString());

                ResultSet rs = ps.executeQuery();

                if(rs.next()){
                    totalvenda = rs.getDouble("total");
                }

                return totalvenda;

            } catch (SQLException erro) {
                throw new RuntimeException(erro);
            }
    }
}
