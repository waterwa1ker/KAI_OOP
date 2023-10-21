package org.example.fourth_lab;

import java.awt.*;

public class TQuadrangle extends TFigure {
    protected int x2,x3,x4,y2,y3,y4;
    protected int w,h = 0;
    private boolean VISION = true;

    public TQuadrangle(int x1, int y1, int x2, int y2, int x3, int y3,int x4,int y4, Color color){
        super(x1,y1); //вызов родительского конструктора
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
        this.x4=x4;
        this.y4=y4;
        super.setColor(color);
        System.out.println("Объект TQuadrangle создан");
    }

    @Override
        public void MoveTo(int dx, int dy){
            int x1 = super.GetX()+dx;
            int y1 = super.GetY()+dy;
            super.Set(x1,y1);
            x2 += dx;
            x3 += dx;
            x4 += dx;
            y2 += dy;
            y3 += dy;
            y4 += dy;
            this.repaint();
        }

    public TQuadrangle(int x1, int y1){
        super(x1,y1);
    }

    public void chSize(int dx, int dy) {
        x2 += dx;
        x3 = x2;
        y3 += dy;
        y4 = y3;
        this.repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (VISION == true) {
            int x1 = super.GetX();
            int y1 = super.GetY();
            g.setColor(super.getColor());
            g.drawLine(x1,y1,x2,y2);
            g.drawLine(x2,y2,x3,y3);
            g.drawLine(x3,y3,x4,y4);
            g.drawLine(x4,y4,x1,y1);
        }

    }



}
