package ventanas;

import clases.Administrador;
import herramientas.ComponentesDeVentana;
import herramientas.ManejoDeListas;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

public class IniciarSesionAdministrador extends javax.swing.JFrame {

    /* Este administrador es el principal con el cual se pueden empezar a 
       registrar a los demás administradores*/
    public static final Administrador administradorPrincipal
            = new Administrador("PRINCIPAL", "contrasenia");

    public IniciarSesionAdministrador() {
        initComponents();
        setSize(400, 550);
        setResizable(false);
        setTitle("Acceso al sistema");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        txtContraseniaOculta.setVisible(false);
        txtContraseniaOculta.setEchoChar('\u25CF');

        ComponentesDeVentana.ajustarImagenAJLabel(lblFondo,
                "src/imagenes/fondoBlanco2.jpg");
        ComponentesDeVentana.ajustarImagenAJLabel(lblLogoPrincipal,
                "src/imagenes/logoPrincipal2.png");
        ComponentesDeVentana.ajustarImagenAJLabel(lblImagenOpcion,
                "src/imagenes/administracion.png");
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(
                ClassLoader.getSystemResource("imagenes/logoCNEConFondo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogoPrincipal = new javax.swing.JLabel();
        lblImagenOpcion = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JTextField();
        txtContraseniaOculta = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        lblDerechosReservados = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblLogoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 360, 126));
        getContentPane().add(lblImagenOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, 170));

        txtNombreUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUsuario.setText("Nombre de usuario");
        txtNombreUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombreUsuario.setFocusable(false);
        txtNombreUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreUsuarioFocusLost(evt);
            }
        });
        txtNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 280, -1));

        txtContrasenia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(102, 102, 102));
        txtContrasenia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasenia.setText("Contraseña");
        txtContrasenia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtContrasenia.setFocusable(false);
        txtContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseniaFocusGained(evt);
            }
        });
        txtContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseniaMouseClicked(evt);
            }
        });
        getContentPane().add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 280, -1));

        txtContraseniaOculta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtContraseniaOculta.setForeground(new java.awt.Color(102, 102, 102));
        txtContraseniaOculta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseniaOculta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtContraseniaOculta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseniaOcultaFocusLost(evt);
            }
        });
        getContentPane().add(txtContraseniaOculta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 280, -1));

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

        lblDerechosReservados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDerechosReservados.setText("EPN © Todos los Derechos Reservados.");
        getContentPane().add(lblDerechosReservados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 485, 230, -1));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed

        String usuario = txtNombreUsuario.getText();
        String contrasena = txtContraseniaOculta.getText();

        if (usuario.equals(administradorPrincipal.getUsuario())) {
            if (contrasena.equals(administradorPrincipal.getContrasenia())) {

                Administracion.administrador = administradorPrincipal;
                Administracion.administrador.setNombres("ADMINISTRADOR");
                Administracion.administrador.setApellidos("PRINCIPAL");
                this.dispose();
                new Administracion().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Contraseña incorrecta.");
                txtContraseniaOculta.setText("");
            }
        } else if (ManejoDeListas.buscarEnListaDeAdministradores(usuario) != -1) {
            int posicionLista = ManejoDeListas.buscarEnListaDeAdministradores(usuario);
            if (contrasena.equals(FrmPrincipal.listaAdministradores.
                    get(posicionLista).getContrasenia())) {
                Administracion.administrador
                        = FrmPrincipal.listaAdministradores.get(posicionLista);
                this.dispose();
                new Administracion().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Contraseña incorrecta.");
                txtContraseniaOculta.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "El nombre de usuario no está registrado.");
            txtNombreUsuario.setText("");
            txtContraseniaOculta.setText("");
        }

        if (txtNombreUsuario.getText().isEmpty()) {
            txtNombreUsuario.setText("Nombre de usuario");
        }

        if (txtContraseniaOculta.getPassword().length == 0) {
            txtContrasenia.setVisible(true);
            txtContraseniaOculta.setVisible(false);
        }

    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtNombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreUsuarioMouseClicked
        // TODO add your handling code here:
        ponerCamposEnfocables();
    }//GEN-LAST:event_txtNombreUsuarioMouseClicked

    private void txtNombreUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreUsuarioFocusGained
        // TODO add your handling code here:
        if (txtNombreUsuario.getText().equals("Nombre de usuario")) {
            txtNombreUsuario.setText("");
        }
    }//GEN-LAST:event_txtNombreUsuarioFocusGained

    private void txtNombreUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreUsuarioFocusLost
        // TODO add your handling code here:
        if (txtNombreUsuario.getText().isEmpty()) {
            txtNombreUsuario.setText("Nombre de usuario");
        }
    }//GEN-LAST:event_txtNombreUsuarioFocusLost

    private void txtContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaFocusGained
        // TODO add your handling code here

        if (txtContrasenia.getText().equals("Contraseña")) {
            txtContrasenia.setVisible(false);
            txtContraseniaOculta.setVisible(true);
            txtContraseniaOculta.requestFocus();
        }

    }//GEN-LAST:event_txtContraseniaFocusGained

    private void txtContraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseniaMouseClicked
        // TODO add your handling code here:
        ponerCamposEnfocables();
    }//GEN-LAST:event_txtContraseniaMouseClicked

    private void txtContraseniaOcultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaOcultaFocusLost
        // TODO add your handling code here:

        if (txtContraseniaOculta.getPassword().length == 0) {
            txtContrasenia.setVisible(true);
            txtContraseniaOculta.setVisible(false);
        }

    }//GEN-LAST:event_txtContraseniaOcultaFocusLost

    /*Este metodo hace que se vuelva a habilitar la interaccion entre la ventana
      principal cuando se cierre la ventana de Inicio de Sesion*/
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FrmPrincipal.ventanaPrincipal.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void ponerCamposEnfocables() {
        txtNombreUsuario.setFocusable(true);
        txtContrasenia.setFocusable(true);
        txtContraseniaOculta.setFocusable(true);
    }

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
            java.util.logging.Logger.getLogger(IniciarSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesionAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JLabel lblDerechosReservados;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagenOpcion;
    private javax.swing.JLabel lblLogoPrincipal;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JPasswordField txtContraseniaOculta;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
