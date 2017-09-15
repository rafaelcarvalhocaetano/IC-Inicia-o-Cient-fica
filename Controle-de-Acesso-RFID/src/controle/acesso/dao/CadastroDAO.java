
package controle.acesso.dao;

import controle.acesso.bean.CadastroBean;
import controle.acesso.factory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class CadastroDAO {

    public boolean selecionar(CadastroBean cb) {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT id FROM arduino ");

            Connection c = Conexao.conexao();
            PreparedStatement ps = c.prepareStatement(sql.toString());
            
            ps.setInt(1, cb.getId());
            ps.executeQuery();

            return true;

        } catch (SQLException e) {
            System.err.println("Ocorreu um erro ao selecionar "+e);
            return false;

        }

    }
    public static boolean save(CadastroBean cb){
        
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO arduino (id) VALUES (?) ");
            
            Connection c = Conexao.conexao();
            PreparedStatement ps = c.prepareStatement(sql.toString());
            
            ps.setInt(1, cb.getId());
            
            ps.executeUpdate();
            
            return true;
                    
        } catch (SQLException e) {
            System.err.println("Erro ao inserir "+e);
            return false;
        }
    }
    /*
    public static void main(String[] args) {
        CadastroBean cb = new CadastroBean();
        cb.setId(23232323);
        
        CadastroDAO dao = new CadastroDAO();
        dao.save(cb);
    }
    */
}
