package org.example.fourth_lab;



import java.awt.*;

public class TTrapeze extends TQuadrangle {

    public TTrapeze(int x, int y, int w, int h, int c, Color color) {
        super(x,y);
        x2 = x + w; y2 = y;
        x3 = x2 - c; y3 = y - h;
        x4 = x + c; y4 = y3;
        super.setColor(color);
        System.out.println("Объект TTrapeze создан");
    }

    public TTrapeze(int x, int y) { super(x,y); }

    public void chSize(int dx, int dy) {
        super.Set(super.GetX()-dx,super.GetY()+dy);
        x2 += dx;
        y2 += dy;
        x3 += dx;
        x4 -= dx;
    }

}
