package org.example.second_lab;

import javax.swing.*;
import java.awt.*;

public class Line extends JPanel {

    private Point firstPoint, secondPoint;
    private Color color;
    private boolean VISION = true;

    public Line (Point firstPoint, Point secondPoint, Color c) {
        setLayout(null);
        setOpaque(false);
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        color = c;
        System.out.println("Линия создана");
        this.repaint();
    }

    public Line (Point firstPoint, Point secondPoint) {
        setLayout(null);
        setOpaque(false);
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        color = Color.BLACK;
        System.out.println("Линия создана");
        this.repaint();
    }

    public void MoveTo(int c1, int c2) {
        firstPoint.setX(firstPoint.getX() + c1);
        firstPoint.setY(firstPoint.getY() + c1);
        secondPoint.setX(secondPoint.getX() + c2);
        secondPoint.setY(secondPoint.getY() + c2);
        this.repaint();
    }

    public void Show(Color color) {
        this.color = color;
        this.repaint();
    }

    public void Turn() {
        double c1, c2;
        c1 = (secondPoint.getX() - firstPoint.getX()) * Math.cos(Math.toRadians(90.0)) - (secondPoint.getY() - firstPoint.getY()) * Math.sin(Math.toRadians(90.0)) + firstPoint.getX();
        c2 = (secondPoint.getX() - firstPoint.getX()) * Math.sin(Math.toRadians(90.0)) + (secondPoint.getY() - firstPoint.getY()) * Math.cos(Math.toRadians(90.0)) + firstPoint.getY();
        secondPoint.setX((int)c1);
        secondPoint.setY((int) c2);
        this.repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawLine(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY());
        }
    }
}