/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;
import herramientas.ComponentesDeVentana;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Windows
 */
public class LugarDeVotacion extends javax.swing.JFrame {

    /**
     * Creates new form LugarDeVotacion
     */
    public LugarDeVotacion() {
        initComponents();
                setSize(400, 550);
        setResizable(false);
        setTitle("LUGAR DE VOTACIÓN");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        ComponentesDeVentana.ajustarImagenAJLabel(lblFondo,
                "src/imagenes/fondoBlanco2.jpg");
        ComponentesDeVentana.ajustarImagenAJLabel(lblLogoPrincipal,
                "src/imagenes/logoPrincipal2.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblLogoPrincipal = new javax.swing.JLabel();
        lblLugarDeVotacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDerechosReservados = new javax.swing.JLabel();
        btnRealizado = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(lblLogoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 360, 126));

        lblLugarDeVotacion.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblLugarDeVotacion.setForeground(new java.awt.Color(0, 102, 204));
        lblLugarDeVotacion.setText("Su lugar de votación es:");
        jPanel2.add(lblLugarDeVotacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        lblDerechosReservados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDerechosReservados.setText("EPN © Todos los Derechos Reservados.");
        jPanel2.add(lblDerechosReservados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 230, -1));

        btnRealizado.setBackground(new java.awt.Color(0, 153, 255));
        btnRealizado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRealizado.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizado.setText("Realizado");
        btnRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnRealizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 160, 30));
        jPanel2.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizadoActionPerformed
        this.dispose();
        FrmPrincipal.ventanaPrincipal.setEnabled(true);
    }//GEN-LAST:event_btnRealizadoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FrmPrincipal.ventanaPrincipal.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(LugarDeVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LugarDeVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LugarDeVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LugarDeVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LugarDeVotacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDerechosReservados;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogoPrincipal;
    private javax.swing.JLabel lblLugarDeVotacion;
    // End of variables declaration//GEN-END:variables
}
