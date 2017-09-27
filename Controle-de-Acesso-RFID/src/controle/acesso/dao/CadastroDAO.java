package controle.acesso.dao;

import controle.acesso.bean.CadastroAluno;
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

    public ArrayList<CadastroAluno> listar() throws SQLException {

        StringBuilder sql = new StringBuilder();

        sql.append("SELECT a.codigo, a.nome, a.rg, a.cpf, a.tipo ");
        sql.append("FROM arduino a ");
        
        Connection conexao = Conexao.conexao();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());

        ResultSet r = ps.executeQuery();
        ArrayList<CadastroAluno> itens = new ArrayList<CadastroAluno>();

        while (r.next()) {

            CadastroAluno ca = new CadastroAluno();
            ca.setCodigo(r.getString("a.codigo"));
            ca.setNome(r.getString("a.nome"));
            ca.setRg(r.getString("a.rg"));
            ca.setCpf(r.getString("a.cpf"));
            ca.setTipo(r.getString("a.tipo"));
            itens.add(ca);
        }
        return itens;
    }
    

    public void salvar(CadastroAluno c) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO arduino (id, codigo, nome, rg, cpf, curso, tipo) VALUES (?,?,?,?,?,?,?) ");
        
        Connection con;
        try {

            con = Conexao.conexao();
            PreparedStatement ptt = con.prepareStatement(sql.toString());
            
            ptt.setString(1, c.getId());
            ptt.setString(2, c.getCodigo());
            ptt.setString(3, c.getNome());
            ptt.setString(4, c.getRg());
            ptt.setString(5, c.getCpf());
            ptt.setString(6, c.getCurso());
            /*
            Date hj = new Date();
            SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");
            c.setEntrada(sp.format(hj));
            c.setSaida(sp.format(hj));
            */
        
            ptt.setString(7, c.getTipo());
           
            ptt.executeUpdate();

            System.out.println("SALVO COM SUCESSO " + c.getId());

        } catch (SQLException ex) {
            System.out.println("ERRO AO SALVAR O ALUNO NA CAMADA DAO");
            ex.printStackTrace();
        }

    }
}
