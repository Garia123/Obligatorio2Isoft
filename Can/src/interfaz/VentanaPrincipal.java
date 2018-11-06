/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.CardLayout;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Tomás
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private int xx;
    private int xy;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JPanel();
        jPabelBarraSuperior = new javax.swing.JPanel();
        lbCerrar = new javax.swing.JLabel();
        lbMinimizar = new javax.swing.JLabel();
        jPanelContenido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelCanes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPabelBarraSuperior.setBackground(new java.awt.Color(0, 0, 0));
        jPabelBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPabelBarraSuperiorMouseDragged(evt);
            }
        });
        jPabelBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPabelBarraSuperiorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPabelBarraSuperiorMouseReleased(evt);
            }
        });
        jPabelBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lbCerrar.setText("X");
        lbCerrar.setToolTipText("");
        lbCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCerrarMouseClicked(evt);
            }
        });
        jPabelBarraSuperior.add(lbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 20, 30));

        lbMinimizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        lbMinimizar.setText("_");
        lbMinimizar.setToolTipText("");
        lbMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseClicked(evt);
            }
        });
        jPabelBarraSuperior.add(lbMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 20, 30));

        menuPrincipal.add(jPabelBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenPrincipal.jpg"))); // NOI18N
        jPanelContenido.add(jLabel2);

        menuPrincipal.add(jPanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 560, 500));

        jButton1.setText("Recordatorios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menuPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 260, 30));

        jButton2.setText("Mis canes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menuPrincipal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 260, 30));

        jButton3.setText("Calendario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        menuPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 260, 30));

        jButton4.setText("Actividades");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        menuPrincipal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 260, 30));

        jButton5.setText("Veterinario");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        menuPrincipal.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 260, 30));

        jPanelCanes.setLayout(new java.awt.CardLayout());
        menuPrincipal.add(jPanelCanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 570, 500));

        getContentPane().add(menuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarMouseClicked
        setExtendedState(VentanaPrincipal.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_lbCerrarMouseClicked

    private void jPabelBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPabelBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPabelBarraSuperiorMouseDragged

    private void jPabelBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPabelBarraSuperiorMousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPabelBarraSuperiorMousePressed

    private void jPabelBarraSuperiorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPabelBarraSuperiorMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_jPabelBarraSuperiorMouseReleased

    private void lbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbMinimizarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout cn = (CardLayout) jPanelCanes.getLayout();
        cn.show(jPanelCanes,"Mis canes");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPabelBarraSuperior;
    public javax.swing.JPanel jPanelCanes;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JLabel lbCerrar;
    private javax.swing.JLabel lbMinimizar;
    public static javax.swing.JPanel menuPrincipal;
    // End of variables declaration//GEN-END:variables
}