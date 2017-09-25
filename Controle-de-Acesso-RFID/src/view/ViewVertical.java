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
        conexao = new javax.swing.JLabel();
        aluno = new javax.swing.JLabel();
        professores = new javax.swing.JLabel();
        terceiros = new javax.swing.JLabel();
        principal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PainelControler = new javax.swing.JPanel();
        PainelMain = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        PainelProfessor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        PainelAlunos = new javax.swing.JPanel();
        PainelControle = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Main.setBackground(new java.awt.Color(255, 255, 255));

        PainelOpcoes.setBackground(new java.awt.Color(4, 26, 39));

        conexao.setBackground(new java.awt.Color(32, 81, 114));
        conexao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        conexao.setForeground(new java.awt.Color(255, 255, 255));
        conexao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-GPS Antenna-30.png"))); // NOI18N
        conexao.setText("       CONEXAO");
        conexao.setOpaque(true);
        conexao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conexaoMouseClicked(evt);
            }
        });

        aluno.setBackground(new java.awt.Color(32, 81, 114));
        aluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aluno.setForeground(new java.awt.Color(255, 255, 255));
        aluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Staff-30.png"))); // NOI18N
        aluno.setText("          ALUNOS");
        aluno.setOpaque(true);
        aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunoMouseClicked(evt);
            }
        });

        professores.setBackground(new java.awt.Color(32, 81, 114));
        professores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        professores.setForeground(new java.awt.Color(255, 255, 255));
        professores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        professores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Staff Filled-30.png"))); // NOI18N
        professores.setText("PROFESSORES");
        professores.setOpaque(true);

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

        principal.setBackground(new java.awt.Color(32, 81, 114));
        principal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        principal.setForeground(new java.awt.Color(255, 255, 255));
        principal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Work-30.png"))); // NOI18N
        principal.setText("       CONTROLE");
        principal.setOpaque(true);
        principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Monitor-50.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Controle de Acesso - RFID");

        javax.swing.GroupLayout PainelOpcoesLayout = new javax.swing.GroupLayout(PainelOpcoes);
        PainelOpcoes.setLayout(PainelOpcoesLayout);
        PainelOpcoesLayout.setHorizontalGroup(
            PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelOpcoesLayout.createSequentialGroup()
                .addGroup(PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelOpcoesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conexao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(professores, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(terceiros, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelOpcoesLayout.createSequentialGroup()
                        .addGroup(PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelOpcoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelOpcoesLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PainelOpcoesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelOpcoesLayout.setVerticalGroup(
            PainelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelOpcoesLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conexao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(professores, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terceiros, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        PainelControler.setBackground(new java.awt.Color(255, 255, 255));

        PainelMain.setBackground(new java.awt.Color(32, 81, 114));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PAINEL PRINCIPAL");

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

        jLabel4.setText("logo");

        javax.swing.GroupLayout PainelMainLayout = new javax.swing.GroupLayout(PainelMain);
        PainelMain.setLayout(PainelMainLayout);
        PainelMainLayout.setHorizontalGroup(
            PainelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMainLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );
        PainelMainLayout.setVerticalGroup(
            PainelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMainLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PainelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelProfessor.setBackground(new java.awt.Color(32, 81, 114));

        jLabel5.setText("LOGO");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTROLE DE ACESSO DOS PROFESSORES");

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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout PainelProfessorLayout = new javax.swing.GroupLayout(PainelProfessor);
        PainelProfessor.setLayout(PainelProfessorLayout);
        PainelProfessorLayout.setHorizontalGroup(
            PainelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProfessorLayout.createSequentialGroup()
                .addGroup(PainelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProfessorLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6))
                    .addGroup(PainelProfessorLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PainelProfessorLayout.setVerticalGroup(
            PainelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProfessorLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PainelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        PainelAlunos.setBackground(new java.awt.Color(32, 81, 114));

        javax.swing.GroupLayout PainelAlunosLayout = new javax.swing.GroupLayout(PainelAlunos);
        PainelAlunos.setLayout(PainelAlunosLayout);
        PainelAlunosLayout.setHorizontalGroup(
            PainelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        PainelAlunosLayout.setVerticalGroup(
            PainelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        PainelControle.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout PainelControleLayout = new javax.swing.GroupLayout(PainelControle);
        PainelControle.setLayout(PainelControleLayout);
        PainelControleLayout.setHorizontalGroup(
            PainelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        PainelControleLayout.setVerticalGroup(
            PainelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelControlerLayout = new javax.swing.GroupLayout(PainelControler);
        PainelControler.setLayout(PainelControlerLayout);
        PainelControlerLayout.setHorizontalGroup(
            PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelAlunos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelControlerLayout.setVerticalGroup(
            PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void conexaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conexaoMouseClicked
        PainelAlunos.setVisible(false);
        PainelProfessor.setVisible(false);
        PainelControle.setVisible(true);
        PainelMain.setVisible(false);
        PainelControle.setVisible(false);
        
    }//GEN-LAST:event_conexaoMouseClicked

    private void alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunoMouseClicked
        PainelAlunos.setVisible(true);
        PainelProfessor.setVisible(false);
       
        PainelProfessor.setVisible(false);
        PainelControle.setVisible(false);
        PainelMain.setVisible(false);
        
    }//GEN-LAST:event_alunoMouseClicked

    private void principalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseClicked
        PainelAlunos.setVisible(false);
        PainelProfessor.setVisible(false);
        PainelControle.setVisible(true);
        PainelMain.setVisible(false);
        
        
    }//GEN-LAST:event_principalMouseClicked

    private void terceirosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terceirosMouseClicked
        PainelAlunos.setVisible(false);
        PainelProfessor.setVisible(false);
       
        PainelProfessor.setVisible(false);
        PainelControle.setVisible(true);
        PainelMain.setVisible(false);
    }//GEN-LAST:event_terceirosMouseClicked

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
    private javax.swing.JPanel PainelAlunos;
    private javax.swing.JPanel PainelControle;
    private javax.swing.JPanel PainelControler;
    private javax.swing.JPanel PainelMain;
    private javax.swing.JPanel PainelOpcoes;
    private javax.swing.JPanel PainelProfessor;
    private javax.swing.JLabel aluno;
    private javax.swing.JLabel conexao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel principal;
    private javax.swing.JLabel professores;
    private javax.swing.JLabel terceiros;
    // End of variables declaration//GEN-END:variables
}
