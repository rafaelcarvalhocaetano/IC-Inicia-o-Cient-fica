package view;

import gnu.io.*;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Carvalho Caetano - TCC UNINOVE
 */
public class ViewVertical extends javax.swing.JFrame implements SerialPortEventListener{

    
    public ViewVertical() {
        initComponents();
    }
    
    private String[] portNameList;  //retorna uma lista de portas disponivel SO
    private Enumeration buscaListPort; //tbm retorna uma lista de portas disponiveis
    private CommPortIdentifier portaAtual;
    private int portaSerialAux; //auxilia na conversão das portas seriais
    private String serialPortaNameAux;
    private CommPortIdentifier idPorta; //identificador da porta
    private SerialPort serialPort;
    private String appName = "Supervisorio";
    private int timeOut = 1000; // tempo de espera da porta serial
    private OutputStream output = null;
    private BufferedReader input = null;
    private String SERIAL_PORT_NAME;
    
    
    public String[] returnPort(){
        int i = 0;        
        buscaListPort = null;
        buscaListPort = CommPortIdentifier.getPortIdentifiers();
        portNameList = new String [10];
        
        while(buscaListPort.hasMoreElements()){
            portaAtual = (CommPortIdentifier) buscaListPort.nextElement();
            portNameList[i] = portaAtual.getName();
            
            i++;
        }
        return portNameList;        
    }
    
    public void numberSerial(){
        portaSerial.addItem("300");
        portaSerial.addItem("1200");
        portaSerial.addItem("2400");
        portaSerial.addItem("4800");
        portaSerial.addItem("9600");
        portaSerial.addItem("19200");
        portaSerial.addItem("38400");
        portaSerial.addItem("57600");
        portaSerial.addItem("115200");
        portaSerial.addItem("230400");
        portaSerial.addItem("250000");    
    }
    private void Modelo_Palca(){
        modeloPlca.addItem("Arduino Yún");
        modeloPlca.addItem("Arduino UNO");
        modeloPlca.addItem("Arduino Duemilanove");
        modeloPlca.addItem("Arduino Diecimila");
        modeloPlca.addItem("Arduino Nano");
        modeloPlca.addItem("Arduino Mega");
        modeloPlca.addItem("Arduino Mega 2560");
        modeloPlca.addItem("Arduino Mega ADK");
        modeloPlca.addItem("Arduino Leonardo");
        modeloPlca.addItem("Arduino Micro");
        modeloPlca.addItem("Arduino Esplora");
        modeloPlca.addItem("Arduino Mini");
        modeloPlca.addItem("Arduino Ethernet");
        modeloPlca.addItem("Arduino Fio");
        modeloPlca.addItem("Arduino BT");
       
    }
    
    
    public boolean inicia_serial(String serial_port_name, int number_port){
        boolean status = false;
        try {
            buscaListPort = null;
            buscaListPort = CommPortIdentifier.getPortIdentifiers();
            idPorta = null;
            
            while(idPorta == null || buscaListPort.hasMoreElements()){
                
                CommPortIdentifier porta_atual = (CommPortIdentifier) buscaListPort.nextElement(); 
                if(porta_atual.getName().equals(serial_port_name) || porta_atual.getName().startsWith(serial_port_name)){
                    serialPort = (SerialPort) porta_atual.open(appName, timeOut);
                    idPorta = porta_atual;
                    
                    System.out.println("Conectado a porta serial: "+idPorta.getName());
                    System.out.println("Taxa de transmissão: "+number_port);
                    break;
                }
                
            }
            serialPort.setSerialPortParams(number_port, serialPort.DATABITS_8, serialPort.STOPBITS_1, serialPort.PARITY_NONE);
            serialPort.addEventListener(this);
            serialPort.notifyOnDataAvailable(true);
            
            status = true;
            
            if(idPorta == null || serialPort == null){
                return false;
            }
        } catch (Exception e) {
            System.out.println("Erro em INICIA SERIAL");
            e.printStackTrace();
            return false;
        }
        return status;
    }
    
