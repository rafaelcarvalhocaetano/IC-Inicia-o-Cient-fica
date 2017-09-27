package controle.acesso.dao;

import controle.acesso.bean.Cadastro;
import controle.acesso.factory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class CadastroDAO {

    public ArrayList<Cadastro> listar() throws SQLException {

        StringBuilder sql = new StringBuilder();

        sql.append("SELECT a.codigo, a.nome, a.rg, a.cpf, a.tipo ");
        sql.append("FROM arduino a ");
        
        Connection conexao = Conexao.conexao();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());

        ResultSet r = ps.executeQuery();
        ArrayList<Cadastro> itens = new ArrayList<Cadastro>();

        while (r.next()) {

            Cadastro ca = new Cadastro();
            ca.setCodigo(r.getString("a.codigo"));
            ca.setNome(r.getString("a.nome"));
            ca.setRg(r.getString("a.rg"));
            ca.setCpf(r.getString("a.cpf"));
            ca.setTipo(r.getString("a.tipo"));
            itens.add(ca);
        }
        return itens;
    }
    public void salvar(Cadastro c) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO arduino (codigo, nome, rg, cpf, curso, tipo) VALUES (?,?,?,?,?,?) ");
        
        Connection con;
        try {
            con = Conexao.conexao();
            PreparedStatement ptt = con.prepareStatement(sql.toString());
            
            
            ptt.setString(1, c.getCodigo());
            ptt.setString(2, c.getNome());
            ptt.setString(3, c.getRg());
            ptt.setString(4, c.getCpf());
            ptt.setString(5, c.getCurso());
            /*
            Date hj = new Date();
            SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");
            c.setEntrada(sp.format(hj));
            c.setSaida(sp.format(hj));
            */
            ptt.setString(6, c.getTipo());
            ptt.executeUpdate();
            System.out.println("SALVO COM SUCESSO " + c.getId());
        } catch (SQLException ex) {
            System.out.println("ERRO AO SALVAR O ALUNO NA CAMADA DAO");
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Cadastro> listarPorCodigo(String c) throws SQLException {

        StringBuilder sql = new StringBuilder();

        sql.append("SELECT a.codigo, a.nome, a.rg, a.cpf, a.tipo ");
        sql.append("FROM arduino a WHERE codigo = '"+c+"' ");
        
        Connection conexao = Conexao.conexao();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());

        ResultSet r = ps.executeQuery();
        ArrayList<Cadastro> itens = new ArrayList<Cadastro>();

        while (r.next()) {

            Cadastro ca = new Cadastro();
            ca.setCodigo(r.getString("a.codigo"));
            ca.setNome(r.getString("a.nome"));
            ca.setRg(r.getString("a.rg"));
            ca.setCpf(r.getString("a.cpf"));
            ca.setTipo(r.getString("a.tipo"));
            itens.add(ca);
        }
        return itens;
    }
    
    
}
