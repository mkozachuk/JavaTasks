package com.javarush.task.task05.task0518;

/* 
- Имя
- Имя, рост
- Имя, рост, цвет
Регистрируем собачек
*/


public class Dog {
   String name;
   int height;
   String color;
   //напишите тут ваш код

    public Dog(String name){
        this.name = name;
    }
    public Dog(String name, int height){
        this.name = name;
        this.height = height;
    }
    public Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}