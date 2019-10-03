package com.javarush.task.task05.task0517;

/*
 Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int weight;
    int age;
    String color;
    String address;
    public Cat(String name){
        this.name = name;
        weight = 10;
        color = "black";
        age = 7;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        color = "black";
    }
    public Cat(String name, int weight, int age){
        this.weight = weight;
        this.name = name;
        this.age = age;
        color = "black";
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 7;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 7;
    }

    public static void main(String[] args) {

    }
}
