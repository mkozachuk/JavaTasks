package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {

        Cat[] array = new Cat[50000];
        for(int i = 0; i < 50000; i++){
            array[i] = new Cat();
        }  // напишите тут ваш код
        Dog[] array1 = new Dog[50000];
        for(int i = 0; i < 50000; i++){
            array1[i] = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
