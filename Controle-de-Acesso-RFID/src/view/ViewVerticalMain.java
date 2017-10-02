package view;

import arduino.ArduinoSerial;

import controle.acesso.bean.Cadastro;
import controle.acesso.dao.CadastroDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rafael Carvalho Caetano - TCC UNINOVE
 */
public class ViewVerticalMain extends javax.swing.JFrame {
    
    ArduinoSerial as = new ArduinoSerial("COM3");
    private boolean flag = true;
    
    Thread t = new Thread() {

        @Override
        public void run() {
            //as.initialize();

            while (flag) {

                txtId.setText(as.read());
                codigo.setText(as.read());
                
                if (as.read() != null) {
                   
                    System.out.println(as.read());
                    CadastroDAO dao = new CadastroDAO();
                    String a = codigo.getText();

                    DefaultTableModel model = (DefaultTableModel) lista.getModel();
                    model.setNumRows(0);

                    try {
                        //dao.listarPorCodigo(a);
                        for (Cadastro c : dao.listarPorCodigo(a)) {
                            model.addRow(new Object[]{
                                c.getCodigo(),
                                c.getNome(),
                                c.getCurso(),
                                c.getTipo()
                            });
                            //buscando.setText("Código: "+c.getCodigo()+" Nome: "+c.getNome()+"CURSO: "+c.getCurso());
                            
                            dao.salvar(c);
                            codigo.setText("");
                            txtId.setText("");
                            as.sleep(1000);
                            as.send("");
                        }
                    } catch (SQLException ex) {
                        System.out.println("ERRO ...ERRO ...");
                    }
                }
                
            }
        }
    };
    
   
    
