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
        PainelConexao = new javax.swing.JPanel();
        PainelControleAcesso = new javax.swing.JPanel();
        PainelAluno = new javax.swing.JPanel();
        PainelProfessore = new javax.swing.JPanel();
        PainelTerceiros = new javax.swing.JPanel();

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
                .addContainerGap(34, Short.MAX_VALUE)
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

        PainelConexao.setBackground(new java.awt.Color(255, 255, 255));

        PainelControleAcesso.setBackground(new java.awt.Color(255, 255, 255));

        PainelAluno.setBackground(new java.awt.Color(255, 255, 255));

        PainelProfessore.setBackground(new java.awt.Color(255, 255, 255));

        PainelTerceiros.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PainelTerceirosLayout = new javax.swing.GroupLayout(PainelTerceiros);
        PainelTerceiros.setLayout(PainelTerceirosLayout);
        PainelTerceirosLayout.setHorizontalGroup(
            PainelTerceirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        PainelTerceirosLayout.setVerticalGroup(
            PainelTerceirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelProfessoreLayout = new javax.swing.GroupLayout(PainelProfessore);
        PainelProfessore.setLayout(PainelProfessoreLayout);
        PainelProfessoreLayout.setHorizontalGroup(
            PainelProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTerceiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelProfessoreLayout.setVerticalGroup(
            PainelProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTerceiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelAlunoLayout = new javax.swing.GroupLayout(PainelAluno);
        PainelAluno.setLayout(PainelAlunoLayout);
        PainelAlunoLayout.setHorizontalGroup(
            PainelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelProfessore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelAlunoLayout.setVerticalGroup(
            PainelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelProfessore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelControleAcessoLayout = new javax.swing.GroupLayout(PainelControleAcesso);
        PainelControleAcesso.setLayout(PainelControleAcessoLayout);
        PainelControleAcessoLayout.setHorizontalGroup(
            PainelControleAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelControleAcessoLayout.setVerticalGroup(
            PainelControleAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelConexaoLayout = new javax.swing.GroupLayout(PainelConexao);
        PainelConexao.setLayout(PainelConexaoLayout);
        PainelConexaoLayout.setHorizontalGroup(
            PainelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelControleAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelConexaoLayout.setVerticalGroup(
            PainelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelControleAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelControlerLayout = new javax.swing.GroupLayout(PainelControler);
        PainelControler.setLayout(PainelControlerLayout);
        PainelControlerLayout.setHorizontalGroup(
            PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelConexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelControlerLayout.setVerticalGroup(
            PainelControlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelConexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel terceiros;
    // End of variables declaration//GEN-END:variables
}
