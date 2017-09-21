package controle.acesso.dao;

import controle.acesso.bean.Cadastro;
import controle.acesso.factory.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

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

    public void salvarInformacoes(Cadastro c) {

        Connection con;
        try {

            con = Conexao.conexao();
            PreparedStatement ptt = con.prepareStatement("INSERT INTO arduino (id) VALUES (?)");
            ptt.setString(1, c.getId());
            ptt.setString(2, c.getNome());
            ptt.setString(3, c.getCpf());
            ptt.setString(4, c.getRg());

            ptt.setString(5, c.getCurso());

            ptt.setString(6, c.getEntrada());
            ptt.setString(7, c.getSaida());

            ptt.executeUpdate();

            System.out.println("SALVO COM SUCESSO " + c.getId());

        } catch (SQLException ex) {

        }

    }
    public void cadastrar(Cadastro c) {

        Connection con;
        try {

            con = Conexao.conexao();
            PreparedStatement ptt = con.prepareStatement("INSERT INTO arduino (id, nome, rg, cpf, curso) VALUES (?, ?, ?, ?, ?)");
            ptt.setString(1, c.getId());
            ptt.setString(2, c.getNome());
            ptt.setString(3, c.getRg());
            ptt.setString(4, c.getCpf());

            ptt.setString(5, c.getCurso());
            ptt.executeUpdate();

            System.out.println("SALVO COM SUCESSO " + c.getId());

        } catch (SQLException ex) {

        }

    }

}
