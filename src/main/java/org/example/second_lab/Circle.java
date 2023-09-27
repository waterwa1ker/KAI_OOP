package org.example.second_lab;

import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {
    private int radius;

    private Point point;
    private Color color;
    private boolean VISION = true;

    public Circle (Point point, int radius, Color c) {
        setLayout(null);
        setOpaque(false);
        this.point = point;
        System.out.print("Начальный радиус: " + radius + "; ");
        this.radius = radius;
        if ((point.getX()+radius) >= 1200) { this.radius = 1200 - point.getX();}
        if ((point.getY()+radius) >= 500) { this.radius = 500 - point.getY();}
        if (radius>point.getX()) { this.radius = point.getX(); }
        if (radius>=point.getY()) { this.radius= point.getY(); }
        System.out.println("Итоговый радиус: " + this.radius);
        color = c;
        System.out.println("Окружность создана");
    }

    public Circle (Point point, int radius) {
        setLayout(null);
        setOpaque(false);
        this.point = point;
        this.radius = radius;
        color= Color.BLACK;
        System.out.println("Окружность создана");
    }

    public void moveTo(int dx, int dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
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
            g.drawOval(point.getX() - radius /2, point.getY()- radius /2, radius, radius);
        }
    }
}
