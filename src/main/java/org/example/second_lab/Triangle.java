package org.example.second_lab;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JPanel {

    private Point point;
    private int z, t, h;
    private Color color;
    private boolean VISION = true;

    public Triangle (Point point, int c3, int c4, int c5, Color c) {
        setLayout(null);
        setOpaque(false);
        this.point = point;
        z = c3;
        t = c4;
        h = c5;
        color = c;
        System.out.println("Треугольник создан");
    }

    public Triangle (Point point, int c3, int c4, int c5) {
        setLayout(null);
        setOpaque(false);
        this.point = point;
        z = c3;
        t = c4;
        h = c5;
        color= Color.BLACK;
        System.out.println("Треугольник создан");
    }

    public void MoveTo(int c1, int c2) {
        point.setX(point.getX() + c1);
        point.setY(point.getY() + c1);
        z += c1;
        h += c2;
        t += c2;

    }

    public void Show(Color color) {
        this.color = color;
        this.repaint();
    }

    public void chSize(int c1, int c2) {
        point.setX(point.getX() - c1);
        z += c1;
        t -= c2;
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawPolygon(new int[] {point.getX(), point.getY(), z}, new int[] {t, h, t},3);
        }
    }

}



