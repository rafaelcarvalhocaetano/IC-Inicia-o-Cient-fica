package view;

/**
 *
 * @author Developer
 */
public class ViewVertical extends javax.swing.JFrame {

    
    public ViewVertical() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        PainelOpcoes = new javax.swing.JPanel();
        btn_aluno = new javax.swing.JLabel();
        btn_prof = new javax.swing.JLabel();
        terceiros = new javax.swing.JLabel();
        btn_controle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_conexao = new javax.swing.JLabel();
        PainelControler = new javax.swing.JPanel();
        PainelProfessore = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PainelTerceiros = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PainelAluno = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        PainelControleAcesso = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaControleAcesso = new javax.swing.JTable();
        PainelConexao = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Main.setBackground(new java.awt.Color(255, 255, 255));

        PainelOpcoes.setBackground(new java.awt.Color(4, 26, 39));

        btn_aluno.setBackground(new java.awt.Color(32, 81, 114));
        btn_aluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_aluno.setForeground(new java.awt.Color(255, 255, 255));
        btn_aluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_aluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Staff-30.png"))); // NOI18N
        btn_aluno.setText("          ALUNOS");
        btn_aluno.setOpaque(true);
        btn_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alunoMouseClicked(evt);
            }
        });

        btn_prof.setBackground(new java.awt.Color(32, 81, 114));
        btn_prof.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_prof.setForeground(new java.awt.Color(255, 255, 255));
        btn_prof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_prof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Staff Filled-30.png"))); // NOI18N
        btn_prof.setText("PROFESSORES");
        btn_prof.setOpaque(true);
        btn_prof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_profMouseClicked(evt);
            }
        });

        terceiros.setBackground(new java.awt.Color(32, 81, 114));
        terceiros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        terceiros.setForeground(new java.awt.Color(255, 255, 255));
        terceiros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        terceiros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Staff Filled-30.png"))); // NOI18N
        terceiros.setText("     TERCEIROS");
        terceiros.setOpaque(true);
        terceiros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terceirosMouseClicked(evt);
            }
        });

        btn_controle.setBackground(new java.awt.Color(32, 81, 114));
        btn_controle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_controle.setForeground(new java.awt.Color(255, 255, 255));
        btn_controle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_controle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Work-30.png"))); // NOI18N
        btn_controle.setText("       CONTROLE");
        btn_controle.setOpaque(true);
        btn_controle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_controleMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Monitor-50.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Controle de Acesso - RFID");

        btn_conexao.setBackground(new java.awt.Color(32, 81, 114));
        btn_conexao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_conexao.setForeground(new java.awt.Color(255, 255, 255));
        btn_conexao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_conexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-GPS Antenna-30.png"))); // NOI18N
        btn_conexao.setText("       CONEXAO");
        btn_conexao.setOpaque(true);
        btn_conexao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_conexaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PainelOpcoesLayout = new javax.swing.GroupLayout(PainelOpcoes);
        PainelOpcoes.setLayout(PainelOpcoesLayout);
        PainelOpcoesLayout.setHorizontalGroup(
            PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelOpcoesLayout.createSequentialGroup()
                .addGroup(PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelOpcoesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(terceiros, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_controle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelOpcoesLayout.createSequentialGroup()
                        .addGroup(PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelOpcoesLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelOpcoesLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2))
                            .addGroup(PainelOpcoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_conexao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelOpcoesLayout.setVerticalGroup(
            PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelOpcoesLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_conexao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_controle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terceiros, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        PainelControler.setBackground(new java.awt.Color(255, 255, 255));

        PainelProfessore.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Close Window-30 (2).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PainelProfessoreLayout = new javax.swing.GroupLayout(PainelProfessore);
        PainelProfessore.setLayout(PainelProfessoreLayout);
        PainelProfessoreLayout.setHorizontalGroup(
            PainelProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProfessoreLayout.createSequentialGroup()
                .addGap(0, 504, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        PainelProfessoreLayout.setVerticalGroup(
            PainelProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProfessoreLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 510, Short.MAX_VALUE))
        );

        PainelTerceiros.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Close Window-30 (2).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PainelTerceirosLayout = new javax.swing.GroupLayout(PainelTerceiros);
        PainelTerceiros.setLayout(PainelTerceirosLayout);
        PainelTerceirosLayout.setHorizontalGroup(
            PainelTerceirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTerceirosLayout.createSequentialGroup()
                .addGap(0, 504, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        PainelTerceirosLayout.setVerticalGroup(
            PainelTerceirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTerceirosLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelAluno.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Close Window-30 (2).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

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
        jScrollPane2.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(78, 78, 134));
        jLabel8.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(78, 78, 134));
        jLabel9.setText("Mês");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PainelAlunoLayout = new javax.swing.GroupLayout(PainelAluno);
        PainelAluno.setLayout(PainelAlunoLayout);
        PainelAlunoLayout.setHorizontalGroup(
            PainelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAlunoLayout.createSequentialGroup()
                .addGap(0, 504, Short.MAX_VALUE)
                .addComponent(jLabel6))
            .addComponent(jScrollPane2)
            .addGroup(PainelAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelAlunoLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(58, 58, 58)))
                .addGap(56, 56, 56))
        );
        PainelAlunoLayout.setVerticalGroup(
            PainelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAlunoLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(110, 110, 110)
                .addGroup(PainelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelControleAcesso.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Close Window-30 (2).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        tabelaControleAcesso.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaControleAcesso.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabelaControleAcesso);

        javax.swing.GroupLayout PainelControleAcessoLayout = new javax.swing.GroupLayout(PainelControleAcesso);
        PainelControleAcesso.setLayout(PainelControleAcessoLayout);
        PainelControleAcessoLayout.setHorizontalGroup(
            PainelControleAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelControleAcessoLayout.createSequentialGroup()
                .addGap(0, 504, Short.MAX_VALUE)
                .addComponent(jLabel7))
            .addGroup(PainelControleAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PainelControleAcessoLayout.setVerticalGroup(
            PainelControleAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelControleAcessoLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelConexao.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Close Window-30 (2).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PainelConexaoLayout = new javax.swing.GroupLayout(PainelConexao);
        PainelConexao.setLayout(PainelConexaoLayout);
        PainelConexaoLayout.setHorizontalGroup(
            PainelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelConexaoLayout.createSequentialGroup()
                .addGap(0, 504, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        PainelConexaoLayout.setVerticalGroup(
            PainelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConexaoLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 510, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelControlerLayout = new javax.swing.GroupLayout(PainelControler);
        PainelControler.setLayout(PainelControlerLayout);
        PainelControlerLayout.setHorizontalGroup(
            PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelConexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelControleAcesso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelTerceiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelProfessore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelControlerLayout.setVerticalGroup(
            PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelConexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelControleAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelTerceiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelProfessore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(PainelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PainelControler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelControler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_conexaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_conexaoMouseClicked
        PainelConexao.setVisible(true);
        PainelControleAcesso.setVisible(false);
        PainelAluno.setVisible(false);
        PainelProfessore.setVisible(false);
        PainelTerceiros.setVisible(false);
    }//GEN-LAST:event_btn_conexaoMouseClicked

    private void btn_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alunoMouseClicked
       PainelConexao.setVisible(false);
       PainelControleAcesso.setVisible(false);
       PainelAluno.setVisible(true);
       PainelProfessore.setVisible(false);
       PainelTerceiros.setVisible(false);
       
    }//GEN-LAST:event_btn_alunoMouseClicked

    private void btn_controleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_controleMouseClicked
      PainelConexao.setVisible(false);
      PainelControleAcesso.setVisible(true);
      PainelAluno.setVisible(false);
      PainelProfessore.setVisible(false);
      PainelTerceiros.setVisible(false);
        
    }//GEN-LAST:event_btn_controleMouseClicked

    private void terceirosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terceirosMouseClicked
        PainelConexao.setVisible(false);
        PainelControleAcesso.setVisible(false);
        PainelAluno.setVisible(false);
        PainelProfessore.setVisible(false);
        PainelTerceiros.setVisible(true);
    }//GEN-LAST:event_terceirosMouseClicked

    private void btn_profMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profMouseClicked
        PainelProfessore.setVisible(true);
        PainelTerceiros.setVisible(false);
        PainelConexao.setVisible(false);
        PainelControleAcesso.setVisible(false);
        PainelAluno.setVisible(false);
        
        
    }//GEN-LAST:event_btn_profMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVertical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JPanel PainelAluno;
    private javax.swing.JPanel PainelConexao;
    private javax.swing.JPanel PainelControleAcesso;
    private javax.swing.JPanel PainelControler;
    private javax.swing.JPanel PainelOpcoes;
    private javax.swing.JPanel PainelProfessore;
    private javax.swing.JPanel PainelTerceiros;
    private javax.swing.JLabel btn_aluno;
    private javax.swing.JLabel btn_conexao;
    private javax.swing.JLabel btn_controle;
    private javax.swing.JLabel btn_prof;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaControleAcesso;
    private javax.swing.JLabel terceiros;
    // End of variables declaration//GEN-END:variables
}
