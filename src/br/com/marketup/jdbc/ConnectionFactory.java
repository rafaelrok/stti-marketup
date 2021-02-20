
package br.com.marketup.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rafae
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        
        try {
            
            return DriverManager.getConnection("jdbc:mysql://localhost/softtechti_marketup","admin","@123456@");
                    
        } catch (SQLException erro) {
            
            throw new RuntimeException(erro);
        }
        
    }
    
}
