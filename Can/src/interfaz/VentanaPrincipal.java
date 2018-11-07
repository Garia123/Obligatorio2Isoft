/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.CardLayout;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
        jPanelImgInicio.setVisible(true);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        this.setLocationRelativeTo(this);
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
        btnFamilia = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        jPanelContenido = new javax.swing.JPanel();
        jPanelImgInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelRegCan = new javax.swing.JPanel();
        btnCancelarRegCan = new javax.swing.JButton();
        btnSubirImagen = new javax.swing.JButton();
        lblRegCan = new javax.swing.JLabel();
        lblDescripcionRegCan = new javax.swing.JLabel();
        lblNombreRegCan = new javax.swing.JLabel();
        lblAlturaRegCan = new javax.swing.JLabel();
        lblPesoRegCan = new javax.swing.JLabel();
        lblImgRegCan = new javax.swing.JLabel();
        btnConfirmarRegCan = new javax.swing.JButton();
        txtDescripcionRegCan = new javax.swing.JTextField();
        txtPesoRegCan = new javax.swing.JTextField();
        txtNombreRegCan = new javax.swing.JTextField();
        txtAlturaRegCan = new javax.swing.JTextField();
        jPanelMisCanes = new javax.swing.JPanel();
        listaMisCanes = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        btnEliminarCan = new javax.swing.JButton();
        btnAgregarCan = new javax.swing.JButton();
        lblMisCanes = new javax.swing.JLabel();
        btnMisCanes = new javax.swing.JButton();
        btnActividades1 = new javax.swing.JButton();
        btnRecordatorios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPrincipal.setBackground(new java.awt.Color(217, 201, 201));
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

        btnFamilia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnFamilia.setText("Familia");
        btnFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamiliaActionPerformed(evt);
            }
        });
        menuPrincipal.add(btnFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 260, 30));

        btnAgenda.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgenda.setText("Agenda");
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        menuPrincipal.add(btnAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 260, 30));

        jPanelContenido.setBackground(new java.awt.Color(217, 201, 201));

        jPanelImgInicio.setBackground(new java.awt.Color(217, 201, 201));
        jPanelImgInicio.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenPrincipal.jpg"))); // NOI18N
        jLabel1.setText("  ");
        jPanelImgInicio.add(jLabel1);
        jLabel1.setBounds(-15, 5, 570, 498);

        jPanelRegCan.setBackground(new java.awt.Color(217, 201, 201));
        jPanelRegCan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelarRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCancelarRegCan.setText("Cancelar");
        btnCancelarRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(btnCancelarRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        btnSubirImagen.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnSubirImagen.setText("Subir imagen");
        btnSubirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirImagenActionPerformed(evt);
            }
        });
        jPanelRegCan.add(btnSubirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 170, -1));

        lblRegCan.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblRegCan.setText("Registro de nuevo can:");
        jPanelRegCan.add(lblRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblDescripcionRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDescripcionRegCan.setText("Descripción:");
        jPanelRegCan.add(lblDescripcionRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblNombreRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombreRegCan.setText("Nombre:");
        jPanelRegCan.add(lblNombreRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblAlturaRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblAlturaRegCan.setText("Altura: ");
        jPanelRegCan.add(lblAlturaRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblPesoRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPesoRegCan.setText("Peso:");
        jPanelRegCan.add(lblPesoRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblImgRegCan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelRegCan.add(lblImgRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 170, 160));

        btnConfirmarRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnConfirmarRegCan.setText("Confirmar");
        btnConfirmarRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(btnConfirmarRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        txtDescripcionRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(txtDescripcionRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 320, 80));

        txtPesoRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPesoRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(txtPesoRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 90, 30));

        txtNombreRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombreRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(txtNombreRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 90, 30));

        txtAlturaRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAlturaRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(txtAlturaRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 90, 30));

        jPanelMisCanes.setBackground(new java.awt.Color(217, 201, 201));
        jPanelMisCanes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaMisCanes.setViewportView(jList2);

        jPanelMisCanes.add(listaMisCanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 330, 250));

        btnEliminarCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminarCan.setText("Eliminar");
        btnEliminarCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCanActionPerformed(evt);
            }
        });
        jPanelMisCanes.add(btnEliminarCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        btnAgregarCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregarCan.setText("Agregar");
        btnAgregarCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCanActionPerformed(evt);
            }
        });
        jPanelMisCanes.add(btnAgregarCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        lblMisCanes.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblMisCanes.setText("Mis canes");
        jPanelMisCanes.add(lblMisCanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelRegCan, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMisCanes, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelRegCan, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMisCanes, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menuPrincipal.add(jPanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 540, 470));

        btnMisCanes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnMisCanes.setText("Mis canes");
        btnMisCanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisCanesActionPerformed(evt);
            }
        });
        menuPrincipal.add(btnMisCanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 260, 30));

        btnActividades1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnActividades1.setText("Actividades");
        btnActividades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividades1ActionPerformed(evt);
            }
        });
        menuPrincipal.add(btnActividades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 260, 30));

        btnRecordatorios.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRecordatorios.setText("Recordatorios");
        btnRecordatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordatoriosActionPerformed(evt);
            }
        });
        menuPrincipal.add(btnRecordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 260, 30));

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

    private void btnFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamiliaActionPerformed
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(true);
        
    }//GEN-LAST:event_btnFamiliaActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnEliminarCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCanActionPerformed

    private void btnAgregarCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCanActionPerformed

    private void btnMisCanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisCanesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMisCanesActionPerformed

    private void btnActividades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActividades1ActionPerformed

    private void btnRecordatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecordatoriosActionPerformed

    private void txtDescripcionRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionRegCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionRegCanActionPerformed

    private void btnConfirmarRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarRegCanActionPerformed
        String nombre = txtNombreRegCan.getText();
        String alturaAux = txtAlturaRegCan.getText();
        float altura = Float.parseFloat(alturaAux);
        String pesoAux = txtPesoRegCan.getText();
        float peso = Float.parseFloat(pesoAux);
        String descripcion = txtDescripcionRegCan.getText();
    }//GEN-LAST:event_btnConfirmarRegCanActionPerformed

    private void btnSubirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirImagenActionPerformed
        JFileChooser img = new JFileChooser();
        img.setDialogTitle("Buscar foto");
        if(img.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            File archivo = new File(img.getSelectedFile().toString());
            rsscalelabel.RSScaleLabel.setScaleLabel(lblImgRegCan, img.getSelectedFile().toString());
        }
    }//GEN-LAST:event_btnSubirImagenActionPerformed

    private void btnCancelarRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarRegCanActionPerformed

    private void txtPesoRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoRegCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoRegCanActionPerformed

    private void txtNombreRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegCanActionPerformed

    private void txtAlturaRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaRegCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaRegCanActionPerformed

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
                try {
                    new VentanaPrincipal().setVisible(true);
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades1;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnAgregarCan;
    private javax.swing.JButton btnCancelarRegCan;
    private javax.swing.JButton btnConfirmarRegCan;
    private javax.swing.JButton btnEliminarCan;
    private javax.swing.JButton btnFamilia;
    private javax.swing.JButton btnMisCanes;
    private javax.swing.JButton btnRecordatorios;
    private javax.swing.JButton btnSubirImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPabelBarraSuperior;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelImgInicio;
    private javax.swing.JPanel jPanelMisCanes;
    private javax.swing.JPanel jPanelRegCan;
    private javax.swing.JLabel lbCerrar;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel lblAlturaRegCan;
    private javax.swing.JLabel lblDescripcionRegCan;
    private javax.swing.JLabel lblImgRegCan;
    private javax.swing.JLabel lblMisCanes;
    private javax.swing.JLabel lblNombreRegCan;
    private javax.swing.JLabel lblPesoRegCan;
    private javax.swing.JLabel lblRegCan;
    private javax.swing.JScrollPane listaMisCanes;
    public static javax.swing.JPanel menuPrincipal;
    private javax.swing.JTextField txtAlturaRegCan;
    private javax.swing.JTextField txtDescripcionRegCan;
    private javax.swing.JTextField txtNombreRegCan;
    private javax.swing.JTextField txtPesoRegCan;
    // End of variables declaration//GEN-END:variables
}
