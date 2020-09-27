package ru.geekbrains.lesson7;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;
    public Map(){
        setBackground(Color.DARK_GRAY);

    }
    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("mode:%d, size:%d, win:%d\n", gameMode, fieldSizeX, winLength);
    }
}