    public ViewVerticalMain() {
        initComponents();

        DefaultTableModel modelo1 = (DefaultTableModel) tabela.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) lista.getModel();
        tabela.setRowSorter(new TableRowSorter(modelo1));
        lista.setRowSorter(new TableRowSorter(modelo2));

     
       t.start();
      
       
       
    }
    /*

    Thread controlarAcesso = new Thread(){
        @Override
        public void run() {
        
        CadastroDAO dao = new CadastroDAO();
        String a = codigo.getText();
        
        DefaultTableModel model = (DefaultTableModel) lista.getModel();
        model.setNumRows(0);
        
        try {
            //dao.listarPorCodigo(a);
            for(Cadastro c : dao.listarPorCodigo(a)){
                model.addRow(new Object[]{
                    c.getCodigo(),
                    c.getNome(),
                    c.getCurso(),
                    c.getTipo()
                });
                //buscando.setText("Código: "+c.getCodigo()+" Nome: "+c.getNome()+"CURSO: "+c.getCurso());
                dao.salvar(c);
                codigo.setText("");
                as.send("");
                as.sleep(1000);
            }
            
        } catch (SQLException ex) {
            System.out.println("ERRO ...ERRO ...");
        }
        }
    };
    public void atualizar(){
        
        CadastroDAO dao = new CadastroDAO();
        String a = codigo.getText();
        
        DefaultTableModel model = (DefaultTableModel) lista.getModel();
        model.setNumRows(0);
        
        try {
            //dao.listarPorCodigo(a);
            for(Cadastro c : dao.listarPorCodigo(a)){
                model.addRow(new Object[]{
                    c.getCodigo(),
                    c.getNome(),
                    c.getCurso(),
                    c.getTipo()
                });
                //buscando.setText("Código: "+c.getCodigo()+" Nome: "+c.getNome()+"CURSO: "+c.getCurso());
                dao.salvar(c);
                //codigo.setText("");
                as.sleep(1000);
                
                txtId.setText("");
                codigo.setText("");
            }
        } catch (SQLException ex) {
            System.out.println("ERRO ...ERRO ...");
        }
    }
     */
 /*
    public void ler() {
        try {
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            CadastroDAO dao = new CadastroDAO();
           
            for (Cadastro ca : dao.listar()) {

                model.addRow(new Object[]{
                    ca.getCodigo(),
                    ca.getNome()
                });
            }
        } catch (SQLException e) {
            System.out.println("Erro ao LER");
        }
    }
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        PControle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTable();
        btn_buscando = new javax.swing.JButton();
        buscando = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        PInfor = new javax.swing.JPanel();
        btn_aluno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_cadProfessores = new javax.swing.JLabel();
        btn_cadastrarAluno = new javax.swing.JLabel();
        BUSCAR = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        PAlunos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        PConexao = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtRg = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        salvar = new javax.swing.JLabel();
        cancelar = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        main.setBackground(new java.awt.Color(255, 255, 255));

        PControle.setBackground(new java.awt.Color(255, 255, 255));

        lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME", "RG", "CPF"
            }
        ));
        jScrollPane1.setViewportView(lista);
        if (lista.getColumnModel().getColumnCount() > 0) {
            lista.getColumnModel().getColumn(0).setResizable(false);
            lista.getColumnModel().getColumn(1).setResizable(false);
            lista.getColumnModel().getColumn(2).setResizable(false);
            lista.getColumnModel().getColumn(3).setResizable(false);
        }

        btn_buscando.setText("buscar");
        btn_buscando.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscandoMouseClicked(evt);
            }
        });
        btn_buscando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscandoActionPerformed(evt);
            }
        });

        buscando.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buscando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscando.setText("Buscando ...");
        buscando.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        codigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigo.setText("CÓDIGO");

        javax.swing.GroupLayout PControleLayout = new javax.swing.GroupLayout(PControle);
        PControle.setLayout(PControleLayout);
        PControleLayout.setHorizontalGroup(
            PControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PControleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_buscando)
                .addGap(267, 267, 267))
            .addGroup(PControleLayout.createSequentialGroup()
                .addGroup(PControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PControleLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PControleLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(buscando, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PControleLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        PControleLayout.setVerticalGroup(
            PControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PControleLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(codigo)
                .addGap(61, 61, 61)
                .addComponent(buscando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(btn_buscando)
                .addGap(102, 102, 102))
        );

        PInfor.setBackground(new java.awt.Color(2, 26, 39));

        btn_aluno.setBackground(new java.awt.Color(27, 64, 90));
        btn_aluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_aluno.setForeground(new java.awt.Color(255, 255, 255));
        btn_aluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_aluno.setText("ALUNOS");
        btn_aluno.setOpaque(true);
        btn_aluno.setPreferredSize(new java.awt.Dimension(55, 15));
        btn_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alunoMouseClicked(evt);
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

        btn_cadProfessores.setBackground(new java.awt.Color(27, 64, 90));
        btn_cadProfessores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cadProfessores.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadProfessores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cadProfessores.setText("CADASTRAR PROFESSOR");
        btn_cadProfessores.setOpaque(true);
        btn_cadProfessores.setPreferredSize(new java.awt.Dimension(55, 15));
        btn_cadProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadProfessoresMouseClicked(evt);
            }
        });

        btn_cadastrarAluno.setBackground(new java.awt.Color(27, 64, 90));
        btn_cadastrarAluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cadastrarAluno.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastrarAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cadastrarAluno.setText("CADASTRAR ALUNO");
        btn_cadastrarAluno.setOpaque(true);
        btn_cadastrarAluno.setPreferredSize(new java.awt.Dimension(55, 15));
        btn_cadastrarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarAlunoMouseClicked(evt);
            }
        });

        BUSCAR.setText("jButton2");
        BUSCAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BUSCARMouseClicked(evt);
            }
        });

        abrir.setText("ABRIR");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        fechar.setText("FECHAR");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PInforLayout = new javax.swing.GroupLayout(PInfor);
        PInfor.setLayout(PInforLayout);
        PInforLayout.setHorizontalGroup(
            PInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PInforLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(98, 98, 98))
            .addComponent(btn_aluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_cadastrarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_cadProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PInforLayout.createSequentialGroup()
                .addGroup(PInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PInforLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PInforLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BUSCAR))
                    .addGroup(PInforLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(abrir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        PInforLayout.setVerticalGroup(
            PInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInforLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(btn_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cadProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BUSCAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(abrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        PAlunos.setBackground(new java.awt.Color(255, 255, 255));
        PAlunos.setPreferredSize(new java.awt.Dimension(600, 509));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Close Window-30 (2).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CÓDIGO", "NOME"
            }
        ));
        tabela.setGridColor(new java.awt.Color(255, 255, 255));
        tabela.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
        }

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PConexao.setBackground(new java.awt.Color(255, 255, 255));
        PConexao.setPreferredSize(new java.awt.Dimension(600, 509));

        jLabel10.setBackground(new java.awt.Color(27, 64, 90));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NOME :");
        jLabel10.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(27, 64, 90));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CURSO :");
        jLabel12.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(27, 64, 90));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("RG :");
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(27, 64, 90));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CPF :");
        jLabel17.setOpaque(true);

        status.setBackground(new java.awt.Color(27, 64, 90));
        status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("STATUS DO CADASTRO");
        status.setOpaque(true);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Close Window-30 (2).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Plus Filled-30.png"))); // NOI18N
        salvar.setText(" SALVAR");
        salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarMouseClicked(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Delete-30.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        txtId.setBackground(new java.awt.Color(27, 64, 90));
        txtId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId.setText("ID - RFID");
        txtId.setOpaque(true);

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALUNO", "PROFESSOR" }));
        tipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setBackground(new java.awt.Color(27, 64, 90));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("TIPO :");
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout PConexaoLayout = new javax.swing.GroupLayout(PConexao);
        PConexao.setLayout(PConexaoLayout);
        PConexaoLayout.setHorizontalGroup(
            PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PConexaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PConexaoLayout.createSequentialGroup()
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PConexaoLayout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PConexaoLayout.createSequentialGroup()
                            .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PConexaoLayout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(PConexaoLayout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addComponent(salvar)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCurso)
                                .addComponent(txtNome)
                                .addComponent(txtRg)
                                .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cancelar)
                                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        PConexaoLayout.setVerticalGroup(
            PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PConexaoLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PConexaoLayout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(28, 28, 28)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(PConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(salvar))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(PInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PConexao, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                    .addGap(0, 242, Short.MAX_VALUE)
                    .addComponent(PAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                    .addGap(0, 237, Short.MAX_VALUE)
                    .addComponent(PControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PConexao, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btn_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alunoMouseClicked
        PConexao.setVisible(false);
        PAlunos.setVisible(true);
        try {
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            CadastroDAO dao = new CadastroDAO();

            for (Cadastro ca : dao.listar()) {

                model.addRow(new Object[]{
                    ca.getCodigo(),
                    ca.getNome()
                });
            }
        } catch (SQLException e) {
            System.out.println("Erro ao LER");
        }
    }//GEN-LAST:event_btn_alunoMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn_cadProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadProfessoresMouseClicked
        PConexao.setVisible(true);
        PAlunos.setVisible(false);
        txtCurso.setEnabled(false);

    }//GEN-LAST:event_btn_cadProfessoresMouseClicked

    private void btn_cadastrarAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarAlunoMouseClicked

        PConexao.setVisible(true);
        PAlunos.setVisible(false);
        txtCurso.setEnabled(true);
    }//GEN-LAST:event_btn_cadastrarAlunoMouseClicked

    private void salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMouseClicked

        Cadastro ca = new Cadastro();
        CadastroDAO dao = new CadastroDAO();

        ca.setCodigo(txtId.getText());
        ca.setNome(txtNome.getText());
        ca.setTipo((String) tipo.getSelectedItem());
        ca.setCurso(txtCurso.getText());
        ca.setRg(txtRg.getText());
        ca.setCpf(txtCpf.getText());
        /*
        if (txtId.getText() == null || txtNome.getText() == null || txtCurso.getText() == null || txtCpf.getText() == null) {
            JOptionPane.showMessageDialog(rootPane, "Todos os Campos são obrigatórios", "ERRO AO SALVAR", JOptionPane.ERROR_MESSAGE);
            System.out.println("erro aqui");
            return;
        }
         */

        dao.salvar(ca);
        //JOptionPane.showMessageDialog(rootPane, "SALVO COM SUCESSO", "SALVO", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("SALVO COM SUCESSO");

        //limpando campos
        txtId.setText(" ");
        as.send(" ");
        txtNome.setText("");
        tipo.getSelectedItem();
        txtCurso.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        status.setText("Cadastrado com sucesso ...");

    }//GEN-LAST:event_salvarMouseClicked

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        PConexao.setVisible(false);
    }//GEN-LAST:event_cancelarMouseClicked

    private void btn_buscandoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscandoMouseClicked


    }//GEN-LAST:event_btn_buscandoMouseClicked

    private void BUSCARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUSCARMouseClicked
        PControle.setVisible(true);
        PConexao.setVisible(false);
        PAlunos.setVisible(false);

    }//GEN-LAST:event_BUSCARMouseClicked


    private void btn_buscandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscandoActionPerformed

        CadastroDAO dao = new CadastroDAO();
        //Cadastro c = new Cadastro();
        String a = codigo.getText();
        //String b = as.read();

        DefaultTableModel model = (DefaultTableModel) lista.getModel();
        model.setNumRows(0);
        try {
            //dao.listarPorCodigo(a);
            for (Cadastro c : dao.listarPorCodigo(a)) {
                model.addRow(new Object[]{
                    c.getCodigo(),
                    c.getNome(),
                    c.getCurso(),
                    c.getTipo()
                });
                //buscando.setText("Código: "+c.getCodigo()+" Nome: "+c.getNome()+"CURSO: "+c.getCurso());
                if (a != null) {
                    dao.salvar(c);
                }
                codigo.setText("");

            }
        } catch (SQLException ex) {
            System.out.println("ERRO ...ERRO ...");
        }
    }//GEN-LAST:event_btn_buscandoActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        as.initialize();
        System.out.println("CONEXÃO INICIALIZADA");
    }//GEN-LAST:event_abrirActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
       as.close();
       
       System.out.println("CONEXÃO FECHADA");
    }//GEN-LAST:event_fecharActionPerformed
    
  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVerticalMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSCAR;
    private javax.swing.JPanel PAlunos;
    private javax.swing.JPanel PConexao;
    private javax.swing.JPanel PControle;
    private javax.swing.JPanel PInfor;
    private javax.swing.JButton abrir;
    private javax.swing.JLabel btn_aluno;
    private javax.swing.JButton btn_buscando;
    private javax.swing.JLabel btn_cadProfessores;
    private javax.swing.JLabel btn_cadastrarAluno;
    private javax.swing.JLabel buscando;
    private javax.swing.JLabel cancelar;
    private javax.swing.JLabel codigo;
    private javax.swing.JButton fechar;
    private javax.swing.JLabel info;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable lista;
    private javax.swing.JPanel main;
    private javax.swing.JLabel salvar;
    private javax.swing.JLabel status;
    private javax.swing.JTable tabela;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtRg;
    // End of variables declaration//GEN-END:variables

}
