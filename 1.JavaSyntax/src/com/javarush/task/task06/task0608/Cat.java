package com.javarush.task.task06.task0608;

/* 
Статические методы для кошек
Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).
*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
       catCount = catCount;
       return catCount;
       //напишите тут ваш код

    }

    public static void setCatCount(int catCount) {
       Cat.catCount = catCount; //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
