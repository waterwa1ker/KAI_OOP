package org.example.second_lab;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JPanel {

    private Point point;
    private int w, h;
    private Color color;
    private boolean VISION = true;

    public Rectangle (Point point, int c3, int c4, Color c) {
        setLayout(null);
        setOpaque(false);
        this.point = point;
        w = c3;
        h = c4;
        color = c;
        System.out.println("Прямоугольник создан");
    }

    public Rectangle (Point point, int c3, int c4) {
        setLayout(null);
        setOpaque(false);
        this.point = point;
        w = c3;
        h = c4;
        color= Color.BLACK;
        System.out.println("Прямоугольник создан");
    }

    public void MoveTo(int c1, int c2) {
        point.setX(point.getX() + c1);
        point.setY(point.getY() + c2);
    }

    public void Show(Color color) {
        this.color = color;
        this.repaint();
    }

    public void chSize(int c1, int c2) {
        w += c1;
        h += c2;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawRect(point.getX(), point.getY(), w, h);
        }
    }
}
