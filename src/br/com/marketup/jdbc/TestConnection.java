
package br.com.marketup.jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class TestConnection {
    
    public static void main(String[] args) {
        
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null,"Conectado com Sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Ops, ocorreu um erro!" + erro);
        }
    }
    
}
