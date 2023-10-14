package org.example.second_lab;

import javax.swing.*;
import java.awt.*;

public class ComplexFigure extends JPanel {

    private Point point;
    private int radius, w;
    private Color color;
    private CircleComplex circle;
    private Rectangle rectangle;
    private boolean VISION = true;

    public ComplexFigure(Point point, int radius, Color color) {
        setLayout(null);
        setOpaque(false);
        this.point = point;
        this.radius = radius;
        w = radius*2;
        this.color = color;
        circle = new CircleComplex(point.getX(), point.getY(), radius, color);
        rectangle = new Rectangle(point, w, w, color);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawOval(point.getX()+w/4, point.getY()+w/4, radius, radius);
            g.drawRect(point.getX(), point.getY(), w, w);
        }
    }

    public void MoveTo(int dx, int dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
        this.repaint();
    }

    public void Show(Color color) {
        this.color = color;
        this.repaint();
    }

    public void changeRadius(int radius) {
        if (radius < w) {
            this.radius = radius;
        }
        else {
            this.radius = w-radius;
        }
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CircleComplex getCircleComplex() {
        return circle;
    }

    public void setCircleComplex(CircleComplex circle) {
        this.circle = circle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
