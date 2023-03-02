package ventanas;

import herramientas.ComponentesDeVentana;
import java.awt.Image;
import java.awt.Toolkit;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class IniciarSesionCedula extends javax.swing.JFrame {

    private FrmPrincipal ventanaPrincipal;

    public IniciarSesionCedula(FrmPrincipal ventanaPrincipal) {
        initComponents();
        setSize(400, 550);
        setResizable(false);
        setTitle("Iniciar sesión");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.ventanaPrincipal = ventanaPrincipal;

        ComponentesDeVentana.ajustarImagenAJLabel(lblFondo,
                "src/imagenes/fondoBlanco2.jpg");
        ComponentesDeVentana.ajustarImagenAJLabel(lblLogoPrincipal,
                "src/imagenes/logoPrincipal2.png");
        ComponentesDeVentana.ajustarImagenAJLabel(lblImagenOpcion,
                FrmPrincipal.imagenDeEleccion);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(
                ClassLoader.getSystemResource("imagenes/logoCNEConFondo.png"));
        return retValue;
    }

    private void ponerCamposEnfocables() {
        txtNumeroCedula.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumeroCedula = new javax.swing.JTextField();
        lblDerechosReservados = new javax.swing.JLabel();
        lblImagenOpcion = new javax.swing.JLabel();
        lblLogoPrincipal = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumeroCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumeroCedula.setForeground(new java.awt.Color(102, 102, 102));
        txtNumeroCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroCedula.setText("Ingresa tu número de cédula");
        txtNumeroCedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNumeroCedula.setFocusable(false);
        txtNumeroCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroCedulaFocusLost(evt);
            }
        });
        txtNumeroCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumeroCedulaMouseClicked(evt);
            }
        });
        getContentPane().add(txtNumeroCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 280, -1));

        lblDerechosReservados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDerechosReservados.setText("EPN © Todos los Derechos Reservados.");
        getContentPane().add(lblDerechosReservados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 485, 230, -1));
        getContentPane().add(lblImagenOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, 170));
        getContentPane().add(lblLogoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 360, 126));

        btnAcceder.setBackground(new java.awt.Color(0, 153, 255));
        btnAcceder.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("ACCEDER");
        btnAcceder.setBorder(null);
        btnAcceder.setBorderPainted(false);
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 160, 30));

        lblCedula.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblCedula.setText("Cédula");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroCedulaFocusGained
        // TODO add your handling code here:
        if (txtNumeroCedula.getText().equals("Ingresa tu número de cédula")) {
            txtNumeroCedula.setText("");
        }
    }//GEN-LAST:event_txtNumeroCedulaFocusGained

    private void txtNumeroCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroCedulaFocusLost
        // TODO add your handling code here:
        if (txtNumeroCedula.getText().isEmpty()) {
            txtNumeroCedula.setText("Ingresa tu número de cédula");
        }
    }//GEN-LAST:event_txtNumeroCedulaFocusLost

    private void txtNumeroCedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroCedulaMouseClicked
        ponerCamposEnfocables();
    }//GEN-LAST:event_txtNumeroCedulaMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.ventanaPrincipal.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed

        this.dispose();
        this.ventanaPrincipal.setEnabled(false);
        if (FrmPrincipal.imagenDeEleccion.equals("src/imagenes/lugarVotacion.png")) {
            
        } else if (FrmPrincipal.imagenDeEleccion.equals("src/imagenes/votoTelematico.png")) {
            new Papeleta().setVisible(true);
        }

    }//GEN-LAST:event_btnAccederActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesionCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesionCedula(FrmPrincipal.ventanaPrincipal).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDerechosReservados;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagenOpcion;
    private javax.swing.JLabel lblLogoPrincipal;
    private javax.swing.JTextField txtNumeroCedula;
    // End of variables declaration//GEN-END:variables
}
