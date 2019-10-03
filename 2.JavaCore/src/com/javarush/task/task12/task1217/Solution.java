package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавить в каждый интерфейс по одному методу.


*/

public class Solution {
    public static void main(String[] args) {

    }


    public interface CanFly{
        void fly (Object fly);
    }

    public interface CanRun{
        void run(Object run);
    }

    public interface CanSwim{
        void swim (Object swim);
    }
//add interfaces here - добавь интерфейсы тут

}
