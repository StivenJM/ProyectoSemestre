package ventanas;

import clases.Binomio;
import clases.Votante;
import herramientas.ComponentesDeVentana;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Papeleta extends javax.swing.JFrame {
    
    private final int NUMERO_MAXIMO_BINOMIOS = 16;
    private final Font FUENTE_ESTANDAR = new Font("Arial", Font.BOLD, 12);
    private final boolean BINOMIO_SI_TIENE_VOTO = true;
    private final boolean BINOMIO_NO_TIENE_VOTO = false;
    private boolean[] listaVotosEscogidos;
    private ArrayList<Binomio> listaBinomios;
    private Votante votante;
    private JLabel[] listaDeLabelsMovimiento;
    private JLabel[] listaDeLabelsNumeroLista;
    private JLabel[] listaDeLabelsVotoBlanco;
    private JLabel[] listaDeLabelsImagenLista;
    private JLabel[] listaDeLabelsVotar;
    private JButton[] listaDeBotonesInformacion;

    public Papeleta() {
        initComponents();
        setSize(1130, 700);
        //setResizable(false);
        setTitle("ELECCIONES GENERALES 2023");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        listaBinomios = FrmPrincipal.listaBinomios;
        votante = IniciarSesionCedula.votante;

        ComponentesDeVentana.ajustarImagenAJLabel(lblFondo,
                "src/imagenes/fondoPapeleta.png");
        ComponentesDeVentana.ajustarImagenAJLabel(lblEscudoEcudor,
                "src/imagenes/escudoEcuador.png");
        ComponentesDeVentana.ajustarImagenAJLabel(lblLogoCNE,
                "src/imagenes/logoPrincipal2.png");

        lblSubtitulo.setBackground(Color.WHITE);
        lblSubtitulo.setOpaque(true);
        ComponentesDeVentana.redondearBordesJLabel(lblSubtitulo, 10, 1);
        
        ComponentesDeVentana.ajustarImagenAJLabel(lblFondoPanel, 
                "src/imagenes/fondoSoloVerde.png");
        
        /*Se inicializa la lista de votos escogidos, que es true en la
        posicion i cuando el binomio de la posicion i de la lista de Binomios
        ha sido escogida*/
        listaVotosEscogidos = new boolean[NUMERO_MAXIMO_BINOMIOS];
        for (boolean elemento : listaVotosEscogidos) {
            elemento = BINOMIO_NO_TIENE_VOTO;
        }

        listaDeLabelsMovimiento = new JLabel[NUMERO_MAXIMO_BINOMIOS];
        listaDeLabelsNumeroLista = new JLabel[NUMERO_MAXIMO_BINOMIOS];
        listaDeLabelsVotoBlanco = new JLabel[NUMERO_MAXIMO_BINOMIOS];
        listaDeLabelsImagenLista = new JLabel[NUMERO_MAXIMO_BINOMIOS];
        listaDeLabelsVotar = new JLabel[NUMERO_MAXIMO_BINOMIOS];
        listaDeBotonesInformacion = new JButton[NUMERO_MAXIMO_BINOMIOS];

        llenarListaLabelsMovimiento();
        llenarListaLabelsNumeroLista();
        llenarListaLabelsVotoBlanco();
        llenarListaLabelsImagenLista();
        llenarListaLabelsVotar();
        llenarListaBotonesInformacion();
        ocultarLabelsYBotones();
        redondearBordesDeLabelsVotar();
        ajustarImagenEnBotonesDeInformacion();
        ponerNombresDeMovimientoEnLabels();
        ponerNumerosDeListaEnLabels();
        ponerFondoBlancoEnLabelsVotar();
        ponerImagenesDeVotoBlancoEnLabels();
        ponerImagenesDeListasEnLabels();
        
        String indicaciones = "Recuerda elegir a un solo candidato en la" +
                " papeleta electoral. Si no deseas apoyar a ningun " + 
                "candidato, puedes emitir un voto en blanco. Si la papeleta " + 
                "electoral tiene mas de un voto, tu voto será nulo " + 
                "y no será valido";
        ComponentesDeVentana.ajustarTextoEnLabel(indicaciones, lblIndicaciones,
                FUENTE_ESTANDAR);
        
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(
                ClassLoader.getSystemResource("imagenes/logoCNEConFondo.png"));
        return retValue;
    }

    private void llenarListaLabelsMovimiento() {
        listaDeLabelsMovimiento[0] = lblNombreMovimiento1;
        listaDeLabelsMovimiento[1] = lblNombreMovimiento2;
        listaDeLabelsMovimiento[2] = lblNombreMovimiento3;
        listaDeLabelsMovimiento[3] = lblNombreMovimiento4;
        listaDeLabelsMovimiento[4] = lblNombreMovimiento5;
        listaDeLabelsMovimiento[5] = lblNombreMovimiento6;
        listaDeLabelsMovimiento[6] = lblNombreMovimiento7;
        listaDeLabelsMovimiento[7] = lblNombreMovimiento8;
        listaDeLabelsMovimiento[8] = lblNombreMovimiento9;
        listaDeLabelsMovimiento[9] = lblNombreMovimiento10;
        listaDeLabelsMovimiento[10] = lblNombreMovimiento11;
        listaDeLabelsMovimiento[11] = lblNombreMovimiento12;
        listaDeLabelsMovimiento[12] = lblNombreMovimiento13;
        listaDeLabelsMovimiento[13] = lblNombreMovimiento14;
        listaDeLabelsMovimiento[14] = lblNombreMovimiento15;
        listaDeLabelsMovimiento[15] = lblNombreMovimiento16;
    }

    public void llenarListaLabelsNumeroLista() {
        listaDeLabelsNumeroLista[0] = lblNumeroLIsta1;
        listaDeLabelsNumeroLista[1] = lblNumeroLIsta2;
        listaDeLabelsNumeroLista[2] = lblNumeroLIsta3;
        listaDeLabelsNumeroLista[3] = lblNumeroLIsta4;
        listaDeLabelsNumeroLista[4] = lblNumeroLIsta5;
        listaDeLabelsNumeroLista[5] = lblNumeroLIsta6;
        listaDeLabelsNumeroLista[6] = lblNumeroLIsta7;
        listaDeLabelsNumeroLista[7] = lblNumeroLIsta8;
        listaDeLabelsNumeroLista[8] = lblNumeroLIsta9;
        listaDeLabelsNumeroLista[9] = lblNumeroLIsta10;
        listaDeLabelsNumeroLista[10] = lblNumeroLIsta11;
        listaDeLabelsNumeroLista[11] = lblNumeroLIsta12;
        listaDeLabelsNumeroLista[12] = lblNumeroLIsta13;
        listaDeLabelsNumeroLista[13] = lblNumeroLIsta14;
        listaDeLabelsNumeroLista[14] = lblNumeroLIsta15;
        listaDeLabelsNumeroLista[15] = lblNumeroLIsta16;
    }

    public void llenarListaLabelsVotoBlanco() {
        listaDeLabelsVotoBlanco[0] = lblVotoBlanco1;
        listaDeLabelsVotoBlanco[1] = lblVotoBlanco2;
        listaDeLabelsVotoBlanco[2] = lblVotoBlanco3;
        listaDeLabelsVotoBlanco[3] = lblVotoBlanco4;
        listaDeLabelsVotoBlanco[4] = lblVotoBlanco5;
        listaDeLabelsVotoBlanco[5] = lblVotoBlanco6;
        listaDeLabelsVotoBlanco[6] = lblVotoBlanco7;
        listaDeLabelsVotoBlanco[7] = lblVotoBlanco8;
        listaDeLabelsVotoBlanco[8] = lblVotoBlanco9;
        listaDeLabelsVotoBlanco[9] = lblVotoBlanco10;
        listaDeLabelsVotoBlanco[10] = lblVotoBlanco11;
        listaDeLabelsVotoBlanco[11] = lblVotoBlanco12;
        listaDeLabelsVotoBlanco[12] = lblVotoBlanco13;
        listaDeLabelsVotoBlanco[13] = lblVotoBlanco14;
        listaDeLabelsVotoBlanco[14] = lblVotoBlanco15;
        listaDeLabelsVotoBlanco[15] = lblVotoBlanco16;
    }

    public void llenarListaLabelsImagenLista() {
        listaDeLabelsImagenLista[0] = lblImagenLista1;
        listaDeLabelsImagenLista[1] = lblImagenLista2;
        listaDeLabelsImagenLista[2] = lblImagenLista3;
        listaDeLabelsImagenLista[3] = lblImagenLista4;
        listaDeLabelsImagenLista[4] = lblImagenLista5;
        listaDeLabelsImagenLista[5] = lblImagenLista6;
        listaDeLabelsImagenLista[6] = lblImagenLista7;
        listaDeLabelsImagenLista[7] = lblImagenLista8;
        listaDeLabelsImagenLista[8] = lblImagenLista9;
        listaDeLabelsImagenLista[9] = lblImagenLista10;
        listaDeLabelsImagenLista[10] = lblImagenLista11;
        listaDeLabelsImagenLista[11] = lblImagenLista12;
        listaDeLabelsImagenLista[12] = lblImagenLista13;
        listaDeLabelsImagenLista[13] = lblImagenLista14;
        listaDeLabelsImagenLista[14] = lblImagenLista15;
        listaDeLabelsImagenLista[15] = lblImagenLista16;
    }

    public void llenarListaLabelsVotar() {
        listaDeLabelsVotar[0] = lblVotar1;
        listaDeLabelsVotar[1] = lblVotar2;
        listaDeLabelsVotar[2] = lblVotar3;
        listaDeLabelsVotar[3] = lblVotar4;
        listaDeLabelsVotar[4] = lblVotar5;
        listaDeLabelsVotar[5] = lblVotar6;
        listaDeLabelsVotar[6] = lblVotar7;
        listaDeLabelsVotar[7] = lblVotar8;
        listaDeLabelsVotar[8] = lblVotar9;
        listaDeLabelsVotar[9] = lblVotar10;
        listaDeLabelsVotar[10] = lblVotar11;
        listaDeLabelsVotar[11] = lblVotar12;
        listaDeLabelsVotar[12] = lblVotar13;
        listaDeLabelsVotar[13] = lblVotar14;
        listaDeLabelsVotar[14] = lblVotar15;
        listaDeLabelsVotar[15] = lblVotar16;
    }

    public void llenarListaBotonesInformacion() {
        listaDeBotonesInformacion[0] = btnInformacionCandidatos1;
        listaDeBotonesInformacion[1] = btnInformacionCandidatos2;
        listaDeBotonesInformacion[2] = btnInformacionCandidatos3;
        listaDeBotonesInformacion[3] = btnInformacionCandidatos4;
        listaDeBotonesInformacion[4] = btnInformacionCandidatos5;
        listaDeBotonesInformacion[5] = btnInformacionCandidatos6;
        listaDeBotonesInformacion[6] = btnInformacionCandidatos7;
        listaDeBotonesInformacion[7] = btnInformacionCandidatos8;
        listaDeBotonesInformacion[8] = btnInformacionCandidatos9;
        listaDeBotonesInformacion[9] = btnInformacionCandidatos10;
        listaDeBotonesInformacion[10] = btnInformacionCandidatos11;
        listaDeBotonesInformacion[11] = btnInformacionCandidatos12;
        listaDeBotonesInformacion[12] = btnInformacionCandidatos13;
        listaDeBotonesInformacion[13] = btnInformacionCandidatos14;
        listaDeBotonesInformacion[14] = btnInformacionCandidatos15;
        listaDeBotonesInformacion[15] = btnInformacionCandidatos16;
    }

    private void redondearBordesDeLabelsVotar() {
        for (int i = 0; i < listaBinomios.size(); i++) {
            ComponentesDeVentana.redondearBordesJLabel(listaDeLabelsVotar[i], 5, 1);
        }
    }

    private void ajustarImagenEnBotonesDeInformacion() {
        for (int i = 0; i < listaBinomios.size(); i++) {
            ComponentesDeVentana.ajustarImagenAJButton(
                    listaDeBotonesInformacion[i],
                    "src/imagenes/botonInformacion.png");
        }
    }

    private void ocultarLabelsYBotones() {
        for (int i = 0; i < NUMERO_MAXIMO_BINOMIOS; i++) {
            if (i >= listaBinomios.size()) {
                listaDeLabelsMovimiento[i].setVisible(false);
                listaDeLabelsNumeroLista[i].setVisible(false);
                listaDeLabelsVotoBlanco[i].setVisible(false);
                listaDeLabelsImagenLista[i].setVisible(false);
                listaDeLabelsVotar[i].setVisible(false);
                listaDeBotonesInformacion[i].setVisible(false);
            }
        }
    }

    private void ponerNombresDeMovimientoEnLabels() {
        for (int i = 0; i < listaBinomios.size(); i++) {
            ComponentesDeVentana.ajustarTextoEnLabel(listaBinomios.get(i)
                    .getMovimientoPolitico().getNombre().toUpperCase(),
                    listaDeLabelsMovimiento[i], FUENTE_ESTANDAR);
        }
    }

    private void ponerNumerosDeListaEnLabels() {
        for (int i = 0; i < listaBinomios.size(); i++) {
            ComponentesDeVentana.ajustarTextoEnLabel(Integer.toString(
                    listaBinomios.get(i).getMovimientoPolitico().getNumeroDeLista()), 
                    listaDeLabelsNumeroLista[i], FUENTE_ESTANDAR);
        }
    }
    
    private void ponerFondoBlancoEnLabelsVotar () {
        for (int i = 0; i < listaBinomios.size(); i++) {
            ComponentesDeVentana.ajustarImagenAJLabel(listaDeLabelsVotar[i], 
                    "src/imagenes/fondoSoloBlanco.png");
        }
    }
    
    private void ponerImagenesDeVotoBlancoEnLabels () {
        for (int i = 0; i < listaBinomios.size(); i++) {
            ComponentesDeVentana.ajustarImagenAJLabel(listaDeLabelsVotoBlanco[i], 
                    "src/imagenes/votoBlanco.png");
        }
    }
    
    private void ponerImagenesDeListasEnLabels () {
        for (int i = 0; i < listaBinomios.size(); i++) {
            ComponentesDeVentana.ajustarImagenAJLabelDinamico(listaDeLabelsImagenLista[i], 
                    listaBinomios.get(i).getMovimientoPolitico().getRutaImagen());
        }
    }
    
    private void abrirVentanaEmergenteCandidatos (Binomio b, JButton boton) {
        //Este punto es la parte central superior del boton
        Point puntoReferenciaDeBoton = boton.getLocationOnScreen();
        
        VentanaEmergenteCandidatos v = new VentanaEmergenteCandidatos(this, true, b);
        
        int alturaVentanaEmergente = v.getHeight();
        int anchoVentanaEmergente = v.getWidth();
        
        //Se establece la posicion de la ventana emergente
        v.setLocation(puntoReferenciaDeBoton.x - (int)(anchoVentanaEmergente/2) + 15,
                puntoReferenciaDeBoton.y - alturaVentanaEmergente);
        v.setVisible(true);
    }
    
    private void cambiarLabelVotoBlanco (JLabel label) {
        ComponentesDeVentana.ajustarImagenAJLabel(label,
                "src/imagenes/votoNegro.png");
    }
    
    private void cambiarLabelVotoNegro (JLabel label) {
        ComponentesDeVentana.ajustarImagenAJLabel(label,
                "src/imagenes/votoBlanco.png");
    }
    
    private void votarPorBinomioEnLista(int indiceBinomio) {
        listaVotosEscogidos[indiceBinomio] = BINOMIO_SI_TIENE_VOTO;
    }
    
    private void anularVotoPorBinomioEnLista(int indiceBinomio) {
        listaVotosEscogidos[indiceBinomio] = BINOMIO_NO_TIENE_VOTO;
    }
    
    private void cuadroDeBinomioClickeado (int indiceBinomio) {
        if (listaVotosEscogidos[indiceBinomio] == BINOMIO_NO_TIENE_VOTO) {
            cambiarLabelVotoBlanco(listaDeLabelsVotoBlanco[indiceBinomio]);
            votarPorBinomioEnLista(indiceBinomio);
        } else {
            cambiarLabelVotoNegro(listaDeLabelsVotoBlanco[indiceBinomio]);
            votarPorBinomioEnLista(indiceBinomio);
            anularVotoPorBinomioEnLista(indiceBinomio);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogoCNE = new javax.swing.JLabel();
        lblEscudoEcudor = new javax.swing.JLabel();
        lblEleccionesGenerales = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        panelBinomiosPares = new javax.swing.JPanel();
        lblVotoBlanco1 = new javax.swing.JLabel();
        lblImagenLista1 = new javax.swing.JLabel();
        btnInformacionCandidatos1 = new javax.swing.JButton();
        lblVotar1 = new javax.swing.JLabel();
        lblNombreMovimiento1 = new javax.swing.JLabel();
        lblNumeroLIsta1 = new javax.swing.JLabel();
        lblNumeroLIsta2 = new javax.swing.JLabel();
        lblNombreMovimiento2 = new javax.swing.JLabel();
        btnInformacionCandidatos2 = new javax.swing.JButton();
        lblImagenLista2 = new javax.swing.JLabel();
        lblVotoBlanco2 = new javax.swing.JLabel();
        lblVotar2 = new javax.swing.JLabel();
        btnInformacionCandidatos3 = new javax.swing.JButton();
        lblImagenLista3 = new javax.swing.JLabel();
        lblVotoBlanco3 = new javax.swing.JLabel();
        lblVotar3 = new javax.swing.JLabel();
        lblNombreMovimiento3 = new javax.swing.JLabel();
        lblNumeroLIsta3 = new javax.swing.JLabel();
        lblNumeroLIsta4 = new javax.swing.JLabel();
        lblNombreMovimiento4 = new javax.swing.JLabel();
        btnInformacionCandidatos4 = new javax.swing.JButton();
        lblImagenLista4 = new javax.swing.JLabel();
        lblVotoBlanco4 = new javax.swing.JLabel();
        lblVotar4 = new javax.swing.JLabel();
        btnInformacionCandidatos5 = new javax.swing.JButton();
        lblImagenLista5 = new javax.swing.JLabel();
        lblVotoBlanco5 = new javax.swing.JLabel();
        lblVotar5 = new javax.swing.JLabel();
        lblNombreMovimiento5 = new javax.swing.JLabel();
        lblNumeroLIsta5 = new javax.swing.JLabel();
        lblNumeroLIsta6 = new javax.swing.JLabel();
        lblNombreMovimiento6 = new javax.swing.JLabel();
        btnInformacionCandidatos6 = new javax.swing.JButton();
        lblImagenLista6 = new javax.swing.JLabel();
        lblVotoBlanco6 = new javax.swing.JLabel();
        lblVotar6 = new javax.swing.JLabel();
        btnInformacionCandidatos7 = new javax.swing.JButton();
        lblVotoBlanco7 = new javax.swing.JLabel();
        lblImagenLista7 = new javax.swing.JLabel();
        lblNumeroLIsta7 = new javax.swing.JLabel();
        lblNombreMovimiento7 = new javax.swing.JLabel();
        lblVotar7 = new javax.swing.JLabel();
        lblNombreMovimiento8 = new javax.swing.JLabel();
        lblNumeroLIsta8 = new javax.swing.JLabel();
        btnInformacionCandidatos8 = new javax.swing.JButton();
        lblImagenLista8 = new javax.swing.JLabel();
        lblVotoBlanco8 = new javax.swing.JLabel();
        lblVotar8 = new javax.swing.JLabel();
        btnInformacionCandidatos9 = new javax.swing.JButton();
        lblNombreMovimiento9 = new javax.swing.JLabel();
        lblImagenLista9 = new javax.swing.JLabel();
        lblNumeroLIsta9 = new javax.swing.JLabel();
        lblVotoBlanco9 = new javax.swing.JLabel();
        lblVotar9 = new javax.swing.JLabel();
        lblNumeroLIsta10 = new javax.swing.JLabel();
        lblVotoBlanco10 = new javax.swing.JLabel();
        lblImagenLista10 = new javax.swing.JLabel();
        lblNombreMovimiento10 = new javax.swing.JLabel();
        btnInformacionCandidatos10 = new javax.swing.JButton();
        lblVotar10 = new javax.swing.JLabel();
        lblImagenLista11 = new javax.swing.JLabel();
        lblVotoBlanco11 = new javax.swing.JLabel();
        lblNombreMovimiento11 = new javax.swing.JLabel();
        btnInformacionCandidatos11 = new javax.swing.JButton();
        lblNumeroLIsta11 = new javax.swing.JLabel();
        lblVotar11 = new javax.swing.JLabel();
        lblVotoBlanco12 = new javax.swing.JLabel();
        lblNumeroLIsta12 = new javax.swing.JLabel();
        lblNombreMovimiento12 = new javax.swing.JLabel();
        lblImagenLista12 = new javax.swing.JLabel();
        btnInformacionCandidatos12 = new javax.swing.JButton();
        lblVotar12 = new javax.swing.JLabel();
        lblNombreMovimiento13 = new javax.swing.JLabel();
        btnInformacionCandidatos13 = new javax.swing.JButton();
        lblImagenLista13 = new javax.swing.JLabel();
        lblNumeroLIsta13 = new javax.swing.JLabel();
        lblVotoBlanco13 = new javax.swing.JLabel();
        lblVotar13 = new javax.swing.JLabel();
        lblNumeroLIsta14 = new javax.swing.JLabel();
        lblImagenLista14 = new javax.swing.JLabel();
        lblVotoBlanco14 = new javax.swing.JLabel();
        lblNombreMovimiento14 = new javax.swing.JLabel();
        btnInformacionCandidatos14 = new javax.swing.JButton();
        lblVotar14 = new javax.swing.JLabel();
        lblImagenLista15 = new javax.swing.JLabel();
        lblNumeroLIsta15 = new javax.swing.JLabel();
        lblVotoBlanco15 = new javax.swing.JLabel();
        btnInformacionCandidatos15 = new javax.swing.JButton();
        lblNombreMovimiento15 = new javax.swing.JLabel();
        lblVotar15 = new javax.swing.JLabel();
        btnInformacionCandidatos16 = new javax.swing.JButton();
        lblNombreMovimiento16 = new javax.swing.JLabel();
        lblImagenLista16 = new javax.swing.JLabel();
        lblNumeroLIsta16 = new javax.swing.JLabel();
        lblVotoBlanco16 = new javax.swing.JLabel();
        lblVotar16 = new javax.swing.JLabel();
        lblFondoPanel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblIndicaciones = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblLogoCNE, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 50, 100, 35));
        getContentPane().add(lblEscudoEcudor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 29, 35));

        lblEleccionesGenerales.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblEleccionesGenerales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEleccionesGenerales.setText("ELECCIONES GENERALES");
        getContentPane().add(lblEleccionesGenerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1130, -1));

        lblFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("07 DE FEBRERO DE 2023");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1130, -1));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 153));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PRESIDENTA / PRESIDENTE - VICEPRESIDENTA / VICEPRESIDENTE");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1130, -1));

        lblSubtitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblSubtitulo.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("SE ELIGE UN (1) BINOMIO PRESIDENCIAL");
        lblSubtitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 120, 800, 20));

        panelBinomiosPares.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVotoBlanco1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco1MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 60, 50, 50));

        lblImagenLista1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 75, 75));

        btnInformacionCandidatos1.setForeground(new java.awt.Color(255, 255, 255));
        btnInformacionCandidatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos1ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 190, 30, 30));

        lblVotar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 100, 170));

        lblNombreMovimiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento1.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 100, 35));

        lblNumeroLIsta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta1.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 100, 15));

        lblNumeroLIsta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta2.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 285, 100, 15));

        lblNombreMovimiento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento2.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 250, 100, 35));

        btnInformacionCandidatos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos2ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 30, 30));

        lblImagenLista2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 75, 75));

        lblVotoBlanco2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco2MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 50, 50));

        lblVotar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 300, 100, 170));

        btnInformacionCandidatos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos3ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 190, 30, 30));

        lblImagenLista3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 75, 75));

        lblVotoBlanco3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco3MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 60, 50, 50));

        lblVotar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 60, 100, 170));

        lblNombreMovimiento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento3.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 10, 100, 35));

        lblNumeroLIsta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta3.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 45, 100, 15));

        lblNumeroLIsta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta4.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 285, 100, 15));

        lblNombreMovimiento4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento4.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 250, 100, 35));

        btnInformacionCandidatos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos4ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 430, 30, 30));

        lblImagenLista4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 75, 75));

        lblVotoBlanco4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco4MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 300, 50, 50));

        lblVotar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 300, 100, 170));

        btnInformacionCandidatos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos5ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 190, 30, 30));

        lblImagenLista5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista5, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 110, 75, 75));

        lblVotoBlanco5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco5MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 60, 50, 50));

        lblVotar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 100, 170));

        lblNombreMovimiento5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento5.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, 35));

        lblNumeroLIsta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta5.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 45, 100, 15));

        lblNumeroLIsta6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta6.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 285, 100, 15));

        lblNombreMovimiento6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento6.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 100, 35));

        btnInformacionCandidatos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos6ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 430, 30, 30));

        lblImagenLista6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista6, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 350, 75, 75));

        lblVotoBlanco6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco6MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco6, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 300, 50, 50));

        lblVotar6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, 170));

        btnInformacionCandidatos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos7ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 190, 30, 30));

        lblVotoBlanco7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco7MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco7, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 60, 50, 50));

        lblImagenLista7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista7, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 110, 75, 75));

        lblNumeroLIsta7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta7.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 45, 100, 15));

        lblNombreMovimiento7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento7.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento7, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 10, 100, 35));

        lblVotar7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 60, 100, 170));

        lblNombreMovimiento8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento8.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento8, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 250, 100, 35));

        lblNumeroLIsta8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta8.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 285, 100, 15));

        btnInformacionCandidatos8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos8ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos8, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 430, 30, 30));

        lblImagenLista8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista8, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 350, 75, 75));

        lblVotoBlanco8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco8MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco8, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 300, 50, 50));

        lblVotar8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 300, 100, 170));

        btnInformacionCandidatos9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos9ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos9, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 190, 30, 30));

        lblNombreMovimiento9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento9.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento9, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 10, 100, 35));

        lblImagenLista9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista9, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 110, 75, 75));

        lblNumeroLIsta9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta9.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 45, 100, 15));

        lblVotoBlanco9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco9MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco9, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 60, 50, 50));

        lblVotar9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 60, 100, 170));

        lblNumeroLIsta10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta10.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 285, 100, 15));

        lblVotoBlanco10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco10MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco10, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 300, 50, 50));

        lblImagenLista10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista10, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 350, 75, 75));

        lblNombreMovimiento10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento10.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento10, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 250, 100, 35));

        btnInformacionCandidatos10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos10ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos10, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 430, 30, 30));

        lblVotar10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 300, 100, 170));

        lblImagenLista11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista11, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 110, 75, 75));

        lblVotoBlanco11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco11MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco11, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 60, 50, 50));

        lblNombreMovimiento11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento11.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento11, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 10, 100, 35));

        btnInformacionCandidatos11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos11ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos11, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 190, 30, 30));

        lblNumeroLIsta11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta11.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta11, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 45, 100, 15));

        lblVotar11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 60, 100, 170));

        lblVotoBlanco12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco12MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco12, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 300, 50, 50));

        lblNumeroLIsta12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta12.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta12, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 285, 100, 15));

        lblNombreMovimiento12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento12.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento12, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 250, 100, 35));

        lblImagenLista12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista12, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 350, 75, 75));

        btnInformacionCandidatos12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos12ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos12, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 430, 30, 30));

        lblVotar12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 300, 100, 170));

        lblNombreMovimiento13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento13.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento13, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 10, 100, 35));

        btnInformacionCandidatos13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos13ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos13, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 190, 30, 30));

        lblImagenLista13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 75, 75));

        lblNumeroLIsta13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta13.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta13, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 45, 100, 15));

        lblVotoBlanco13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco13MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco13, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 60, 50, 50));

        lblVotar13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 60, 100, 170));

        lblNumeroLIsta14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta14.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta14, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 285, 100, 15));

        lblImagenLista14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 75, 75));

        lblVotoBlanco14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco14MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco14, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 300, 50, 50));

        lblNombreMovimiento14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento14.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento14, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 250, 100, 35));

        btnInformacionCandidatos14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos14ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos14, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 430, 30, 30));

        lblVotar14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar14, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 300, 100, 170));

        lblImagenLista15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista15, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 110, 75, 75));

        lblNumeroLIsta15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta15.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 45, 100, 15));

        lblVotoBlanco15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco15MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco15, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 60, 50, 50));

        btnInformacionCandidatos15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos15ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos15, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 190, 30, 30));

        lblNombreMovimiento15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento15.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 100, 35));

        lblVotar15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 100, 170));

        btnInformacionCandidatos16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionCandidatos16ActionPerformed(evt);
            }
        });
        panelBinomiosPares.add(btnInformacionCandidatos16, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 430, 30, 30));

        lblNombreMovimiento16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMovimiento16.setText("Movimiento");
        panelBinomiosPares.add(lblNombreMovimiento16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 100, 35));

        lblImagenLista16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblImagenLista16, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 350, 75, 75));

        lblNumeroLIsta16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroLIsta16.setText("Numero Lista");
        panelBinomiosPares.add(lblNumeroLIsta16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 285, 100, 15));

        lblVotoBlanco16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVotoBlanco16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotoBlanco16MouseClicked(evt);
            }
        });
        panelBinomiosPares.add(lblVotoBlanco16, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 300, 50, 50));

        lblVotar16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelBinomiosPares.add(lblVotar16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 100, 170));
        panelBinomiosPares.add(lblFondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 480));

        getContentPane().add(panelBinomiosPares, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 900, 480));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENVIAR VOTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, 150, 30));

        lblIndicaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndicaciones.setText("Indicaciones de voto");
        getContentPane().add(lblIndicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 170, 250));

        lblFondo.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FrmPrincipal.ventanaPrincipal.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnInformacionCandidatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos1ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(0), btnInformacionCandidatos1);
    }//GEN-LAST:event_btnInformacionCandidatos1ActionPerformed

    private void btnInformacionCandidatos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos2ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(1), btnInformacionCandidatos2);
    }//GEN-LAST:event_btnInformacionCandidatos2ActionPerformed

    private void btnInformacionCandidatos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos3ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(2), btnInformacionCandidatos3);
    }//GEN-LAST:event_btnInformacionCandidatos3ActionPerformed

    private void btnInformacionCandidatos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos4ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(3), btnInformacionCandidatos4);
    }//GEN-LAST:event_btnInformacionCandidatos4ActionPerformed

    private void btnInformacionCandidatos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos5ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(4), btnInformacionCandidatos5);
    }//GEN-LAST:event_btnInformacionCandidatos5ActionPerformed

    private void btnInformacionCandidatos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos6ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(5), btnInformacionCandidatos6);
    }//GEN-LAST:event_btnInformacionCandidatos6ActionPerformed

    private void btnInformacionCandidatos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos7ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(6), btnInformacionCandidatos7);
    }//GEN-LAST:event_btnInformacionCandidatos7ActionPerformed

    private void btnInformacionCandidatos8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos8ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(7), btnInformacionCandidatos8);
    }//GEN-LAST:event_btnInformacionCandidatos8ActionPerformed

    private void btnInformacionCandidatos9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos9ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(8), btnInformacionCandidatos9);
    }//GEN-LAST:event_btnInformacionCandidatos9ActionPerformed

    private void btnInformacionCandidatos10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos10ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(9), btnInformacionCandidatos10);
    }//GEN-LAST:event_btnInformacionCandidatos10ActionPerformed

    private void btnInformacionCandidatos11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos11ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(10), btnInformacionCandidatos11);
    }//GEN-LAST:event_btnInformacionCandidatos11ActionPerformed

    private void btnInformacionCandidatos12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos12ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(11), btnInformacionCandidatos12);
    }//GEN-LAST:event_btnInformacionCandidatos12ActionPerformed

    private void btnInformacionCandidatos13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos13ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(12), btnInformacionCandidatos13);
    }//GEN-LAST:event_btnInformacionCandidatos13ActionPerformed

    private void btnInformacionCandidatos14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos14ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(13), btnInformacionCandidatos14);
    }//GEN-LAST:event_btnInformacionCandidatos14ActionPerformed

    private void btnInformacionCandidatos15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos15ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(14), btnInformacionCandidatos15);
    }//GEN-LAST:event_btnInformacionCandidatos15ActionPerformed

    private void btnInformacionCandidatos16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionCandidatos16ActionPerformed
        abrirVentanaEmergenteCandidatos(listaBinomios.get(15), btnInformacionCandidatos16);
    }//GEN-LAST:event_btnInformacionCandidatos16ActionPerformed

    private void lblVotoBlanco1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco1MouseClicked
        cuadroDeBinomioClickeado(0);
    }//GEN-LAST:event_lblVotoBlanco1MouseClicked

    private void lblVotoBlanco2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco2MouseClicked
        cuadroDeBinomioClickeado(1);
    }//GEN-LAST:event_lblVotoBlanco2MouseClicked

    private void lblVotoBlanco3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco3MouseClicked
        cuadroDeBinomioClickeado(2);
    }//GEN-LAST:event_lblVotoBlanco3MouseClicked

    private void lblVotoBlanco4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco4MouseClicked
        cuadroDeBinomioClickeado(3);
    }//GEN-LAST:event_lblVotoBlanco4MouseClicked

    private void lblVotoBlanco5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco5MouseClicked
        cuadroDeBinomioClickeado(4);
    }//GEN-LAST:event_lblVotoBlanco5MouseClicked

    private void lblVotoBlanco6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco6MouseClicked
        cuadroDeBinomioClickeado(5);
    }//GEN-LAST:event_lblVotoBlanco6MouseClicked

    private void lblVotoBlanco7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco7MouseClicked
        cuadroDeBinomioClickeado(6);
    }//GEN-LAST:event_lblVotoBlanco7MouseClicked

    private void lblVotoBlanco8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco8MouseClicked
        cuadroDeBinomioClickeado(7);
    }//GEN-LAST:event_lblVotoBlanco8MouseClicked

    private void lblVotoBlanco9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco9MouseClicked
        cuadroDeBinomioClickeado(8);
    }//GEN-LAST:event_lblVotoBlanco9MouseClicked

    private void lblVotoBlanco10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco10MouseClicked
        cuadroDeBinomioClickeado(9);
    }//GEN-LAST:event_lblVotoBlanco10MouseClicked

    private void lblVotoBlanco11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco11MouseClicked
        cuadroDeBinomioClickeado(10);
    }//GEN-LAST:event_lblVotoBlanco11MouseClicked

    private void lblVotoBlanco12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco12MouseClicked
        cuadroDeBinomioClickeado(11);
    }//GEN-LAST:event_lblVotoBlanco12MouseClicked

    private void lblVotoBlanco13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco13MouseClicked
        cuadroDeBinomioClickeado(12);
    }//GEN-LAST:event_lblVotoBlanco13MouseClicked

    private void lblVotoBlanco14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco14MouseClicked
        cuadroDeBinomioClickeado(13);
    }//GEN-LAST:event_lblVotoBlanco14MouseClicked

    private void lblVotoBlanco15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco15MouseClicked
        cuadroDeBinomioClickeado(14);
    }//GEN-LAST:event_lblVotoBlanco15MouseClicked

    private void lblVotoBlanco16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotoBlanco16MouseClicked
        cuadroDeBinomioClickeado(15);
    }//GEN-LAST:event_lblVotoBlanco16MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int numeroBinomiosEscogidos = 0;
        int indiceBinomioEscogido = 0;
        
        for (int i = 0; i < listaBinomios.size(); i++) {
            if (listaVotosEscogidos[i] == BINOMIO_SI_TIENE_VOTO) {
                numeroBinomiosEscogidos++;
                indiceBinomioEscogido = i;
            }
        }
        
        if (numeroBinomiosEscogidos == 1) {
            votante.votarPorBinomio(listaBinomios.get(indiceBinomioEscogido));
            votante.setTieneVotoRegistrado();
        } else {
            votante.setTieneVotoRegistrado();
        }
        
        JOptionPane.showMessageDialog(rootPane, "¡Voto enviado correctamente!");
        this.dispose();
        FrmPrincipal.ventanaPrincipal.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Papeleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Papeleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Papeleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Papeleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Papeleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformacionCandidatos1;
    private javax.swing.JButton btnInformacionCandidatos10;
    private javax.swing.JButton btnInformacionCandidatos11;
    private javax.swing.JButton btnInformacionCandidatos12;
    private javax.swing.JButton btnInformacionCandidatos13;
    private javax.swing.JButton btnInformacionCandidatos14;
    private javax.swing.JButton btnInformacionCandidatos15;
    private javax.swing.JButton btnInformacionCandidatos16;
    private javax.swing.JButton btnInformacionCandidatos2;
    private javax.swing.JButton btnInformacionCandidatos3;
    private javax.swing.JButton btnInformacionCandidatos4;
    private javax.swing.JButton btnInformacionCandidatos5;
    private javax.swing.JButton btnInformacionCandidatos6;
    private javax.swing.JButton btnInformacionCandidatos7;
    private javax.swing.JButton btnInformacionCandidatos8;
    private javax.swing.JButton btnInformacionCandidatos9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblEleccionesGenerales;
    private javax.swing.JLabel lblEscudoEcudor;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondoPanel;
    private javax.swing.JLabel lblImagenLista1;
    private javax.swing.JLabel lblImagenLista10;
    private javax.swing.JLabel lblImagenLista11;
    private javax.swing.JLabel lblImagenLista12;
    private javax.swing.JLabel lblImagenLista13;
    private javax.swing.JLabel lblImagenLista14;
    private javax.swing.JLabel lblImagenLista15;
    private javax.swing.JLabel lblImagenLista16;
    private javax.swing.JLabel lblImagenLista2;
    private javax.swing.JLabel lblImagenLista3;
    private javax.swing.JLabel lblImagenLista4;
    private javax.swing.JLabel lblImagenLista5;
    private javax.swing.JLabel lblImagenLista6;
    private javax.swing.JLabel lblImagenLista7;
    private javax.swing.JLabel lblImagenLista8;
    private javax.swing.JLabel lblImagenLista9;
    private javax.swing.JLabel lblIndicaciones;
    private javax.swing.JLabel lblLogoCNE;
    private javax.swing.JLabel lblNombreMovimiento1;
    private javax.swing.JLabel lblNombreMovimiento10;
    private javax.swing.JLabel lblNombreMovimiento11;
    private javax.swing.JLabel lblNombreMovimiento12;
    private javax.swing.JLabel lblNombreMovimiento13;
    private javax.swing.JLabel lblNombreMovimiento14;
    private javax.swing.JLabel lblNombreMovimiento15;
    private javax.swing.JLabel lblNombreMovimiento16;
    private javax.swing.JLabel lblNombreMovimiento2;
    private javax.swing.JLabel lblNombreMovimiento3;
    private javax.swing.JLabel lblNombreMovimiento4;
    private javax.swing.JLabel lblNombreMovimiento5;
    private javax.swing.JLabel lblNombreMovimiento6;
    private javax.swing.JLabel lblNombreMovimiento7;
    private javax.swing.JLabel lblNombreMovimiento8;
    private javax.swing.JLabel lblNombreMovimiento9;
    private javax.swing.JLabel lblNumeroLIsta1;
    private javax.swing.JLabel lblNumeroLIsta10;
    private javax.swing.JLabel lblNumeroLIsta11;
    private javax.swing.JLabel lblNumeroLIsta12;
    private javax.swing.JLabel lblNumeroLIsta13;
    private javax.swing.JLabel lblNumeroLIsta14;
    private javax.swing.JLabel lblNumeroLIsta15;
    private javax.swing.JLabel lblNumeroLIsta16;
    private javax.swing.JLabel lblNumeroLIsta2;
    private javax.swing.JLabel lblNumeroLIsta3;
    private javax.swing.JLabel lblNumeroLIsta4;
    private javax.swing.JLabel lblNumeroLIsta5;
    private javax.swing.JLabel lblNumeroLIsta6;
    private javax.swing.JLabel lblNumeroLIsta7;
    private javax.swing.JLabel lblNumeroLIsta8;
    private javax.swing.JLabel lblNumeroLIsta9;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVotar1;
    private javax.swing.JLabel lblVotar10;
    private javax.swing.JLabel lblVotar11;
    private javax.swing.JLabel lblVotar12;
    private javax.swing.JLabel lblVotar13;
    private javax.swing.JLabel lblVotar14;
    private javax.swing.JLabel lblVotar15;
    private javax.swing.JLabel lblVotar16;
    private javax.swing.JLabel lblVotar2;
    private javax.swing.JLabel lblVotar3;
    private javax.swing.JLabel lblVotar4;
    private javax.swing.JLabel lblVotar5;
    private javax.swing.JLabel lblVotar6;
    private javax.swing.JLabel lblVotar7;
    private javax.swing.JLabel lblVotar8;
    private javax.swing.JLabel lblVotar9;
    private javax.swing.JLabel lblVotoBlanco1;
    private javax.swing.JLabel lblVotoBlanco10;
    private javax.swing.JLabel lblVotoBlanco11;
    private javax.swing.JLabel lblVotoBlanco12;
    private javax.swing.JLabel lblVotoBlanco13;
    private javax.swing.JLabel lblVotoBlanco14;
    private javax.swing.JLabel lblVotoBlanco15;
    private javax.swing.JLabel lblVotoBlanco16;
    private javax.swing.JLabel lblVotoBlanco2;
    private javax.swing.JLabel lblVotoBlanco3;
    private javax.swing.JLabel lblVotoBlanco4;
    private javax.swing.JLabel lblVotoBlanco5;
    private javax.swing.JLabel lblVotoBlanco6;
    private javax.swing.JLabel lblVotoBlanco7;
    private javax.swing.JLabel lblVotoBlanco8;
    private javax.swing.JLabel lblVotoBlanco9;
    private javax.swing.JPanel panelBinomiosPares;
    // End of variables declaration//GEN-END:variables
}
