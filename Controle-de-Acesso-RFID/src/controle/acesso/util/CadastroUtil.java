
package controle.acesso.util;

import gnu.io.*;
import java.util.Enumeration;

/**
 *
 * @author Rafael Carvalho
 */
public class CadastroUtil implements SerialPortEventListener{
    
    private String[] portNameList;  //retorna uma lista de portas disponivel SO
    private Enumeration buscaListPort; //tbm retorna uma lista de portas disponiveis
    private CommPortIdentifier portaAtual;
    
    public String[] returnPort(){
        int i = 0;
        buscaListPort = CommPortIdentifier.getPortIdentifiers();
        portNameList = new String [10];
        
        while(buscaListPort.hasMoreElements()){
            portaAtual = (CommPortIdentifier) buscaListPort.nextElement();
            portNameList[i] = portaAtual.getName();
            
            i++;
        }
        return portNameList;        
    }
    public void btnBuscar(){
        returnPort();
        for (int i = 0; i < portNameList.length; i++) {
            
        }
    }
    
    
    
    

    @Override
    public void serialEvent(SerialPortEvent spe) {
       
    }
    
    
    
    
    
   
    
}
