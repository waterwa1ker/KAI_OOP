package org.example.second_lab;

public class Point {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Точка создана");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