    public void enviarDados(String dados){
        try {
            output = serialPort.getOutputStream();
            output.write(dados.getBytes());
            
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    public synchronized void closeSerial(){
        if(serialPort != null){
            serialPort.removeEventListener();
            serialPort.close();
        }
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        PInfor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PAlunos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        PControleAcesso = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        PConexao = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buscarConexao = new javax.swing.JLabel();
        conectar = new javax.swing.JLabel();
        desconectar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        modeloPlca = new javax.swing.JComboBox<>();
        portaSerial = new javax.swing.JComboBox<>();
        portas = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        main.setBackground(new java.awt.Color(255, 255, 255));

        PInfor.setBackground(new java.awt.Color(2, 26, 39));

        jLabel1.setBackground(new java.awt.Color(27, 64, 90));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONEXÃO");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(27, 64, 90));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTROLE");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(27, 64, 90));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ALUNOS");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONTROLE DE ACESSO");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Vani", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Add User Group Man Man-30.png"))); // NOI18N

        javax.swing.GroupLayout PInforLayout = new javax.swing.GroupLayout(PInfor);
        PInfor.setLayout(PInforLayout);
        PInforLayout.setHorizontalGroup(
            PInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PInforLayout.createSequentialGroup()
                .addGroup(PInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PInforLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PInforLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel8)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        PInforLayout.setVerticalGroup(
            PInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInforLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PAlunos.setBackground(new java.awt.Color(255, 255, 255));
        PAlunos.setPreferredSize(new java.awt.Dimension(600, 509));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Close Window-30 (2).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setBackground(new java.awt.Color(27, 64, 90));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("NOME");
        jLabel19.setOpaque(true);

        jLabel20.setBackground(new java.awt.Color(27, 64, 90));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("MÊS");
        jLabel20.setOpaque(true);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel21.setBackground(new java.awt.Color(27, 64, 90));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("BUSCAR");
        jLabel21.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, 146, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PAlunosLayout = new javax.swing.GroupLayout(PAlunos);
        PAlunos.setLayout(PAlunosLayout);
        PAlunosLayout.setHorizontalGroup(
            PAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAlunosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAlunosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        PAlunosLayout.setVerticalGroup(
            PAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAlunosLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PControleAcesso.setBackground(new java.awt.Color(255, 255, 255));
        PControleAcesso.setPreferredSize(new java.awt.Dimension(600, 509));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Close Window-30 (2).png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PControleAcessoLayout = new javax.swing.GroupLayout(PControleAcesso);
        PControleAcesso.setLayout(PControleAcessoLayout);
        PControleAcessoLayout.setHorizontalGroup(
            PControleAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PControleAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PControleAcessoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );
        PControleAcessoLayout.setVerticalGroup(
            PControleAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PControleAcessoLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PConexao.setBackground(new java.awt.Color(255, 255, 255));
        PConexao.setPreferredSize(new java.awt.Dimension(600, 509));

        jLabel10.setBackground(new java.awt.Color(27, 64, 90));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MODELO DA PLACA :");
        jLabel10.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(27, 64, 90));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PORTA SERIAL :");
        jLabel12.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(27, 64, 90));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PORTA :");
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(27, 64, 90));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("STATUS :");
        jLabel17.setOpaque(true);

        buscarConexao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarConexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Processor-50.png"))); // NOI18N
        buscarConexao.setText("BUSCAR CONEXÃO");
        buscarConexao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarConexaoMouseClicked(evt);
            }
        });

        conectar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Data Transfer Filled-38.png"))); // NOI18N
        conectar.setText("CONECTAR");
        conectar.setEnabled(false);
        conectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conectarMouseClicked(evt);
            }
        });

        desconectar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desconectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Logout Rounded Down Filled-38.png"))); // NOI18N
        desconectar.setText("DESCONECTAR");
        desconectar.setEnabled(false);
        desconectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desconectarMouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(27, 64, 90));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DADOS DA CONEXÃO RFID");
        jLabel14.setOpaque(true);

        modeloPlca.setBorder(null);
        modeloPlca.setEnabled(false);

        portaSerial.setEnabled(false);

        portas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        portas.setEnabled(false);

        jLabel18.setBackground(new java.awt.Color(27, 64, 90));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("DESCONECTADO");
        jLabel18.setOpaque(true);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Close Window-30 (2).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PConexaoLayout = new javax.swing.GroupLayout(PConexao);
        PConexao.setLayout(PConexaoLayout);
        PConexaoLayout.setHorizontalGroup(
            PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PConexaoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PConexaoLayout.createSequentialGroup()
                        .addComponent(buscarConexao)
                        .addGap(42, 42, 42)
                        .addComponent(conectar)
                        .addGap(34, 34, 34)
                        .addComponent(desconectar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PConexaoLayout.createSequentialGroup()
                        .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PConexaoLayout.createSequentialGroup()
                                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(modeloPlca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(portaSerial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(portas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))))
                        .addGap(0, 42, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PConexaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PConexaoLayout.setVerticalGroup(
            PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PConexaoLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(76, 76, 76)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modeloPlca)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(portaSerial)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(portas)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarConexao)
                    .addComponent(conectar)
                    .addComponent(desconectar))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(PInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                    .addGap(0, 230, Short.MAX_VALUE)
                    .addComponent(PControleAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                    .addGap(0, 232, Short.MAX_VALUE)
                    .addComponent(PAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(PConexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PControleAcesso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       PConexao.setVisible(true);
       PControleAcesso.setVisible(false);
       PAlunos.setVisible(false);
       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        PConexao.setVisible(false);
        PControleAcesso.setVisible(true);
        PAlunos.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        PConexao.setVisible(false);
        PControleAcesso.setVisible(false);
        PAlunos.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void buscarConexaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarConexaoMouseClicked
       
        //inicializa o combobox vazio
        portaSerial.setModel(new DefaultComboBoxModel(new String[]{
        
        }));
        //inicializa o combobox vazio
        modeloPlca.setModel(new DefaultComboBoxModel(new String[]{
            
        }));
        //inicializa o combobox vazio
        portas.setModel(new DefaultComboBoxModel(new String[] {
            
        }));
        returnPort();
        for (int i = 0; i < portNameList.length; i++) {
             portas.addItem(portNameList[i]);
        }
        if(portNameList[0] != null){
            portaSerial.setEnabled(true);
            modeloPlca.setEnabled(true);
            portas.setEnabled(true);
            conectar.setEnabled(true);
            desconectar.setEnabled(true);
            info.setText("Informe os valores e click em conectar");
            
            numberSerial();
            Modelo_Palca();
        }else if(portNameList[0] == null){
            info.setText("Nenhuma porta encontrada ... ");
            JOptionPane.showMessageDialog(null, "Nenhuma porta localizada\nVerifique a conexão e tente novamente");
            info.setText("Click em buscar ... ");
            portaSerial.setEnabled(true);
            modeloPlca.setEnabled(true);
            portas.setEnabled(true);
            conectar.setEnabled(false);
            desconectar.setEnabled(false);
        }
    }//GEN-LAST:event_buscarConexaoMouseClicked

    private void conectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectarMouseClicked
       
        SERIAL_PORT_NAME = (String) (portas.getSelectedItem());
        portaSerialAux = Integer.parseInt((String) portaSerial.getSelectedItem());
        
        if(inicia_serial(SERIAL_PORT_NAME, portaSerialAux)){
            portaSerial.setEnabled(false);
            modeloPlca.setEnabled(false);
            portas.setEnabled(false);
            conectar.setEnabled(false);
            desconectar.setEnabled(true);
            buscarConexao.setEnabled(false);
            info.setText("CONECTADO COM SUCESSO ... ");
            
        }
    }//GEN-LAST:event_conectarMouseClicked

    private void desconectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desconectarMouseClicked
        closeSerial();
        portaSerial.setEnabled(true);
        modeloPlca.setEnabled(true);
            portas.setEnabled(true);
            conectar.setEnabled(true);
            desconectar.setEnabled(true);
            buscarConexao.setEnabled(true);
            info.setText("DESCONECTADO COM SUCESSO ... ");
            System.out.println("--------DESCONECTADO--------");
    }//GEN-LAST:event_desconectarMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVertical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PAlunos;
    private javax.swing.JPanel PConexao;
    private javax.swing.JPanel PControleAcesso;
    private javax.swing.JPanel PInfor;
    private javax.swing.JLabel buscarConexao;
    private javax.swing.JLabel conectar;
    private javax.swing.JLabel desconectar;
    private javax.swing.JLabel info;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel main;
    private javax.swing.JComboBox<String> modeloPlca;
    private javax.swing.JComboBox<String> portaSerial;
    private javax.swing.JComboBox<String> portas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void serialEvent(SerialPortEvent spe) {
    
    }

   
}
