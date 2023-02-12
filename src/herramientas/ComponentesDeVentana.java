package herramientas;

import java.awt.Color;
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
}
