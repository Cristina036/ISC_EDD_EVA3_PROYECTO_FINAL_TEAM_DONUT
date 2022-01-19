package eva3_proyecto_final_team_donut;

/**
 *
 * @author TEAM DONUT
 */
public class START extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public START() {
        initComponents();
        this.setTitle("Simple Academy");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        E = new javax.swing.JButton();
        D = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        E.setBackground(new java.awt.Color(240, 239, 237));
        E.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        E.setForeground(new java.awt.Color(0, 0, 0));
        E.setText("Estudiantes");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 266, 330, 40));

        D.setBackground(new java.awt.Color(240, 239, 237));
        D.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        D.setForeground(new java.awt.Color(0, 0, 0));
        D.setText("Docentes");
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
        });
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 179, 330, 40));

        FONDO.setBackground(new java.awt.Color(240, 239, 237));
        FONDO.setForeground(new java.awt.Color(240, 239, 237));
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eva3_proyecto_final_team_donut/Imagenes/SA1_1.png"))); // NOI18N
        FONDO.setText("Docentes");
        FONDO.setToolTipText("");
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        this.setVisible(false);
        LOGIN_E e = new LOGIN_E();
        e.setVisible(true);
    }//GEN-LAST:event_EActionPerformed

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
        this.setVisible(false);
        LOGIN_D l = new LOGIN_D();
        l.setVisible(true);

    }//GEN-LAST:event_DMouseClicked

    private void EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseClicked

    }//GEN-LAST:event_EMouseClicked

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
            java.util.logging.Logger.getLogger(START.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(START.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(START.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(START.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new START().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JLabel FONDO;
    // End of variables declaration//GEN-END:variables
}
