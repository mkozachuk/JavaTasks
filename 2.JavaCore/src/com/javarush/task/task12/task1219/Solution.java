package com.javarush.task.task12.task1219;

/* 
Создаем человека
Есть public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public abstract class Human implements CanRun, CanSwim{

    }

    public abstract class Duck implements CanSwim, CanRun, CanFly{

    }

    public abstract class Penguin implements CanRun, CanSwim{

    }

    public abstract class Airplane implements CanFly, CanRun{

    }
}
