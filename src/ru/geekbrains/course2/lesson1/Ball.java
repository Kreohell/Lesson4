package ru.geekbrains.lessons.homework_1;

import java.awt.*;

public class Ball extends ru.geekbrains.lessons.homework_1.Sprite {
    private final Color color;
    private float vX;
    private float vY;

    Ball() {
        halfHeight = 20 + (float) (Math.random() * 50f);
        halfWidth = halfHeight;
        color = new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)
        );
        vX = (float) (100f + (Math.random() * 200f));
        vY = (float) (100f + (Math.random() * 200f));
    }

    @Override
    void update(ru.geekbrains.lessons.homework_1.GameCanvas canvas, float deltaTime) {
        x += vX * deltaTime;//S = vt;
        y += vY * deltaTime;
        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if (getRight() > canvas.getRight()) {
            setRight(canvas.getRight());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vY = -vY;
        }
    }

    @Override
    void render(ru.geekbrains.lessons.homework_1.GameCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int) getLeft(), (int) getTop(),
                (int) getWidth(), (int) getHeight()
        );
    }
}
