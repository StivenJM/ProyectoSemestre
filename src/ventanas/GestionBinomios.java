/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.*;
import herramientas.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import static ventanas.FrmPrincipal.listaBinomios;

/**
 *
 * @author Erick
 */
public class GestionBinomios extends javax.swing.JFrame {
    
    int filaSeleccionada;
    Binomio binomioSeleccionado;
    private final int IMAGEN_MOVIMIENTO = 1;
    private final int IMAGEN_PRESIDENTE = 2;
    private final int IMAGEN_VICEPRESIDENTE = 3;
    private final int NUMERO_MAXIMO_BINOMIOS_PERMITIDOS = 16;
    private int tipoDeUltimaImagenSeleccionada;
    private String rutaImagenMovimientoSeleccionada;
    private String rutaImagenPresidenteSeleccionada;
    private String rutaImagenVicepresidenteSeleccionada;

    /**
     * Creates new form GestionBinomios
     */
    DefaultTableModel dtmTablaBinomios;
    
    public GestionBinomios() {
        initComponents();
        
        quitarTextosDeErrores();
        
        setSize(1100, 700);
        setResizable(false);
        setTitle("GESTIÓN DE BINOMIOS");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        ComponentesDeVentana.ajustarImagenAJLabel(lblFondo,
                "src/imagenes/fondoBlanco2.jpg");
        ComponentesDeVentana.ajustarImagenAJLabel(lblLogoPrincipal,
                "src/imagenes/logoPrincipal.png");
        
        pnlEditarBinomio.setOpaque(false);
        pnlEditarBinomio.setVisible(false);
        pnlNuevoBinomio.setOpaque(false);
        pnlNuevoBinomio.setVisible(false);
        pnlBuscarBinomio.setOpaque(false);
        
        ComponentesDeVentana.ajustarImagenAJButton(btnNuevo, "src/imagenes/nuevo.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnEliminar, "src/imagenes/eliminar.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnEditar, "src/imagenes/editar.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnBuscar, "src/imagenes/buscar.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnAdjuntarImagenMovimiento, "src/imagenes/adjuntarImagen.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnAdjuntarImagenPresidente, "src/imagenes/adjuntarImagen.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnAdjuntarImagenVicepresidente, "src/imagenes/adjuntarImagen.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnAdjuntarImagenMovimiento1, "src/imagenes/adjuntarImagen.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnAdjuntarImagenPresidente1, "src/imagenes/adjuntarImagen.png");
        ComponentesDeVentana.ajustarImagenAJButton(btnAdjuntarImagenVicepresidente1, "src/imagenes/adjuntarImagen.png");

        //Añadiendo informacion de ventameas emergentes en los botones de adjuntar imagen
        btnAdjuntarImagenMovimiento.setToolTipText("Presiona para adjuntar imagen de movimiento");
        btnAdjuntarImagenPresidente.setToolTipText("Presiona para adjuntar imagen de candidato");
        btnAdjuntarImagenVicepresidente.setToolTipText("Presiona para adjuntar imagen de candidato");
        btnAdjuntarImagenMovimiento1.setToolTipText("Presiona para cambiar imagen de movimiento");
        btnAdjuntarImagenPresidente1.setToolTipText("Presiona para cambiar imagen de candidato");
        btnAdjuntarImagenVicepresidente1.setToolTipText("Presiona para cambiar imagen de candidato");
        
        btnNuevo.setOpaque(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setBorderPainted(false);
        btnEliminar.setOpaque(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setBorderPainted(false);
        btnEditar.setOpaque(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setBorderPainted(false);
        btnBuscar.setOpaque(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setBorderPainted(false);
        
        dtmTablaBinomios = new DefaultTableModel();
        dtmTablaBinomios.addColumn("Lista");
        dtmTablaBinomios.addColumn("Presidente/a");
        dtmTablaBinomios.addColumn("Vicepresidente/a");
        tblBinomios.setModel(dtmTablaBinomios);
        
        limpiarTablaDeBinomios();
        mostrarDatosDeBinomios();
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

        pnlFondo = new javax.swing.JPanel();
        lblLogoPrincipal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBinomios = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        pnlEditarBinomio = new javax.swing.JPanel();
        lblNombreMovimientoPolitico = new javax.swing.JLabel();
        txtMovimientoPolitico = new javax.swing.JTextField();
        lblDatosPresidente = new javax.swing.JLabel();
        txtNombresPresidente = new javax.swing.JTextField();
        lbNombresPresidente = new javax.swing.JLabel();
        lblApellidosPresidente = new javax.swing.JLabel();
        txtApellidosPresidente = new javax.swing.JTextField();
        lblDatosVicepresidente = new javax.swing.JLabel();
        lblNombresVicepresidente = new javax.swing.JLabel();
        txtNombresVicepresidente = new javax.swing.JTextField();
        lblApellidosVicepresidente = new javax.swing.JLabel();
        txtApellidosVicepresidente = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lblNumeroDeLista = new javax.swing.JLabel();
        txtNumeroDeLista = new javax.swing.JTextField();
        lblErrorNumeroLista = new javax.swing.JLabel();
        lblErrorNombresPresidente = new javax.swing.JLabel();
        lblErrorApellidosPresidente = new javax.swing.JLabel();
        lblErrorNombresVicepresidente = new javax.swing.JLabel();
        lblErrorApellidosVicepresidente = new javax.swing.JLabel();
        lblErrorNombreMovimiento = new javax.swing.JLabel();
        btnAdjuntarImagenMovimiento1 = new javax.swing.JButton();
        btnAdjuntarImagenPresidente1 = new javax.swing.JButton();
        btnAdjuntarImagenVicepresidente1 = new javax.swing.JButton();
        pnlNuevoBinomio = new javax.swing.JPanel();
        lblNombreMovimientoPolitico2 = new javax.swing.JLabel();
        txtMovimientoPolitico2 = new javax.swing.JTextField();
        lblDatosPresidente2 = new javax.swing.JLabel();
        txtNombresPresidente2 = new javax.swing.JTextField();
        lbNombresPresidente2 = new javax.swing.JLabel();
        lblApellidosPresidente2 = new javax.swing.JLabel();
        txtApellidosPresidente2 = new javax.swing.JTextField();
        lblDatosVicepresidente2 = new javax.swing.JLabel();
        lblNombresVicepresidente2 = new javax.swing.JLabel();
        txtNombresVicepresidente2 = new javax.swing.JTextField();
        lblApellidosVicepresidente2 = new javax.swing.JLabel();
        txtApellidosVicepresidente2 = new javax.swing.JTextField();
        lblNumeroDeLista2 = new javax.swing.JLabel();
        txtNumeroDeLista2 = new javax.swing.JTextField();
        lblErrorNumeroLista2 = new javax.swing.JLabel();
        lblErrorNombresPresidente2 = new javax.swing.JLabel();
        lblErrorApellidosPresidente2 = new javax.swing.JLabel();
        lblErrorNombresVicepresidente2 = new javax.swing.JLabel();
        lblErrorApellidosVicepresidente2 = new javax.swing.JLabel();
        lblErrorNombreMovimiento2 = new javax.swing.JLabel();
        btnAnadir = new javax.swing.JButton();
        btnAdjuntarImagenMovimiento = new javax.swing.JButton();
        btnAdjuntarImagenPresidente = new javax.swing.JButton();
        btnAdjuntarImagenVicepresidente = new javax.swing.JButton();
        lblMovimientoPoliticoObligatorio = new javax.swing.JLabel();
        lblNumeroListaObligatorio = new javax.swing.JLabel();
        lblNombresPresidenteObligatorio = new javax.swing.JLabel();
        lblApellidosPresidenteObligatorio = new javax.swing.JLabel();
        lblNombresVicepresidenteObligatorio = new javax.swing.JLabel();
        lblApellidosVicepresidenteObligatorio = new javax.swing.JLabel();
        lblImagenMovimientoObligatorio = new javax.swing.JLabel();
        pnlBuscarBinomio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreMovimientoBusqueda = new javax.swing.JTextField();
        lblNumeroListaBusqueda = new javax.swing.JLabel();
        txtNumeroListaBusqueda = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlFondo.add(lblLogoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -40, 340, 190));

        tblBinomios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblBinomios.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBinomios.setAlignmentX(0.0F);
        tblBinomios.setAlignmentY(0.0F);
        tblBinomios.setOpaque(false);
        jScrollPane2.setViewportView(tblBinomios);

        pnlFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        pnlFondo.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 65, 65));

        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 65, 65));

        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 65, 65));

        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 65, 65));

        pnlEditarBinomio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreMovimientoPolitico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreMovimientoPolitico.setText("Nombre del movimiento");
        pnlEditarBinomio.add(lblNombreMovimientoPolitico, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15, -1, 25));

        txtMovimientoPolitico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMovimientoPoliticoKeyReleased(evt);
            }
        });
        pnlEditarBinomio.add(txtMovimientoPolitico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 15, 200, 25));

        lblDatosPresidente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDatosPresidente.setText("Datos del candidato a presidente");
        pnlEditarBinomio.add(lblDatosPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 115, -1, 25));

        txtNombresPresidente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresPresidenteKeyReleased(evt);
            }
        });
        pnlEditarBinomio.add(txtNombresPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, 25));

        lbNombresPresidente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNombresPresidente.setText("Nombres");
        pnlEditarBinomio.add(lbNombresPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 25));

        lblApellidosPresidente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblApellidosPresidente.setText("Apellidos");
        pnlEditarBinomio.add(lblApellidosPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 195, -1, 25));

        txtApellidosPresidente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosPresidenteKeyReleased(evt);
            }
        });
        pnlEditarBinomio.add(txtApellidosPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 200, 25));

        lblDatosVicepresidente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDatosVicepresidente.setText("Datos del candidato a vicepresidente");
        pnlEditarBinomio.add(lblDatosVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, -1, 25));

        lblNombresVicepresidente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombresVicepresidente.setText("Nombres");
        pnlEditarBinomio.add(lblNombresVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 285, -1, 25));

        txtNombresVicepresidente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresVicepresidenteKeyReleased(evt);
            }
        });
        pnlEditarBinomio.add(txtNombresVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 285, 200, 25));

        lblApellidosVicepresidente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblApellidosVicepresidente.setText("Apellidos");
        pnlEditarBinomio.add(lblApellidosVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 25));

        txtApellidosVicepresidente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosVicepresidenteKeyReleased(evt);
            }
        });
        pnlEditarBinomio.add(txtApellidosVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 200, 25));

        btnActualizar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlEditarBinomio.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        lblNumeroDeLista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNumeroDeLista.setText("Número de lista");
        pnlEditarBinomio.add(lblNumeroDeLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 60, -1, 25));

        txtNumeroDeLista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroDeListaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDeListaKeyTyped(evt);
            }
        });
        pnlEditarBinomio.add(txtNumeroDeLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 200, 25));

        lblErrorNumeroLista.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorNumeroLista.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNumeroLista.setText("jLabel2");
        pnlEditarBinomio.add(lblErrorNumeroLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 85, -1, -1));

        lblErrorNombresPresidente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorNombresPresidente.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNombresPresidente.setText("jLabel3");
        pnlEditarBinomio.add(lblErrorNombresPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 175, -1, -1));

        lblErrorApellidosPresidente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorApellidosPresidente.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorApellidosPresidente.setText("jLabel4");
        pnlEditarBinomio.add(lblErrorApellidosPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        lblErrorNombresVicepresidente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorNombresVicepresidente.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNombresVicepresidente.setText("jLabel5");
        pnlEditarBinomio.add(lblErrorNombresVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        lblErrorApellidosVicepresidente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorApellidosVicepresidente.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorApellidosVicepresidente.setText("jLabel6");
        pnlEditarBinomio.add(lblErrorApellidosVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 355, -1, -1));

        lblErrorNombreMovimiento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorNombreMovimiento.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNombreMovimiento.setText("jLabel1");
        pnlEditarBinomio.add(lblErrorNombreMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        btnAdjuntarImagenMovimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarImagenMovimiento1ActionPerformed(evt);
            }
        });
        pnlEditarBinomio.add(btnAdjuntarImagenMovimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 40, 40));

        btnAdjuntarImagenPresidente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarImagenPresidente1ActionPerformed(evt);
            }
        });
        pnlEditarBinomio.add(btnAdjuntarImagenPresidente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 165, 40, 40));

        btnAdjuntarImagenVicepresidente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarImagenVicepresidente1ActionPerformed(evt);
            }
        });
        pnlEditarBinomio.add(btnAdjuntarImagenVicepresidente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 40, 40));

        pnlFondo.add(pnlEditarBinomio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 640, 430));

        pnlNuevoBinomio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreMovimientoPolitico2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreMovimientoPolitico2.setText("Nombre del movimiento político");
        lblNombreMovimientoPolitico2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblNombreMovimientoPolitico2KeyReleased(evt);
            }
        });
        pnlNuevoBinomio.add(lblNombreMovimientoPolitico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15, -1, 25));

        txtMovimientoPolitico2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMovimientoPolitico2KeyReleased(evt);
            }
        });
        pnlNuevoBinomio.add(txtMovimientoPolitico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 15, 200, 25));

        lblDatosPresidente2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDatosPresidente2.setText("Datos del candidato a presidente");
        pnlNuevoBinomio.add(lblDatosPresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 115, -1, 25));

        txtNombresPresidente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresPresidente2KeyReleased(evt);
            }
        });
        pnlNuevoBinomio.add(txtNombresPresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, 25));

        lbNombresPresidente2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNombresPresidente2.setText("Nombres");
        pnlNuevoBinomio.add(lbNombresPresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 25));

        lblApellidosPresidente2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblApellidosPresidente2.setText("Apellidos");
        pnlNuevoBinomio.add(lblApellidosPresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 195, -1, 25));

        txtApellidosPresidente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosPresidente2KeyReleased(evt);
            }
        });
        pnlNuevoBinomio.add(txtApellidosPresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 200, 25));

        lblDatosVicepresidente2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDatosVicepresidente2.setText("Datos del candidato a vicepresidente");
        pnlNuevoBinomio.add(lblDatosVicepresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, -1, 25));

        lblNombresVicepresidente2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombresVicepresidente2.setText("Nombres");
        pnlNuevoBinomio.add(lblNombresVicepresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 285, -1, 25));

        txtNombresVicepresidente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresVicepresidente2KeyReleased(evt);
            }
        });
        pnlNuevoBinomio.add(txtNombresVicepresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 285, 200, 25));

        lblApellidosVicepresidente2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblApellidosVicepresidente2.setText("Apellidos");
        pnlNuevoBinomio.add(lblApellidosVicepresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 25));

        txtApellidosVicepresidente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosVicepresidente2KeyReleased(evt);
            }
        });
        pnlNuevoBinomio.add(txtApellidosVicepresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 200, 25));

        lblNumeroDeLista2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNumeroDeLista2.setText("Número de lista");
        pnlNuevoBinomio.add(lblNumeroDeLista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 60, -1, 25));

        txtNumeroDeLista2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroDeLista2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDeLista2KeyTyped(evt);
            }
        });
        pnlNuevoBinomio.add(txtNumeroDeLista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 200, 25));

        lblErrorNumeroLista2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorNumeroLista2.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNumeroLista2.setText("jLabel2");
        pnlNuevoBinomio.add(lblErrorNumeroLista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 85, -1, 15));

        lblErrorNombresPresidente2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorNombresPresidente2.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNombresPresidente2.setText("jLabel3");
        pnlNuevoBinomio.add(lblErrorNombresPresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 175, -1, 15));

        lblErrorApellidosPresidente2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorApellidosPresidente2.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorApellidosPresidente2.setText("jLabel4");
        pnlNuevoBinomio.add(lblErrorApellidosPresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 15));

        lblErrorNombresVicepresidente2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorNombresVicepresidente2.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNombresVicepresidente2.setText("jLabel5");
        pnlNuevoBinomio.add(lblErrorNombresVicepresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, 15));

        lblErrorApellidosVicepresidente2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorApellidosVicepresidente2.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorApellidosVicepresidente2.setText("jLabel6");
        pnlNuevoBinomio.add(lblErrorApellidosVicepresidente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 355, -1, 15));

        lblErrorNombreMovimiento2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorNombreMovimiento2.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNombreMovimiento2.setText("jLabel1");
        pnlNuevoBinomio.add(lblErrorNombreMovimiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, 15));

        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        pnlNuevoBinomio.add(btnAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        btnAdjuntarImagenMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarImagenMovimientoActionPerformed(evt);
            }
        });
        pnlNuevoBinomio.add(btnAdjuntarImagenMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 40, 40));

        btnAdjuntarImagenPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarImagenPresidenteActionPerformed(evt);
            }
        });
        pnlNuevoBinomio.add(btnAdjuntarImagenPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 165, 40, 40));

        btnAdjuntarImagenVicepresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarImagenVicepresidenteActionPerformed(evt);
            }
        });
        pnlNuevoBinomio.add(btnAdjuntarImagenVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 40, 40));

        lblMovimientoPoliticoObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovimientoPoliticoObligatorio.setText("*");
        lblMovimientoPoliticoObligatorio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlNuevoBinomio.add(lblMovimientoPoliticoObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 15, 8, 25));

        lblNumeroListaObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroListaObligatorio.setText("*");
        lblNumeroListaObligatorio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlNuevoBinomio.add(lblNumeroListaObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 8, 25));

        lblNombresPresidenteObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombresPresidenteObligatorio.setText("*");
        lblNombresPresidenteObligatorio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlNuevoBinomio.add(lblNombresPresidenteObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 8, 25));

        lblApellidosPresidenteObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidosPresidenteObligatorio.setText("*");
        lblApellidosPresidenteObligatorio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlNuevoBinomio.add(lblApellidosPresidenteObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 195, 8, 25));

        lblNombresVicepresidenteObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombresVicepresidenteObligatorio.setText("*");
        lblNombresVicepresidenteObligatorio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlNuevoBinomio.add(lblNombresVicepresidenteObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 285, 8, 25));

        lblApellidosVicepresidenteObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidosVicepresidenteObligatorio.setText("*");
        lblApellidosVicepresidenteObligatorio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlNuevoBinomio.add(lblApellidosVicepresidenteObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 8, 25));

        lblImagenMovimientoObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenMovimientoObligatorio.setText("*");
        lblImagenMovimientoObligatorio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlNuevoBinomio.add(lblImagenMovimientoObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 8, 25));

        pnlFondo.add(pnlNuevoBinomio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 640, 430));

        pnlBuscarBinomio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Binomio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nombre del Movimiento");

        lblNumeroListaBusqueda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNumeroListaBusqueda.setText("Número de lista");

        javax.swing.GroupLayout pnlBuscarBinomioLayout = new javax.swing.GroupLayout(pnlBuscarBinomio);
        pnlBuscarBinomio.setLayout(pnlBuscarBinomioLayout);
        pnlBuscarBinomioLayout.setHorizontalGroup(
            pnlBuscarBinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarBinomioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscarBinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblNumeroListaBusqueda))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarBinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreMovimientoBusqueda)
                    .addComponent(txtNumeroListaBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        pnlBuscarBinomioLayout.setVerticalGroup(
            pnlBuscarBinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarBinomioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscarBinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreMovimientoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarBinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroListaBusqueda)
                    .addComponent(txtNumeroListaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlBuscarBinomio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 440, 120));
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            rutaImagenMovimientoSeleccionada = null;
            rutaImagenPresidenteSeleccionada = null;
            rutaImagenVicepresidenteSeleccionada = null;
            if (txtNombreMovimientoBusqueda.getText().isBlank() && txtNumeroListaBusqueda.getText().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese el nombre del movimiento"
                        + " o el número de lista para realizar la búsqueda", "Error", JOptionPane.ERROR_MESSAGE);
                limpiarFormulario1();
                pnlEditarBinomio.setVisible(false);
            } else if (txtNombreMovimientoBusqueda.getText().isBlank() && !txtNumeroListaBusqueda.getText().isBlank()) {
                int numeroDeLista = Integer.parseInt(txtNumeroListaBusqueda.getText());
                int posicionDeLaLista = ManejoDeListas.buscarEnListaDeBinomios(numeroDeLista);
                tblBinomios.setRowSelectionInterval(posicionDeLaLista, posicionDeLaLista);
                llenarDatosAEditar();
                pnlEditarBinomio.setVisible(true);
                txtNumeroListaBusqueda.setText("");
            } else if (!txtNombreMovimientoBusqueda.getText().isBlank() && txtNumeroListaBusqueda.getText().isBlank()) {
                String nombreMovimiento = txtNombreMovimientoBusqueda.getText();
                int posicionDeLaLista = ManejoDeListas.buscarEnListaDeBinomios(nombreMovimiento);
                tblBinomios.setRowSelectionInterval(posicionDeLaLista, posicionDeLaLista);
                llenarDatosAEditar();
                pnlEditarBinomio.setVisible(true);
                txtNombreMovimientoBusqueda.setText("");
            } else if (!txtNombreMovimientoBusqueda.getText().isBlank() && !txtNumeroListaBusqueda.getText().isBlank()) {
                int numeroDeLista = Integer.parseInt(txtNumeroListaBusqueda.getText());
                String nombreMovimiento = txtNombreMovimientoBusqueda.getText();
                int posicionDeLaListaConNumero = ManejoDeListas.buscarEnListaDeBinomios(numeroDeLista);
                int posicionDeLaListaConNombre = ManejoDeListas.buscarEnListaDeBinomios(nombreMovimiento);
                int posicionDeLaListaFinal;
                
                if (posicionDeLaListaConNombre == posicionDeLaListaConNumero) {
                    posicionDeLaListaFinal = posicionDeLaListaConNombre;
                    tblBinomios.setRowSelectionInterval(posicionDeLaListaFinal, posicionDeLaListaFinal);
                    llenarDatosAEditar();
                    pnlEditarBinomio.setVisible(true);
                    txtNombreMovimientoBusqueda.setText("");
                    txtNumeroListaBusqueda.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El nombre del Movimiento no coincide con el número de la Lista. \nCompruebe los datos ingresados e inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (IllegalArgumentException iae) {
            JOptionPane.showMessageDialog(rootPane, "No se encontró el binomio", "Error", JOptionPane.ERROR_MESSAGE);
            limpiarFormulario1();
            pnlEditarBinomio.setVisible(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            pnlEditarBinomio.setVisible(true);
            pnlNuevoBinomio.setVisible(false);
            llenarDatosAEditar();
            rutaImagenMovimientoSeleccionada = null;
            rutaImagenPresidenteSeleccionada = null;
            rutaImagenVicepresidenteSeleccionada = null;
        } catch (IndexOutOfBoundsException iobe) {
            JOptionPane.showMessageDialog(rootPane, "No se seleccionó ningún binomio para editar", "Error", JOptionPane.ERROR_MESSAGE);
            pnlEditarBinomio.setVisible(false);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        if (FrmPrincipal.listaBinomios.size() < NUMERO_MAXIMO_BINOMIOS_PERMITIDOS) {
            limpiarFormulario1();
            limpiarFormulario2();
            rutaImagenMovimientoSeleccionada = null;
            rutaImagenPresidenteSeleccionada = null;
            rutaImagenVicepresidenteSeleccionada = null;
            pnlNuevoBinomio.setVisible(true);
            pnlEditarBinomio.setVisible(false);
            btnAnadir.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ya alcanzó el numero maximo\nde binomios permitidos");
            pnlNuevoBinomio.setVisible(false);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            obtenerBinomioSeleccionado();
            eliminarImagenesRelacionadasConBinomio(binomioSeleccionado, true, true, true);
            listaBinomios.remove(binomioSeleccionado);
            limpiarTablaDeBinomios();
            mostrarDatosDeBinomios();
        } catch (IndexOutOfBoundsException iobe) {
            JOptionPane.showMessageDialog(rootPane, "No se seleccionó ningún binomio para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        String nuevoNombreMovimiento = txtMovimientoPolitico.getText();
        int nuevoNumeroDeLista = Integer.parseInt(txtNumeroDeLista.getText());
        String nuevosNombresPresidente = txtNombresPresidente.getText();
        String nuevosApellidosPresidente = txtApellidosPresidente.getText();
        String nuevosNombresVicepresidente = txtNombresVicepresidente.getText();
        String nuevosApellidosVicepresidente = txtApellidosVicepresidente.getText();
        
        binomioSeleccionado.getMovimientoPolitico().setNombre(nuevoNombreMovimiento);
        binomioSeleccionado.getMovimientoPolitico().setNumeroDeLista(nuevoNumeroDeLista);
        binomioSeleccionado.getPresidente().setNombres(nuevosNombresPresidente);
        binomioSeleccionado.getPresidente().setApellidos(nuevosApellidosPresidente);
        binomioSeleccionado.getVicepresidente().setNombres(nuevosNombresVicepresidente);
        binomioSeleccionado.getVicepresidente().setApellidos(nuevosApellidosVicepresidente);
        
        if (rutaImagenMovimientoSeleccionada != null) {
            eliminarImagenesRelacionadasConBinomio(binomioSeleccionado, true, false, false);
            binomioSeleccionado.getMovimientoPolitico().setRutaImagen(rutaImagenMovimientoSeleccionada);
        }
        
        if (rutaImagenPresidenteSeleccionada != null) {
            eliminarImagenesRelacionadasConBinomio(binomioSeleccionado, false, true, false);
            binomioSeleccionado.getPresidente().setRutaImagen(rutaImagenPresidenteSeleccionada);
        }
        
        if (rutaImagenVicepresidenteSeleccionada != null) {
            eliminarImagenesRelacionadasConBinomio(binomioSeleccionado, false, false, true);
            binomioSeleccionado.getVicepresidente().setRutaImagen(rutaImagenVicepresidenteSeleccionada);
        }
        
        pnlEditarBinomio.setVisible(false);
        limpiarFormulario1();
        limpiarTablaDeBinomios();
        mostrarDatosDeBinomios();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Administracion.ventanaAdministracion.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void txtNumeroDeListaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDeListaKeyReleased
        // TODO add your handling code here:
        int nuevoNumeroDeLista;
        if (Validador.esNumeroNaturalCorrecto(txtNumeroDeLista.getText())) {
            nuevoNumeroDeLista = Integer.parseInt(txtNumeroDeLista.getText());
            if (ManejoDeListas.buscarEnListaDeBinomios(nuevoNumeroDeLista) == -1 || nuevoNumeroDeLista == binomioSeleccionado.getMovimientoPolitico().getNumeroDeLista()) {
                lblErrorNumeroLista.setVisible(false);
                btnActualizar.setEnabled(true);
            } else {
                lblErrorNumeroLista.setText("Número de Lista Repetido");
                lblErrorNumeroLista.setVisible(true);
                btnActualizar.setEnabled(false);
            }
        } else {
            lblErrorNumeroLista.setText("Número de Lista Incorrecto");
            lblErrorNumeroLista.setVisible(true);
            btnActualizar.setEnabled(false);
        }
    }//GEN-LAST:event_txtNumeroDeListaKeyReleased

    private void txtMovimientoPoliticoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMovimientoPoliticoKeyReleased
        // TODO add your handling code here:
        String nuevoNombreDelMovimiento = txtMovimientoPolitico.getText();
        if (ManejoDeListas.buscarEnListaDeBinomios(nuevoNombreDelMovimiento) == -1 || nuevoNombreDelMovimiento.equals(binomioSeleccionado.getMovimientoPolitico().getNombre())) {
            lblErrorNombreMovimiento.setVisible(false);
            btnActualizar.setEnabled(true);
        } else {
            lblErrorNombreMovimiento.setText("Movimiento Repetido");
            lblErrorNombreMovimiento.setVisible(true);
            btnActualizar.setEnabled(false);
        }
    }//GEN-LAST:event_txtMovimientoPoliticoKeyReleased

    private void txtMovimientoPolitico2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMovimientoPolitico2KeyReleased
        // TODO add your handling code here:
        String nombreDelMovimiento = txtMovimientoPolitico2.getText();
        if (ManejoDeListas.buscarEnListaDeBinomios(nombreDelMovimiento) == -1) {
            lblErrorNombreMovimiento2.setVisible(false);
            habilitarBotonAnadir();
        } else {
            lblErrorNombreMovimiento2.setText("Movimiento Repetido");
            lblErrorNombreMovimiento2.setVisible(true);
            btnAnadir.setEnabled(false);
        }
    }//GEN-LAST:event_txtMovimientoPolitico2KeyReleased

    private void txtNumeroDeLista2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDeLista2KeyReleased
        // TODO add your handling code here:
        int numeroDeLista;
        if (Validador.esNumeroNaturalCorrecto(txtNumeroDeLista2.getText())) {
            numeroDeLista = Integer.parseInt(txtNumeroDeLista2.getText());
            if (ManejoDeListas.buscarEnListaDeBinomios(numeroDeLista) == -1) {
                lblErrorNumeroLista2.setVisible(false);
                habilitarBotonAnadir();
            } else {
                lblErrorNumeroLista2.setText("Número de Lista Repetido");
                lblErrorNumeroLista2.setVisible(true);
                btnAnadir.setEnabled(false);
            }
        } else {
            lblErrorNumeroLista2.setText("Número de Lista Incorrecto");
            lblErrorNumeroLista2.setVisible(true);
            btnAnadir.setEnabled(false);
        }
    }//GEN-LAST:event_txtNumeroDeLista2KeyReleased

    private void lblNombreMovimientoPolitico2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblNombreMovimientoPolitico2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNombreMovimientoPolitico2KeyReleased

    private void txtNombresPresidenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresPresidenteKeyReleased
        // TODO add your handling code here:
        if (!Validador.esNombreCorrecto(txtNombresPresidente.getText())) {
            lblErrorNombresPresidente.setVisible(true);
            btnActualizar.setEnabled(false);
        } else {
            lblErrorNombresPresidente.setVisible(false);
            btnActualizar.setEnabled(true);
        }
    }//GEN-LAST:event_txtNombresPresidenteKeyReleased

    private void txtApellidosPresidenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosPresidenteKeyReleased
        // TODO add your handling code here:
        if (!Validador.esApellidoCorrecto(txtApellidosPresidente.getText())) {
            lblErrorApellidosPresidente.setVisible(true);
            btnActualizar.setEnabled(false);
        } else {
            lblErrorApellidosPresidente.setVisible(false);
            btnActualizar.setEnabled(true);
        }
    }//GEN-LAST:event_txtApellidosPresidenteKeyReleased

    private void txtNombresVicepresidenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresVicepresidenteKeyReleased
        // TODO add your handling code here:
        if (!Validador.esNombreCorrecto(txtNombresVicepresidente.getText())) {
            lblErrorNombresVicepresidente.setVisible(true);
            btnActualizar.setEnabled(false);
        } else {
            lblErrorNombresVicepresidente.setVisible(false);
            btnActualizar.setEnabled(true);
        }
    }//GEN-LAST:event_txtNombresVicepresidenteKeyReleased

    private void txtApellidosVicepresidenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosVicepresidenteKeyReleased
        // TODO add your handling code here:
        if (!Validador.esApellidoCorrecto(txtApellidosVicepresidente.getText())) {
            lblErrorApellidosVicepresidente.setVisible(true);
            btnActualizar.setEnabled(false);
        } else {
            lblErrorApellidosVicepresidente.setVisible(false);
            btnActualizar.setEnabled(true);
        }
    }//GEN-LAST:event_txtApellidosVicepresidenteKeyReleased

    private void txtNombresPresidente2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresPresidente2KeyReleased
        // TODO add your handling code here:
        if (!Validador.esNombreCorrecto(txtNombresPresidente2.getText())) {
            lblErrorNombresPresidente2.setVisible(true);
            btnAnadir.setEnabled(false);
        } else {
            lblErrorNombresPresidente2.setVisible(false);
            habilitarBotonAnadir();
        }
    }//GEN-LAST:event_txtNombresPresidente2KeyReleased

    private void txtApellidosPresidente2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosPresidente2KeyReleased
        // TODO add your handling code here:
        if (!Validador.esApellidoCorrecto(txtApellidosPresidente2.getText())) {
            lblErrorApellidosPresidente2.setVisible(true);
            btnAnadir.setEnabled(false);
        } else {
            lblErrorApellidosPresidente2.setVisible(false);
            habilitarBotonAnadir();
        }
    }//GEN-LAST:event_txtApellidosPresidente2KeyReleased

    private void txtNombresVicepresidente2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresVicepresidente2KeyReleased
        // TODO add your handling code here:
        if (!Validador.esNombreCorrecto(txtNombresVicepresidente2.getText())) {
            lblErrorNombresVicepresidente2.setVisible(true);
            btnAnadir.setEnabled(false);
        } else {
            lblErrorNombresVicepresidente2.setVisible(false);
            habilitarBotonAnadir();
        }
    }//GEN-LAST:event_txtNombresVicepresidente2KeyReleased

    private void txtApellidosVicepresidente2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosVicepresidente2KeyReleased
        // TODO add your handling code here:
        if (!Validador.esApellidoCorrecto(txtApellidosVicepresidente2.getText())) {
            lblErrorApellidosVicepresidente2.setVisible(true);
            btnAnadir.setEnabled(false);
        } else {
            lblErrorApellidosVicepresidente2.setVisible(false);
            habilitarBotonAnadir();
        }
    }//GEN-LAST:event_txtApellidosVicepresidente2KeyReleased

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        // TODO add your handling code here:
        String nombreMovimiento = txtMovimientoPolitico2.getText();
        int numeroDeLista = Integer.parseInt(txtNumeroDeLista2.getText());
        String nombresPresidente = txtNombresPresidente2.getText();
        String apellidosPresidente = txtApellidosPresidente2.getText();
        String nombresVicepresidente = txtNombresVicepresidente2.getText();
        String apellidosVicepresidente = txtApellidosVicepresidente2.getText();
        
        MovimientoPolitico nuevoMovimiento = new MovimientoPolitico(nombreMovimiento, numeroDeLista);
        Candidato nuevoPresidente = new Candidato("Presidente", nombresPresidente, apellidosPresidente);
        Candidato nuevoVicePresidente = new Candidato("Vicepresidente", nombresVicepresidente, apellidosVicepresidente);
        Binomio nuevoBinomio = new Binomio(nuevoMovimiento, nuevoPresidente, nuevoVicePresidente);
        
        if (rutaImagenMovimientoSeleccionada != null) {
            nuevoBinomio.getMovimientoPolitico().setRutaImagen(rutaImagenMovimientoSeleccionada);
        }
        
        if (rutaImagenPresidenteSeleccionada != null) {
            nuevoBinomio.getPresidente().setRutaImagen(rutaImagenPresidenteSeleccionada);
        }
        
        if (rutaImagenVicepresidenteSeleccionada != null) {
            nuevoBinomio.getVicepresidente().setRutaImagen(rutaImagenVicepresidenteSeleccionada);
        }
        
        listaBinomios.add(nuevoBinomio);
        
        limpiarTablaDeBinomios();
        mostrarDatosDeBinomios();
        
        pnlNuevoBinomio.setVisible(false);
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void txtNumeroDeListaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDeListaKeyTyped
        // TODO add your handling code here:
        if (txtNumeroDeLista.getText().length() > 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroDeListaKeyTyped

    private void txtNumeroDeLista2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDeLista2KeyTyped
        // TODO add your handling code here:
        if (txtNumeroDeLista2.getText().length() > 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroDeLista2KeyTyped

    private void btnAdjuntarImagenMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarImagenMovimientoActionPerformed
        String ruta = obtenerRutaArchivoImagenSeleccionado();
        this.tipoDeUltimaImagenSeleccionada = this.IMAGEN_MOVIMIENTO;
        
        if (!ruta.equals("")) {
            guardarArchivoImagenEnProyecto(ruta, "src" + File.separator
                    + "imagenes" + File.separator + "listas");
        }
        
        habilitarBotonAnadir();
    }//GEN-LAST:event_btnAdjuntarImagenMovimientoActionPerformed

    private void btnAdjuntarImagenPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarImagenPresidenteActionPerformed
        String ruta = obtenerRutaArchivoImagenSeleccionado();
        this.tipoDeUltimaImagenSeleccionada = this.IMAGEN_PRESIDENTE;
        
        if (!ruta.equals("")) {
            guardarArchivoImagenEnProyecto(ruta, "src" + File.separator
                    + "imagenes" + File.separator + "candidatos");
        }
    }//GEN-LAST:event_btnAdjuntarImagenPresidenteActionPerformed

    private void btnAdjuntarImagenVicepresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarImagenVicepresidenteActionPerformed
        String ruta = obtenerRutaArchivoImagenSeleccionado();
        this.tipoDeUltimaImagenSeleccionada = this.IMAGEN_VICEPRESIDENTE;
        
        if (!ruta.equals("")) {
            guardarArchivoImagenEnProyecto(ruta, "src" + File.separator
                    + "imagenes" + File.separator + "candidatos");
        }
    }//GEN-LAST:event_btnAdjuntarImagenVicepresidenteActionPerformed

    private void btnAdjuntarImagenMovimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarImagenMovimiento1ActionPerformed
        String ruta = obtenerRutaArchivoImagenSeleccionado();
        this.tipoDeUltimaImagenSeleccionada = this.IMAGEN_MOVIMIENTO;
        
        if (!ruta.equals("")) {
            guardarArchivoImagenEnProyecto(ruta, "src" + File.separator
                    + "imagenes" + File.separator + "listas");
        }
    }//GEN-LAST:event_btnAdjuntarImagenMovimiento1ActionPerformed

    private void btnAdjuntarImagenPresidente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarImagenPresidente1ActionPerformed
        String ruta = obtenerRutaArchivoImagenSeleccionado();
        this.tipoDeUltimaImagenSeleccionada = this.IMAGEN_PRESIDENTE;
        
        if (!ruta.equals("")) {
            guardarArchivoImagenEnProyecto(ruta, "src" + File.separator
                    + "imagenes" + File.separator + "candidatos");
        }
    }//GEN-LAST:event_btnAdjuntarImagenPresidente1ActionPerformed

    private void btnAdjuntarImagenVicepresidente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarImagenVicepresidente1ActionPerformed
        String ruta = obtenerRutaArchivoImagenSeleccionado();
        this.tipoDeUltimaImagenSeleccionada = this.IMAGEN_VICEPRESIDENTE;
        
        if (!ruta.equals("")) {
            guardarArchivoImagenEnProyecto(ruta, "src" + File.separator
                    + "imagenes" + File.separator + "candidatos");
        }
    }//GEN-LAST:event_btnAdjuntarImagenVicepresidente1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionBinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionBinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionBinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionBinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionBinomios().setVisible(true);
            }
        });
    }
    
    private void llenarDatosAEditar() {
        obtenerBinomioSeleccionado();
        txtMovimientoPolitico.setText(binomioSeleccionado.getMovimientoPolitico().getNombre());
        txtNumeroDeLista.setText(binomioSeleccionado.getMovimientoPolitico().getNumeroDeLista() + "");
        txtNombresPresidente.setText(binomioSeleccionado.getPresidente().getNombres());
        txtApellidosPresidente.setText(binomioSeleccionado.getPresidente().getApellidos());
        txtNombresVicepresidente.setText(binomioSeleccionado.getVicepresidente().getNombres());
        txtApellidosVicepresidente.setText(binomioSeleccionado.getVicepresidente().getApellidos());
    }
    
    private void limpiarFormulario1() {
        txtApellidosPresidente.setText("");
        txtApellidosVicepresidente.setText("");
        txtMovimientoPolitico.setText("");
        txtNombresPresidente.setText("");
        txtNombresVicepresidente.setText("");
        txtNumeroDeLista.setText("");
    }
    
    private void limpiarFormulario2() {
        txtApellidosPresidente2.setText("");
        txtApellidosVicepresidente2.setText("");
        txtMovimientoPolitico2.setText("");
        txtNombresPresidente2.setText("");
        txtNombresVicepresidente2.setText("");
        txtNumeroDeLista2.setText("");
    }
    
    private void mostrarDatosDeBinomios() {
        for (Binomio b : FrmPrincipal.listaBinomios) {
            dtmTablaBinomios.addRow(new Object[]{b.getMovimientoPolitico().getNombre(), b.getPresidente().getApellidos() + " " + b.getPresidente().getNombres(), b.getVicepresidente().getApellidos() + " " + b.getVicepresidente().getNombres()});
        }
    }
    
    private void limpiarTablaDeBinomios() {
        for (int i = 0; i < tblBinomios.getRowCount(); i++) {
            dtmTablaBinomios.removeRow(i);
            i -= 1;
        }
    }
    
    private void obtenerBinomioSeleccionado() {
        filaSeleccionada = tblBinomios.getSelectedRow();
        binomioSeleccionado = listaBinomios.get(filaSeleccionada);
    }
    
    private void quitarTextosDeErrores() {
        lblErrorApellidosPresidente.setText("Apellidos Incorrectos");
        lblErrorApellidosVicepresidente.setText("Apellidos Incorrectos");
        lblErrorNombresPresidente.setText("Nombres Incorrectos");
        lblErrorNombresVicepresidente.setText("Nombres Incorrectos");
        lblErrorNumeroLista.setText("Número de Lista Incorrecto");
        lblErrorApellidosPresidente.setVisible(false);
        lblErrorApellidosVicepresidente.setVisible(false);
        lblErrorNombreMovimiento.setVisible(false);
        lblErrorNombresPresidente.setVisible(false);
        lblErrorNombresVicepresidente.setVisible(false);
        lblErrorNumeroLista.setVisible(false);
        lblErrorApellidosPresidente2.setText("Apellidos Incorrectos");
        lblErrorApellidosVicepresidente2.setText("Apellidos Incorrectos");
        lblErrorNombresPresidente2.setText("Nombres Incorrectos");
        lblErrorNombresVicepresidente2.setText("Nombres Incorrectos");
        lblErrorNumeroLista2.setText("Número de Lista Incorrecto");
        lblErrorApellidosPresidente2.setVisible(false);
        lblErrorApellidosVicepresidente2.setVisible(false);
        lblErrorNombreMovimiento2.setVisible(false);
        lblErrorNombresPresidente2.setVisible(false);
        lblErrorNombresVicepresidente2.setVisible(false);
        lblErrorNumeroLista2.setVisible(false);
    }
    
    private void habilitarBotonAnadir() {
        if (!txtApellidosPresidente2.getText().isBlank() && !txtApellidosVicepresidente2.getText().isBlank()
                && !txtMovimientoPolitico2.getText().isBlank() && !txtNombresPresidente2.getText().isBlank()
                && !txtNombresVicepresidente2.getText().isBlank() && !txtNumeroDeLista2.getText().isBlank()
                && rutaImagenMovimientoSeleccionada != null) {
            btnAnadir.setEnabled(true);
        } else {
            btnAnadir.setEnabled(false);
        }
    }
    
    private String obtenerRutaArchivoImagenSeleccionado() {
        /*En este metodo si no se escoje ningun archivo, el retorno serà ""*/
        String ruta = "";
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter(
                "Imágenes (*.jpg, *.jpeg, *.png)", "jpg", "png", "jpeg");
        jFileChooser.setFileFilter(filtrado);
        
        int respuesta = jFileChooser.showOpenDialog(this);
        
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            ruta = jFileChooser.getSelectedFile().getPath();
        }
        
        return ruta;
    }
    
    private void guardarArchivoImagenEnProyecto(String rutaArchivo,
            String rutaDestino) {

        /*El argumento ruta Destino debe ser solo la ruta de un directorio de una
        carpeta, incluso puede ser ""*/
        if (Validador.esRutaDeArchivoImagenCorrecto(rutaArchivo)) {
            
            try {
                File archivo = new File(rutaArchivo);
                //Se obtienen los bytes del archivo imagen
                Path path = Paths.get(archivo.getPath());
                byte[] bytes = Files.readAllBytes(path);

                //Guardar bytes en un archivo dentro del proyecto
                String nombreArchivo = archivo.getName();
                String rutaArchivoFinal = System.getProperty("user.dir")
                        + File.separator + rutaDestino + File.separator
                        + nombreArchivo;
                Path pathFinal = Paths.get(rutaArchivoFinal);
                Files.write(pathFinal, bytes);
                if (tipoDeUltimaImagenSeleccionada == IMAGEN_MOVIMIENTO) {
                    rutaImagenMovimientoSeleccionada = rutaArchivoFinal;
                } else if (tipoDeUltimaImagenSeleccionada == IMAGEN_PRESIDENTE) {
                    rutaImagenPresidenteSeleccionada = rutaArchivoFinal;
                } else if (tipoDeUltimaImagenSeleccionada == IMAGEN_VICEPRESIDENTE) {
                    rutaImagenVicepresidenteSeleccionada = rutaArchivoFinal;
                }
                JOptionPane.showMessageDialog(this, "Imagen guardada.");
            } catch (IOException ioe) {
                JOptionPane.showMessageDialog(this, "Error al guardar la imagen.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al guardar la imagen.");
            }
            
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Debe seleccionar un archivo de imagen válido.");
        }
        
    }
    
    private void eliminarImagenesRelacionadasConBinomio(Binomio binomio,
            boolean eliminarImagenMovimiento,
            boolean eliminarImagenPresidente,
            boolean eliminarImagenVicepresidente) {
        
        String rutaLogoCandidato = "src" + File.separator
                + "imagenes" + File.separator + "candidatos" + File.separator
                + "logoCandidato.png";
        
        if (eliminarImagenMovimiento) {
            String rutaMovimiento = binomio.getMovimientoPolitico().getRutaImagen();
            File archivoMovimiento = new File(rutaMovimiento);
            archivoMovimiento.delete();
        }
        
        if (eliminarImagenPresidente) {
            String rutaPresidente = binomio.getPresidente().getRutaImagen();
            if (!rutaPresidente.equals(rutaLogoCandidato)) {
                File archivoPresidente = new File(rutaPresidente);
                archivoPresidente.delete();
            }
        }
        
        if (eliminarImagenVicepresidente) {
            String rutaVicepresidente = binomio.getVicepresidente().getRutaImagen();
            
            if (!rutaVicepresidente.equals(rutaLogoCandidato)) {
                File archivoVicepresidente = new File(rutaVicepresidente);
                archivoVicepresidente.delete();
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAdjuntarImagenMovimiento;
    private javax.swing.JButton btnAdjuntarImagenMovimiento1;
    private javax.swing.JButton btnAdjuntarImagenPresidente;
    private javax.swing.JButton btnAdjuntarImagenPresidente1;
    private javax.swing.JButton btnAdjuntarImagenVicepresidente;
    private javax.swing.JButton btnAdjuntarImagenVicepresidente1;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbNombresPresidente;
    private javax.swing.JLabel lbNombresPresidente2;
    private javax.swing.JLabel lblApellidosPresidente;
    private javax.swing.JLabel lblApellidosPresidente2;
    private javax.swing.JLabel lblApellidosPresidenteObligatorio;
    private javax.swing.JLabel lblApellidosVicepresidente;
    private javax.swing.JLabel lblApellidosVicepresidente2;
    private javax.swing.JLabel lblApellidosVicepresidenteObligatorio;
    private javax.swing.JLabel lblDatosPresidente;
    private javax.swing.JLabel lblDatosPresidente2;
    private javax.swing.JLabel lblDatosVicepresidente;
    private javax.swing.JLabel lblDatosVicepresidente2;
    private javax.swing.JLabel lblErrorApellidosPresidente;
    private javax.swing.JLabel lblErrorApellidosPresidente2;
    private javax.swing.JLabel lblErrorApellidosVicepresidente;
    private javax.swing.JLabel lblErrorApellidosVicepresidente2;
    private javax.swing.JLabel lblErrorNombreMovimiento;
    private javax.swing.JLabel lblErrorNombreMovimiento2;
    private javax.swing.JLabel lblErrorNombresPresidente;
    private javax.swing.JLabel lblErrorNombresPresidente2;
    private javax.swing.JLabel lblErrorNombresVicepresidente;
    private javax.swing.JLabel lblErrorNombresVicepresidente2;
    private javax.swing.JLabel lblErrorNumeroLista;
    private javax.swing.JLabel lblErrorNumeroLista2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagenMovimientoObligatorio;
    private javax.swing.JLabel lblLogoPrincipal;
    private javax.swing.JLabel lblMovimientoPoliticoObligatorio;
    private javax.swing.JLabel lblNombreMovimientoPolitico;
    private javax.swing.JLabel lblNombreMovimientoPolitico2;
    private javax.swing.JLabel lblNombresPresidenteObligatorio;
    private javax.swing.JLabel lblNombresVicepresidente;
    private javax.swing.JLabel lblNombresVicepresidente2;
    private javax.swing.JLabel lblNombresVicepresidenteObligatorio;
    private javax.swing.JLabel lblNumeroDeLista;
    private javax.swing.JLabel lblNumeroDeLista2;
    private javax.swing.JLabel lblNumeroListaBusqueda;
    private javax.swing.JLabel lblNumeroListaObligatorio;
    private javax.swing.JPanel pnlBuscarBinomio;
    private javax.swing.JPanel pnlEditarBinomio;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlNuevoBinomio;
    private javax.swing.JTable tblBinomios;
    private javax.swing.JTextField txtApellidosPresidente;
    private javax.swing.JTextField txtApellidosPresidente2;
    private javax.swing.JTextField txtApellidosVicepresidente;
    private javax.swing.JTextField txtApellidosVicepresidente2;
    private javax.swing.JTextField txtMovimientoPolitico;
    private javax.swing.JTextField txtMovimientoPolitico2;
    private javax.swing.JTextField txtNombreMovimientoBusqueda;
    private javax.swing.JTextField txtNombresPresidente;
    private javax.swing.JTextField txtNombresPresidente2;
    private javax.swing.JTextField txtNombresVicepresidente;
    private javax.swing.JTextField txtNombresVicepresidente2;
    private javax.swing.JTextField txtNumeroDeLista;
    private javax.swing.JTextField txtNumeroDeLista2;
    private javax.swing.JTextField txtNumeroListaBusqueda;
    // End of variables declaration//GEN-END:variables
}
