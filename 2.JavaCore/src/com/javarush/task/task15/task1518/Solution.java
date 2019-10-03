package com.javarush.task.task15.task1518;

/*
1. В классе Solution создай класс Cat с публичным полем name типа String.
2. В статическом блоке создай объект типа Cat и присвой его переменной cat(не забудь инициализировать поле name).
3. В классе Cat не создавай конструкторы с параметрами.
4. В статическом блоке выведи имя созданного кота на экран.


Статики и котики
*/

public class Solution {

    public static class Cat{
        public String name;
    }



    static {
        Cat cat1 = new Cat();

        cat1.name = "Ivan";

        cat = cat1;

        System.out.println(cat1.name);
    }
    public static Cat cat;


    public static void main(String[] args) {

    }
}
