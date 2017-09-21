
package view;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Rafael Carvalho
 */
public class NovaTela extends javax.swing.JFrame {

    
    public NovaTela() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_professor = new javax.swing.JLabel();
        btn_estudantes = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        home1 = new javax.swing.JPanel();
        professor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        estudantes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_professor1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        home.setBackground(new java.awt.Color(1, 198, 83));
        home.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Controle de Acesso RFID");

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TCC ( UNINOVE )");

        btn_professor.setBackground(new java.awt.Color(0, 150, 61));
        btn_professor.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        btn_professor.setForeground(new java.awt.Color(255, 255, 255));
        btn_professor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_professor.setText("CADASTRAR");
        btn_professor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_professorMouseClicked(evt);
            }
        });

        btn_estudantes.setBackground(new java.awt.Color(0, 150, 61));
        btn_estudantes.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        btn_estudantes.setForeground(new java.awt.Color(255, 255, 255));
        btn_estudantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_estudantes.setText("ESTUDANTE");
        btn_estudantes.setOpaque(true);
        btn_estudantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_estudantesMouseClicked(evt);
            }
        });

        close.setBackground(new java.awt.Color(0, 150, 62));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-Delete-26.png"))); // NOI18N
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        home1.setBackground(new java.awt.Color(255, 255, 255));

        professor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TESTE DE PAGINAÇÃO");

        javax.swing.GroupLayout professorLayout = new javax.swing.GroupLayout(professor);
        professor.setLayout(professorLayout);
        professorLayout.setHorizontalGroup(
            professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(professorLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        professorLayout.setVerticalGroup(
            professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(professorLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel3)
                .addContainerGap(315, Short.MAX_VALUE))
        );

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
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout estudantesLayout = new javax.swing.GroupLayout(estudantes);
        estudantes.setLayout(estudantesLayout);
        estudantesLayout.setHorizontalGroup(
            estudantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        estudantesLayout.setVerticalGroup(
            estudantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estudantesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout home1Layout = new javax.swing.GroupLayout(home1);
        home1.setLayout(home1Layout);
        home1Layout.setHorizontalGroup(
            home1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(estudantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(home1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(home1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(professor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        home1Layout.setVerticalGroup(
            home1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(estudantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(home1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(home1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(professor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        btn_professor1.setBackground(new java.awt.Color(0, 150, 61));
        btn_professor1.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        btn_professor1.setForeground(new java.awt.Color(255, 255, 255));
        btn_professor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_professor1.setText("ESTUDANTE");
        btn_professor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_professor1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeLayout.createSequentialGroup()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_estudantes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_professor1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_professor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 241, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_estudantes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_professor1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_professor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_estudantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_estudantesMouseClicked
       
        setLblColor(btn_estudantes);
        resetLblColor(btn_professor);
        estudantes.setVisible(true);
        professor.setVisible(false);
    }//GEN-LAST:event_btn_estudantesMouseClicked

    private void btn_professorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_professorMouseClicked
        setLblColor(btn_estudantes);
        resetLblColor(btn_professor);
        estudantes.setVisible(false);
        professor.setVisible(true);
        
    }//GEN-LAST:event_btn_professorMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void btn_professor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_professor1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_professor1MouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaTela().setVisible(true);
            }
        });
    }
    public void setLblColor(JLabel lbl)
    {
        lbl.setBackground(new Color(0,150,62));
    }
    
      public void resetLblColor(JLabel lbl)
    {
        lbl.setBackground(new Color(1,198,83));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_estudantes;
    private javax.swing.JLabel btn_professor;
    private javax.swing.JLabel btn_professor1;
    private javax.swing.JLabel close;
    private javax.swing.JPanel estudantes;
    private javax.swing.JPanel home;
    private javax.swing.JPanel home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel professor;
    // End of variables declaration//GEN-END:variables
}
