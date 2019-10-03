package com.javarush.task.task06.task0612;

/* 
Калькулятор
Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает разницу чисел a и b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов от числа a
*/

public class Calculator {
    public static int plus(int a, int b) {
        int sum = a + b;//напишите тут ваш код
        return sum;
    }

    public static int minus(int a, int b) {
       int minus = a - b; //напишите тут ваш код
        return minus;
    }

    public static int multiply(int a, int b) {
       int mult = a * b; //напишите тут ваш код
        return mult;
    }

    public static double division(int a, int b) {
        double dev = (double) a / (double) b;;//напишите тут ваш код
        return dev;
    }

    public static double percent(int a, int b) {
        double proc = ((double)a * (double)b) / 100;//напишите тут ваш код
        return proc;
    }

    public static void main(String[] args) {

    }
}