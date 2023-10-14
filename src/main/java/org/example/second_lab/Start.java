package org.example.second_lab;

import javax.swing.*;
import java.awt.*;

public class Start {

    private JFrame frame = new JFrame("Лабораторная работа №1");
    private JButton backButton = new JButton("Назад");
    private JButton lineButton = new JButton("Линия");
    private JButton circleButton = new JButton("Окружность");
    private JButton rectangleButton = new JButton("Прямоугольник");
    private JButton triangleButton = new JButton("Треугольник");
    private JButton ringButton = new JButton("Кольцо");
    private JButton complexButton = new JButton("Вписанная окружность");
    private JButton createButton = new JButton("Создать");
    private JButton moveButton = new JButton("Переместить");
    private JButton deleteButton = new JButton("Удалить");
    private JButton turnButton = new JButton("Повернуть на 90");
    private JButton changeRadiusButton = new JButton("Изменить радиус");
    private JButton changeSizeButton = new JButton("Изменить размер");
    private JButton setVisibleButton = new JButton("Сделать видимым/невидимым");
    private JButton arrayButton = new JButton("Массив");

    private JPanel centerPanel = centerPanel(); //JPanel - элемент управления, представляющий собой прямоугольное пространство, на котором можно размещать другие элементы
    private JPanel southPanel = southPanel();
    private JPanel line = null;
    private Line [] lines = null;
    private JPanel circle = null;
    private Circle [] circles = null;
    private JPanel rectangle = null;
    private Rectangle [] rectangles = null;
    private JPanel triangle = null;
    private Triangle [] triangles = null;
    private JPanel ring = null;
    private JPanel[] rings = null;
    private JPanel complex = null;
    private JPanel[] complexArray = null;
    private int numbut, ch1, ch2, ch3, ch4, ch5 = 0;
    private boolean liveVision = false, circleVision = false, rectangleVision = false, triangleVision = false, ringVision = false,
    complexVision = false;

