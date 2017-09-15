
package controle.acesso.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael Carvalho
 */
public class Conexao {
    
    private static final String PASS = "q1w2e3r4";
    private static final String USER = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/rfid";
    
    
    public static Connection conexao() throws SQLException{
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        
        Connection conexao = DriverManager.getConnection(URL, USER, PASS);
        
        return conexao;
        
    }
    public static void closeConnection(Connection c){
        if(c != null){
            try {
                c.close();
            } catch (SQLException e) {
                System.err.println("Erro fabrica ao "+e);
            }
        }
    }
    public static void closeConnection(Connection c, PreparedStatement pst){
       if(pst != null){
           try {
               pst.close();
           } catch (SQLException e) {
                System.err.println("Erro fabrica ao "+e);
           }
       }
    }
    public static void closeConnection(Connection c, PreparedStatement pst, ResultSet rs){
       if(rs != null){
           try {
               rs.close();
           } catch (SQLException e) {
               System.err.println("Erro fabrica ao "+e);
           }
       }
        closeConnection(c, pst);
    }    
    
}
