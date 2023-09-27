package org.example.first_lab;

import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {
    private int x, y, radius;
    private Color color;
    private boolean VISION = true;

    public Circle (int x, int y, int radius, Color c) {
        setLayout(null);
        setOpaque(false);
        this.x = x;
        this.y = y;
        this.radius = radius;
        color = c;
    }

    public Circle (int x, int y, int radius) {
        setLayout(null);
        setOpaque(false);
        this.x = x;
        this.y = y;
        this.radius = radius;
        color= Color.BLACK;
    }

    public void moveTo(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void show(Color color) {
        this.color = color;
        this.repaint();
    }

    public void changeRadius(int radius) {
        this.radius = radius;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawOval(x- radius /2, y- radius /2, radius, radius);
            System.out.println("Circle Видимость: " + VISION);
        }
    }
}
