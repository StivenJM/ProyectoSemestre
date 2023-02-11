package clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D;

import javax.swing.border.AbstractBorder;

public class BordeRedondeado extends AbstractBorder {
    private int radio;
    private Color color;
    private int espesor;

    public BordeRedondeado(int radio, Color color, int espesor) {
        this.radio = radio;
        this.color = color;
        this.espesor = espesor;
    }
    
    public BordeRedondeado(int radio) {
        this.radio = radio;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int ancho, int altura) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(espesor));
        g2d.drawRoundRect(x, y, ancho - 1, altura - 1, radio, radio);
        g2d.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(4, 8, 4, 8);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.right = 8;
        insets.top = insets.bottom = 4;
        return insets;
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}