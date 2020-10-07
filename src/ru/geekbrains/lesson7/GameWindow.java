package ru.geekbrains.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 500;
    private static final int WIN_POSY = 100;
    private Map map;

    GameWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // задаем что будет делать "крестик"
        setSize(WIN_WIDTH, WIN_HEIGHT); // задаем "габариты" окна
        setLocation(WIN_POSX, WIN_POSY); // задаем начальное положение
        setTitle("TicTacToe"); // наименование
        setResizable(false); // отсутствие возможности изменять "габариты"
        JButton btnStart = new JButton("Start"); // из библиотеки Swing берем элемент управления - кнопку
        JButton btnStop = new JButton("Exit"); // то же самое
        JPanel panelBottom = new JPanel(); // из библиотеки Swing берем компонент - панель
        panelBottom.setLayout(new GridLayout(1, 2)); // компановщиком задаем сетку для расположения кнопок
        panelBottom.add(btnStart);
        panelBottom.add(btnStop);// добавляем кнопки на панельку
        map = new Map();// создаем поле вызывая конструктор класса Мар
        SettingsWindow settings = new SettingsWindow(this); //
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            } // тут описываем действие кнопки Старт и говорим что при нажатии открывается окно Настроек
        });
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            } // тут говорим что делать при нажатии кноки Выход, собственно выйти из программы
        });
        add(map, BorderLayout.CENTER); // метод для добавления поля, при этом задаем ему центральное расположение
        add(panelBottom, BorderLayout.SOUTH); // метод для добавления панели с кнопками, располагается внизу окна
        setVisible(true); // собственно видим это окно

    }
    public void acceptSettings(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        map.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLength);
        // метод для запуска игры после прохождения этапа настроек

    }
}
