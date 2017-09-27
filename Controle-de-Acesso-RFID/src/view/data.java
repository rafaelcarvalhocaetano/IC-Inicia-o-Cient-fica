/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controle.acesso.bean.Cadastro;

import controle.acesso.dao.CadastroDAO;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Developer
 */
public class data {
    
    public static void main(String[] args) {
        /*
        Date data = new Date();
        Locale.setDefault(new Locale("pt", "BR"));
        String entra = DateFormat.getInstance().format(data);
        System.out.println(entra);
       
        SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        System.out.println(" "+sp.format(data.getTime()));
       
       
        CadastroDAO dao = new CadastroDAO();
        Cadastro ca = new Cadastro();
        
        ca.setCodigo("12345678");
        ca.setNome("Rafael Carvalho Caetano");
        ca.setRg("11.222.333-3");
        ca.setCpf("999.888.777-66");
        ca.setCurso("SI");
        Date hj = new Date();
        
        ca.setEntrada(hj.toString());
        ca.setSaida(hj.toString());
    
        
        dao.salvarAluno(ca);
        System.out.println("SALVO COM SUCESSO ");
        
        /*
        CadastroDAO dao = new CadastroDAO();
        CadastroP p = new CadastroP();
        p.setCodigo("12345678");
        p.setNome("Rafael Carvalho Caetano");
        p.setRg("11.222.333-3");
        p.setCpf("999.888.777-66");
        Date hj = new Date();
        
        p.setEntrada(hj.toString());
        p.setSaida(hj.toString());
    
        
        dao.salvarProfessor(p);
        System.out.println("salvo util");
        
        
        CadastroDAO dao = new CadastroDAO();
        CadastroP ca = new CadastroP();
        
        try {
           List<CadastroP> itens = dao.listarP();
            
            for (CadastroP c : itens) {
                System.out.println("nome "+c.getNome());
                
            }
        } catch (SQLException ex) {
            System.out.println("Erro aqui .. ");
        }
*/
        
    
    }
    
    

    
        
      
}
