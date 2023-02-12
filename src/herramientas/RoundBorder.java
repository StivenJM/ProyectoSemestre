package herramientas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.Border;

public class RoundBorder implements Border {

    private int radius;
    private int thickness;
    private Color color;

    public RoundBorder(int radius, int thickness) {
        this(radius, thickness, null);
    }

    public RoundBorder(int radius, int thickness, Color color) {
        this.radius = radius;
        this.thickness = thickness;
        this.color = color;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + this.thickness, this.radius + this.thickness, 
            this.radius + this.thickness, this.radius + this.thickness);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (this.color != null) {
            g2.setColor(this.color);
        }

        int i;
        for (i = 0; i < this.thickness; i++) {
            g2.drawRoundRect(x + i, y + i, width - i - i - 1, height - i - i - 1, this.radius, this.radius);
        }
    }

    public static void roundLabel(JLabel label, int radius, int thickness) {
        roundLabel(label, radius, thickness, null);
    }

    public static void roundLabel(JLabel label, int radius, int thickness, Color color) {
        label.setBorder(new RoundBorder(radius, thickness, color));
    }

    public static void roundButton(JButton button, int radius, int thickness) {
        roundButton(button, radius, thickness, null);
    }

    public static void roundButton(JButton button, int radius, int thickness, Color color) {
        button.setBorder(new RoundBorder(radius, thickness, color));
    }
}
