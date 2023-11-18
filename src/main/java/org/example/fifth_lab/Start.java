package org.example.fifth_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Start {

    private JFrame f = new JFrame("Лабораторная работа №5");

    private JButton but0 = new JButton("Назад");
    private JButton but1 = new JButton("Окружности");
    private JButton but2 = new JButton("Четырехугольники");
    private JButton but3 = new JButton("Окружность");
    private JButton but4 = new JButton("Эллипс");
    private JButton but5 = new JButton("Четырехугольник");
    private JButton but6 = new JButton("Прямоугольник");
    private JButton but7 = new JButton("Ромб");
    private JButton but8 = new JButton("Трапециия");
    private JButton but9 = new JButton("Создать");
    private JButton but10 = new JButton("Переместить");
    private JButton but11 = new JButton("Удалить");
    private JButton but13 = new JButton("Изменить радиус");
    private JButton but14 = new JButton("Повернуть на 90");
    private JButton but15 = new JButton("Изменить размер");

    private JButton but16 = new JButton("Массив");
    private JButton but17 = new JButton("Показать");
    private JButton but18 = new JButton("Стереть");
    private JButton but19 = new JButton("Уничтожить");
    private JButton but20 = new JButton("Подиерархии");

    private JPanel cP = centerPanel();
    private JPanel sP = southPanel();
    private JPanel circle = null;
    private TCircle [] circles = null;
    private JPanel ellipse = null;
    private JPanel quadrangle = null;
    private TRectangle [] rectangles = null;
    private JPanel rectangle = null;
    private JPanel romb = null;
    private JPanel trapeze = null;
    private JPanel[] massive = null;

    private JLabel text = null;

    private int i, numbut, numbut2, ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8 = 0;
    private int fig_to_move;
    private boolean VISION1 = true, VISION2 = true, VISION3 = true, VISION4 = true, VISION5 = true, VISION6 = true;

    private Start() {                                   //создаем основное окно
        f.setLayout(new BorderLayout());
        f.setSize(1280,680);
        f.add(cP, BorderLayout.CENTER);
        f.add(sP, BorderLayout.SOUTH);
        //обработчик клавиш
        f.addKeyListener(new KeyAdapter() {
            //            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        MoveMassive(0,-10);
                        break;
                    case KeyEvent.VK_DOWN:
                        MoveMassive(0,10);
                        break;
                    case KeyEvent.VK_LEFT:
                        MoveMassive(-10,0);
                        break;
                    case KeyEvent.VK_RIGHT:
                        MoveMassive(10,0);
                        break;
                }
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    //панель с рисунками
    private JPanel centerPanel () {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBackground(Color.white);
        return p;
    }

    //панель с кнопками
    private JPanel southPanel () {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.setBackground(Color.GRAY);
        p.add(but1);
        p.add(but2);
        p.add(but16);

        //кнопка "Назад"
        but0.addActionListener(e -> {
            sP.removeAll();
            if (numbut2 == 1) {
                sP.add(but1);
                sP.add(but2);
                sP.add(but16);
                numbut2=0;
                numbut=0;
            }
            if (numbut2 == 2) {
                sP.add(but0);
                sP.add(but3);
                sP.add(but4);
                numbut2 = 1;
            }
            if (numbut2 == 21) {
                sP.add(but0);
                sP.add(but9);
                sP.add(but10);
                sP.add(but11);
                sP.add(but13);
                sP.add(but16);
                numbut = 1;
                numbut2 = 2;
            }
            if (numbut2 == 3) {
                sP.add(but0);
                sP.add(but5);
                sP.add(but6);
                sP.add(but7);
                sP.add(but8);
                numbut2 = 1;
            }
            if (numbut2 == 4) {
                sP.add(but0);
                sP.add(but9);
                sP.add(but17);
                sP.add(but10);
                sP.add(but18);
                sP.add(but19);
                sP.add(but20);
                numbut2 = 1;
            }
            if (numbut2 == 24) {
                sP.add(but0);
                sP.add(but9);
                sP.add(but10);
                sP.add(but11);
                sP.add(but15);
                sP.add(but16);
                numbut = 4;
                numbut2 = 3;
            }
            if (numbut2 == 5) {
                sP.add(but0);
                sP.add(but1);
                sP.add(but2);
                sP.add(but10);
                fig_to_move = 0;
                numbut2 = 4;
            }
            sP.revalidate();
            sP.repaint();
//            System.out.println("numbut = " + numbut);
//            System.out.println("numbut2 = " + numbut2);
        });
        //кнопка "Окружности"
        but1.addActionListener(e -> {
            if (numbut==7) {
                numbut2 = 5;
                fig_to_move = 1;
                sP.removeAll();
                sP.add(but0);
                sP.add(but10);
                sP.add(but13);
                JOptionPane.showMessageDialog(f,"Перемещение только для Окружностей и Эллипсов");
                f.setFocusable(true);
                f.requestFocus();
            }
            else {
                sP.removeAll();
                sP.add(but0);
                sP.add(but3);
                sP.add(but4);
                numbut2 = 1;
            }
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Четырехугольники"
        but2.addActionListener(e -> {
            if (numbut==7) {
                numbut2 = 5;
                fig_to_move = 2;
                sP.removeAll();
                sP.add(but0);
                sP.add(but10);
                sP.add(but15);
                JOptionPane.showMessageDialog(f,"Перемещение только для Четырехугольников");
                f.setFocusable(true);
                f.requestFocus();
            }
            else {
                sP.removeAll();
                sP.add(but0);
                sP.add(but5);
                sP.add(but6);
                sP.add(but7);
                sP.add(but8);
                numbut2 = 1;
            }
            sP.revalidate();
            sP.repaint();
        });

        //кнопка "Окружность"
        but3.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but13);
            sP.add(but16);
            numbut = 1;
            numbut2 = 2;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Эллипс"
        but4.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but14);
            numbut = 2;
            numbut2 = 2;
            sP.revalidate();
            sP.repaint();
        });

        //кнопка "Четырехугольник"
        but5.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            numbut = 3;
            numbut2 = 3;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Прямоугольник"
        but6.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but15);
            sP.add(but16);
            numbut = 4;
            numbut2 = 3;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Ромб"
        but7.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but15);
            numbut = 5;
            numbut2 = 3;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Трапециия"
        but8.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but15);
            numbut = 6;
            numbut2 = 3;
            sP.revalidate();
            sP.repaint();
        });

        //кнопка "Создать"
        but9.addActionListener(e -> {
            if (numbut == 1) {
                if (circle == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 300);
                    ch3 = (int) (Math.random() * 200);
                    circle = new TCircle(ch1, ch2, ch3, Color.BLACK);
                    VISION1 = true;
                    ((TCircle) circle).Show(VISION1);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate();
                } else {
                    JOptionPane.showMessageDialog(f, "Окружность уже нарисована");
                }
            }
            else if (numbut == 11) {
                if (circles == null) {
                    circles = new TCircle[10];
                    VISION2 = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        circles[i] = new TCircle (ch1, ch2, ch3, Color.GREEN);
                        System.out.println("Circle №" + (i+1) + " координаты центра:: " + ch1 +", "+ ch2 +", диаметр:"+ ch3);
                        circles[i].Show(VISION2);
                        cP.add(circles[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей уже создан");
                }
            }
            else if (numbut == 2) {
                if (ellipse == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 300);
                    ch3 = (int) (Math.random() * 200);
                    ch4 = (int) (Math.random() * 100);
                    VISION2 = true;
                    ellipse = new TEllipse(ch1, ch2, ch3, ch4, Color.RED);
                    ((TCircle) circle).Show(VISION2);
                    cP.add(ellipse, BorderLayout.CENTER);
                    cP.revalidate();
                } else {
                    JOptionPane.showMessageDialog(f, "Эллипс уже нарисован");
                }
            }
            else if (numbut == 3) {
                if (quadrangle == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 500);
                    ch3 = (int) (Math.random() * 500);
                    ch4 = (int) (Math.random() * 500);
                    ch5 = (int) (Math.random() * 500);
                    ch6 = (int) (Math.random() * 500);
                    ch7 = (int) (Math.random() * 500);
                    ch8 = (int) (Math.random() * 500);
                    quadrangle = new TQuadrangle(ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8, Color.BLACK);
                    VISION3 = true;
                    ((TQuadrangle) quadrangle).Show(VISION3);
                    cP.add(quadrangle, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Четырехугольник уже нарисован");
                }
            }
            else if (numbut == 4) {
                if (rectangle == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 500);
                    ch3 = 100 + (int) (Math.random() * 500);
                    ch4 = 100 + (int) (Math.random() * 250);
                    rectangle = new TRectangle(ch1, ch2, ch3, ch4, Color.BLUE);
                    VISION4 = true;
                    ((TRectangle) rectangle).Show(VISION4);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.revalidate();
                } else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник уже нарисован");
                }
            }
            else if (numbut == 14) {
                if (rectangles == null) {
                    rectangles = new TRectangle[10];
                    VISION3 = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        ch4 = (int) (Math.random() * 300);
                        rectangles[i] = new TRectangle (ch1, ch2, ch3, ch4, Color.RED);
                        System.out.println("Rectangle №" + (i+1));
                        rectangles[i].Show(VISION3);
                        cP.add(rectangles[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
            }
            else if (numbut == 5) {
                if (romb == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 500);
                    ch3 = 100 + (int) (Math.random() * 500);
                    ch4 = 100 + (int) (Math.random() * 250);
                    romb = new TRomb(ch1, ch2, ch3, ch4, Color.CYAN);
                    VISION5 = true;
                    ((TRomb) romb).Show(VISION5);
                    cP.add(romb, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Ромб уже нарисован");
                }
            }
            else if (numbut == 6) {
                if (trapeze == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 500);
                    ch3 = 100 + (int) (Math.random() * 500);
                    ch4 = 100 + (int) (Math.random() * 250);
                    ch5 = 10 + (int) (Math.random() * 50);
                    trapeze = new TTrapeze(ch1, ch2, ch3, ch4, ch5, Color.GREEN);
                    VISION6 = true;
                    ((TTrapeze) trapeze).Show(VISION6);
                    cP.add(trapeze, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Трапеция уже нарисована");
                }
            }
            else if (numbut == 7) {
                if (massive == null) {
                    massive = new TFigure[30];
                    for (i=0; i<30; i++) {
                        // ch1 == 1 -> Окружность
                        // ch1 == 2 -> Эллипс
                        // ch1 == 3 -> Четырехугольник
                        // ch1 == 4 -> Прямоугольник
                        // ch1 == 5 -> Ромб
                        // ch1 == 6 -> Трапеция
                        ch1 = 1 + (int) (Math.random() * 6);
                        if (ch1 == 1) {
                            System.out.println("Фигура №" + (i+1) + " - Окружность");
                            ch1 = (int) (Math.random() * 500);
                            ch2 = (int) (Math.random() * 300);
                            ch3 = (int) (Math.random() * 200);
                            massive[i] = new TCircle(ch1, ch2, ch3, Color.BLACK);
                        }
                        else  if (ch1 == 2) {
                            System.out.println("Фигура №" + (i+1) + " - Эллипс");
                            ch1 = (int) (Math.random() * 500);
                            ch2 = (int) (Math.random() * 300);
                            ch3 = (int) (Math.random() * 200);
                            ch4 = (int) (Math.random() * 100);
                            massive[i] = new TEllipse(ch1, ch2, ch3, ch4, Color.RED);
                        }
                        else  if (ch1 == 3) {
                            System.out.println("Фигура №" + (i+1) + " - Четырехугольник");
                            ch1 = (int) (Math.random() * 500);
                            ch2 = (int) (Math.random() * 500);
                            ch3 = (int) (Math.random() * 500);
                            ch4 = (int) (Math.random() * 500);
                            ch5 = (int) (Math.random() * 500);
                            ch6 = (int) (Math.random() * 500);
                            ch7 = (int) (Math.random() * 500);
                            ch8 = (int) (Math.random() * 500);
                            massive[i] = new TQuadrangle(ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8, Color.BLACK);
                        }
                        else  if (ch1 == 4) {
                            System.out.println("Фигура №" + (i+1) + " - Прямоугольник");
                            ch1 = (int) (Math.random() * 500);
                            ch2 = (int) (Math.random() * 500);
                            ch3 = 100 + (int) (Math.random() * 500);
                            ch4 = 100 + (int) (Math.random() * 250);
                            massive[i] = new TRectangle(ch1, ch2, ch3, ch4, Color.BLUE);
                        }
                        else  if (ch1 == 5) {
                            System.out.println("Фигура №" + (i+1) + " - Ромб");
                            ch1 = (int) (Math.random() * 500);
                            ch2 = (int) (Math.random() * 500);
                            ch3 = 100 + (int) (Math.random() * 500);
                            ch4 = 100 + (int) (Math.random() * 250);
                            massive[i] = new TRomb(ch1, ch2, ch3, ch4, Color.CYAN);
                        }
                        else  if (ch1 == 6) {
                            System.out.println("Фигура №" + (i+1) + " - Трапециия");
                            ch1 = (int) (Math.random() * 500);
                            ch2 = (int) (Math.random() * 500);
                            ch3 = 100 + (int) (Math.random() * 500);
                            ch4 = 100 + (int) (Math.random() * 250);
                            ch5 = 10 + (int) (Math.random() * 50);
                            massive[i] = new TTrapeze(ch1, ch2, ch3, ch4, ch5, Color.GREEN);
                        }
                    }
                    JOptionPane.showMessageDialog(f, "Создан Массив из " + (i) + " фигур");
                } else {
                    JOptionPane.showMessageDialog(f, "Массив уже создан");
                }
                f.setFocusable(true);
                f.requestFocus();
            }
            ch1 = ch2 = ch3 = ch4 = ch5 = ch6 = ch7 = ch8 = 0;
        });
        //кнопка "Переместить"
        but10.addActionListener(e -> {
            ch1 = -30 + (int) (Math.random() * 100);
            ch2 = -30 + (int) (Math.random() * 100);
            if (numbut == 1) {
                if (circle != null) {
                    ((TCircle) circle).MoveTo(ch1, ch2);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            else if (numbut == 11) {
                if (circles != null) {
                    for (int i=0; i<10; i++) {
                        circles[i].MoveTo(ch1, ch2);
                        circles[i].Show(VISION2);
                        cP.repaint();
                        System.out.println("перемещение Окружности №" + (i+1));
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив окружностей не найден");
                }
            }
            else if (numbut == 2) {
                if (ellipse  != null) {
                    ((TEllipse) ellipse ).MoveTo(ch1, ch2);
                    cP.add(ellipse , BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Эллипс не найден");
                }
            }
            else if (numbut == 3) {
                if (quadrangle != null) {
                    ((TQuadrangle) quadrangle).MoveTo(ch1,ch2);
                    cP.add(quadrangle, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Четырехугольник не найден");
                }
            }
            else if (numbut == 4) {
                if (rectangle != null) {
                    ((TRectangle) rectangle).MoveTo(ch1, ch2);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (rectangles != null) {
                    for (int i=0; i<10; i++) {
                        rectangles[i].MoveTo(ch1, ch2);
                        rectangles[i].Show(VISION3);
                        cP.repaint();
                        System.out.println("перемещение Прямоугольника №" + (i+1));
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Прямоугольников не найден");
                }
            }
            else if (numbut == 5) {
                if (romb != null) {
                    ((TRomb) romb).MoveTo(ch1,ch2);
                    cP.add(romb, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Ромб не найден");
                }
            }
            else if (numbut == 6) {
                if (trapeze != null) {
                    ((TTrapeze) trapeze).MoveTo(ch1,ch2);
                    cP.add(trapeze, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Трапеция не найдена");
                }
            }
            else if (numbut == 7) {
                MoveMassive(ch1, ch2);
            }
            ch1 = ch2 = 0;
        });
        //кнопка "Удалить"
        but11.addActionListener(e -> {
            if (numbut == 1) {
                if (circle != null) {
                    cP.remove(circle);
                    ((TCircle) circle).Show(false);
                    circle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            else if (numbut == 11) {
                if (circles != null) {
                    for (int i=0; i<10; i++) {
                        cP.remove(circles[i]);
                        circles[i].Show(false);
                    }
                    circles = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей не найден");
                }
            }
            else if (numbut == 2) {
                if (ellipse  != null) {
                    cP.remove(ellipse);
                    ((TEllipse) ellipse ).Show(false);
                    ellipse  = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Эллипс не найден");
                }
            }
            else if (numbut == 3) {
                if (quadrangle != null) {
                    cP.remove(quadrangle);
                    ((TQuadrangle) quadrangle).Show(false);
                    quadrangle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Четырехугольник не найден");
                }
            }
            else if (numbut == 4) {
                if (rectangle != null) {
                    cP.remove(rectangle);
                    ((TRectangle) rectangle).Show(false);
                    rectangle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (rectangles != null) {
                    for (int i=0; i<10; i++) {
                        cP.remove(rectangles[i]);
                        rectangles[i].Show(false);
                    }
                    rectangles = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Прямоугольников не найден");
                }
            }
            else if (numbut == 5) {
                if (romb != null) {
                    cP.remove(romb);
                    ((TRomb) romb).Show(false);
                    romb = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Ромб не найден");
                }
            }
            else if (numbut == 6) {
                if (trapeze != null) {
                    cP.remove(trapeze);
                    ((TTrapeze) trapeze).Show(false);
                    trapeze = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Трапеция не найдена");
                }
            }
        });

        //кнопка "Изменить радиус"
        but13.addActionListener(e -> {
            ch1 = 50 + (int) (Math.random() * 150);
            //для одиночной окружности
            if (numbut == 1) {
                if (circle != null) {
                    ((TCircle) circle).chRad(ch1);
                    ((TCircle) circle).Show(VISION1);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            //для массива окружностей
            else if (numbut == 11) {
                if (circles != null) {
                    for (int i = 0; i < 10; i++) {
                        ch1 = 50 + (int) (Math.random() * 150);
                        circles[i].chRad(ch1);
                        circles[i].Show(VISION2);
                    }
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей не создан");
                }
            }
            //для окружностей из массива
            else if (numbut == 7) {
                if (massive != null) {
                    for (int j = 0; j < 30; j++) {
                        if (massive[j] instanceof TCircle) {
                            ((TCircle) massive[j]).chRad(ch1);
                        }
                    }
                    for (int t = 0; t < i; t++) {
                        if (massive[t] instanceof TCircle) {
                            cP.add(massive[t], BorderLayout.CENTER);
                        }
                    }
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Массив не создан");
                }
                f.setFocusable(true);
                f.requestFocus();
            }
            ch1 = 0;
        });
        //кнопка ""Повернуть на 90""
        but14.addActionListener(e -> {
            if (ellipse  != null) {
                ((TEllipse) ellipse ).Turn();
                ((TEllipse) ellipse ).Show(VISION2);
                cP.add(ellipse , BorderLayout.CENTER);
                cP.revalidate();
                cP.repaint();
            } else {
                JOptionPane.showMessageDialog(f, "Эллипс не найден");
            }
        });
        //кнопка "Изменить размер"
        but15.addActionListener(e -> {
            ch1 = -25 + (int) (Math.random() * 50);
            ch2 = -25 + (int) (Math.random() * 50);
            //для одиночного четырехугольника
            if (numbut == 3) {
                if (quadrangle != null) {
                    ((TQuadrangle) quadrangle).chSize(ch1, ch2);
                    ((TQuadrangle) quadrangle).Show(VISION3);
                    cP.add(quadrangle, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Четырехугольник не найден");
                }
            }
            //для одиночного прямоугольника
            if (numbut == 4) {
                if (rectangle != null) {
                    ((TRectangle) rectangle).chSize(ch1, ch2);
                    ((TRectangle) rectangle).Show(VISION4);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            //для массива прямоугольников
            else if (numbut == 14) {
                if (rectangles != null) {
                    for (int i = 0; i < 10; i++) {
                        rectangles[i].chSize(ch1, ch2);
                        rectangles[i].Show(VISION3);
                    }
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей не создан");
                }
            }
            //для одиночного ромба
            else if (numbut == 5) {
                if (romb != null) {
                    ((TRomb) romb).chSize(ch1, ch2);
                    ((TRomb) romb).Show(VISION5);
                    cP.add(romb, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Ромб не найден");
                }
            }
            //для одиночной трапеции
            else if (numbut == 6) {
                if (trapeze != null) {
                    ((TTrapeze) trapeze).chSize(ch1, ch2);
                    ((TTrapeze) trapeze).Show(VISION6);
                    cP.add(trapeze, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Трапеция не найдена");
                }
            }
            //для четырехугольников из массива
            else if (numbut == 7) {
                if (massive != null) {
                    for (int j = 0; j < 30; j++) {
                        if (massive[j] instanceof TQuadrangle) {
                            ((TQuadrangle) massive[j]).chSize(ch1,ch2);
                        }
                    }
                    for (int t = 0; t < i; t++) {
                        if (massive[t] instanceof TQuadrangle) {
                            cP.add(massive[t], BorderLayout.CENTER);
                        }
                    }
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Массив не создан");
                }
                f.setFocusable(true);
                f.requestFocus();
            }
            ch1 = ch2 = 0;
        });

        //"Массив"
        but16.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);

            if (numbut == 1) {
                sP.add(but10); sP.add(but11); sP.add(but13); numbut = 11; numbut2 = 21;
                JOptionPane.showMessageDialog(f, "Следующие действия будут выполнены для массива окружностей");
            }
            else if (numbut == 4) {
                sP.add(but10); sP.add(but11); sP.add(but15); numbut = 14; numbut2 = 24;
                JOptionPane.showMessageDialog(f, "Следующие действия будут выполнены для массива прямоугольников");
            }
            else {
                sP.add(but17);
                sP.add(but10);
                sP.add(but18);
                sP.add(but19);
                sP.add(but20);
                numbut = 7;
                numbut2 = 1;
            }
            sP.revalidate();
            sP.repaint();
        });
        //"Показать"
        but17.addActionListener(e -> {
            if (massive != null) {
                for (int i=0; i<30; i++) {
                    ((TFigure) massive[i]).Show(true);
                    cP.add(massive[i], BorderLayout.CENTER);
                    if (i>0) { cP.remove(text); }
                    text = null; text = new JLabel("Показано " + (i+1) + "/30 фигур");
                    cP.add(text, BorderLayout.SOUTH);
                    cP.validate();
                    cP.revalidate();
                    cP.repaint();
                }
                JOptionPane.showMessageDialog(f,"Все фигуры показаны");
            }
            else {
                JOptionPane.showMessageDialog(f, "Массив не создан");
            }
            f.setFocusable(true);
            f.requestFocus();
        });
        //"Стереть"
        but18.addActionListener(e -> {
            if (massive != null) {
                for (int i=0; i<30; i++) {
                    cP.remove(massive[i]);
                }
                cP.remove(text);
                cP.revalidate();
                cP.repaint();
                i = 0; text = null;
                System.out.println("Фигуры стерты, но объекты не уничтожены");
            }
            else {
                JOptionPane.showMessageDialog(f, "Массив не создан");
            }
            f.setFocusable(true);
            f.requestFocus();
        });
        //"Уничтожить"
        but19.addActionListener(e -> {
            if (massive != null) {
                if (text != null) {
                    for (int i = 0; i < 30; i++) {
                        cP.remove(massive[i]);
                    }
                    cP.remove(text);
                    cP.revalidate();
                    cP.repaint();
                    i = 0; text = null;
                }
                massive = null;
                System.out.println("Фигуры стерты, а соответствующие объекты уничтожены");
            } else {
                JOptionPane.showMessageDialog(f, "Массив не создан");
            }
            f.setFocusable(true);
            f.requestFocus();
        });
        //"Подиерархии"
        but20.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but1);
            sP.add(but2);
            sP.add(but10);
            numbut2 = 4;
            sP.revalidate();
            sP.repaint();
        });

        return p;
    }

    private void MoveMassive (int dx, int dy) {
        //перемещение всех
        if (fig_to_move == 0) {
            if (massive != null) {
                for (int j = 0; j < 30; j++) {
                    ((TFigure) massive[j]).MoveTo(dx, dy);
                }
                for (int t = 0; t < i; t++) {
                    cP.add(massive[t], BorderLayout.CENTER);
                }
                cP.revalidate();
                cP.repaint();
            } else {
                JOptionPane.showMessageDialog(f, "Массив не создан");
            }
        }
        //перемещение окружностей
        else  if (fig_to_move == 1) {
            if (massive != null) {
                for (int j = 0; j < 30; j++) {
                    if (massive[j] instanceof TCircle) {
                        ((TFigure) massive[j]).MoveTo(dx, dy);
                    }
                }
                for (int t = 0; t < i; t++) {
                    if (massive[t] instanceof TCircle) {
                        cP.add(massive[t], BorderLayout.CENTER);
                    }
                }
                cP.revalidate();
                cP.repaint();
            } else {
                JOptionPane.showMessageDialog(f, "Массив не создан");
            }
        }
        //перемещение 4хугольников
        else  if (fig_to_move == 2) {
            if (massive != null) {
                for (int j = 0; j < 30; j++) {
                    if (massive[j] instanceof TQuadrangle) {
                        ((TFigure) massive[j]).MoveTo(dx, dy);
                    }
                }
                for (int t = 0; t < i; t++) {
                    if (massive[t] instanceof TQuadrangle) {
                        cP.add(massive[t], BorderLayout.CENTER);
                    }
                }
                cP.revalidate();
                cP.repaint();
            } else {
                JOptionPane.showMessageDialog(f, "Массив не создан");
            }
        }
        else {
            JOptionPane.showMessageDialog(f, "Фигуры не найдены");
        }
        f.setFocusable(true);
        f.requestFocus();
    }

    public static void main (String[] argc) {
        SwingUtilities.invokeLater(Start::new);
    }
}
