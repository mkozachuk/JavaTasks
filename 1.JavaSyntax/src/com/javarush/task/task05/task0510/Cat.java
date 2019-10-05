package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
   String name;
   int age;
   int weight = 7;
   String color;
   String address = null;

   public void initialize(String name){
       this.name = name;
       age = 7;
       weight = 7;
       color = "klack";



   }//напишите тут ваш код
    public void initialize(String name, int weight, int age){
       this.name = name;
       this.weight = weight;
       this.age = age;
        color = "klack";
    }
    public void initialize(String name, int age){
       this.name = name;
       this.age = age;
       weight = 7;
        color = "klack";
    }
    public void initialize(int weight, String colot){
       this.weight = weight;
       this.color = colot;
       age = 10;
    }
    public void initialize(int weight, String color, String address){
       this.weight = weight;
       this.color = color;
       this.address = address;
       age = 10;
    }

    public static void main(String[] args) {

    }
}
