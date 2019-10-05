package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
*/


public class Rectangle {
    //напишите тут ваш код
    int left;
    int top;
    int width;
    int height;
    public Rectangle(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height =  height;
    }
    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
        width = height = 0;
    }
    public Rectangle(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        height = width;
    }
    public Rectangle(){
        Rectangle nR = new Rectangle();
    }

    public static void main(String[] args) {

    }
}
