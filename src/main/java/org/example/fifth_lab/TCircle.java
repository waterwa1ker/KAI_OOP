package org.example.fifth_lab;

import java.awt.*;

public class TCircle extends TFigure {
    protected int r1, r2;
    protected Color color;
    private boolean VISION = true;

    public TCircle(int x, int y, int r, Color color) {
        super(x,y);
        System.out.println("Координаты центра: x=" + x + ", y=" + y);
        r1 = r2 = r;
        this.color = color;
        System.out.println("Объект TCircle создан");
    }

    public TCircle(int x, int y) { super(x,y); }

    public void Show(boolean VISION) {
        this.VISION= VISION;
        setVisible(this.VISION);
        this.VISION = true;
        this.repaint();
    }

    @Override
    public void MoveTo(int dx, int dy) {
        this.Show(false);
        x1 = super.GetX() + dx;
        y1 = super.GetY() + dy;
        super.Set(x1, y1);
        System.out.println("1.Новые координаты: x=" + (super.GetX() + dx) + "; y=" + (super.GetY() + dy));
        this.Show(true);
    }

    public void chRad(int r) {
        if (r1 == r2) {
            r1 = r2 = r;
        } else {
            r1 = r;
        }
        this.repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (VISION==true) {
            g.setColor(color);
            g.drawOval(super.GetX(),super.GetY(),r1*2,r2*2);
        }
    }

}
