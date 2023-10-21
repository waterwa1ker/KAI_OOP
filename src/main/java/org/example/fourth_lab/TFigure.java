package org.example.fourth_lab;

import javax.swing.*;
import java.awt.*;

abstract class TFigure extends JPanel {
    private Point TPoint = new Point();
    private Color color = Color.BLUE;
    abstract void MoveTo(int x, int y);

    public void Show(Color color) {
        this.color = color;
        this.repaint();
    }

    public TFigure(int x, int y) {
        TPoint.Set(x,y);
        setLayout(null);
        setOpaque(false);
        System.out.println("Координаты TFigure инициализированы");
    }

    public void Set(int x, int y) {
        TPoint.Set(x,y);
    }

    public int GetX() {return TPoint.GetX();}
    public int GetY() {return TPoint.GetY();}

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
