package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
Есть public интерфейсы CanFly(летать), CanMove(передвигаться), CanEat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).


*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public abstract class Dog implements CanEat, CanMove{
    }

    public abstract class Duck implements CanEat, CanMove, CanFly{
    }

    public abstract class Car implements CanMove{
    }

    public abstract class Airplane implements CanFly, CanMove{
    }
}
