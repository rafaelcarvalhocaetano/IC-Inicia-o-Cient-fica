/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Developer
 */
public class data {
    
    public static void main(String[] args) {
        Date data = new Date();
        Locale.setDefault(new Locale("pt", "BR"));
        String entra = DateFormat.getInstance().format(data);
        System.out.println(entra);
    }
    
    

    
        
      
}
