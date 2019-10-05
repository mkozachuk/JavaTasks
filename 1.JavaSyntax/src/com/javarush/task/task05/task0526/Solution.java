package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина

1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address


*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код\
        Man man = new Man("Ivan", 17, "kiev");
        Man man1 = new Man("Boris", 20, "tulma");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);

        Woman woman = new Woman("kasia", 17, "kiev");
        Woman woman1 = new Woman("Natka", 19, "warszawa");
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
    }


    public static class Man {
        String name;
        int age;
        String address;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;


        }

    }

    public static class Woman {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;


        }


        //напишите тут ваш код
    }
}
