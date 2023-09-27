package org.example.second_lab;

import javax.swing.*;
import java.awt.*;

public class Ring extends JPanel {

    private Point point;
    private int D;
    private Color color;
    private Circle One, Two;
    private boolean VISION = true;

    public Ring (Point point, int r, Color c) {
        System.out.println("\nвызов конструктора 1\n");
        setLayout(null);
        setOpaque(false);
        if ((point.getX()+r) >= 1200) { r = 1200 - point.getX();}
        if ((point.getY()+r) >= 500) { r = 500 - point.getY();}
        if (r > point.getX()) { r = point.getX(); }
        if (r >= point.getY()) { r = point.getY(); }
        One = new Circle(new Point(point.getX(),point.getY()),r, c);
        Two = new Circle(new Point(point.getX(),point.getY()),r*2/3, c);
        D = r*2;
        this.point = point;
        System.out.println("Кольцо создано");
    }

    public Ring (Point point, int r) {
        setLayout(null);
        setOpaque(false);
        One = new Circle(new Point(point.getX(),point.getY()),r, Color.BLACK);
        Two = new Circle(new Point(point.getX(),point.getY()),r*2/3, Color.BLACK);
        this.point = point;
        D=r*2;
        System.out.println("Объект Ring создан");
    }

    public void MoveTo(int dx, int dy) {
        point.setX(point.getX()+dx);
        point.setY(point.getY()+dy);
        this.repaint();
    }

    public void Show(boolean VISION) {
        this.VISION= VISION;
        setVisible(this.VISION);
        this.VISION = true;
        this.repaint();
    }

    public void chRad(int r) {
        D = r*2;
        this.repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawOval(point.getX()-D/2, point.getY()-D/2, D, D);
            g.drawOval(point.getX()-D/4, point.getY()-D/4, D/2, D/2);
        }
    }
}