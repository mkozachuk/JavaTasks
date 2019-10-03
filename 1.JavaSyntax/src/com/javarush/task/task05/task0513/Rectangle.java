package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //left, top, width, height //напишите тут ваш код
    int left;
    int top;
    int width;
    int height;


    public void initialize(int left, int top, int width, int height) {
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
        width = 0;
        height = 0;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        height = width;
    }

    public void initialize() {
        Rectangle other = new Rectangle();

    }



    public static void main(String[] args) {

    }
}