    private Start() {
        //создаем основное окно
        frame.setLayout(new BorderLayout()); //setLayout - метод для изменения менеджера размещения, BorderLayout - менеджер
        frame.setSize(1280,680);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //позволяет указать действие, которое необходимо выполнить, когда пользователь закрывает окно нажатием на крестик.
        frame.setVisible(true);
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
        p.add(lineButton);
        p.add(circleButton);
        p.add(rectangleButton);
        p.add(triangleButton);
        p.add(ringButton);
        p.add(complexButton);

        //кнопка "Назад"
        backButton.addActionListener(e -> {
            if (numbut == 1 || numbut == 2 || numbut == 3 || numbut == 4 || numbut == 5 || numbut == 6) {
                southPanel.removeAll();
                southPanel.add(lineButton);
                southPanel.add(circleButton);
                southPanel.add(rectangleButton);
                southPanel.add(triangleButton);
                southPanel.add(ringButton);
                southPanel.add(complexButton);
            }
            if (numbut == 11 || numbut == 12 || numbut == 13 || numbut == 14 || numbut == 15 || numbut == 16) {

                if (numbut == 11) { southPanel.add(turnButton); numbut = 1;}
                if (numbut == 12) { southPanel.add(changeRadiusButton); numbut = 2;}
                if (numbut == 13) { southPanel.add(changeSizeButton);numbut = 3;}
                if (numbut == 14) { southPanel.add(changeSizeButton);numbut = 4;}
                if (numbut == 15) { southPanel.add(changeRadiusButton);numbut = 5;}
                if (numbut == 16) { southPanel.add(changeRadiusButton); numbut = 6;}
                southPanel.add(arrayButton);
            }
            southPanel.revalidate();
            southPanel.repaint();
        });

        //кнопка "Линия"
        lineButton.addActionListener(e -> {
            southPanel.removeAll();
            southPanel.add(backButton);
            southPanel.add(createButton);
            southPanel.add(moveButton);
            southPanel.add(deleteButton);
            southPanel.add(turnButton);
            southPanel.add(setVisibleButton);
            southPanel.add(arrayButton);
            southPanel.revalidate();
            southPanel.repaint();
            numbut = 1;
        });

        //кнопка "Окружность"
        circleButton.addActionListener(e -> {
            southPanel.removeAll();
            southPanel.add(backButton);
            southPanel.add(createButton);
            southPanel.add(moveButton);
            southPanel.add(deleteButton);
            southPanel.add(changeRadiusButton);
            southPanel.add(setVisibleButton);
            southPanel.add(arrayButton);
            southPanel.revalidate();
            southPanel.repaint();
            numbut = 2;
        });
        //кнопка "Прямоугольник"
        rectangleButton.addActionListener(e -> {
            southPanel.removeAll();
            southPanel.add(backButton);
            southPanel.add(createButton);
            southPanel.add(moveButton);
            southPanel.add(deleteButton);
            southPanel.add(changeSizeButton);
            southPanel.add(setVisibleButton);
            southPanel.add(arrayButton);
            southPanel.revalidate();
            southPanel.repaint();
            numbut = 3;
        });
        //кнопка "Треугольник"
        triangleButton.addActionListener(e -> {
            southPanel.removeAll();
            southPanel.add(backButton);
            southPanel.add(createButton);
            southPanel.add(moveButton);
            southPanel.add(deleteButton);
            southPanel.add(changeSizeButton);
            southPanel.add(setVisibleButton);
            southPanel.add(arrayButton);
            southPanel.revalidate();
            southPanel.repaint();
            numbut = 4;
        });
        //кнопка "Кольцо"
        ringButton.addActionListener(e -> {
            southPanel.removeAll();
            southPanel.add(backButton);
            southPanel.add(createButton);
            southPanel.add(moveButton);
            southPanel.add(deleteButton);
            southPanel.add(changeRadiusButton);
            southPanel.add(setVisibleButton);
            southPanel.add(arrayButton);
            southPanel.revalidate();
            southPanel.repaint();
            numbut = 5;
        });
        complexButton.addActionListener(e -> {
            southPanel.removeAll();
            southPanel.add(backButton);
            southPanel.add(createButton);
            southPanel.add(moveButton);
            southPanel.add(deleteButton);
            southPanel.add(changeRadiusButton);
            southPanel.add(setVisibleButton);
            southPanel.add(arrayButton);
            southPanel.revalidate();
            southPanel.repaint();
            numbut = 6;
        });

        //кнопка "Создать"
        createButton.addActionListener(e -> {
            ch1 = (int) (Math.random() * 300);
            ch2 = (int) (Math.random() * 300);
            ch3 = (int) (Math.random() * 300);
            ch4 = (int) (Math.random() * 300);
            ch5 = (int) (Math.random() * 300);
            if (numbut == 1) {
                if (line == null) {
                    liveVision = true;
                    line = new Line (new Point(ch1, ch2), new Point(ch3, ch4), Color.RED);
                    ((Line) line).Show(Color.RED);
                    centerPanel.add(line, BorderLayout.CENTER);
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Линия уже нарисована");
                }
            }
            else if (numbut == 11) {
                if (lines == null) {
                    lines = new Line[10];
                    liveVision = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        ch4 = (int) (Math.random() * 300);
                        lines[i] = new Line (new Point(ch1, ch2), new Point(ch3, ch4), Color.RED);
                        System.out.println("Line №" + (i+1) + " координаты:: " + ch1 +", "+ ch2 +", "+ ch3 +", "+ ch4);
                        lines[i].Show(Color.RED);
                        centerPanel.add(lines[i], BorderLayout.CENTER);
                        centerPanel.validate();
                        centerPanel.repaint();
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив линий уже создан");
                }
            }
            else if (numbut == 2) {
                if (circle == null) {
                    circleVision = true;
                    circle = new Circle (new Point(ch1, ch2), ch3, Color.GREEN);
                    ((Circle) circle).show(Color.GREEN);
                    centerPanel.add(circle, BorderLayout.CENTER);
                    centerPanel.revalidate();
                } else {
                    JOptionPane.showMessageDialog(frame, "Окружность уже нарисована");
                }
            }
            else if (numbut == 12) {
                if (circles == null) {
                    circles = new Circle[10];
                    circleVision = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        circles[i] = new Circle (new Point(ch1, ch2), ch3, Color.GREEN);
                        System.out.println("Circle №" + (i+1) + " координаты центра:: " + ch1 +", "+ ch2 +", диаметр:"+ ch3);
                        circles[i].show(Color.GREEN);
                        centerPanel.add(circles[i], BorderLayout.CENTER);
                        centerPanel.validate();
                        centerPanel.repaint();
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив Окружностей уже создан");
                }
            }
            else if (numbut == 3) {
                if (rectangle == null) {
                    rectangleVision = true;
                    rectangle = new Rectangle (new Point(ch1, ch2), ch3, ch4, Color.BLUE);
                    ((Rectangle) rectangle).Show(Color.BLUE);
                    centerPanel.add(rectangle, BorderLayout.CENTER);
                    centerPanel.revalidate();
                } else {
                    JOptionPane.showMessageDialog(frame, "Прямоугольник уже нарисован");
                }
            }
            else if (numbut == 13) {
                if (rectangles == null) {
                    rectangles = new Rectangle[10];
                    rectangleVision = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        ch4 = (int) (Math.random() * 300);
                        rectangles[i] = new Rectangle (new Point(ch1, ch2), ch3, ch4, Color.BLUE);
                        System.out.println("Rectangle №" + (i+1) + " координаты начальной точки: " + ch1 +", "+ ch2 +", длина:"+ ch3 + ", ширина:"+ ch4);
                        rectangles[i].Show(Color.BLUE);
                        centerPanel.add(rectangles[i], BorderLayout.CENTER);
                        centerPanel.validate();
                        centerPanel.repaint();
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив Прямоугольников уже создан");
                }
            }
            else if (numbut == 4) {
                if (triangle == null) {
                    triangleVision = true;
                    triangle = new Triangle(new Point(ch1, ch2), ch3, ch4, ch5, Color.BLACK);
                    ((Triangle) triangle).Show(Color.BLACK);
                    centerPanel.add(triangle, BorderLayout.CENTER);
                    centerPanel.revalidate();
                } else {
                    JOptionPane.showMessageDialog(frame, "Треугольник уже нарисован");
                }
            }
            else if (numbut == 14) {
                if (triangles == null) {
                    triangles = new Triangle[10];
                    triangleVision = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        ch4 = (int) (Math.random() * 300);
                        ch5 = (int) (Math.random() * 300);
                        triangles[i] = new Triangle(new Point(ch1, ch2), ch3, ch4, ch5, Color.BLACK);
                        System.out.println("Triangle №" + (i+1));
                        triangles[i].Show(Color.BLACK);
                        centerPanel.add(triangles[i], BorderLayout.CENTER);
                        centerPanel.validate();
                        centerPanel.repaint();
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив Прямоугольников уже создан");
                }
            }
            else if (numbut == 5){
                if (ring == null) {
                    ringVision = true;
                    ring = new Ring(new Point(ch1, ch2), ch3, Color.MAGENTA);
                    ((Ring) ring).Show(Color.MAGENTA);
                    centerPanel.add(ring, BorderLayout.CENTER);
                    centerPanel.revalidate();
                } else {
                    JOptionPane.showMessageDialog(frame, "Кольцо уже нарисовано");
                }
            }
            else if (numbut == 15){
                if (rings == null) {
                    rings = new Ring[10];
                    ringVision = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        rings[i] = new Ring(new Point(ch1, ch2), ch3, Color.MAGENTA);
                        System.out.println("RING №" + (i+1));
                        ((Ring)rings[i]).Show(Color.MAGENTA);
                        centerPanel.add(rings[i], BorderLayout.CENTER);
                        centerPanel.validate();
                        centerPanel.repaint();
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив Колец уже создан");
                }
            }
            else if (numbut == 6){
                if (complex == null) {
                    complexVision = true;
                    complex = new ComplexFigure(new Point(ch1, ch2), ch3, Color.magenta);
                    ((ComplexFigure) complex).Show(Color.MAGENTA);
                    centerPanel.add(complex, BorderLayout.CENTER);
                    centerPanel.revalidate();
                } else {
                    JOptionPane.showMessageDialog(frame, "Сложная фигура уже нарисована");
                }
            }
            else if (numbut == 16){
                if (complexArray == null) {
                    complexArray = new ComplexFigure[10];
                    complexVision = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        complexArray[i] = new ComplexFigure(new Point(ch1, ch2), ch3, Color.MAGENTA);
                        System.out.println("Complex №" + (i+1));
                        ((ComplexFigure)complexArray[i]).Show(Color.MAGENTA);
                        centerPanel.add(complexArray[i], BorderLayout.CENTER);
                        centerPanel.validate();
                        centerPanel.repaint();
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив сложных фигур уже создан");
                }
            }
            ch1 = ch2 = ch3 = ch4 = ch5 = 0;
        });
        //кнопка "Переместить"
        moveButton.addActionListener(e -> {
            ch1 = -50 + (int) (Math.random() * 100);
            ch2 = -50 + (int) (Math.random() * 100);
            if (numbut == 1) {
                if (line != null) {
                    ((Line) line).MoveTo(ch1, ch2);
                    ((Line) line).Show(Color.RED);
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Линия не найдена");
                }
            }
            else if (numbut == 11) {
                if (lines != null) {
                    for (int i=0; i<10; i++) {
                        lines[i].MoveTo(ch1, ch2);
                        lines[i].Show(Color.RED);
                        centerPanel.repaint();
                        System.out.println("перемещение Линии №" + (i+1));
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив линий не найден");
                }
            }
            else if (numbut == 2) {
                if (circle != null) {
                    ((Circle) circle).moveTo(ch1, ch2);
                    ((Circle) circle).show(Color.GREEN);
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Окружность не найдена");
                }
            }
            else if (numbut == 12) {
                if (circles != null) {
                    for (int i=0; i<10; i++) {
                        circles[i].moveTo(ch1, ch2);
                        circles[i].show(Color.GREEN);
                        centerPanel.repaint();
                        System.out.println("перемещение Окружности №" + (i+1));
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив окружностей не найден");
                }
            }
            else if (numbut == 3) {
                if (rectangle != null) {
                    ((Rectangle) rectangle).MoveTo(ch1, ch2);
                    ((Rectangle) rectangle).Show(Color.BLUE);
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Прямоугольник не найден");
                }
            }
            else if (numbut == 13) {
                if (rectangles != null) {
                    for (int i=0; i<10; i++) {
                        rectangles[i].MoveTo(ch1, ch2);
                        rectangles[i].Show(Color.BLUE);
                        centerPanel.repaint();
                        System.out.println("перемещение Прямоугольника №" + (i+1));
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив Прямоугольников не найден");
                }
            }
            else if (numbut == 4) {
                if (triangle != null) {
                    ((Triangle) triangle).MoveTo(ch1, ch2);
                    ((Triangle) triangle).Show(Color.BLACK);
                    centerPanel.repaint();
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Треугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (triangles != null) {
                    for (int i=0; i<10; i++) {
                        triangles[i].MoveTo(ch1, ch2);
                        triangles[i].Show(Color.BLACK);
                        centerPanel.repaint();
                        System.out.println("перемещение Треугольника №" + (i+1));
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив Треугольников не найден");
                }
            }
            else if (numbut == 5){
                if (ring != null) {
                    ((Ring) ring).MoveTo(ch1, ch2);
                    ((Ring) ring).Show(Color.MAGENTA);
                    centerPanel.repaint();
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Кольцо не найдено");
                }
            }
            else if (numbut == 15) {
                if (rings != null) {
                    for (int i=0; i<10; i++) {
                        ((Ring)rings[i]).MoveTo(ch1, ch2);
                        ((Ring)rings[i]).Show(Color.MAGENTA);
                        centerPanel.repaint();
                        System.out.println("перемещение Кольца №" + (i+1));
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив Колец не найден");
                }
            }
            else if (numbut == 6) {
                if (complex != null) {
                    ((ComplexFigure) complex).MoveTo(ch1, ch2);
                    ((ComplexFigure) complex).Show(Color.MAGENTA);
                    centerPanel.repaint();
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Сложная фигура не найдена");
                }
            }
            else if (numbut == 16) {
                if (complexArray != null) {
                    for (int i=0; i<10; i++) {
                        ((ComplexFigure)complexArray[i]).MoveTo(ch1, ch2);
                        ((ComplexFigure)complexArray[i]).Show(Color.MAGENTA);
                        centerPanel.repaint();
                        System.out.println("перемещение Сложной фигуры №" + (i+1));
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив сложных фигур не найден");
                }
            }
            ch1 = ch2 = 0;
        });
        //кнопка "Удалить"
        deleteButton.addActionListener(e -> {
            if (numbut == 1) {
                if (line != null) {
                    centerPanel.remove(line);
                    ((Line) line).Show(Color.WHITE);
                    line = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Линия не найдена");
                }
            }
            else if (numbut == 11) {
                if (lines != null) {
                    for (int i=0; i<10; i++) {
                        centerPanel.remove(lines[i]);
                        lines[i].Show(Color.WHITE);
                    }
                    lines = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив линий не найден");
                }
            }
            else if (numbut == 2) {
                if (circle != null) {
                    centerPanel.remove(circle);
                    ((Circle) circle).show(Color.WHITE);
                    circle = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Окружность не найдена");
                }
            }
            else if (numbut == 12) {
                if (circles != null) {
                    for (int i=0; i<10; i++) {
                        centerPanel.remove(circles[i]);
                        circles[i].show(Color.WHITE);
                    }
                    circles = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив линий не найден");
                }
            }
            else if (numbut == 3) {
                if (rectangle != null) {
                    centerPanel.remove(rectangle);
                    ((Rectangle) rectangle).Show(Color.WHITE);
                    rectangle = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Прямоугольник не найден");
                }
            }
            else if (numbut == 13) {
                if (rectangles != null) {
                    for (int i=0; i<10; i++) {
                        centerPanel.remove(rectangles[i]);
                        rectangles[i].Show(Color.WHITE);
                    }
                    rectangles = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив линий не найден");
                }
            }
            else if (numbut == 4) {
                if (triangle != null) {
                    centerPanel.remove(triangle);
                    ((Triangle) triangle).Show(Color.WHITE);
                    triangle = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Треугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (triangles != null) {
                    for (int i=0; i<10; i++) {
                        centerPanel.remove(triangles[i]);
                        triangles[i].Show(Color.WHITE);
                    }
                    triangles = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив треугольников не найден");
                }
            }
            else if (numbut == 5){
                if (ring != null) {
                    centerPanel.remove(ring);
                    ((Ring) ring).Show(Color.WHITE);
                    ring = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Кольцо не найдено");
                }
            }
            else if (numbut == 15) {
                if (rings != null) {
                    for (int i=0; i<10; i++) {
                        centerPanel.remove(rings[i]);
                        ((Ring)rings[i]).Show(Color.WHITE);
                    }
                    rings = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив колец не найден");
                }
            }
            else if (numbut == 6){
                if (complex != null) {
                    centerPanel.remove(complex);
                    ((ComplexFigure) complex).Show(Color.WHITE);
                    complex = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Сложная фигура не найдена");
                }
            }
            else if (numbut == 16) {
                if (complexArray != null) {
                    for (int i=0; i<10; i++) {
                        centerPanel.remove(complexArray[i]);
                        ((ComplexFigure)complexArray[i]).Show(Color.WHITE);
                    }
                    complexArray = null;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив сложных фигур не найден");
                }
            }
        });

        //кнопка "Повернуть на 45"
        turnButton.addActionListener(e -> {
            if (numbut == 1) {
                if (line != null) {
                    ((Line) line).Turn();
                    ((Line) line).Show(Color.RED);
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Линия не найдена");
                }
            }
            else if (numbut == 11) {
                if (lines != null) {
                    for (int i = 0; i < 10; i++) {
                        lines[i].Turn();
                        lines[i].Show(Color.RED);
                    }
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Массив не создан");
                }
            }
        });
        //кнопка "Изменить радиус"
        changeRadiusButton.addActionListener(e -> {
            if (numbut == 2) {
                ch1 = 50 + (int) (Math.random() * 150);
                if (circle != null) {
                    ((Circle) circle).changeRadius(ch1);
                    ((Circle) circle).show(Color.GREEN);
                    ch1 = 0;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Окружность не найдена");
                }
            }
            else if (numbut == 12) {
                if (circles != null) {
                    for (int i = 0; i < 10; i++) {
                        ch1 = 50 + (int) (Math.random() * 150);
                        circles[i].changeRadius(ch1);
                        circles[i].show(Color.GREEN);
                    }
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Массив Окружностей не создан");
                }
            }

            else if (numbut == 5) {
                ch1 = 50 + (int) (Math.random() * 150);
                if (ring != null) {
                    ((Ring) ring).chRad(ch1);
                    ((Ring) ring).Show(Color.MAGENTA);
                    ch1 = 0;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Кольцо не найдено");
                }
            }
            else if (numbut == 15) {
                if (rings != null) {
                    for (int i = 0; i < 10; i++) {
                        ch1 = 50 + (int) (Math.random() * 150);
                        ((Ring)rings[i]).chRad(ch1);
                        ((Ring)rings[i]).Show(Color.MAGENTA);
                    }
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Массив Колец не создан");
                }
            }
            else if (numbut == 6) {
                ch1 = 50 + (int) (Math.random() * 150);
                if (complex != null) {
                    ((ComplexFigure) complex).changeRadius(ch1);
                    ((ComplexFigure) complex).Show(Color.MAGENTA);
                    ch1 = 0;
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Сложная фигура не найдена");
                }
            }
            else if (numbut == 16) {
                if (complexArray != null) {
                    for (int i = 0; i < 10; i++) {
                        ch1 = 50 + (int) (Math.random() * 150);
                        ((ComplexFigure)complexArray[i]).changeRadius(ch1);
                        ((ComplexFigure)complexArray[i]).Show(Color.MAGENTA);
                    }
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Массив сложных фигур не создан");
                }
            }

        });
        //кнопка "Изменить размер"
        changeSizeButton.addActionListener(e -> {
            ch1 = -25 + (int) (Math.random() * 50);
            ch2 = -25 + (int) (Math.random() * 50);
            if (numbut == 3) {
                if (rectangle != null) {
                    ((Rectangle) rectangle).chSize(ch1, ch2);
                    ((Rectangle) rectangle).Show(Color.BLUE);
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Прямоугольник не найден");
                }
            }
            else if (numbut == 13) {
                if (rectangles != null) {
                    for (int i = 0; i < 10; i++) {
                        rectangles[i].chSize(ch1, ch2);
                        rectangles[i].Show(Color.BLUE);
                    }
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Массив Окружностей не создан");
                }
            }
            else if (numbut == 4) {
                if (triangle != null) {
                    ((Triangle) triangle).chSize(ch1, ch2);
                    ((Triangle) triangle).Show(Color.BLACK);
                    centerPanel.revalidate();
                    centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Треугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (triangles != null) {
                    for (int i = 0; i < 10; i++) {
                        triangles[i].chSize(ch1, ch2);
                        triangles[i].Show(Color.BLACK);
                    }
                    centerPanel.revalidate();
                    centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Массив Окружностей не создан");
                }
            }
            ch1 = ch2 = 0;
        });
        // кнопка "Сделать видимым/невидимым"
        setVisibleButton.addActionListener(e -> {
            if (numbut == 1) {
                if (line != null) {
                    System.out.println("Видимость: " + liveVision);
                    if (!liveVision) {
                        ((Line) line).Show(Color.RED);
                    }
                    else{
                        ((Line) line).Show(Color.WHITE);
                    }
                    liveVision = !liveVision;
                    centerPanel.revalidate(); centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Линия не найдена");
                }
            }
            else if (numbut == 11) {
                if (lines != null) {
                    Color arrayColor;
                    System.out.println("Видимость: " + liveVision);
                    if(!liveVision){
                        arrayColor = Color.RED;
                    }
                    else{
                        arrayColor = Color.WHITE;
                    }
                    for (int i=0; i<10; i++) {
                        lines[i].Show(arrayColor);
                        centerPanel.repaint();
                    }
                    liveVision = !liveVision;
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив линий не найден");
                }
            }
            else if (numbut == 2) {
                if (circle != null) {
                    System.out.println("Видимость: " + circleVision);
                    if (!circleVision) {
                        ((Circle) circle).show(Color.GREEN);
                    }
                    else{
                        ((Circle) circle).show(Color.WHITE);
                    }
                    circleVision = !circleVision;
                    centerPanel.revalidate(); centerPanel.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Окружность не найдена");
                }
            }
            else if (numbut == 12) {
                if (circles != null) {
                    circleVision = !circleVision;
                    Color arrayColor;
                    System.out.println("Видимость: " + circleVision);
                    if (!circleVision){
                        arrayColor = Color.GREEN;
                    }
                    else{
                        arrayColor = Color.WHITE;
                    }
                    for (int i=0; i<10; i++) {
                        circles[i].show(arrayColor);
                        centerPanel.repaint();
                    }
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив линий не найден");
                }
            }
            else if (numbut == 3) {
                if (rectangle != null) {
                    System.out.println("Видимость: " + rectangleVision);
                    if (!rectangleVision) {
                        ((Rectangle) rectangle).Show(Color.BLUE);
                    }
                    else{
                        ((Rectangle) rectangle).Show(Color.WHITE);
                    }
                    rectangleVision = !rectangleVision;
                    centerPanel.revalidate(); centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Прямоугольник не найден");
                }
            }
            else if (numbut == 13) {
                if (rectangles != null) {
                    Color arrayColor;
                    if (!rectangleVision){
                        arrayColor = Color.BLUE;
                    }
                    else{
                        arrayColor = Color.WHITE;
                    }
                    System.out.println("Видимость: " + rectangleVision);
                    for (int i=0; i<10; i++) {
                        rectangles[i].Show(arrayColor);
                        centerPanel.repaint();
                    }
                    rectangleVision = !rectangleVision;
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив линий не найден");
                }
            }
            else if (numbut == 4) {
                if (triangle != null) {
                    System.out.println("Видимость: " + triangleVision);
                    if (!triangleVision) {
                        ((Triangle) triangle).Show(Color.BLACK);
                    }
                    else {
                        ((Triangle) triangle).Show(Color.WHITE);
                    }
                    triangleVision = !triangleVision;
                    centerPanel.revalidate(); centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Треугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (triangles != null) {
                    Color arrayColor;
                    if (!triangleVision){
                        arrayColor = Color.BLACK;
                    }
                    else{
                        arrayColor = Color.WHITE;
                    }
                    System.out.println("Видимость: " + triangleVision);
                    for (int i=0; i<10; i++) {
                        triangles[i].Show(arrayColor);
                        centerPanel.repaint();
                    }
                    triangleVision = !triangleVision;
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив линий не найден");
                }
            }
            else if (numbut == 5) {
                if (ring != null) {
                    System.out.println("Видимость: " + ringVision);
                    if (!ringVision) {
                        ((Ring) ring).Show(Color.MAGENTA);
                    }
                    else {
                        ((Ring) ring).Show(Color.WHITE);
                    }
                    ringVision = !ringVision;
                    centerPanel.revalidate(); centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Кольцо не найдено");
                }
            }
            else if (numbut == 15) {
                if (rings != null) {
                    Color arrayColor;
                    if (!ringVision){
                        arrayColor = Color.MAGENTA;
                    }
                    else{
                        arrayColor = Color.WHITE;
                    }
                    System.out.println("Видимость: " + ringVision);
                    for (int i=0; i<10; i++) {
                        ((Ring)rings[i]).Show(arrayColor);
                        centerPanel.repaint();
                    }
                    ringVision = !ringVision;
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив колец не найден");
                }
            }
            else if (numbut == 6) {
                if (complex != null) {
                    System.out.println("Видимость: " + complexVision);
                    if (!complexVision) {
                        ((ComplexFigure) complex).Show(Color.MAGENTA);
                    }
                    else {
                        ((ComplexFigure) complex).Show(Color.WHITE);
                    }
                    complexVision = !complexVision;
                    centerPanel.revalidate(); centerPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(frame, "Сложная фигура не найдена");
                }
            }
            else if (numbut == 16) {
                if (complexArray != null) {
                    Color arrayColor;
                    if (!complexVision){
                        arrayColor = Color.MAGENTA;
                    }
                    else{
                        arrayColor = Color.WHITE;
                    }
                    System.out.println("Видимость: " + complexVision);
                    for (int i=0; i<10; i++) {
                        ((ComplexFigure)complexArray[i]).Show(arrayColor);
                        centerPanel.repaint();
                    }
                    complexVision = !complexVision;
                    centerPanel.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Массив сложных фигур не найден");
                }
            }
        });

        //кнопка "Массив"
        arrayButton.addActionListener(e -> {
            southPanel.removeAll();
            southPanel.add(backButton);
            southPanel.add(createButton);
            southPanel.add(moveButton);
            southPanel.add(deleteButton);
            southPanel.add(setVisibleButton);
            if (numbut == 1 ) {
                southPanel.add(turnButton); numbut = 11;
                JOptionPane.showMessageDialog(frame, "Следующие действия будут выполнены для массива линий");
            }
            if (numbut == 2 ) {
                southPanel.add(changeRadiusButton); numbut = 12;
                JOptionPane.showMessageDialog(frame, "Следующие действия будут выполнены для массива окружностей");
            }
            if (numbut == 3 ) {
                southPanel.add(changeSizeButton); numbut = 13;
                JOptionPane.showMessageDialog(frame, "Следующие действия будут выполнены для массива прямоугольников");
            }
            if (numbut == 4 ) {
                southPanel.add(changeSizeButton); numbut = 14;
                JOptionPane.showMessageDialog(frame, "Следующие действия будут выполнены для массива треугольников");
            }
            if (numbut == 5 ) {
                southPanel.add(changeRadiusButton); numbut = 15;
                JOptionPane.showMessageDialog(frame, "Следующие действия будут выполнены для массива колец");
            }
            if (numbut == 6) {
                southPanel.add(changeRadiusButton); numbut = 16;
                JOptionPane.showMessageDialog(frame, "Следующие действия будет выполнены для массивы сложных фигур");
            }
            southPanel.revalidate();
            southPanel.repaint();
        });

        return p;
    }

    public static void main (String[] argc) {
        SwingUtilities.invokeLater(Start::new);
    }
}
