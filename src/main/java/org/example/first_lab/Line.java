package org.example.first_lab;

import javax.swing.*;
import java.awt.*;

public class Line extends JPanel {

    private int x1, y1, x2, y2;
    private Color color;
    private boolean VISION = true;

    public Line (int c1, int c2, int c3, int c4, Color c) {
        setLayout(null);
        setOpaque(false);
        x1 = c1;
        y1 = c2;
        x2 = c3;
        y2 = c4;
        color = c;
        this.repaint();
    }

    public Line (int c1, int c2, int c3, int c4) {
        setLayout(null);
        setOpaque(false);
        x1 = c1;
        y1 = c2;
        x2 = c3;
        y2 = c4;
        color = Color.BLACK;
        this.repaint();
    }

    public void MoveTo(int c1, int c2) {
        x1 += c1;
        x2 += c1;
        y1 += c2;
        y2 += c2;
        this.repaint();
    }

    public void Show(Color color) {
        this.color = color;
        this.repaint();
    }

    public void Turn() {
        double c1, c2;
        c1 = (x2 - x1) * Math.cos(Math.toRadians(90.0)) - (y2 - y1) * Math.sin(Math.toRadians(90.0)) + x1;
        c2 = (x2 - x1) * Math.sin(Math.toRadians(90.0)) + (y2 - y1) * Math.cos(Math.toRadians(90.0)) + y1;
        x2= (int)c1;
        y2= (int)c2;
        this.repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawLine(x1, y1, x2, y2);
            System.out.println("Line Видимость: " + VISION);
            System.out.println("Нарисованая Line с координатами: " + x1 + ", " + y1 + ", " + x2 + ", " + y2);

        }
    }
}