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
    
    public static void ajustarImagenAJLabel(JLabel label, String directorioImagen) {
        ImageIcon imagen = new ImageIcon(directorioImagen);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
                label.getWidth(), label.getHeight(),
                Image.SCALE_DEFAULT));
        label.setIcon(icono);
    }
    
    public static void ajustarImagenAJButton(JButton button, String directorioImagen) {
        ImageIcon icono = new ImageIcon(directorioImagen);
        Image imagen = icono.getImage();
        Image nuevaImagen = imagen.getScaledInstance(button.getWidth(), 
                button.getHeight(), Image.SCALE_SMOOTH);
        icono = new ImageIcon(nuevaImagen);
        button.setIcon(icono);
    }
    
    public static void redondearBordesJButton(JButton button, int radio, int espesor) {
        RoundBorder.roundButton(button, radio, espesor);
    }
    
    public static void redondearBordesJButton(JButton button, int radio, int espesor, Color color) {
        RoundBorder.roundButton(button, radio, espesor, color);
    }
    
    public static void redondearBordesJLabel(JLabel label, int radio, int espesor) {
        RoundBorder.roundLabel(label, radio, espesor);
    }
    
    private static boolean ajustarHorizontalmenteTextoALabel(String texto, JLabel label) {
        /*Retorna true si el texto no excede los limites del label y retorna 
        false si pasa lo contrario*/
        boolean retorno = true;
        FontMetrics fontMetrics = label.getFontMetrics(label.getFont());
        int saltosDeLineaDados = 0;
        int saltosDeLineaPermitidos = (int) label.getHeight() / fontMetrics.getHeight();

        String[] listaPalabras = texto.split("\\s+");
        String textoLabel = "<html>";
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

        textoLabel += "</html>";

        label.setText(textoLabel);
        label.setHorizontalAlignment(JLabel.CENTER);

        if (saltosDeLineaDados+1 > saltosDeLineaPermitidos) {
            retorno = false;
        }
        return retorno;
    }
    
    private static void ajustarTextoEnLabel (String texto, JLabel label, Font fuenteInicial) {
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
