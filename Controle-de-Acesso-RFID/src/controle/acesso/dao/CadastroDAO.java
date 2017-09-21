package controle.acesso.dao;

import controle.acesso.bean.Cadastro;
import controle.acesso.factory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class CadastroDAO {

    public ArrayList<Cadastro> listar() throws SQLException {

        StringBuilder sql = new StringBuilder();

        sql.append("SELECT id ");
        sql.append("FROM arduino");

        Connection conexao = Conexao.conexao();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());

        ResultSet resultado = ps.executeQuery();
        ArrayList<Cadastro> itens = new ArrayList<Cadastro>();

        while (resultado.next()) {

            Cadastro ca = new Cadastro();
            ca.setId(resultado.getString("id"));
            itens.add(ca);
        }
        return itens;
    }

    public void salvar(Cadastro c) {

        Connection con;
        try {
            
            con = Conexao.conexao();
            PreparedStatement ptt = con.prepareStatement("INSERT INTO arduino (id) VALUES (?)");
            ptt.setString(1, c.getId());
            ptt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO ...");
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERRO AO SALVAR ...");
        }

    }

}
