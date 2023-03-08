/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ventanas;

import clases.Binomio;
import herramientas.ComponentesDeVentana;
import java.awt.Font;
import javax.swing.JFrame;

/**
 *
 * @author stive
 */
public class VentanaEmergenteCandidatos extends javax.swing.JDialog {
    
    public Binomio binomio;
    private final Font fuenteEstandar = new Font("Arial", Font.BOLD, 12);
    private JFrame parent;
    
    /**
     * Creates new form NewJDialog
     */
    public VentanaEmergenteCandidatos(java.awt.Frame parent, boolean modal, Binomio b) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        this.binomio = b;
        this.parent = (JFrame) parent;
        ComponentesDeVentana.ajustarImagenAJLabelDinamico(lblFondo, 
                "src/imagenes/fondoBlancoVentanaEmergente.png");
        ComponentesDeVentana.ajustarImagenAJLabelDinamico(lblImagenPresidente,
                binomio.getPresidente().getRutaImagen());
        ComponentesDeVentana.ajustarImagenAJLabelDinamico(lblImagenVicepresidente,
                binomio.getVicepresidente().getRutaImagen());
        
        ComponentesDeVentana.ajustarTextoEnLabel(
                binomio.getPresidente().getApellidos().toUpperCase() + " " + 
                        binomio.getPresidente().getNombres().toUpperCase(), 
                lblNombrePresidente, fuenteEstandar);
        ComponentesDeVentana.ajustarTextoEnLabel(binomio.getVicepresidente().getApellidos().toUpperCase() + " " + 
                        binomio.getVicepresidente().getNombres().toUpperCase(), 
                lblNombreVicepresidente, fuenteEstandar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagenPresidente = new javax.swing.JLabel();
        lblNombrePresidente = new javax.swing.JLabel();
        lblPresidente = new javax.swing.JLabel();
        lblVicepresidente = new javax.swing.JLabel();
        lblNombreVicepresidente = new javax.swing.JLabel();
        lblImagenVicepresidente = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagenPresidente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblImagenPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 40, 70, 70));

        lblNombrePresidente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePresidente.setText("Nombre");
        getContentPane().add(lblNombrePresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, 70, 30));

        lblPresidente.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblPresidente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPresidente.setText("PRESIDENTE");
        getContentPane().add(lblPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 100, 15));

        lblVicepresidente.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblVicepresidente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVicepresidente.setText("VICEPRESIDENTE");
        getContentPane().add(lblVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 275, 100, 15));

        lblNombreVicepresidente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreVicepresidente.setText("Nombre");
        getContentPane().add(lblNombreVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 240, 70, 30));

        lblImagenVicepresidente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblImagenVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 170, 70, 70));

        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaEmergenteCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmergenteCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmergenteCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmergenteCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaEmergenteCandidatos dialog = new VentanaEmergenteCandidatos(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagenPresidente;
    private javax.swing.JLabel lblImagenVicepresidente;
    private javax.swing.JLabel lblNombrePresidente;
    private javax.swing.JLabel lblNombreVicepresidente;
    private javax.swing.JLabel lblPresidente;
    private javax.swing.JLabel lblVicepresidente;
    // End of variables declaration//GEN-END:variables
}