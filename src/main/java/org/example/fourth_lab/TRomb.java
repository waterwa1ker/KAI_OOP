package org.example.fourth_lab;

import java.awt.*;

public class TRomb extends TQuadrangle {

    public TRomb (int x, int y, int w, int h, Color color) {
        super(x,y); //вызов родительского конструктора
        x2 = x4 = x + w/2;
        y2 = y - h/2;
        x3 = x + w;
        y3 = y;
        y4 = y + h/2;
        super.setColor(color);
        System.out.println("Объект TRomb создан");
    }

    public TRomb(int x, int y) { super(x,y);}

    public void chSize(int dx, int dy) {
        super.Set(super.GetX()+dx,super.GetY());
        x3 -= dx;
        y2 += dy;
        y4 -= dy;
        this.repaint();
    }
}
