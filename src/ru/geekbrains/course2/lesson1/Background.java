package ru.geekbrains.lessons.homework_1;


import java.awt.*;

public class Background extends GameCanvas {


    Background(MainCircles controller) {
        super(controller);
        newSetBackground();
        lastFrameTime = System.nanoTime();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        newSetBackground();
        repaint();
    }

    private void newSetBackground(){
        setBackground(new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)));

    }
}
