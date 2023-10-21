package org.example.third_lab;

import java.awt.*;

public class TCircle extends TFigure {
    protected int r1, r2;
    protected Color color;
    private boolean VISION = true;

    public TCircle(int x, int y, int r, Color color) {
        super(x,y); //вызов родительского конструктора
        System.out.println("Координаты центра TCircle: x=" + x + ", y=" + y);
        r1 = r2 = r;
        this.color = color;
        System.out.println("Объект TCircle создан");
    }

    public TCircle(int x, int y) { super(x,y); }

    public void MoveTo(int x, int y) {
        super.Set(super.GetX()+x,super.GetY()+y);
        System.out.println("Новые координаты: x="+ (super.GetX()+x) + "; y=" + (super.GetY()+y));
        this.repaint();
    }

    @Override
    public void Show(Color color) {
        this.color = color;
        this.repaint();
    }

    public void chRad(int r) {
        r1 = r2 = r;
        this.repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawOval(super.GetX(),super.GetY(),r1*2,r2*2);
        }
    }


}
