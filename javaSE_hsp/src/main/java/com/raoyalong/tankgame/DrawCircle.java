package com.raoyalong.tankgame;


import javax.swing.*;
import java.awt.*;

/**
 * @author raoyalong
 * @create 2023 - 02 - 04 16:44
 */
public class DrawCircle extends JFrame {

    private MyPanel mp;

    public static void main(String[] args) {
        new DrawCircle();
//        System.out.println("退出程序~");
    }
    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint方法被调用了");

        g.drawOval(10,10,100,100);
    }
}
