package com.javarush.task.task06.task0613;

/* 
Кот и статика

*/

import java.net.SocketImpl;

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        Cat[] array = new Cat[10];
        for(int i = 0; i < 10; i++){
            array[i] = new Cat();
        }
        System.out.println(Cat.catCount);
        // Выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount;
        public Cat(){
            catCount++;
        }
        // Создай статическую переменную catCount

        // Создай конструктор
    }
}
