package clases;

import java.awt.Color;
import java.awt.Image;
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
    
    public static void redondearBordesJButton(JButton button) {
        button.setBorder(new BordeRedondeado(20));
        button.setContentAreaFilled(false);
    }
    
    public static void redondearBordesJButton(JButton button, Color color,
            int espesorBorde) {
        button.setBorder(new BordeRedondeado(20, color, espesorBorde));
        button.setContentAreaFilled(false);
    }
}
