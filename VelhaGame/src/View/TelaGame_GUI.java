
package View;

import Model.Funcoes;


public class TelaGame_GUI extends javax.swing.JFrame {
    Funcoes f = new Funcoes();

    public TelaGame_GUI() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nono = new javax.swing.JLabel();
        oitavo = new javax.swing.JLabel();
        setimo = new javax.swing.JLabel();
        quinto = new javax.swing.JLabel();
        segundo = new javax.swing.JLabel();
        sexto = new javax.swing.JLabel();
        quarto = new javax.swing.JLabel();
        terceiro = new javax.swing.JLabel();
        primeiro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        velha = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        O = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        vez_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(24, 41, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(null);

        nono.setFont(new java.awt.Font("Chandas", 1, 22)); // NOI18N
        nono.setForeground(new java.awt.Color(242, 242, 242));
        nono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nonoMouseClicked(evt);
            }
        });
        jPanel1.add(nono);
        nono.setBounds(300, 270, 50, 60);

        oitavo.setFont(new java.awt.Font("Chandas", 1, 22)); // NOI18N
        oitavo.setForeground(new java.awt.Color(242, 242, 242));
        oitavo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oitavo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oitavoMouseClicked(evt);
            }
        });
        jPanel1.add(oitavo);
        oitavo.setBounds(230, 270, 50, 60);

        setimo.setFont(new java.awt.Font("Chandas", 1, 22)); // NOI18N
        setimo.setForeground(new java.awt.Color(242, 242, 242));
        setimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setimoMouseClicked(evt);
            }
        });
        jPanel1.add(setimo);
        setimo.setBounds(160, 270, 50, 60);

        quinto.setFont(new java.awt.Font("Chandas", 1, 22)); // NOI18N
        quinto.setForeground(new java.awt.Color(242, 242, 242));
        quinto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quinto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quintoMouseClicked(evt);
            }
        });
        jPanel1.add(quinto);
        quinto.setBounds(230, 200, 50, 60);

        segundo.setFont(new java.awt.Font("Chandas", 1, 22)); // NOI18N
        segundo.setForeground(new java.awt.Color(242, 242, 242));
        segundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        segundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segundoMouseClicked(evt);
            }
        });
        jPanel1.add(segundo);
        segundo.setBounds(230, 130, 50, 60);

        sexto.setFont(new java.awt.Font("Chandas", 1, 22)); // NOI18N
        sexto.setForeground(new java.awt.Color(242, 242, 242));
        sexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sextoMouseClicked(evt);
            }
        });
        jPanel1.add(sexto);
        sexto.setBounds(300, 200, 50, 60);

        quarto.setFont(new java.awt.Font("Chandas", 1, 22)); // NOI18N
        quarto.setForeground(new java.awt.Color(242, 242, 242));
        quarto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quarto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quartoMouseClicked(evt);
            }
        });
        jPanel1.add(quarto);
        quarto.setBounds(160, 130, 50, 60);

        terceiro.setFont(new java.awt.Font("Chandas", 1, 22)); // NOI18N
        terceiro.setForeground(new java.awt.Color(242, 242, 242));
        terceiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        terceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terceiroMouseClicked(evt);
            }
        });
        jPanel1.add(terceiro);
        terceiro.setBounds(300, 130, 50, 60);

        primeiro.setFont(new java.awt.Font("Chandas", 1, 22)); // NOI18N
        primeiro.setForeground(new java.awt.Color(242, 242, 242));
        primeiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        primeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primeiroMouseClicked(evt);
            }
        });
        jPanel1.add(primeiro);
        primeiro.setBounds(160, 200, 50, 60);

        jLabel1.setBackground(new java.awt.Color(24, 72, 94));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/game.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 260, 70, 80);

        jLabel2.setBackground(new java.awt.Color(24, 72, 94));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/game.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 190, 70, 80);

        jLabel3.setBackground(new java.awt.Color(24, 72, 94));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/game.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 190, 70, 80);

        jLabel4.setBackground(new java.awt.Color(24, 72, 94));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/game.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 190, 70, 80);

        jLabel6.setBackground(new java.awt.Color(24, 72, 94));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/game.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 120, 70, 80);

        jLabel7.setBackground(new java.awt.Color(24, 72, 94));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/game.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 120, 70, 80);

        jLabel5.setBackground(new java.awt.Color(24, 72, 94));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/game.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 120, 70, 80);

        jLabel8.setBackground(new java.awt.Color(24, 72, 94));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/game.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(150, 260, 70, 80);

        jLabel9.setBackground(new java.awt.Color(24, 72, 94));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/game.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(220, 260, 70, 80);

        jPanel2.setBackground(new java.awt.Color(9, 164, 171));
        jPanel2.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Chandas", 1, 10)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("X (wins)");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 0, 60, 26);

        X.setFont(new java.awt.Font("Chandas", 1, 14)); // NOI18N
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("  ");
        jPanel2.add(X);
        X.setBounds(6, 19, 50, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 340, 60, 50);

        jPanel3.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Chandas", 1, 10)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("T (wins)");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(0, 0, 70, 26);

        velha.setFont(new java.awt.Font("Chandas", 1, 14)); // NOI18N
        velha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(velha);
        velha.setBounds(0, 20, 70, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(220, 340, 70, 50);

        jPanel4.setBackground(new java.awt.Color(241, 178, 57));
        jPanel4.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Chandas", 1, 10)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("O (wins)");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(0, 0, 60, 26);

        O.setFont(new java.awt.Font("Chandas", 1, 14)); // NOI18N
        O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        O.setText("  ");
        jPanel4.add(O);
        O.setBounds(10, 20, 40, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(300, 340, 60, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh (1).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(460, 10, 30, 30);

        jLabel12.setFont(new java.awt.Font("Chandas", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(241, 178, 57));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("O");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 10, 40, 30);

        jLabel13.setFont(new java.awt.Font("Chandas", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(9, 164, 171));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 10, 40, 30);

        jPanel5.setBackground(new java.awt.Color(31, 53, 64));
        jPanel5.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Chandas", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 242, 242));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TURN");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(40, 0, 50, 29);

        vez_txt.setFont(new java.awt.Font("Chandas", 1, 12)); // NOI18N
        vez_txt.setForeground(new java.awt.Color(242, 242, 242));
        vez_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(vez_txt);
        vez_txt.setBounds(10, 0, 40, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(210, 10, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void segundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundoMouseClicked
        f.setI(0);
        f.setJ(1);
        f.jogo();
    }//GEN-LAST:event_segundoMouseClicked

    private void quartoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quartoMouseClicked
        f.setI(0);
        f.setJ(0);
        f.jogo();
    }//GEN-LAST:event_quartoMouseClicked

    private void terceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terceiroMouseClicked
        f.setI(0);
        f.setJ(2);
        f.jogo();
    }//GEN-LAST:event_terceiroMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        f.refresh();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void primeiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeiroMouseClicked
        f.setI(1);
        f.setJ(0);
        f.jogo();
    }//GEN-LAST:event_primeiroMouseClicked

    private void quintoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quintoMouseClicked
        f.setI(1);
        f.setJ(1);
        f.jogo();
    }//GEN-LAST:event_quintoMouseClicked

    private void sextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sextoMouseClicked
        f.setI(1);
        f.setJ(2);
        f.jogo();
    }//GEN-LAST:event_sextoMouseClicked

    private void setimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setimoMouseClicked
        f.setI(2);
        f.setJ(0);
        f.jogo();
    }//GEN-LAST:event_setimoMouseClicked

    private void oitavoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oitavoMouseClicked
        f.setI(2);
        f.setJ(1);
        f.jogo();
    }//GEN-LAST:event_oitavoMouseClicked

    private void nonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonoMouseClicked
        f.setI(2);
        f.setJ(2);
        f.jogo();
    }//GEN-LAST:event_nonoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGame_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGame_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGame_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGame_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGame_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel O;
    public static javax.swing.JLabel X;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JLabel nono;
    public static javax.swing.JLabel oitavo;
    public static javax.swing.JLabel primeiro;
    public static javax.swing.JLabel quarto;
    public static javax.swing.JLabel quinto;
    public static javax.swing.JLabel segundo;
    public static javax.swing.JLabel setimo;
    public static javax.swing.JLabel sexto;
    public static javax.swing.JLabel terceiro;
    public static javax.swing.JLabel velha;
    public static javax.swing.JLabel vez_txt;
    // End of variables declaration//GEN-END:variables
}
