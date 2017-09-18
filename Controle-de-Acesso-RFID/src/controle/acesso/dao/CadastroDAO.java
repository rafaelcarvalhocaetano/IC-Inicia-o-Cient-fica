
package controle.acesso.dao;

import controle.acesso.bean.CadastroBean;
import controle.acesso.factory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class CadastroDAO {

    public ArrayList<CadastroBean> listar() throws SQLException {

		StringBuilder sql = new StringBuilder();

		sql.append("SELECT id ");
		sql.append("FROM arduino");

		Connection conexao = Conexao.conexao();
		PreparedStatement ps = conexao.prepareStatement(sql.toString());

		ResultSet resultado = ps.executeQuery();

		ArrayList<CadastroBean> itens = new ArrayList<CadastroBean>();

		while (resultado.next()) {

			CadastroBean ca = new CadastroBean();

			ca.setId(resultado.getString("id"));
			
			itens.add(ca);
		}

		return itens;

	}
    
    public boolean salvar(CadastroBean cb){
        
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO arduino (id) VALUES (?) ");
            
            Connection c = Conexao.conexao();
            PreparedStatement ps = c.prepareStatement(sql.toString());
            
            ps.setString(1, cb.getId());
            
            ps.executeUpdate();
            
            return true;
                    
        } catch (SQLException e) {
            System.err.println("Erro ao inserir "+e);
            return false;
        }
    }
}

 
