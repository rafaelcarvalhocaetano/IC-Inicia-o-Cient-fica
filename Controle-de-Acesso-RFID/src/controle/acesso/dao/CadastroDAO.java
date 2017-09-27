package controle.acesso.dao;

import controle.acesso.bean.CadastroAluno;
import controle.acesso.factory.Conexao;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class CadastroDAO {

    public ArrayList<CadastroAluno> listar() throws SQLException {

        StringBuilder sql = new StringBuilder();

        sql.append("SELECT codigo ");
        sql.append("FROM arduino");
        
        Connection conexao = Conexao.conexao();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());

        ResultSet resultado = ps.executeQuery();
        ArrayList<CadastroAluno> itens = new ArrayList<CadastroAluno>();

        while (resultado.next()) {

            CadastroAluno ca = new CadastroAluno();
            ca.setId(resultado.getString("codigo"));
            itens.add(ca);
        }
        return itens;
    }
    

    public void salvar(CadastroAluno c) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO arduino (id, codigo, nome, rg, cpf, curso, entrada, saida, tipo) VALUES (?,?,?,?,?,?,?,?,?) ");
        
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
            
            Date hj = new Date();
            SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");
            c.setEntrada(sp.format(hj));
            c.setSaida(sp.format(hj));            
            
            ptt.setString(7, c.getEntrada());
            ptt.setString(8, c.getSaida());
            ptt.setString(9, c.getTipo());
           
            ptt.executeUpdate();

            System.out.println("SALVO COM SUCESSO " + c.getId());

        } catch (SQLException ex) {
            System.out.println("ERRO AO SALVAR O ALUNO NA CAMADA DAO");
            ex.printStackTrace();
        }

    }
}
