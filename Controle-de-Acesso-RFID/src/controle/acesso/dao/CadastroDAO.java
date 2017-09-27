package controle.acesso.dao;

import controle.acesso.bean.CadastroAluno;
import controle.acesso.bean.CadastroP;
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

    public ArrayList<CadastroAluno> listarAluno() throws SQLException {

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
    public ArrayList<CadastroP> listarP() throws SQLException {

        StringBuilder sql = new StringBuilder();

        sql.append("SELECT codigo ");
        sql.append("FROM professor");

        Connection conexao = Conexao.conexao();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());

        ResultSet resultado = ps.executeQuery();
        ArrayList<CadastroP> itens = new ArrayList<CadastroP>();

        while (resultado.next()) {

            CadastroP ca = new CadastroP();
            ca.setId(resultado.getString("codigo"));
            itens.add(ca);
        }
        return itens;
    }

    public void salvarAluno(CadastroAluno c) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO arduino (id, codigo, nome, rg, cpf, curso, entrada, saida) VALUES (?,?,?,?,?,?,?,?)");
        
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
           
            ptt.executeUpdate();

            System.out.println("SALVO COM SUCESSO " + c.getId());

        } catch (SQLException ex) {
            System.out.println("ERRO AO SALVAR O ALUNO NA CAMADA DAO");
            ex.printStackTrace();
        }

    }
    public void salvarProfessor(CadastroP p) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO professor (id, codigo, nome, rg, cpf, entrada, saida) VALUES (?,?,?,?,?,?,?)");
        
        Connection con;
        try {

            con = Conexao.conexao();
            PreparedStatement ptt = con.prepareStatement(sql.toString());
            
            ptt.setString(1, p.getId());
            ptt.setString(2, p.getCodigo());
            ptt.setString(3, p.getNome());
            ptt.setString(4, p.getRg());
            ptt.setString(5, p.getCpf());
                       
            Date hj = new Date();
            SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");
            p.setEntrada(sp.format(hj));
            p.setSaida(sp.format(hj));            
            
            ptt.setString(6, p.getEntrada());
            ptt.setString(7, p.getSaida());
           
            ptt.executeUpdate();

            System.out.println("SALVO COM SUCESSO DAO");

        } catch (SQLException ex) {
            System.out.println("ERRO AO SALVAR O PROFESSOR NA CAMADA DAO");
            ex.printStackTrace();
        }

    }
    
    

}
