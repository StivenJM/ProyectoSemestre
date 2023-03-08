package ventanas;
import clases.Administrador;
import herramientas.ComponentesDeVentana;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class GestionCivil extends javax.swing.JFrame {

    DefaultTableModel tablaGestionCivil;
    public GestionCivil() {
        initComponents();
                setSize(1100,700);
        setResizable(false);
        setTitle("GESTIÓN CIVIL");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        ComponentesDeVentana.ajustarImagenAJLabel(lblFondo,
                "src/imagenes/fondoBlanco2.jpg");
        ComponentesDeVentana.ajustarImagenAJLabel(lblLogoPrincipal, 
                "src/imagenes/logoPrincipal.png");
        
                pnlGestionCivil.setOpaque(false);
        pnlGestionCivil.setVisible(false);
        
        ComponentesDeVentana.ajustarImagenAJButton(btnNuevo, "src/imagenes/nuevo.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnEliminar, "src/imagenes/eliminar.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnEditar, "src/imagenes/editar.png");

        btnNuevo.setOpaque(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setBorderPainted(false);
        btnEliminar.setOpaque(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setBorderPainted(false);
        btnEditar.setOpaque(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setBorderPainted(false);
        
        tablaGestionCivil = new DefaultTableModel();
        tablaGestionCivil.addColumn(" ");
        tablaGestionCivil.addColumn("Nombres");
        tablaGestionCivil.addColumn("Apellidos");
        tablaGestionCivil.addColumn("Cédula");
        tablaGestionCivil.addColumn("Fecha de Nacimiento");
        tblGestionCivil.setModel(tablaGestionCivil);

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

        jPanel1 = new javax.swing.JPanel();
        lblLogoPrincipal = new javax.swing.JLabel();
        lblDerechosReservados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGestionCivil = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        pnlGestionCivil = new javax.swing.JPanel();
        lblDatosDelCiudadano = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        lblPrimerNombre = new javax.swing.JLabel();
        lblSegundoNombre = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        lblPrimerApellido = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        lblSegundoApellido = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblFechaDeNacimiento = new javax.swing.JLabel();
        txtNumeroDeContacto = new javax.swing.JTextField();
        lblNumeroDeContacto = new javax.swing.JLabel();
        txtFechaDeNacimiento = new javax.swing.JTextField();
        lblDireccionDeCorreoElectronico = new javax.swing.JLabel();
        txtDireccionDeCorreoElectronico = new javax.swing.JTextField();
        lblDireccionDeResidenciaActual = new javax.swing.JLabel();
        txtDireccionDeResidenciaActual = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblLogoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -40, 340, 190));

        lblDerechosReservados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDerechosReservados.setText("EPN © Todos los Derechos Reservados.");
        jPanel1.add(lblDerechosReservados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 230, -1));

        tblGestionCivil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblGestionCivil.setModel(new javax.swing.table.DefaultTableModel(
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
        tblGestionCivil.setAlignmentX(0.0F);
        tblGestionCivil.setAlignmentY(0.0F);
        jScrollPane2.setViewportView(tblGestionCivil);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 550, -1));

        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 65, 65));
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 65, 65));

        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 65, 65));

        lblDatosDelCiudadano.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDatosDelCiudadano.setText("Datos del Ciudadano");

        lblPrimerNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPrimerNombre.setText("Primer Nombre");

        lblSegundoNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSegundoNombre.setText("Segundo Nombre");

        lblPrimerApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPrimerApellido.setText("Primer Apellido");

        lblSegundoApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSegundoApellido.setText("Segundo Apellido");

        lblCedula.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCedula.setText("Cédula");

        lblFechaDeNacimiento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaDeNacimiento.setText("Fecha de Nacimiento");

        lblNumeroDeContacto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNumeroDeContacto.setText("Número de Contacto");

        lblDireccionDeCorreoElectronico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDireccionDeCorreoElectronico.setText("Dirección de Correo Electrónico");

        lblDireccionDeResidenciaActual.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDireccionDeResidenciaActual.setText("Dirección de Residencia Actual");

        btnGuardar.setBackground(new java.awt.Color(0, 153, 255));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");

        javax.swing.GroupLayout pnlGestionCivilLayout = new javax.swing.GroupLayout(pnlGestionCivil);
        pnlGestionCivil.setLayout(pnlGestionCivilLayout);
        pnlGestionCivilLayout.setHorizontalGroup(
            pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGestionCivilLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedula)
                    .addComponent(lblDatosDelCiudadano)
                    .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlGestionCivilLayout.createSequentialGroup()
                            .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlGestionCivilLayout.createSequentialGroup()
                                    .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPrimerNombre)
                                        .addComponent(lblSegundoNombre)
                                        .addComponent(lblPrimerApellido)
                                        .addComponent(lblSegundoApellido))
                                    .addGap(137, 137, 137))
                                .addGroup(pnlGestionCivilLayout.createSequentialGroup()
                                    .addComponent(lblFechaDeNacimiento)
                                    .addGap(117, 117, 117)))
                            .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlGestionCivilLayout.createSequentialGroup()
                            .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlGestionCivilLayout.createSequentialGroup()
                                    .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNumeroDeContacto)
                                        .addComponent(lblDireccionDeCorreoElectronico))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGestionCivilLayout.createSequentialGroup()
                                    .addComponent(lblDireccionDeResidenciaActual)
                                    .addGap(59, 59, 59)))
                            .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNumeroDeContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txtDireccionDeCorreoElectronico)
                                .addComponent(txtDireccionDeResidenciaActual)))))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGestionCivilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        pnlGestionCivilLayout.setVerticalGroup(
            pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGestionCivilLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblDatosDelCiudadano)
                .addGap(18, 18, 18)
                .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerNombre)
                    .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSegundoNombre)
                    .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerApellido)
                    .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSegundoApellido)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaDeNacimiento))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroDeContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroDeContacto))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionDeCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccionDeCorreoElectronico))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDireccionDeResidenciaActual)
                    .addComponent(txtDireccionDeResidenciaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnlGestionCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 610, 570));

        lblFondo.setPreferredSize(new java.awt.Dimension(1100, 700));
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        pnlGestionCivil.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Administracion.ventanaAdministracion.setEnabled(true);
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
            java.util.logging.Logger.getLogger(GestionCivil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCivil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCivil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCivil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionCivil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDatosDelCiudadano;
    private javax.swing.JLabel lblDerechosReservados;
    private javax.swing.JLabel lblDireccionDeCorreoElectronico;
    private javax.swing.JLabel lblDireccionDeResidenciaActual;
    private javax.swing.JLabel lblFechaDeNacimiento;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogoPrincipal;
    private javax.swing.JLabel lblNumeroDeContacto;
    private javax.swing.JLabel lblPrimerApellido;
    private javax.swing.JLabel lblPrimerNombre;
    private javax.swing.JLabel lblSegundoApellido;
    private javax.swing.JLabel lblSegundoNombre;
    private javax.swing.JPanel pnlGestionCivil;
    private javax.swing.JTable tblGestionCivil;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccionDeCorreoElectronico;
    private javax.swing.JTextField txtDireccionDeResidenciaActual;
    private javax.swing.JTextField txtFechaDeNacimiento;
    private javax.swing.JTextField txtNumeroDeContacto;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    // End of variables declaration//GEN-END:variables
}