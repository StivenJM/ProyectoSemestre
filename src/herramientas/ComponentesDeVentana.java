package herramientas;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ComponentesDeVentana {
    
    /**
     * Método para redimensionar una imagen y encajarla en un label
     * @param label el componente gráfico en el que se inserta la imagen
     * @param directorioImagen la ruta de la imagen a seleccionar
     */
    public static void ajustarImagenAJLabel(JLabel label, String directorioImagen) {
        ImageIcon imagen = new ImageIcon(directorioImagen);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
                label.getWidth(), label.getHeight(),
                Image.SCALE_DEFAULT));
        label.setIcon(icono);
    }
    
    /**
     * Método para redimensionar una imagen y encajarla en un label de
     * preferencia de dimensiones cuadradas para un mejor acoplamiento, en
     * este método el label se ajusta a la imagen y la imagen al label de manera
     * dinámica
     * @param label componente en el que se inserta la imagen
     * @param directorioImagen ruta en la que se encuentra la imagen a seleccionar
     */
    public static void ajustarImagenAJLabelDinamico (JLabel label, String directorioImagen) {

        ImageIcon imagen = new ImageIcon(directorioImagen);
        
        int alturaImagen = imagen.getIconHeight();
        int anchoImagen = imagen.getIconWidth();
        int alturaLabel = label.getHeight();
        int anchoLabel = label.getWidth();
        
        int posicionXLabel = label.getX();
        int posicionYLabel = label.getY();
        
        if (alturaImagen > anchoImagen) {
            int anchoLabelModificado = (int)
                    ((float)(alturaLabel * anchoImagen) / (float) alturaImagen);
            label.setSize(anchoLabelModificado, alturaLabel);
            
            //Se cambia la posicion del label para que siga apareciendo centrada
            label.setLocation(posicionXLabel + (int)((anchoLabel-anchoLabelModificado)/2), 
                    posicionYLabel);
        } else {
            int alturaLabelModificado = (int)
                    ((float)(anchoLabel * alturaImagen) / (float) anchoImagen);
            label.setSize(anchoLabel, alturaLabelModificado);
            
            //Se cambia la posicion del label para que siga apareciendo centrada
            label.setLocation(posicionXLabel, 
                    posicionYLabel + (int)((alturaLabel-alturaLabelModificado)/2));
        }
        
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
                label.getWidth(), label.getHeight(),
                Image.SCALE_DEFAULT));
        label.setIcon(icono);
    }
    /**
     * Método para redimensionar una imagen y encajarla en un botón
     * @param button componente donde se insertará la imagen
     * @param directorioImagen ruta en la que se encuentra la imagen a seleccionar
     */
    public static void ajustarImagenAJButton(JButton button, String directorioImagen) {
        ImageIcon icono = new ImageIcon(directorioImagen);
        Image imagen = icono.getImage();
        Image nuevaImagen = imagen.getScaledInstance(button.getWidth(), 
                button.getHeight(), Image.SCALE_SMOOTH);
        icono = new ImageIcon(nuevaImagen);
        button.setIcon(icono);
    }
    
    /**
     * Método para redondear los bordes de un botón
     * @param button componente para redondear
     * @param radio la esfericidad que tendrá el botón
     * @param espesor grosor del borde del botón
     */
    public static void redondearBordesJButton(JButton button, int radio, int espesor) {
        RoundBorder.roundButton(button, radio, espesor);
    }
    
    /**
     * Método para redondear los bordes de un botón
     * @param button componente para redondear
     * @param radio la esfericidad que tendrá el botón
     * @param espesor grosor del borde del botón
     * @param color colorear el borde de un color específico
     */
    public static void redondearBordesJButton(JButton button, int radio, int espesor, Color color) {
        RoundBorder.roundButton(button, radio, espesor, color);
    }
    
    /**
     * Método para redondear los bordes de un label
     * @param label componente para redondear
     * @param radio la esfericidad que tendrá el label
     * @param espesor grosor del borde dellabel
     */
    public static void redondearBordesJLabel(JLabel label, int radio, int espesor) {
        RoundBorder.roundLabel(label, radio, espesor);
    }
    
    /**
     * Método para comprobar si el texto excede los límites del label
     * @param texto la cadena de texto a comprobar
     * @param label componente en el que se encuentra el texto
     * @return true si el texto no excede los límites del label
     */
    private static boolean ajustarHorizontalmenteTextoALabel(String texto, JLabel label) {
        
        boolean retorno = true;
        FontMetrics fontMetrics = label.getFontMetrics(label.getFont());
        int saltosDeLineaDados = 0;
        int saltosDeLineaPermitidos = (int) label.getHeight() / fontMetrics.getHeight();

        String[] listaPalabras = texto.split("\\s+");
        String textoLabel = "<html><div style='text-align: center;'>";
        String textoAlternativo = "";

        int bandera = 0;

        while (bandera < listaPalabras.length) {
            if (fontMetrics.stringWidth(textoAlternativo + listaPalabras[bandera] + " ") < label.getWidth()) {
                textoAlternativo += listaPalabras[bandera] + " ";
                bandera++;
            } else {
                textoLabel += textoAlternativo + "<br>";
                textoAlternativo = "";
                saltosDeLineaDados++;
            }
        }

        if (!textoAlternativo.equals("")) {
            textoLabel += textoAlternativo;
        }

        textoLabel += "</div></html>";

        label.setText(textoLabel);
        label.setHorizontalAlignment(JLabel.CENTER);

        if (saltosDeLineaDados+1 > saltosDeLineaPermitidos) {
            retorno = false;
        }
        return retorno;
    }
    
    /**
     * Método para ajustar el texto en un label en caso de que exceda del mismo
     * @param texto cadena de texto a ajustar
     * @param label componente en el que se ajustará el texto
     * @param fuenteInicial tipo de letra inicial del texto
     */
    public static void ajustarTextoEnLabel (String texto, JLabel label, Font fuenteInicial) {
        /*Este metodo ajusta un texto en un label,  en caso de que 
        el texto no alcance en el label, tonces se reducirá el tamaño del texto*/
        label.setFont(fuenteInicial);
        int tamanoInicial = fuenteInicial.getSize();

        while (!ajustarHorizontalmenteTextoALabel(texto, label)) {
            tamanoInicial--;
            Font fuente = new Font(fuenteInicial.getName(), fuenteInicial.getStyle(), tamanoInicial);
            label.setFont(fuente);
        }
    }
}
