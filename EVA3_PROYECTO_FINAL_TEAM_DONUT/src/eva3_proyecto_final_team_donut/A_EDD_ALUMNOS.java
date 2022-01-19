package eva3_proyecto_final_team_donut;

import static eva3_proyecto_final_team_donut.DATOS.datos;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Team Donut
 */
public class A_EDD_ALUMNOS extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public A_EDD_ALUMNOS() {
        initComponents();
        this.setTitle("Datos Alumnos");
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setBackground(new java.awt.Color(255, 255, 255));
        Regresar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Regresar.setForeground(new java.awt.Color(51, 51, 51));
        Regresar.setText("REGRESAR");
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 373, 130, 30));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("20550204 Miramontes Martínez Ivan Yahir ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 530, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("20550402 Benavides Figueroa  Dania Denisse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 530, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("20550368 Reyes Olivas Edgar Amauri ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 530, -1));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("20550380 Valenzuela Ruiz Ana Cristina");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 530, -1));

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("PROMEDIO GRUPAL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 299, 530, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eva3_proyecto_final_team_donut/Imagenes/SA3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.setVisible(false);
        //INICA LLENADO DE CALIFICACIONES
        Lista miLista = new Lista(); //LISTA VACÍA

        int NUni = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades tiene la materia que imparte?"));
        int[] Califas = new int[NUni]; //Array con el num de calificaciones 
        try {
            DATOS.calcProm(miLista, Califas);
        } catch (Exception ex) {
            Logger.getLogger(A_EDD_ALUMNOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        DATOS.datos[0] = DATOS.Prom; //Guarda Promedio en array para calculo del promedio grupal
        this.setVisible(true);
        if (miLista.califsR != 0) {
            jButton1.setForeground(Color.red); //Cambia el color del nombre del alumno para indicar que no aprobo
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        //INICA LLENADO DE CALIFICACIONES
        Lista miLista = new Lista(); //LISTA VACÍA

        int NUni = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades tiene la materia que imparte?"));
        int[] Califas = new int[NUni]; //Array con el num de calificaciones 
        try {
            DATOS.calcProm(miLista, Califas);
        } catch (Exception ex) {
            Logger.getLogger(A_EDD_ALUMNOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        DATOS.datos[1] = DATOS.Prom;
        this.setVisible(true);
        if (miLista.califsR != 0) {
            jButton2.setForeground(Color.red); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked

    }//GEN-LAST:event_RegresarMouseClicked

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.setVisible(false);
        GRUPOS g = new GRUPOS();
        g.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        //INICA LLENADO DE CALIFICACIONES
        Lista miLista = new Lista(); //LISTA VACÍA

        int NUni = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades tiene la materia que imparte?"));
        int[] Califas = new int[NUni]; //Array con el num de calificaciones 
        try {
            DATOS.calcProm(miLista, Califas);
        } catch (Exception ex) {
            Logger.getLogger(A_EDD_ALUMNOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        DATOS.datos[2] = DATOS.Prom;
        this.setVisible(true);
        if (miLista.califsR != 0) {
            jButton3.setForeground(Color.red);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        //INICA LLENADO DE CALIFICACIONES
        Lista miLista = new Lista(); //LISTA VACÍA

        int NUni = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades tiene la materia que imparte?"));
        int[] Califas = new int[NUni]; //Array con el num de calificaciones 
        try {
            DATOS.calcProm(miLista, Califas);
        } catch (Exception ex) {
            Logger.getLogger(A_EDD_ALUMNOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        DATOS.datos[3] = DATOS.Prom;
        this.setVisible(true);
        if (miLista.califsR != 0) {
            jButton4.setForeground(Color.red);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String comp = "";
        for (int i = 0; i < DATOS.datos.length; i++) {
            comp += ("[" + DATOS.datos[i] + "] ");
        }
        int iEdit = JOptionPane.showConfirmDialog(null, "Lista de los promedios:\n " + comp + "\n¿Desea ordenar los promedios?", "", JOptionPane.YES_NO_OPTION);
        if (iEdit == JOptionPane.YES_OPTION) {
            DATOS.selectionSort(datos);    //Ordenamos promedios mediante el método selection sort
            DATOS.imprimirSelection(datos); 
        }
        int iEdit2 = JOptionPane.showConfirmDialog(null, "¿Desea buscar algun promedio en especial?");
        if (iEdit2 == JOptionPane.YES_OPTION) {
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor a buscar:"));
            double iResu = DATOS.binarySearch(datos, valor);
            JOptionPane.showMessageDialog(null, "El elemento esta en la posición: " + iResu);
        }
        double PromG = (double) ((DATOS.listaProm.Suma()) / (DATOS.listaProm.length()));
        JOptionPane.showMessageDialog(null, "El promedio grupal es de: " + PromG);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(A_EDD_ALUMNOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_EDD_ALUMNOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_EDD_ALUMNOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_EDD_ALUMNOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_EDD_ALUMNOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
