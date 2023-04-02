package com.raoyalong.tankgame;

/**
 * @author raoyalong
 * @create 2023 - 02 - 04 16:18
 */
public class Tank {

    private int x;
    private int y;

    @Override
    public String toString() {
        return "Tank{" +
                "x=" + x +
                ", y=" + y +
                '}';
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

    public Tank() {
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
