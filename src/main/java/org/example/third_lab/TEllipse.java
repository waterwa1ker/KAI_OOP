package org.example.third_lab;

import java.awt.*;

public class TEllipse extends TCircle {

    public  TEllipse(int x, int y, int r1, int r2, Color color) {
        super(x,y); //вызов родительского конструктора
        System.out.println("Координаты центра TEllipse: x=" + x + ", y=" + y);
        this.r1=r1;
        this.r2=r2;
        this.color=color;
        System.out.println("Объект TEllipse создан");
    }

    public  TEllipse(int x, int y) {
        super(x,y);
    }

    public void Turn() {
        int a = r1;
        r1=r2;
        r2= a;
        this.repaint();
    }

}